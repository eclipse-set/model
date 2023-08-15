/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Geodaten.impl;

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

import org.eclipse.set.model.model11001.Geodaten.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeodatenFactoryImpl extends EFactoryImpl implements GeodatenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeodatenFactory init() {
		try {
			GeodatenFactory theGeodatenFactory = (GeodatenFactory)EPackage.Registry.INSTANCE.getEFactory(GeodatenPackage.eNS_URI);
			if (theGeodatenFactory != null) {
				return theGeodatenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeodatenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeodatenFactoryImpl() {
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
			case GeodatenPackage.ANZEIGEGEFUEHRT_ES_KATEGORIE_TYPE_CLASS: return createAnzeigegefuehrt_ES_Kategorie_TypeClass();
			case GeodatenPackage.BEZEICHNUNG_STRECKE_TYPE_CLASS: return createBezeichnung_Strecke_TypeClass();
			case GeodatenPackage.BREMSWEG_TYPE_CLASS: return createBremsweg_TypeClass();
			case GeodatenPackage.GEO_FORM_TYPE_CLASS: return createGEO_Form_TypeClass();
			case GeodatenPackage.GEO_KAD_TYPE_CLASS: return createGEO_KAD_TypeClass();
			case GeodatenPackage.GEO_KANTE: return createGEO_Kante();
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP: return createGEO_Kante_Allg_AttributeGroup();
			case GeodatenPackage.GEO_KNOTEN: return createGEO_Knoten();
			case GeodatenPackage.GEO_KOORDINATENSYSTEM_TYPE_CLASS: return createGEO_Koordinatensystem_TypeClass();
			case GeodatenPackage.GEO_LAENGE_TYPE_CLASS: return createGEO_Laenge_TypeClass();
			case GeodatenPackage.GEO_PAD_TYPE_CLASS: return createGEO_PAD_TypeClass();
			case GeodatenPackage.GEO_PUNKT: return createGEO_Punkt();
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP: return createGEO_Punkt_Allg_AttributeGroup();
			case GeodatenPackage.GEO_RADIUS_ATYPE_CLASS: return createGEO_Radius_A_TypeClass();
			case GeodatenPackage.GEO_RADIUS_BTYPE_CLASS: return createGEO_Radius_B_TypeClass();
			case GeodatenPackage.GEO_RICHTUNGSWINKEL_TYPE_CLASS: return createGEO_Richtungswinkel_TypeClass();
			case GeodatenPackage.GESCHWINDIGKEIT_TYPE_CLASS: return createGeschwindigkeit_TypeClass();
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL: return createGeschwindigkeitsprofil();
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP: return createGeschwindigkeitsprofil_Allg_AttributeGroup();
			case GeodatenPackage.GK_XTYPE_CLASS: return createGK_X_TypeClass();
			case GeodatenPackage.GK_YTYPE_CLASS: return createGK_Y_TypeClass();
			case GeodatenPackage.GK_ZTYPE_CLASS: return createGK_Z_TypeClass();
			case GeodatenPackage.HOEHENLINIE: return createHoehenlinie();
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP: return createHoehenlinie_Allg_AttributeGroup();
			case GeodatenPackage.HOEHENLINIE_FORM_TYPE_CLASS: return createHoehenlinie_Form_TypeClass();
			case GeodatenPackage.HOEHENLINIE_LAENGE_TYPE_CLASS: return createHoehenlinie_Laenge_TypeClass();
			case GeodatenPackage.HOEHENPUNKT: return createHoehenpunkt();
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP: return createHoehenpunkt_Allg_AttributeGroup();
			case GeodatenPackage.HOEHENPUNKT_DATUM_TYPE_CLASS: return createHoehenpunkt_Datum_TypeClass();
			case GeodatenPackage.HOEHENPUNKT_HOEHE_TYPE_CLASS: return createHoehenpunkt_Hoehe_TypeClass();
			case GeodatenPackage.HSYSTEM_TYPE_CLASS: return createHSystem_TypeClass();
			case GeodatenPackage.KANTENNAME_TYPE_CLASS: return createKantenname_TypeClass();
			case GeodatenPackage.KNOTENNAME_TYPE_CLASS: return createKnotenname_TypeClass();
			case GeodatenPackage.NEIGUNG_TYPE_CLASS: return createNeigung_TypeClass();
			case GeodatenPackage.OERTLICHKEIT: return createOertlichkeit();
			case GeodatenPackage.OERTLICHKEIT_ABKUERZUNG_TYPE_CLASS: return createOertlichkeit_Abkuerzung_TypeClass();
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP: return createOertlichkeit_Allg_AttributeGroup();
			case GeodatenPackage.OERTLICHKEIT_ART_TYPE_CLASS: return createOertlichkeit_Art_TypeClass();
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP: return createOertlichkeit_Bezeichnung_AttributeGroup();
			case GeodatenPackage.OERTLICHKEIT_GUELTIG_AB_TYPE_CLASS: return createOertlichkeit_Gueltig_Ab_TypeClass();
			case GeodatenPackage.OERTLICHKEIT_GUELTIG_BIS_TYPE_CLASS: return createOertlichkeit_Gueltig_Bis_TypeClass();
			case GeodatenPackage.OERTLICHKEIT_KURZNAME_TYPE_CLASS: return createOertlichkeit_Kurzname_TypeClass();
			case GeodatenPackage.OERTLICHKEIT_LANGNAME_TYPE_CLASS: return createOertlichkeit_Langname_TypeClass();
			case GeodatenPackage.PLAN_QUELLE_TYPE_CLASS: return createPlan_Quelle_TypeClass();
			case GeodatenPackage.STRECKE: return createStrecke();
			case GeodatenPackage.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP: return createStrecke_Bezeichnung_AttributeGroup();
			case GeodatenPackage.STRECKE_BREMSWEG: return createStrecke_Bremsweg();
			case GeodatenPackage.STRECKE_METER_TYPE_CLASS: return createStrecke_Meter_TypeClass();
			case GeodatenPackage.STRECKE_PUNKT: return createStrecke_Punkt();
			case GeodatenPackage.STRECKE_RICHTUNG_TYPE_CLASS: return createStrecke_Richtung_TypeClass();
			case GeodatenPackage.TB_ART_TYPE_CLASS: return createTB_Art_TypeClass();
			case GeodatenPackage.TB_BESCHREIBUNG_TYPE_CLASS: return createTB_Beschreibung_TypeClass();
			case GeodatenPackage.TECHNISCHER_BEREICH: return createTechnischer_Bereich();
			case GeodatenPackage.TECHNISCHER_PUNKT: return createTechnischer_Punkt();
			case GeodatenPackage.TOP_ANSCHLUSS_ATYPE_CLASS: return createTOP_Anschluss_A_TypeClass();
			case GeodatenPackage.TOP_ANSCHLUSS_BTYPE_CLASS: return createTOP_Anschluss_B_TypeClass();
			case GeodatenPackage.TOP_KANTE: return createTOP_Kante();
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP: return createTOP_Kante_Allg_AttributeGroup();
			case GeodatenPackage.TOP_KNOTEN: return createTOP_Knoten();
			case GeodatenPackage.TOP_LAENGE_TYPE_CLASS: return createTOP_Laenge_TypeClass();
			case GeodatenPackage.TP_ART_TYPE_CLASS: return createTP_Art_TypeClass();
			case GeodatenPackage.TP_BESCHREIBUNG_TYPE_CLASS: return createTP_Beschreibung_TypeClass();
			case GeodatenPackage.TRASSE_KANTE_CHILD_ATTRIBUTE_GROUP: return createTrasse_Kante_child_AttributeGroup();
			case GeodatenPackage.UEBERHOEHUNG: return createUeberhoehung();
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP: return createUeberhoehung_Allg_AttributeGroup();
			case GeodatenPackage.UEBERHOEHUNG_DATUM_TYPE_CLASS: return createUeberhoehung_Datum_TypeClass();
			case GeodatenPackage.UEBERHOEHUNG_HOEHE_TYPE_CLASS: return createUeberhoehung_Hoehe_TypeClass();
			case GeodatenPackage.UEBERHOEHUNGSLINIE: return createUeberhoehungslinie();
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP: return createUeberhoehungslinie_Allg_AttributeGroup();
			case GeodatenPackage.UEBERHOEHUNGSLINIE_FORM_TYPE_CLASS: return createUeberhoehungslinie_Form_TypeClass();
			case GeodatenPackage.UEBERHOEHUNGSLINIE_LAENGE_TYPE_CLASS: return createUeberhoehungslinie_Laenge_TypeClass();
			case GeodatenPackage.VPROFIL_ART_TYPE_CLASS: return createV_Profil_Art_TypeClass();
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
			case GeodatenPackage.ENUMGEO_FORM:
				return createENUMGEOFormFromString(eDataType, initialValue);
			case GeodatenPackage.ENUMGEO_KOORDINATENSYSTEM:
				return createENUMGEOKoordinatensystemFromString(eDataType, initialValue);
			case GeodatenPackage.ENUM_HOEHENLINIE_FORM:
				return createENUMHoehenlinieFormFromString(eDataType, initialValue);
			case GeodatenPackage.ENUMH_SYSTEM:
				return createENUMHSystemFromString(eDataType, initialValue);
			case GeodatenPackage.ENUM_OERTLICHKEIT_ART:
				return createENUMOertlichkeitArtFromString(eDataType, initialValue);
			case GeodatenPackage.ENUM_PLAN_QUELLE:
				return createENUMPlanQuelleFromString(eDataType, initialValue);
			case GeodatenPackage.ENUM_STRECKE_RICHTUNG:
				return createENUMStreckeRichtungFromString(eDataType, initialValue);
			case GeodatenPackage.ENUMTB_ART:
				return createENUMTBArtFromString(eDataType, initialValue);
			case GeodatenPackage.ENUMTOP_ANSCHLUSS:
				return createENUMTOPAnschlussFromString(eDataType, initialValue);
			case GeodatenPackage.ENUMTP_ART:
				return createENUMTPArtFromString(eDataType, initialValue);
			case GeodatenPackage.ENUM_UEBERHOEHUNGSLINIE_FORM:
				return createENUMUeberhoehungslinieFormFromString(eDataType, initialValue);
			case GeodatenPackage.ENUMV_PROFIL_ART:
				return createENUMVProfilArtFromString(eDataType, initialValue);
			case GeodatenPackage.ANZEIGEGEFUEHRT_ES_KATEGORIE_TYPE:
				return createAnzeigegefuehrt_ES_Kategorie_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.BEZEICHNUNG_STRECKE_TYPE:
				return createBezeichnung_Strecke_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.ENUMERATION1:
				return createEnumeration1FromString(eDataType, initialValue);
			case GeodatenPackage.ENUMGEO_FORM_OBJECT:
				return createENUMGEOFormObjectFromString(eDataType, initialValue);
			case GeodatenPackage.ENUMGEO_KOORDINATENSYSTEM_OBJECT:
				return createENUMGEOKoordinatensystemObjectFromString(eDataType, initialValue);
			case GeodatenPackage.ENUM_HOEHENLINIE_FORM_OBJECT:
				return createENUMHoehenlinieFormObjectFromString(eDataType, initialValue);
			case GeodatenPackage.ENUMH_SYSTEM_OBJECT:
				return createENUMHSystemObjectFromString(eDataType, initialValue);
			case GeodatenPackage.ENUM_OERTLICHKEIT_ART_OBJECT:
				return createENUMOertlichkeitArtObjectFromString(eDataType, initialValue);
			case GeodatenPackage.ENUM_PLAN_QUELLE_OBJECT:
				return createENUMPlanQuelleObjectFromString(eDataType, initialValue);
			case GeodatenPackage.ENUM_STRECKE_RICHTUNG_OBJECT:
				return createENUMStreckeRichtungObjectFromString(eDataType, initialValue);
			case GeodatenPackage.ENUMTB_ART_OBJECT:
				return createENUMTBArtObjectFromString(eDataType, initialValue);
			case GeodatenPackage.ENUMTOP_ANSCHLUSS_OBJECT:
				return createENUMTOPAnschlussObjectFromString(eDataType, initialValue);
			case GeodatenPackage.ENUMTP_ART_OBJECT:
				return createENUMTPArtObjectFromString(eDataType, initialValue);
			case GeodatenPackage.ENUM_UEBERHOEHUNGSLINIE_FORM_OBJECT:
				return createENUMUeberhoehungslinieFormObjectFromString(eDataType, initialValue);
			case GeodatenPackage.ENUMV_PROFIL_ART_OBJECT:
				return createENUMVProfilArtObjectFromString(eDataType, initialValue);
			case GeodatenPackage.GEO_KAD_TYPE:
				return createGEO_KAD_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.GEO_LAENGE_TYPE:
				return createGEO_Laenge_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.GEO_PAD_TYPE:
				return createGEO_PAD_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.GEO_RADIUS_ATYPE:
				return createGEO_Radius_A_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.GEO_RADIUS_BTYPE:
				return createGEO_Radius_B_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.GEO_RICHTUNGSWINKEL_TYPE:
				return createGEO_Richtungswinkel_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.GESCHWINDIGKEIT_TYPE:
				return createGeschwindigkeit_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.GK_XTYPE:
				return createGK_X_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.GK_YTYPE:
				return createGK_Y_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.GK_ZTYPE:
				return createGK_Z_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.HOEHENLINIE_LAENGE_TYPE:
				return createHoehenlinie_Laenge_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.HOEHENPUNKT_HOEHE_TYPE:
				return createHoehenpunkt_Hoehe_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.KANTENNAME_TYPE:
				return createKantenname_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.KNOTENNAME_TYPE:
				return createKnotenname_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.NEIGUNG_TYPE:
				return createNeigung_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.OERTLICHKEIT_ABKUERZUNG_TYPE:
				return createOertlichkeit_Abkuerzung_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.OERTLICHKEIT_KURZNAME_TYPE:
				return createOertlichkeit_Kurzname_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.OERTLICHKEIT_LANGNAME_TYPE:
				return createOertlichkeit_Langname_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.STRECKE_METER_TYPE:
				return createStrecke_Meter_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.TB_BESCHREIBUNG_TYPE:
				return createTB_Beschreibung_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.TOP_LAENGE_TYPE:
				return createTOP_Laenge_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.TP_BESCHREIBUNG_TYPE:
				return createTP_Beschreibung_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.UEBERHOEHUNG_HOEHE_TYPE:
				return createUeberhoehung_Hoehe_TypeFromString(eDataType, initialValue);
			case GeodatenPackage.UEBERHOEHUNGSLINIE_LAENGE_TYPE:
				return createUeberhoehungslinie_Laenge_TypeFromString(eDataType, initialValue);
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
			case GeodatenPackage.ENUMGEO_FORM:
				return convertENUMGEOFormToString(eDataType, instanceValue);
			case GeodatenPackage.ENUMGEO_KOORDINATENSYSTEM:
				return convertENUMGEOKoordinatensystemToString(eDataType, instanceValue);
			case GeodatenPackage.ENUM_HOEHENLINIE_FORM:
				return convertENUMHoehenlinieFormToString(eDataType, instanceValue);
			case GeodatenPackage.ENUMH_SYSTEM:
				return convertENUMHSystemToString(eDataType, instanceValue);
			case GeodatenPackage.ENUM_OERTLICHKEIT_ART:
				return convertENUMOertlichkeitArtToString(eDataType, instanceValue);
			case GeodatenPackage.ENUM_PLAN_QUELLE:
				return convertENUMPlanQuelleToString(eDataType, instanceValue);
			case GeodatenPackage.ENUM_STRECKE_RICHTUNG:
				return convertENUMStreckeRichtungToString(eDataType, instanceValue);
			case GeodatenPackage.ENUMTB_ART:
				return convertENUMTBArtToString(eDataType, instanceValue);
			case GeodatenPackage.ENUMTOP_ANSCHLUSS:
				return convertENUMTOPAnschlussToString(eDataType, instanceValue);
			case GeodatenPackage.ENUMTP_ART:
				return convertENUMTPArtToString(eDataType, instanceValue);
			case GeodatenPackage.ENUM_UEBERHOEHUNGSLINIE_FORM:
				return convertENUMUeberhoehungslinieFormToString(eDataType, instanceValue);
			case GeodatenPackage.ENUMV_PROFIL_ART:
				return convertENUMVProfilArtToString(eDataType, instanceValue);
			case GeodatenPackage.ANZEIGEGEFUEHRT_ES_KATEGORIE_TYPE:
				return convertAnzeigegefuehrt_ES_Kategorie_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.BEZEICHNUNG_STRECKE_TYPE:
				return convertBezeichnung_Strecke_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.ENUMERATION1:
				return convertEnumeration1ToString(eDataType, instanceValue);
			case GeodatenPackage.ENUMGEO_FORM_OBJECT:
				return convertENUMGEOFormObjectToString(eDataType, instanceValue);
			case GeodatenPackage.ENUMGEO_KOORDINATENSYSTEM_OBJECT:
				return convertENUMGEOKoordinatensystemObjectToString(eDataType, instanceValue);
			case GeodatenPackage.ENUM_HOEHENLINIE_FORM_OBJECT:
				return convertENUMHoehenlinieFormObjectToString(eDataType, instanceValue);
			case GeodatenPackage.ENUMH_SYSTEM_OBJECT:
				return convertENUMHSystemObjectToString(eDataType, instanceValue);
			case GeodatenPackage.ENUM_OERTLICHKEIT_ART_OBJECT:
				return convertENUMOertlichkeitArtObjectToString(eDataType, instanceValue);
			case GeodatenPackage.ENUM_PLAN_QUELLE_OBJECT:
				return convertENUMPlanQuelleObjectToString(eDataType, instanceValue);
			case GeodatenPackage.ENUM_STRECKE_RICHTUNG_OBJECT:
				return convertENUMStreckeRichtungObjectToString(eDataType, instanceValue);
			case GeodatenPackage.ENUMTB_ART_OBJECT:
				return convertENUMTBArtObjectToString(eDataType, instanceValue);
			case GeodatenPackage.ENUMTOP_ANSCHLUSS_OBJECT:
				return convertENUMTOPAnschlussObjectToString(eDataType, instanceValue);
			case GeodatenPackage.ENUMTP_ART_OBJECT:
				return convertENUMTPArtObjectToString(eDataType, instanceValue);
			case GeodatenPackage.ENUM_UEBERHOEHUNGSLINIE_FORM_OBJECT:
				return convertENUMUeberhoehungslinieFormObjectToString(eDataType, instanceValue);
			case GeodatenPackage.ENUMV_PROFIL_ART_OBJECT:
				return convertENUMVProfilArtObjectToString(eDataType, instanceValue);
			case GeodatenPackage.GEO_KAD_TYPE:
				return convertGEO_KAD_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.GEO_LAENGE_TYPE:
				return convertGEO_Laenge_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.GEO_PAD_TYPE:
				return convertGEO_PAD_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.GEO_RADIUS_ATYPE:
				return convertGEO_Radius_A_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.GEO_RADIUS_BTYPE:
				return convertGEO_Radius_B_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.GEO_RICHTUNGSWINKEL_TYPE:
				return convertGEO_Richtungswinkel_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.GESCHWINDIGKEIT_TYPE:
				return convertGeschwindigkeit_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.GK_XTYPE:
				return convertGK_X_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.GK_YTYPE:
				return convertGK_Y_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.GK_ZTYPE:
				return convertGK_Z_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.HOEHENLINIE_LAENGE_TYPE:
				return convertHoehenlinie_Laenge_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.HOEHENPUNKT_HOEHE_TYPE:
				return convertHoehenpunkt_Hoehe_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.KANTENNAME_TYPE:
				return convertKantenname_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.KNOTENNAME_TYPE:
				return convertKnotenname_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.NEIGUNG_TYPE:
				return convertNeigung_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.OERTLICHKEIT_ABKUERZUNG_TYPE:
				return convertOertlichkeit_Abkuerzung_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.OERTLICHKEIT_KURZNAME_TYPE:
				return convertOertlichkeit_Kurzname_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.OERTLICHKEIT_LANGNAME_TYPE:
				return convertOertlichkeit_Langname_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.STRECKE_METER_TYPE:
				return convertStrecke_Meter_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.TB_BESCHREIBUNG_TYPE:
				return convertTB_Beschreibung_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.TOP_LAENGE_TYPE:
				return convertTOP_Laenge_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.TP_BESCHREIBUNG_TYPE:
				return convertTP_Beschreibung_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.UEBERHOEHUNG_HOEHE_TYPE:
				return convertUeberhoehung_Hoehe_TypeToString(eDataType, instanceValue);
			case GeodatenPackage.UEBERHOEHUNGSLINIE_LAENGE_TYPE:
				return convertUeberhoehungslinie_Laenge_TypeToString(eDataType, instanceValue);
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
	public Anzeigegefuehrt_ES_Kategorie_TypeClass createAnzeigegefuehrt_ES_Kategorie_TypeClass() {
		Anzeigegefuehrt_ES_Kategorie_TypeClassImpl anzeigegefuehrt_ES_Kategorie_TypeClass = new Anzeigegefuehrt_ES_Kategorie_TypeClassImpl();
		return anzeigegefuehrt_ES_Kategorie_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Strecke_TypeClass createBezeichnung_Strecke_TypeClass() {
		Bezeichnung_Strecke_TypeClassImpl bezeichnung_Strecke_TypeClass = new Bezeichnung_Strecke_TypeClassImpl();
		return bezeichnung_Strecke_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bremsweg_TypeClass createBremsweg_TypeClass() {
		Bremsweg_TypeClassImpl bremsweg_TypeClass = new Bremsweg_TypeClassImpl();
		return bremsweg_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Form_TypeClass createGEO_Form_TypeClass() {
		GEO_Form_TypeClassImpl geO_Form_TypeClass = new GEO_Form_TypeClassImpl();
		return geO_Form_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_KAD_TypeClass createGEO_KAD_TypeClass() {
		GEO_KAD_TypeClassImpl geO_KAD_TypeClass = new GEO_KAD_TypeClassImpl();
		return geO_KAD_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Kante createGEO_Kante() {
		GEO_KanteImpl geO_Kante = new GEO_KanteImpl();
		return geO_Kante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Kante_Allg_AttributeGroup createGEO_Kante_Allg_AttributeGroup() {
		GEO_Kante_Allg_AttributeGroupImpl geO_Kante_Allg_AttributeGroup = new GEO_Kante_Allg_AttributeGroupImpl();
		return geO_Kante_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Knoten createGEO_Knoten() {
		GEO_KnotenImpl geO_Knoten = new GEO_KnotenImpl();
		return geO_Knoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Koordinatensystem_TypeClass createGEO_Koordinatensystem_TypeClass() {
		GEO_Koordinatensystem_TypeClassImpl geO_Koordinatensystem_TypeClass = new GEO_Koordinatensystem_TypeClassImpl();
		return geO_Koordinatensystem_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Laenge_TypeClass createGEO_Laenge_TypeClass() {
		GEO_Laenge_TypeClassImpl geO_Laenge_TypeClass = new GEO_Laenge_TypeClassImpl();
		return geO_Laenge_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_PAD_TypeClass createGEO_PAD_TypeClass() {
		GEO_PAD_TypeClassImpl geO_PAD_TypeClass = new GEO_PAD_TypeClassImpl();
		return geO_PAD_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Punkt createGEO_Punkt() {
		GEO_PunktImpl geO_Punkt = new GEO_PunktImpl();
		return geO_Punkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Punkt_Allg_AttributeGroup createGEO_Punkt_Allg_AttributeGroup() {
		GEO_Punkt_Allg_AttributeGroupImpl geO_Punkt_Allg_AttributeGroup = new GEO_Punkt_Allg_AttributeGroupImpl();
		return geO_Punkt_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Radius_A_TypeClass createGEO_Radius_A_TypeClass() {
		GEO_Radius_A_TypeClassImpl geO_Radius_A_TypeClass = new GEO_Radius_A_TypeClassImpl();
		return geO_Radius_A_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Radius_B_TypeClass createGEO_Radius_B_TypeClass() {
		GEO_Radius_B_TypeClassImpl geO_Radius_B_TypeClass = new GEO_Radius_B_TypeClassImpl();
		return geO_Radius_B_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Richtungswinkel_TypeClass createGEO_Richtungswinkel_TypeClass() {
		GEO_Richtungswinkel_TypeClassImpl geO_Richtungswinkel_TypeClass = new GEO_Richtungswinkel_TypeClassImpl();
		return geO_Richtungswinkel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geschwindigkeit_TypeClass createGeschwindigkeit_TypeClass() {
		Geschwindigkeit_TypeClassImpl geschwindigkeit_TypeClass = new Geschwindigkeit_TypeClassImpl();
		return geschwindigkeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geschwindigkeitsprofil createGeschwindigkeitsprofil() {
		GeschwindigkeitsprofilImpl geschwindigkeitsprofil = new GeschwindigkeitsprofilImpl();
		return geschwindigkeitsprofil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geschwindigkeitsprofil_Allg_AttributeGroup createGeschwindigkeitsprofil_Allg_AttributeGroup() {
		Geschwindigkeitsprofil_Allg_AttributeGroupImpl geschwindigkeitsprofil_Allg_AttributeGroup = new Geschwindigkeitsprofil_Allg_AttributeGroupImpl();
		return geschwindigkeitsprofil_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GK_X_TypeClass createGK_X_TypeClass() {
		GK_X_TypeClassImpl gK_X_TypeClass = new GK_X_TypeClassImpl();
		return gK_X_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GK_Y_TypeClass createGK_Y_TypeClass() {
		GK_Y_TypeClassImpl gK_Y_TypeClass = new GK_Y_TypeClassImpl();
		return gK_Y_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GK_Z_TypeClass createGK_Z_TypeClass() {
		GK_Z_TypeClassImpl gK_Z_TypeClass = new GK_Z_TypeClassImpl();
		return gK_Z_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenlinie createHoehenlinie() {
		HoehenlinieImpl hoehenlinie = new HoehenlinieImpl();
		return hoehenlinie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenlinie_Allg_AttributeGroup createHoehenlinie_Allg_AttributeGroup() {
		Hoehenlinie_Allg_AttributeGroupImpl hoehenlinie_Allg_AttributeGroup = new Hoehenlinie_Allg_AttributeGroupImpl();
		return hoehenlinie_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenlinie_Form_TypeClass createHoehenlinie_Form_TypeClass() {
		Hoehenlinie_Form_TypeClassImpl hoehenlinie_Form_TypeClass = new Hoehenlinie_Form_TypeClassImpl();
		return hoehenlinie_Form_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenlinie_Laenge_TypeClass createHoehenlinie_Laenge_TypeClass() {
		Hoehenlinie_Laenge_TypeClassImpl hoehenlinie_Laenge_TypeClass = new Hoehenlinie_Laenge_TypeClassImpl();
		return hoehenlinie_Laenge_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenpunkt createHoehenpunkt() {
		HoehenpunktImpl hoehenpunkt = new HoehenpunktImpl();
		return hoehenpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenpunkt_Allg_AttributeGroup createHoehenpunkt_Allg_AttributeGroup() {
		Hoehenpunkt_Allg_AttributeGroupImpl hoehenpunkt_Allg_AttributeGroup = new Hoehenpunkt_Allg_AttributeGroupImpl();
		return hoehenpunkt_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenpunkt_Datum_TypeClass createHoehenpunkt_Datum_TypeClass() {
		Hoehenpunkt_Datum_TypeClassImpl hoehenpunkt_Datum_TypeClass = new Hoehenpunkt_Datum_TypeClassImpl();
		return hoehenpunkt_Datum_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenpunkt_Hoehe_TypeClass createHoehenpunkt_Hoehe_TypeClass() {
		Hoehenpunkt_Hoehe_TypeClassImpl hoehenpunkt_Hoehe_TypeClass = new Hoehenpunkt_Hoehe_TypeClassImpl();
		return hoehenpunkt_Hoehe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HSystem_TypeClass createHSystem_TypeClass() {
		HSystem_TypeClassImpl hSystem_TypeClass = new HSystem_TypeClassImpl();
		return hSystem_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kantenname_TypeClass createKantenname_TypeClass() {
		Kantenname_TypeClassImpl kantenname_TypeClass = new Kantenname_TypeClassImpl();
		return kantenname_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Knotenname_TypeClass createKnotenname_TypeClass() {
		Knotenname_TypeClassImpl knotenname_TypeClass = new Knotenname_TypeClassImpl();
		return knotenname_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Neigung_TypeClass createNeigung_TypeClass() {
		Neigung_TypeClassImpl neigung_TypeClass = new Neigung_TypeClassImpl();
		return neigung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit createOertlichkeit() {
		OertlichkeitImpl oertlichkeit = new OertlichkeitImpl();
		return oertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Abkuerzung_TypeClass createOertlichkeit_Abkuerzung_TypeClass() {
		Oertlichkeit_Abkuerzung_TypeClassImpl oertlichkeit_Abkuerzung_TypeClass = new Oertlichkeit_Abkuerzung_TypeClassImpl();
		return oertlichkeit_Abkuerzung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Allg_AttributeGroup createOertlichkeit_Allg_AttributeGroup() {
		Oertlichkeit_Allg_AttributeGroupImpl oertlichkeit_Allg_AttributeGroup = new Oertlichkeit_Allg_AttributeGroupImpl();
		return oertlichkeit_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Art_TypeClass createOertlichkeit_Art_TypeClass() {
		Oertlichkeit_Art_TypeClassImpl oertlichkeit_Art_TypeClass = new Oertlichkeit_Art_TypeClassImpl();
		return oertlichkeit_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Bezeichnung_AttributeGroup createOertlichkeit_Bezeichnung_AttributeGroup() {
		Oertlichkeit_Bezeichnung_AttributeGroupImpl oertlichkeit_Bezeichnung_AttributeGroup = new Oertlichkeit_Bezeichnung_AttributeGroupImpl();
		return oertlichkeit_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Gueltig_Ab_TypeClass createOertlichkeit_Gueltig_Ab_TypeClass() {
		Oertlichkeit_Gueltig_Ab_TypeClassImpl oertlichkeit_Gueltig_Ab_TypeClass = new Oertlichkeit_Gueltig_Ab_TypeClassImpl();
		return oertlichkeit_Gueltig_Ab_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Gueltig_Bis_TypeClass createOertlichkeit_Gueltig_Bis_TypeClass() {
		Oertlichkeit_Gueltig_Bis_TypeClassImpl oertlichkeit_Gueltig_Bis_TypeClass = new Oertlichkeit_Gueltig_Bis_TypeClassImpl();
		return oertlichkeit_Gueltig_Bis_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Kurzname_TypeClass createOertlichkeit_Kurzname_TypeClass() {
		Oertlichkeit_Kurzname_TypeClassImpl oertlichkeit_Kurzname_TypeClass = new Oertlichkeit_Kurzname_TypeClassImpl();
		return oertlichkeit_Kurzname_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Langname_TypeClass createOertlichkeit_Langname_TypeClass() {
		Oertlichkeit_Langname_TypeClassImpl oertlichkeit_Langname_TypeClass = new Oertlichkeit_Langname_TypeClassImpl();
		return oertlichkeit_Langname_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plan_Quelle_TypeClass createPlan_Quelle_TypeClass() {
		Plan_Quelle_TypeClassImpl plan_Quelle_TypeClass = new Plan_Quelle_TypeClassImpl();
		return plan_Quelle_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke createStrecke() {
		StreckeImpl strecke = new StreckeImpl();
		return strecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Bezeichnung_AttributeGroup createStrecke_Bezeichnung_AttributeGroup() {
		Strecke_Bezeichnung_AttributeGroupImpl strecke_Bezeichnung_AttributeGroup = new Strecke_Bezeichnung_AttributeGroupImpl();
		return strecke_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Bremsweg createStrecke_Bremsweg() {
		Strecke_BremswegImpl strecke_Bremsweg = new Strecke_BremswegImpl();
		return strecke_Bremsweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Meter_TypeClass createStrecke_Meter_TypeClass() {
		Strecke_Meter_TypeClassImpl strecke_Meter_TypeClass = new Strecke_Meter_TypeClassImpl();
		return strecke_Meter_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Punkt createStrecke_Punkt() {
		Strecke_PunktImpl strecke_Punkt = new Strecke_PunktImpl();
		return strecke_Punkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Richtung_TypeClass createStrecke_Richtung_TypeClass() {
		Strecke_Richtung_TypeClassImpl strecke_Richtung_TypeClass = new Strecke_Richtung_TypeClassImpl();
		return strecke_Richtung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TB_Art_TypeClass createTB_Art_TypeClass() {
		TB_Art_TypeClassImpl tB_Art_TypeClass = new TB_Art_TypeClassImpl();
		return tB_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TB_Beschreibung_TypeClass createTB_Beschreibung_TypeClass() {
		TB_Beschreibung_TypeClassImpl tB_Beschreibung_TypeClass = new TB_Beschreibung_TypeClassImpl();
		return tB_Beschreibung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technischer_Bereich createTechnischer_Bereich() {
		Technischer_BereichImpl technischer_Bereich = new Technischer_BereichImpl();
		return technischer_Bereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technischer_Punkt createTechnischer_Punkt() {
		Technischer_PunktImpl technischer_Punkt = new Technischer_PunktImpl();
		return technischer_Punkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOP_Anschluss_A_TypeClass createTOP_Anschluss_A_TypeClass() {
		TOP_Anschluss_A_TypeClassImpl toP_Anschluss_A_TypeClass = new TOP_Anschluss_A_TypeClassImpl();
		return toP_Anschluss_A_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOP_Anschluss_B_TypeClass createTOP_Anschluss_B_TypeClass() {
		TOP_Anschluss_B_TypeClassImpl toP_Anschluss_B_TypeClass = new TOP_Anschluss_B_TypeClassImpl();
		return toP_Anschluss_B_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOP_Kante createTOP_Kante() {
		TOP_KanteImpl toP_Kante = new TOP_KanteImpl();
		return toP_Kante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOP_Kante_Allg_AttributeGroup createTOP_Kante_Allg_AttributeGroup() {
		TOP_Kante_Allg_AttributeGroupImpl toP_Kante_Allg_AttributeGroup = new TOP_Kante_Allg_AttributeGroupImpl();
		return toP_Kante_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOP_Knoten createTOP_Knoten() {
		TOP_KnotenImpl toP_Knoten = new TOP_KnotenImpl();
		return toP_Knoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOP_Laenge_TypeClass createTOP_Laenge_TypeClass() {
		TOP_Laenge_TypeClassImpl toP_Laenge_TypeClass = new TOP_Laenge_TypeClassImpl();
		return toP_Laenge_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TP_Art_TypeClass createTP_Art_TypeClass() {
		TP_Art_TypeClassImpl tP_Art_TypeClass = new TP_Art_TypeClassImpl();
		return tP_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TP_Beschreibung_TypeClass createTP_Beschreibung_TypeClass() {
		TP_Beschreibung_TypeClassImpl tP_Beschreibung_TypeClass = new TP_Beschreibung_TypeClassImpl();
		return tP_Beschreibung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trasse_Kante_child_AttributeGroup createTrasse_Kante_child_AttributeGroup() {
		Trasse_Kante_child_AttributeGroupImpl trasse_Kante_child_AttributeGroup = new Trasse_Kante_child_AttributeGroupImpl();
		return trasse_Kante_child_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehung createUeberhoehung() {
		UeberhoehungImpl ueberhoehung = new UeberhoehungImpl();
		return ueberhoehung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehung_Allg_AttributeGroup createUeberhoehung_Allg_AttributeGroup() {
		Ueberhoehung_Allg_AttributeGroupImpl ueberhoehung_Allg_AttributeGroup = new Ueberhoehung_Allg_AttributeGroupImpl();
		return ueberhoehung_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehung_Datum_TypeClass createUeberhoehung_Datum_TypeClass() {
		Ueberhoehung_Datum_TypeClassImpl ueberhoehung_Datum_TypeClass = new Ueberhoehung_Datum_TypeClassImpl();
		return ueberhoehung_Datum_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehung_Hoehe_TypeClass createUeberhoehung_Hoehe_TypeClass() {
		Ueberhoehung_Hoehe_TypeClassImpl ueberhoehung_Hoehe_TypeClass = new Ueberhoehung_Hoehe_TypeClassImpl();
		return ueberhoehung_Hoehe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehungslinie createUeberhoehungslinie() {
		UeberhoehungslinieImpl ueberhoehungslinie = new UeberhoehungslinieImpl();
		return ueberhoehungslinie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehungslinie_Allg_AttributeGroup createUeberhoehungslinie_Allg_AttributeGroup() {
		Ueberhoehungslinie_Allg_AttributeGroupImpl ueberhoehungslinie_Allg_AttributeGroup = new Ueberhoehungslinie_Allg_AttributeGroupImpl();
		return ueberhoehungslinie_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehungslinie_Form_TypeClass createUeberhoehungslinie_Form_TypeClass() {
		Ueberhoehungslinie_Form_TypeClassImpl ueberhoehungslinie_Form_TypeClass = new Ueberhoehungslinie_Form_TypeClassImpl();
		return ueberhoehungslinie_Form_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehungslinie_Laenge_TypeClass createUeberhoehungslinie_Laenge_TypeClass() {
		Ueberhoehungslinie_Laenge_TypeClassImpl ueberhoehungslinie_Laenge_TypeClass = new Ueberhoehungslinie_Laenge_TypeClassImpl();
		return ueberhoehungslinie_Laenge_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Profil_Art_TypeClass createV_Profil_Art_TypeClass() {
		V_Profil_Art_TypeClassImpl v_Profil_Art_TypeClass = new V_Profil_Art_TypeClassImpl();
		return v_Profil_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGEOForm createENUMGEOFormFromString(EDataType eDataType, String initialValue) {
		ENUMGEOForm result = ENUMGEOForm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGEOFormToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGEOKoordinatensystem createENUMGEOKoordinatensystemFromString(EDataType eDataType, String initialValue) {
		ENUMGEOKoordinatensystem result = ENUMGEOKoordinatensystem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGEOKoordinatensystemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMHoehenlinieForm createENUMHoehenlinieFormFromString(EDataType eDataType, String initialValue) {
		ENUMHoehenlinieForm result = ENUMHoehenlinieForm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMHoehenlinieFormToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMHSystem createENUMHSystemFromString(EDataType eDataType, String initialValue) {
		ENUMHSystem result = ENUMHSystem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMHSystemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMOertlichkeitArt createENUMOertlichkeitArtFromString(EDataType eDataType, String initialValue) {
		ENUMOertlichkeitArt result = ENUMOertlichkeitArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMOertlichkeitArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMPlanQuelle createENUMPlanQuelleFromString(EDataType eDataType, String initialValue) {
		ENUMPlanQuelle result = ENUMPlanQuelle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMPlanQuelleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMStreckeRichtung createENUMStreckeRichtungFromString(EDataType eDataType, String initialValue) {
		ENUMStreckeRichtung result = ENUMStreckeRichtung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMStreckeRichtungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTBArt createENUMTBArtFromString(EDataType eDataType, String initialValue) {
		ENUMTBArt result = ENUMTBArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTBArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTOPAnschluss createENUMTOPAnschlussFromString(EDataType eDataType, String initialValue) {
		ENUMTOPAnschluss result = ENUMTOPAnschluss.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTOPAnschlussToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTPArt createENUMTPArtFromString(EDataType eDataType, String initialValue) {
		ENUMTPArt result = ENUMTPArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTPArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMUeberhoehungslinieForm createENUMUeberhoehungslinieFormFromString(EDataType eDataType, String initialValue) {
		ENUMUeberhoehungslinieForm result = ENUMUeberhoehungslinieForm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMUeberhoehungslinieFormToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMVProfilArt createENUMVProfilArtFromString(EDataType eDataType, String initialValue) {
		ENUMVProfilArt result = ENUMVProfilArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMVProfilArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAnzeigegefuehrt_ES_Kategorie_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnzeigegefuehrt_ES_Kategorie_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Strecke_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Strecke_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEnumeration1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumeration1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGEOForm createENUMGEOFormObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMGEOFormFromString(GeodatenPackage.Literals.ENUMGEO_FORM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGEOFormObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMGEOFormToString(GeodatenPackage.Literals.ENUMGEO_FORM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGEOKoordinatensystem createENUMGEOKoordinatensystemObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMGEOKoordinatensystemFromString(GeodatenPackage.Literals.ENUMGEO_KOORDINATENSYSTEM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGEOKoordinatensystemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMGEOKoordinatensystemToString(GeodatenPackage.Literals.ENUMGEO_KOORDINATENSYSTEM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMHoehenlinieForm createENUMHoehenlinieFormObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMHoehenlinieFormFromString(GeodatenPackage.Literals.ENUM_HOEHENLINIE_FORM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMHoehenlinieFormObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMHoehenlinieFormToString(GeodatenPackage.Literals.ENUM_HOEHENLINIE_FORM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMHSystem createENUMHSystemObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMHSystemFromString(GeodatenPackage.Literals.ENUMH_SYSTEM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMHSystemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMHSystemToString(GeodatenPackage.Literals.ENUMH_SYSTEM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMOertlichkeitArt createENUMOertlichkeitArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMOertlichkeitArtFromString(GeodatenPackage.Literals.ENUM_OERTLICHKEIT_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMOertlichkeitArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMOertlichkeitArtToString(GeodatenPackage.Literals.ENUM_OERTLICHKEIT_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMPlanQuelle createENUMPlanQuelleObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMPlanQuelleFromString(GeodatenPackage.Literals.ENUM_PLAN_QUELLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMPlanQuelleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMPlanQuelleToString(GeodatenPackage.Literals.ENUM_PLAN_QUELLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMStreckeRichtung createENUMStreckeRichtungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMStreckeRichtungFromString(GeodatenPackage.Literals.ENUM_STRECKE_RICHTUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMStreckeRichtungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMStreckeRichtungToString(GeodatenPackage.Literals.ENUM_STRECKE_RICHTUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTBArt createENUMTBArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMTBArtFromString(GeodatenPackage.Literals.ENUMTB_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTBArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMTBArtToString(GeodatenPackage.Literals.ENUMTB_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTOPAnschluss createENUMTOPAnschlussObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMTOPAnschlussFromString(GeodatenPackage.Literals.ENUMTOP_ANSCHLUSS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTOPAnschlussObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMTOPAnschlussToString(GeodatenPackage.Literals.ENUMTOP_ANSCHLUSS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTPArt createENUMTPArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMTPArtFromString(GeodatenPackage.Literals.ENUMTP_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTPArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMTPArtToString(GeodatenPackage.Literals.ENUMTP_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMUeberhoehungslinieForm createENUMUeberhoehungslinieFormObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMUeberhoehungslinieFormFromString(GeodatenPackage.Literals.ENUM_UEBERHOEHUNGSLINIE_FORM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMUeberhoehungslinieFormObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMUeberhoehungslinieFormToString(GeodatenPackage.Literals.ENUM_UEBERHOEHUNGSLINIE_FORM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMVProfilArt createENUMVProfilArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMVProfilArtFromString(GeodatenPackage.Literals.ENUMV_PROFIL_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMVProfilArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMVProfilArtToString(GeodatenPackage.Literals.ENUMV_PROFIL_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createGEO_KAD_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGEO_KAD_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createGEO_Laenge_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGEO_Laenge_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createGEO_PAD_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGEO_PAD_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createGEO_Radius_A_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGEO_Radius_A_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createGEO_Radius_B_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGEO_Radius_B_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createGEO_Richtungswinkel_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGEO_Richtungswinkel_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createGeschwindigkeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeschwindigkeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createGK_X_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGK_X_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createGK_Y_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGK_Y_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createGK_Z_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGK_Z_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createHoehenlinie_Laenge_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHoehenlinie_Laenge_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createHoehenpunkt_Hoehe_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHoehenpunkt_Hoehe_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createKantenname_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKantenname_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createKnotenname_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKnotenname_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createNeigung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNeigung_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOertlichkeit_Abkuerzung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOertlichkeit_Abkuerzung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOertlichkeit_Kurzname_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOertlichkeit_Kurzname_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOertlichkeit_Langname_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOertlichkeit_Langname_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createStrecke_Meter_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrecke_Meter_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTB_Beschreibung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTB_Beschreibung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createTOP_Laenge_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTOP_Laenge_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTP_Beschreibung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTP_Beschreibung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createUeberhoehung_Hoehe_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUeberhoehung_Hoehe_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createUeberhoehungslinie_Laenge_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUeberhoehungslinie_Laenge_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodatenPackage getGeodatenPackage() {
		return (GeodatenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeodatenPackage getPackage() {
		return GeodatenPackage.eINSTANCE;
	}

} //GeodatenFactoryImpl
