/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Nahbedienung.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.set.model.planpro.Nahbedienung.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NahbedienungFactoryImpl extends EFactoryImpl implements NahbedienungFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NahbedienungFactory init() {
		try {
			NahbedienungFactory theNahbedienungFactory = (NahbedienungFactory)EPackage.Registry.INSTANCE.getEFactory(NahbedienungPackage.eNS_URI);
			if (theNahbedienungFactory != null) {
				return theNahbedienungFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NahbedienungFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NahbedienungFactoryImpl() {
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
			case NahbedienungPackage.AWU_TYPE_CLASS: return createAWU_TypeClass();
			case NahbedienungPackage.BEZEICHNUNG_NB_TYPE_CLASS: return createBezeichnung_NB_TypeClass();
			case NahbedienungPackage.BEZEICHNUNG_NB_ZONE_TYPE_CLASS: return createBezeichnung_NB_Zone_TypeClass();
			case NahbedienungPackage.FST_ZTYPE_CLASS: return createF_ST_Z_TypeClass();
			case NahbedienungPackage.FA_FAE_TYPE_CLASS: return createFA_FAE_TypeClass();
			case NahbedienungPackage.FREIE_STELLBARKEIT_TYPE_CLASS: return createFreie_Stellbarkeit_TypeClass();
			case NahbedienungPackage.KENNZAHL_TYPE_CLASS: return createKennzahl_TypeClass();
			case NahbedienungPackage.NB: return createNB();
			case NahbedienungPackage.NB_ART_TYPE_CLASS: return createNB_Art_TypeClass();
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT: return createNB_Bedien_Anzeige_Element();
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP: return createNB_Bedien_Anzeige_Funktionen_AttributeGroup();
			case NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP: return createNB_Bezeichnung_AttributeGroup();
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP: return createNB_Funktionalitaet_NB_R_AttributeGroup();
			case NahbedienungPackage.NB_GRENZE_ART_TYPE_CLASS: return createNB_Grenze_Art_TypeClass();
			case NahbedienungPackage.NB_RUECKGABEVORAUSSETZUNG_TYPE_CLASS: return createNB_Rueckgabevoraussetzung_TypeClass();
			case NahbedienungPackage.NB_VERHAELTNIS_BESONDERS_TYPE_CLASS: return createNB_Verhaeltnis_Besonders_TypeClass();
			case NahbedienungPackage.NB_ZONE: return createNB_Zone();
			case NahbedienungPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP: return createNB_Zone_Allg_AttributeGroup();
			case NahbedienungPackage.NB_ZONE_ALLG_TYPE_CLASS: return createNB_Zone_Allg_TypeClass();
			case NahbedienungPackage.NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP: return createNB_Zone_Bezeichnung_AttributeGroup();
			case NahbedienungPackage.NB_ZONE_ELEMENT: return createNB_Zone_Element();
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP: return createNB_Zone_Element_Allg_AttributeGroup();
			case NahbedienungPackage.NB_ZONE_GRENZE: return createNB_Zone_Grenze();
			case NahbedienungPackage.NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP: return createNB_Zone_Reihenfolgezwang_AttributeGroup();
			case NahbedienungPackage.RANG_TYPE_CLASS: return createRang_TypeClass();
			case NahbedienungPackage.SBUE_TYPE_CLASS: return createSBUE_TypeClass();
			case NahbedienungPackage.SLE_SLS_TYPE_CLASS: return createSLE_SLS_TypeClass();
			case NahbedienungPackage.TASTE_ANF_TYPE_CLASS: return createTaste_ANF_TypeClass();
			case NahbedienungPackage.TASTE_FGT_TYPE_CLASS: return createTaste_FGT_TypeClass();
			case NahbedienungPackage.TASTE_WGT_TYPE_CLASS: return createTaste_WGT_TypeClass();
			case NahbedienungPackage.WGSP_LAGE_TYPE_CLASS: return createW_Gsp_Lage_TypeClass();
			case NahbedienungPackage.WHU_TYPE_CLASS: return createWHU_TypeClass();
			case NahbedienungPackage.WUS_TYPE_CLASS: return createWUS_TypeClass();
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
			case NahbedienungPackage.ENUMNB_ART:
				return createENUMNBArtFromString(eDataType, initialValue);
			case NahbedienungPackage.ENUMNB_GRENZE_ART:
				return createENUMNBGrenzeArtFromString(eDataType, initialValue);
			case NahbedienungPackage.ENUMNB_RUECKGABEVORAUSSETZUNG:
				return createENUMNBRueckgabevoraussetzungFromString(eDataType, initialValue);
			case NahbedienungPackage.ENUMNB_VERHAELTNIS_BESONDERS:
				return createENUMNBVerhaeltnisBesondersFromString(eDataType, initialValue);
			case NahbedienungPackage.ENUMW_GSP_LAGE:
				return createENUMWGspLageFromString(eDataType, initialValue);
			case NahbedienungPackage.BEZEICHNUNG_NB_TYPE:
				return createBezeichnung_NB_TypeFromString(eDataType, initialValue);
			case NahbedienungPackage.BEZEICHNUNG_NB_ZONE_TYPE:
				return createBezeichnung_NB_Zone_TypeFromString(eDataType, initialValue);
			case NahbedienungPackage.ENUMNB_ART_OBJECT:
				return createENUMNBArtObjectFromString(eDataType, initialValue);
			case NahbedienungPackage.ENUMNB_GRENZE_ART_OBJECT:
				return createENUMNBGrenzeArtObjectFromString(eDataType, initialValue);
			case NahbedienungPackage.ENUMNB_RUECKGABEVORAUSSETZUNG_OBJECT:
				return createENUMNBRueckgabevoraussetzungObjectFromString(eDataType, initialValue);
			case NahbedienungPackage.ENUMNB_VERHAELTNIS_BESONDERS_OBJECT:
				return createENUMNBVerhaeltnisBesondersObjectFromString(eDataType, initialValue);
			case NahbedienungPackage.ENUMW_GSP_LAGE_OBJECT:
				return createENUMWGspLageObjectFromString(eDataType, initialValue);
			case NahbedienungPackage.NB_ZONE_ALLG_TYPE:
				return createNB_Zone_Allg_TypeFromString(eDataType, initialValue);
			case NahbedienungPackage.RANG_TYPE:
				return createRang_TypeFromString(eDataType, initialValue);
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
			case NahbedienungPackage.ENUMNB_ART:
				return convertENUMNBArtToString(eDataType, instanceValue);
			case NahbedienungPackage.ENUMNB_GRENZE_ART:
				return convertENUMNBGrenzeArtToString(eDataType, instanceValue);
			case NahbedienungPackage.ENUMNB_RUECKGABEVORAUSSETZUNG:
				return convertENUMNBRueckgabevoraussetzungToString(eDataType, instanceValue);
			case NahbedienungPackage.ENUMNB_VERHAELTNIS_BESONDERS:
				return convertENUMNBVerhaeltnisBesondersToString(eDataType, instanceValue);
			case NahbedienungPackage.ENUMW_GSP_LAGE:
				return convertENUMWGspLageToString(eDataType, instanceValue);
			case NahbedienungPackage.BEZEICHNUNG_NB_TYPE:
				return convertBezeichnung_NB_TypeToString(eDataType, instanceValue);
			case NahbedienungPackage.BEZEICHNUNG_NB_ZONE_TYPE:
				return convertBezeichnung_NB_Zone_TypeToString(eDataType, instanceValue);
			case NahbedienungPackage.ENUMNB_ART_OBJECT:
				return convertENUMNBArtObjectToString(eDataType, instanceValue);
			case NahbedienungPackage.ENUMNB_GRENZE_ART_OBJECT:
				return convertENUMNBGrenzeArtObjectToString(eDataType, instanceValue);
			case NahbedienungPackage.ENUMNB_RUECKGABEVORAUSSETZUNG_OBJECT:
				return convertENUMNBRueckgabevoraussetzungObjectToString(eDataType, instanceValue);
			case NahbedienungPackage.ENUMNB_VERHAELTNIS_BESONDERS_OBJECT:
				return convertENUMNBVerhaeltnisBesondersObjectToString(eDataType, instanceValue);
			case NahbedienungPackage.ENUMW_GSP_LAGE_OBJECT:
				return convertENUMWGspLageObjectToString(eDataType, instanceValue);
			case NahbedienungPackage.NB_ZONE_ALLG_TYPE:
				return convertNB_Zone_Allg_TypeToString(eDataType, instanceValue);
			case NahbedienungPackage.RANG_TYPE:
				return convertRang_TypeToString(eDataType, instanceValue);
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
	public AWU_TypeClass createAWU_TypeClass() {
		AWU_TypeClassImpl awU_TypeClass = new AWU_TypeClassImpl();
		return awU_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_NB_TypeClass createBezeichnung_NB_TypeClass() {
		Bezeichnung_NB_TypeClassImpl bezeichnung_NB_TypeClass = new Bezeichnung_NB_TypeClassImpl();
		return bezeichnung_NB_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_NB_Zone_TypeClass createBezeichnung_NB_Zone_TypeClass() {
		Bezeichnung_NB_Zone_TypeClassImpl bezeichnung_NB_Zone_TypeClass = new Bezeichnung_NB_Zone_TypeClassImpl();
		return bezeichnung_NB_Zone_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public F_ST_Z_TypeClass createF_ST_Z_TypeClass() {
		F_ST_Z_TypeClassImpl f_ST_Z_TypeClass = new F_ST_Z_TypeClassImpl();
		return f_ST_Z_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FA_FAE_TypeClass createFA_FAE_TypeClass() {
		FA_FAE_TypeClassImpl fA_FAE_TypeClass = new FA_FAE_TypeClassImpl();
		return fA_FAE_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Freie_Stellbarkeit_TypeClass createFreie_Stellbarkeit_TypeClass() {
		Freie_Stellbarkeit_TypeClassImpl freie_Stellbarkeit_TypeClass = new Freie_Stellbarkeit_TypeClassImpl();
		return freie_Stellbarkeit_TypeClass;
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
	public NB createNB() {
		NBImpl nb = new NBImpl();
		return nb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Art_TypeClass createNB_Art_TypeClass() {
		NB_Art_TypeClassImpl nB_Art_TypeClass = new NB_Art_TypeClassImpl();
		return nB_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Bedien_Anzeige_Element createNB_Bedien_Anzeige_Element() {
		NB_Bedien_Anzeige_ElementImpl nB_Bedien_Anzeige_Element = new NB_Bedien_Anzeige_ElementImpl();
		return nB_Bedien_Anzeige_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Bedien_Anzeige_Funktionen_AttributeGroup createNB_Bedien_Anzeige_Funktionen_AttributeGroup() {
		NB_Bedien_Anzeige_Funktionen_AttributeGroupImpl nB_Bedien_Anzeige_Funktionen_AttributeGroup = new NB_Bedien_Anzeige_Funktionen_AttributeGroupImpl();
		return nB_Bedien_Anzeige_Funktionen_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Bezeichnung_AttributeGroup createNB_Bezeichnung_AttributeGroup() {
		NB_Bezeichnung_AttributeGroupImpl nB_Bezeichnung_AttributeGroup = new NB_Bezeichnung_AttributeGroupImpl();
		return nB_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Funktionalitaet_NB_R_AttributeGroup createNB_Funktionalitaet_NB_R_AttributeGroup() {
		NB_Funktionalitaet_NB_R_AttributeGroupImpl nB_Funktionalitaet_NB_R_AttributeGroup = new NB_Funktionalitaet_NB_R_AttributeGroupImpl();
		return nB_Funktionalitaet_NB_R_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Grenze_Art_TypeClass createNB_Grenze_Art_TypeClass() {
		NB_Grenze_Art_TypeClassImpl nB_Grenze_Art_TypeClass = new NB_Grenze_Art_TypeClassImpl();
		return nB_Grenze_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Rueckgabevoraussetzung_TypeClass createNB_Rueckgabevoraussetzung_TypeClass() {
		NB_Rueckgabevoraussetzung_TypeClassImpl nB_Rueckgabevoraussetzung_TypeClass = new NB_Rueckgabevoraussetzung_TypeClassImpl();
		return nB_Rueckgabevoraussetzung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Verhaeltnis_Besonders_TypeClass createNB_Verhaeltnis_Besonders_TypeClass() {
		NB_Verhaeltnis_Besonders_TypeClassImpl nB_Verhaeltnis_Besonders_TypeClass = new NB_Verhaeltnis_Besonders_TypeClassImpl();
		return nB_Verhaeltnis_Besonders_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Zone createNB_Zone() {
		NB_ZoneImpl nB_Zone = new NB_ZoneImpl();
		return nB_Zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Zone_Allg_AttributeGroup createNB_Zone_Allg_AttributeGroup() {
		NB_Zone_Allg_AttributeGroupImpl nB_Zone_Allg_AttributeGroup = new NB_Zone_Allg_AttributeGroupImpl();
		return nB_Zone_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Zone_Allg_TypeClass createNB_Zone_Allg_TypeClass() {
		NB_Zone_Allg_TypeClassImpl nB_Zone_Allg_TypeClass = new NB_Zone_Allg_TypeClassImpl();
		return nB_Zone_Allg_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Zone_Bezeichnung_AttributeGroup createNB_Zone_Bezeichnung_AttributeGroup() {
		NB_Zone_Bezeichnung_AttributeGroupImpl nB_Zone_Bezeichnung_AttributeGroup = new NB_Zone_Bezeichnung_AttributeGroupImpl();
		return nB_Zone_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Zone_Element createNB_Zone_Element() {
		NB_Zone_ElementImpl nB_Zone_Element = new NB_Zone_ElementImpl();
		return nB_Zone_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Zone_Element_Allg_AttributeGroup createNB_Zone_Element_Allg_AttributeGroup() {
		NB_Zone_Element_Allg_AttributeGroupImpl nB_Zone_Element_Allg_AttributeGroup = new NB_Zone_Element_Allg_AttributeGroupImpl();
		return nB_Zone_Element_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Zone_Grenze createNB_Zone_Grenze() {
		NB_Zone_GrenzeImpl nB_Zone_Grenze = new NB_Zone_GrenzeImpl();
		return nB_Zone_Grenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Zone_Reihenfolgezwang_AttributeGroup createNB_Zone_Reihenfolgezwang_AttributeGroup() {
		NB_Zone_Reihenfolgezwang_AttributeGroupImpl nB_Zone_Reihenfolgezwang_AttributeGroup = new NB_Zone_Reihenfolgezwang_AttributeGroupImpl();
		return nB_Zone_Reihenfolgezwang_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rang_TypeClass createRang_TypeClass() {
		Rang_TypeClassImpl rang_TypeClass = new Rang_TypeClassImpl();
		return rang_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SBUE_TypeClass createSBUE_TypeClass() {
		SBUE_TypeClassImpl sbuE_TypeClass = new SBUE_TypeClassImpl();
		return sbuE_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SLE_SLS_TypeClass createSLE_SLS_TypeClass() {
		SLE_SLS_TypeClassImpl slE_SLS_TypeClass = new SLE_SLS_TypeClassImpl();
		return slE_SLS_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Taste_ANF_TypeClass createTaste_ANF_TypeClass() {
		Taste_ANF_TypeClassImpl taste_ANF_TypeClass = new Taste_ANF_TypeClassImpl();
		return taste_ANF_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Taste_FGT_TypeClass createTaste_FGT_TypeClass() {
		Taste_FGT_TypeClassImpl taste_FGT_TypeClass = new Taste_FGT_TypeClassImpl();
		return taste_FGT_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Taste_WGT_TypeClass createTaste_WGT_TypeClass() {
		Taste_WGT_TypeClassImpl taste_WGT_TypeClass = new Taste_WGT_TypeClassImpl();
		return taste_WGT_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Gsp_Lage_TypeClass createW_Gsp_Lage_TypeClass() {
		W_Gsp_Lage_TypeClassImpl w_Gsp_Lage_TypeClass = new W_Gsp_Lage_TypeClassImpl();
		return w_Gsp_Lage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WHU_TypeClass createWHU_TypeClass() {
		WHU_TypeClassImpl whU_TypeClass = new WHU_TypeClassImpl();
		return whU_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WUS_TypeClass createWUS_TypeClass() {
		WUS_TypeClassImpl wuS_TypeClass = new WUS_TypeClassImpl();
		return wuS_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMNBArt createENUMNBArtFromString(EDataType eDataType, String initialValue) {
		ENUMNBArt result = ENUMNBArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMNBArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMNBGrenzeArt createENUMNBGrenzeArtFromString(EDataType eDataType, String initialValue) {
		ENUMNBGrenzeArt result = ENUMNBGrenzeArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMNBGrenzeArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMNBRueckgabevoraussetzung createENUMNBRueckgabevoraussetzungFromString(EDataType eDataType, String initialValue) {
		ENUMNBRueckgabevoraussetzung result = ENUMNBRueckgabevoraussetzung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMNBRueckgabevoraussetzungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMNBVerhaeltnisBesonders createENUMNBVerhaeltnisBesondersFromString(EDataType eDataType, String initialValue) {
		ENUMNBVerhaeltnisBesonders result = ENUMNBVerhaeltnisBesonders.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMNBVerhaeltnisBesondersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWGspLage createENUMWGspLageFromString(EDataType eDataType, String initialValue) {
		ENUMWGspLage result = ENUMWGspLage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWGspLageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createBezeichnung_NB_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_NB_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createBezeichnung_NB_Zone_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_NB_Zone_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMNBArt createENUMNBArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMNBArtFromString(NahbedienungPackage.Literals.ENUMNB_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMNBArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMNBArtToString(NahbedienungPackage.Literals.ENUMNB_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMNBGrenzeArt createENUMNBGrenzeArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMNBGrenzeArtFromString(NahbedienungPackage.Literals.ENUMNB_GRENZE_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMNBGrenzeArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMNBGrenzeArtToString(NahbedienungPackage.Literals.ENUMNB_GRENZE_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMNBRueckgabevoraussetzung createENUMNBRueckgabevoraussetzungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMNBRueckgabevoraussetzungFromString(NahbedienungPackage.Literals.ENUMNB_RUECKGABEVORAUSSETZUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMNBRueckgabevoraussetzungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMNBRueckgabevoraussetzungToString(NahbedienungPackage.Literals.ENUMNB_RUECKGABEVORAUSSETZUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMNBVerhaeltnisBesonders createENUMNBVerhaeltnisBesondersObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMNBVerhaeltnisBesondersFromString(NahbedienungPackage.Literals.ENUMNB_VERHAELTNIS_BESONDERS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMNBVerhaeltnisBesondersObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMNBVerhaeltnisBesondersToString(NahbedienungPackage.Literals.ENUMNB_VERHAELTNIS_BESONDERS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWGspLage createENUMWGspLageObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMWGspLageFromString(NahbedienungPackage.Literals.ENUMW_GSP_LAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWGspLageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMWGspLageToString(NahbedienungPackage.Literals.ENUMW_GSP_LAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNB_Zone_Allg_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNB_Zone_Allg_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createRang_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRang_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NahbedienungPackage getNahbedienungPackage() {
		return (NahbedienungPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NahbedienungPackage getPackage() {
		return NahbedienungPackage.eINSTANCE;
	}

} //NahbedienungFactoryImpl
