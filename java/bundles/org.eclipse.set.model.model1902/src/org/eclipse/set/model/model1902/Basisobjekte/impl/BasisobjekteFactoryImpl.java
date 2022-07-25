/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Basisobjekte.impl;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage;
import org.eclipse.set.model.model1902.BasisTypen.ENUMLinksRechts;
import org.eclipse.set.model.model1902.BasisTypen.ENUMWirkrichtung;

import org.eclipse.set.model.model1902.Basisobjekte.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasisobjekteFactoryImpl extends EFactoryImpl implements BasisobjekteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasisobjekteFactory init() {
		try {
			BasisobjekteFactory theBasisobjekteFactory = (BasisobjekteFactory)EPackage.Registry.INSTANCE.getEFactory(BasisobjektePackage.eNS_URI);
			if (theBasisobjekteFactory != null) {
				return theBasisobjekteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasisobjekteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisobjekteFactoryImpl() {
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
			case BasisobjektePackage.ABSTAND_TYPE_CLASS: return createAbstand_TypeClass();
			case BasisobjektePackage.ANHANG: return createAnhang();
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP: return createAnhang_Allg_AttributeGroup();
			case BasisobjektePackage.ANHANG_ART_TYPE_CLASS: return createAnhang_Art_TypeClass();
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP: return createBasis_Objekt_Allg_AttributeGroup();
			case BasisobjektePackage.BEARBEITUNGSVERMERK: return createBearbeitungsvermerk();
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP: return createBearbeitungsvermerk_Allg_AttributeGroup();
			case BasisobjektePackage.BEARBEITUNGSVERMERK_KENNUNG_TYPE_CLASS: return createBearbeitungsvermerk_Kennung_TypeClass();
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ROLLE_TYPE_CLASS: return createBearbeitungsvermerk_Rolle_TypeClass();
			case BasisobjektePackage.BEGRENZUNG_ATYPE_CLASS: return createBegrenzung_A_TypeClass();
			case BasisobjektePackage.BEGRENZUNG_BTYPE_CLASS: return createBegrenzung_B_TypeClass();
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP: return createBereich_Objekt_Teilbereich_AttributeGroup();
			case BasisobjektePackage.BESCHREIBUNG_TYPE_CLASS: return createBeschreibung_TypeClass();
			case BasisobjektePackage.BESTANDSRELEVANZ_TYPE_CLASS: return createBestandsrelevanz_TypeClass();
			case BasisobjektePackage.BESTANDSSCHUTZ_TYPE_CLASS: return createBestandsschutz_TypeClass();
			case BasisobjektePackage.DATEINAME_TYPE_CLASS: return createDateiname_TypeClass();
			case BasisobjektePackage.DATEITYP_TYPE_CLASS: return createDateityp_TypeClass();
			case BasisobjektePackage.DATEN_TYPE_CLASS: return createDaten_TypeClass();
			case BasisobjektePackage.DATUM_REGELWERK_TYPE_CLASS: return createDatum_Regelwerk_TypeClass();
			case BasisobjektePackage.DB_GDI_REFERENZ_TYPE_CLASS: return createDB_GDI_Referenz_TypeClass();
			case BasisobjektePackage.IDENTITAET_TYPE_CLASS: return createIdentitaet_TypeClass();
			case BasisobjektePackage.KOMMENTAR_TYPE_CLASS: return createKommentar_TypeClass();
			case BasisobjektePackage.KURZTEXT_TYPE_CLASS: return createKurztext_TypeClass();
			case BasisobjektePackage.LIEFEROBJEKT: return createLieferobjekt();
			case BasisobjektePackage.LO_AUSGABESTAND_TYPE_CLASS: return createLO_Ausgabestand_TypeClass();
			case BasisobjektePackage.LO_DATUM_HERSTELLUNG_TYPE_CLASS: return createLO_Datum_Herstellung_TypeClass();
			case BasisobjektePackage.LO_DB_FREIGABE_TYPE_CLASS: return createLO_DB_Freigabe_TypeClass();
			case BasisobjektePackage.LO_EMA_NR_TYPE_CLASS: return createLO_EMA_Nr_TypeClass();
			case BasisobjektePackage.LO_ERSATZ_TYPE_CLASS: return createLO_Ersatz_TypeClass();
			case BasisobjektePackage.LO_FIRMENSACHNUMMER_TYPE_CLASS: return createLO_Firmensachnummer_TypeClass();
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP: return createLO_Material_AttributeGroup();
			case BasisobjektePackage.LO_SERIENNUMMER_TYPE_CLASS: return createLO_Seriennummer_TypeClass();
			case BasisobjektePackage.LST_OBJEKT_ART_TYPE_CLASS: return createLST_Objekt_Art_TypeClass();
			case BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP: return createObjektreferenzen_AttributeGroup();
			case BasisobjektePackage.OBJEKTZUSTAND_BESONDERS_TYPE_CLASS: return createObjektzustand_Besonders_TypeClass();
			case BasisobjektePackage.PROXY_OBJEKT: return createProxy_Objekt();
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP: return createPunkt_Objekt_Strecke_AttributeGroup();
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP: return createPunkt_Objekt_TOP_Kante_AttributeGroup();
			case BasisobjektePackage.RICHTUNGSBEZUG_TYPE_CLASS: return createRichtungsbezug_TypeClass();
			case BasisobjektePackage.SEITLICHE_LAGE_TYPE_CLASS: return createSeitliche_Lage_TypeClass();
			case BasisobjektePackage.SEITLICHER_ABSTAND_TYPE_CLASS: return createSeitlicher_Abstand_TypeClass();
			case BasisobjektePackage.STRECKE_KM_TYPE_CLASS: return createStrecke_Km_TypeClass();
			case BasisobjektePackage.TECHNISCHER_PLATZ_TYPE_CLASS: return createTechnischer_Platz_TypeClass();
			case BasisobjektePackage.WIRKRICHTUNG_TYPE_CLASS: return createWirkrichtung_TypeClass();
			case BasisobjektePackage.ZEIT_BEARBEITUNGSVERMERK_TYPE_CLASS: return createZeit_Bearbeitungsvermerk_TypeClass();
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
			case BasisobjektePackage.ENUM_ANHANG_ART:
				return createENUMAnhangArtFromString(eDataType, initialValue);
			case BasisobjektePackage.ENUM_BESTANDSRELEVANZ:
				return createENUMBestandsrelevanzFromString(eDataType, initialValue);
			case BasisobjektePackage.ENUM_DATEITYP:
				return createENUMDateitypFromString(eDataType, initialValue);
			case BasisobjektePackage.ENUMLST_OBJEKT_ART:
				return createENUMLSTObjektArtFromString(eDataType, initialValue);
			case BasisobjektePackage.ENUM_OBJEKTZUSTAND_BESONDERS:
				return createENUMObjektzustandBesondersFromString(eDataType, initialValue);
			case BasisobjektePackage.ENUM_ROLLE:
				return createENUMRolleFromString(eDataType, initialValue);
			case BasisobjektePackage.ABSTAND_TYPE:
				return createAbstand_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.BEARBEITUNGSVERMERK_KENNUNG_TYPE:
				return createBearbeitungsvermerk_Kennung_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.BEGRENZUNG_ATYPE:
				return createBegrenzung_A_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.BEGRENZUNG_BTYPE:
				return createBegrenzung_B_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.BESCHREIBUNG_TYPE:
				return createBeschreibung_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.DB_GDI_REFERENZ_TYPE:
				return createDB_GDI_Referenz_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.ENUM_ANHANG_ART_OBJECT:
				return createENUMAnhangArtObjectFromString(eDataType, initialValue);
			case BasisobjektePackage.ENUM_BESTANDSRELEVANZ_OBJECT:
				return createENUMBestandsrelevanzObjectFromString(eDataType, initialValue);
			case BasisobjektePackage.ENUM_DATEITYP_OBJECT:
				return createENUMDateitypObjectFromString(eDataType, initialValue);
			case BasisobjektePackage.ENUMLST_OBJEKT_ART_OBJECT:
				return createENUMLSTObjektArtObjectFromString(eDataType, initialValue);
			case BasisobjektePackage.ENUM_OBJEKTZUSTAND_BESONDERS_OBJECT:
				return createENUMObjektzustandBesondersObjectFromString(eDataType, initialValue);
			case BasisobjektePackage.ENUM_ROLLE_OBJECT:
				return createENUMRolleObjectFromString(eDataType, initialValue);
			case BasisobjektePackage.IDENTITAET_TYPE:
				return createIdentitaet_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.KOMMENTAR_TYPE:
				return createKommentar_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.KURZTEXT_TYPE:
				return createKurztext_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.LO_AUSGABESTAND_TYPE:
				return createLO_Ausgabestand_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.LO_DB_FREIGABE_TYPE:
				return createLO_DB_Freigabe_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.LO_EMA_NR_TYPE:
				return createLO_EMA_Nr_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.LO_FIRMENSACHNUMMER_TYPE:
				return createLO_Firmensachnummer_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.LO_SERIENNUMMER_TYPE:
				return createLO_Seriennummer_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.RICHTUNGSBEZUG_TYPE:
				return createRichtungsbezug_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.SEITLICHE_LAGE_TYPE:
				return createSeitliche_Lage_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.SEITLICHER_ABSTAND_TYPE:
				return createSeitlicher_Abstand_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.STRECKE_KM_TYPE:
				return createStrecke_Km_TypeFromString(eDataType, initialValue);
			case BasisobjektePackage.TECHNISCHER_PLATZ_TYPE:
				return createTechnischer_Platz_TypeFromString(eDataType, initialValue);
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
			case BasisobjektePackage.ENUM_ANHANG_ART:
				return convertENUMAnhangArtToString(eDataType, instanceValue);
			case BasisobjektePackage.ENUM_BESTANDSRELEVANZ:
				return convertENUMBestandsrelevanzToString(eDataType, instanceValue);
			case BasisobjektePackage.ENUM_DATEITYP:
				return convertENUMDateitypToString(eDataType, instanceValue);
			case BasisobjektePackage.ENUMLST_OBJEKT_ART:
				return convertENUMLSTObjektArtToString(eDataType, instanceValue);
			case BasisobjektePackage.ENUM_OBJEKTZUSTAND_BESONDERS:
				return convertENUMObjektzustandBesondersToString(eDataType, instanceValue);
			case BasisobjektePackage.ENUM_ROLLE:
				return convertENUMRolleToString(eDataType, instanceValue);
			case BasisobjektePackage.ABSTAND_TYPE:
				return convertAbstand_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.BEARBEITUNGSVERMERK_KENNUNG_TYPE:
				return convertBearbeitungsvermerk_Kennung_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.BEGRENZUNG_ATYPE:
				return convertBegrenzung_A_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.BEGRENZUNG_BTYPE:
				return convertBegrenzung_B_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.BESCHREIBUNG_TYPE:
				return convertBeschreibung_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.DB_GDI_REFERENZ_TYPE:
				return convertDB_GDI_Referenz_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.ENUM_ANHANG_ART_OBJECT:
				return convertENUMAnhangArtObjectToString(eDataType, instanceValue);
			case BasisobjektePackage.ENUM_BESTANDSRELEVANZ_OBJECT:
				return convertENUMBestandsrelevanzObjectToString(eDataType, instanceValue);
			case BasisobjektePackage.ENUM_DATEITYP_OBJECT:
				return convertENUMDateitypObjectToString(eDataType, instanceValue);
			case BasisobjektePackage.ENUMLST_OBJEKT_ART_OBJECT:
				return convertENUMLSTObjektArtObjectToString(eDataType, instanceValue);
			case BasisobjektePackage.ENUM_OBJEKTZUSTAND_BESONDERS_OBJECT:
				return convertENUMObjektzustandBesondersObjectToString(eDataType, instanceValue);
			case BasisobjektePackage.ENUM_ROLLE_OBJECT:
				return convertENUMRolleObjectToString(eDataType, instanceValue);
			case BasisobjektePackage.IDENTITAET_TYPE:
				return convertIdentitaet_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.KOMMENTAR_TYPE:
				return convertKommentar_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.KURZTEXT_TYPE:
				return convertKurztext_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.LO_AUSGABESTAND_TYPE:
				return convertLO_Ausgabestand_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.LO_DB_FREIGABE_TYPE:
				return convertLO_DB_Freigabe_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.LO_EMA_NR_TYPE:
				return convertLO_EMA_Nr_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.LO_FIRMENSACHNUMMER_TYPE:
				return convertLO_Firmensachnummer_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.LO_SERIENNUMMER_TYPE:
				return convertLO_Seriennummer_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.RICHTUNGSBEZUG_TYPE:
				return convertRichtungsbezug_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.SEITLICHE_LAGE_TYPE:
				return convertSeitliche_Lage_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.SEITLICHER_ABSTAND_TYPE:
				return convertSeitlicher_Abstand_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.STRECKE_KM_TYPE:
				return convertStrecke_Km_TypeToString(eDataType, instanceValue);
			case BasisobjektePackage.TECHNISCHER_PLATZ_TYPE:
				return convertTechnischer_Platz_TypeToString(eDataType, instanceValue);
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
	public Abstand_TypeClass createAbstand_TypeClass() {
		Abstand_TypeClassImpl abstand_TypeClass = new Abstand_TypeClassImpl();
		return abstand_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang createAnhang() {
		AnhangImpl anhang = new AnhangImpl();
		return anhang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang_Allg_AttributeGroup createAnhang_Allg_AttributeGroup() {
		Anhang_Allg_AttributeGroupImpl anhang_Allg_AttributeGroup = new Anhang_Allg_AttributeGroupImpl();
		return anhang_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang_Art_TypeClass createAnhang_Art_TypeClass() {
		Anhang_Art_TypeClassImpl anhang_Art_TypeClass = new Anhang_Art_TypeClassImpl();
		return anhang_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt_Allg_AttributeGroup createBasis_Objekt_Allg_AttributeGroup() {
		Basis_Objekt_Allg_AttributeGroupImpl basis_Objekt_Allg_AttributeGroup = new Basis_Objekt_Allg_AttributeGroupImpl();
		return basis_Objekt_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bearbeitungsvermerk createBearbeitungsvermerk() {
		BearbeitungsvermerkImpl bearbeitungsvermerk = new BearbeitungsvermerkImpl();
		return bearbeitungsvermerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bearbeitungsvermerk_Allg_AttributeGroup createBearbeitungsvermerk_Allg_AttributeGroup() {
		Bearbeitungsvermerk_Allg_AttributeGroupImpl bearbeitungsvermerk_Allg_AttributeGroup = new Bearbeitungsvermerk_Allg_AttributeGroupImpl();
		return bearbeitungsvermerk_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bearbeitungsvermerk_Kennung_TypeClass createBearbeitungsvermerk_Kennung_TypeClass() {
		Bearbeitungsvermerk_Kennung_TypeClassImpl bearbeitungsvermerk_Kennung_TypeClass = new Bearbeitungsvermerk_Kennung_TypeClassImpl();
		return bearbeitungsvermerk_Kennung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bearbeitungsvermerk_Rolle_TypeClass createBearbeitungsvermerk_Rolle_TypeClass() {
		Bearbeitungsvermerk_Rolle_TypeClassImpl bearbeitungsvermerk_Rolle_TypeClass = new Bearbeitungsvermerk_Rolle_TypeClassImpl();
		return bearbeitungsvermerk_Rolle_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Begrenzung_A_TypeClass createBegrenzung_A_TypeClass() {
		Begrenzung_A_TypeClassImpl begrenzung_A_TypeClass = new Begrenzung_A_TypeClassImpl();
		return begrenzung_A_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Begrenzung_B_TypeClass createBegrenzung_B_TypeClass() {
		Begrenzung_B_TypeClassImpl begrenzung_B_TypeClass = new Begrenzung_B_TypeClassImpl();
		return begrenzung_B_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bereich_Objekt_Teilbereich_AttributeGroup createBereich_Objekt_Teilbereich_AttributeGroup() {
		Bereich_Objekt_Teilbereich_AttributeGroupImpl bereich_Objekt_Teilbereich_AttributeGroup = new Bereich_Objekt_Teilbereich_AttributeGroupImpl();
		return bereich_Objekt_Teilbereich_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Beschreibung_TypeClass createBeschreibung_TypeClass() {
		Beschreibung_TypeClassImpl beschreibung_TypeClass = new Beschreibung_TypeClassImpl();
		return beschreibung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bestandsrelevanz_TypeClass createBestandsrelevanz_TypeClass() {
		Bestandsrelevanz_TypeClassImpl bestandsrelevanz_TypeClass = new Bestandsrelevanz_TypeClassImpl();
		return bestandsrelevanz_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bestandsschutz_TypeClass createBestandsschutz_TypeClass() {
		Bestandsschutz_TypeClassImpl bestandsschutz_TypeClass = new Bestandsschutz_TypeClassImpl();
		return bestandsschutz_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dateiname_TypeClass createDateiname_TypeClass() {
		Dateiname_TypeClassImpl dateiname_TypeClass = new Dateiname_TypeClassImpl();
		return dateiname_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dateityp_TypeClass createDateityp_TypeClass() {
		Dateityp_TypeClassImpl dateityp_TypeClass = new Dateityp_TypeClassImpl();
		return dateityp_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Daten_TypeClass createDaten_TypeClass() {
		Daten_TypeClassImpl daten_TypeClass = new Daten_TypeClassImpl();
		return daten_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datum_Regelwerk_TypeClass createDatum_Regelwerk_TypeClass() {
		Datum_Regelwerk_TypeClassImpl datum_Regelwerk_TypeClass = new Datum_Regelwerk_TypeClassImpl();
		return datum_Regelwerk_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DB_GDI_Referenz_TypeClass createDB_GDI_Referenz_TypeClass() {
		DB_GDI_Referenz_TypeClassImpl dB_GDI_Referenz_TypeClass = new DB_GDI_Referenz_TypeClassImpl();
		return dB_GDI_Referenz_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identitaet_TypeClass createIdentitaet_TypeClass() {
		Identitaet_TypeClassImpl identitaet_TypeClass = new Identitaet_TypeClassImpl();
		return identitaet_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kommentar_TypeClass createKommentar_TypeClass() {
		Kommentar_TypeClassImpl kommentar_TypeClass = new Kommentar_TypeClassImpl();
		return kommentar_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kurztext_TypeClass createKurztext_TypeClass() {
		Kurztext_TypeClassImpl kurztext_TypeClass = new Kurztext_TypeClassImpl();
		return kurztext_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lieferobjekt createLieferobjekt() {
		LieferobjektImpl lieferobjekt = new LieferobjektImpl();
		return lieferobjekt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LO_Ausgabestand_TypeClass createLO_Ausgabestand_TypeClass() {
		LO_Ausgabestand_TypeClassImpl lO_Ausgabestand_TypeClass = new LO_Ausgabestand_TypeClassImpl();
		return lO_Ausgabestand_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LO_Datum_Herstellung_TypeClass createLO_Datum_Herstellung_TypeClass() {
		LO_Datum_Herstellung_TypeClassImpl lO_Datum_Herstellung_TypeClass = new LO_Datum_Herstellung_TypeClassImpl();
		return lO_Datum_Herstellung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LO_DB_Freigabe_TypeClass createLO_DB_Freigabe_TypeClass() {
		LO_DB_Freigabe_TypeClassImpl lO_DB_Freigabe_TypeClass = new LO_DB_Freigabe_TypeClassImpl();
		return lO_DB_Freigabe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LO_EMA_Nr_TypeClass createLO_EMA_Nr_TypeClass() {
		LO_EMA_Nr_TypeClassImpl lO_EMA_Nr_TypeClass = new LO_EMA_Nr_TypeClassImpl();
		return lO_EMA_Nr_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LO_Ersatz_TypeClass createLO_Ersatz_TypeClass() {
		LO_Ersatz_TypeClassImpl lO_Ersatz_TypeClass = new LO_Ersatz_TypeClassImpl();
		return lO_Ersatz_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LO_Firmensachnummer_TypeClass createLO_Firmensachnummer_TypeClass() {
		LO_Firmensachnummer_TypeClassImpl lO_Firmensachnummer_TypeClass = new LO_Firmensachnummer_TypeClassImpl();
		return lO_Firmensachnummer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LO_Material_AttributeGroup createLO_Material_AttributeGroup() {
		LO_Material_AttributeGroupImpl lO_Material_AttributeGroup = new LO_Material_AttributeGroupImpl();
		return lO_Material_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LO_Seriennummer_TypeClass createLO_Seriennummer_TypeClass() {
		LO_Seriennummer_TypeClassImpl lO_Seriennummer_TypeClass = new LO_Seriennummer_TypeClassImpl();
		return lO_Seriennummer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LST_Objekt_Art_TypeClass createLST_Objekt_Art_TypeClass() {
		LST_Objekt_Art_TypeClassImpl lsT_Objekt_Art_TypeClass = new LST_Objekt_Art_TypeClassImpl();
		return lsT_Objekt_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Objektreferenzen_AttributeGroup createObjektreferenzen_AttributeGroup() {
		Objektreferenzen_AttributeGroupImpl objektreferenzen_AttributeGroup = new Objektreferenzen_AttributeGroupImpl();
		return objektreferenzen_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Objektzustand_Besonders_TypeClass createObjektzustand_Besonders_TypeClass() {
		Objektzustand_Besonders_TypeClassImpl objektzustand_Besonders_TypeClass = new Objektzustand_Besonders_TypeClassImpl();
		return objektzustand_Besonders_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Proxy_Objekt createProxy_Objekt() {
		Proxy_ObjektImpl proxy_Objekt = new Proxy_ObjektImpl();
		return proxy_Objekt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Punkt_Objekt_Strecke_AttributeGroup createPunkt_Objekt_Strecke_AttributeGroup() {
		Punkt_Objekt_Strecke_AttributeGroupImpl punkt_Objekt_Strecke_AttributeGroup = new Punkt_Objekt_Strecke_AttributeGroupImpl();
		return punkt_Objekt_Strecke_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Punkt_Objekt_TOP_Kante_AttributeGroup createPunkt_Objekt_TOP_Kante_AttributeGroup() {
		Punkt_Objekt_TOP_Kante_AttributeGroupImpl punkt_Objekt_TOP_Kante_AttributeGroup = new Punkt_Objekt_TOP_Kante_AttributeGroupImpl();
		return punkt_Objekt_TOP_Kante_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Richtungsbezug_TypeClass createRichtungsbezug_TypeClass() {
		Richtungsbezug_TypeClassImpl richtungsbezug_TypeClass = new Richtungsbezug_TypeClassImpl();
		return richtungsbezug_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Seitliche_Lage_TypeClass createSeitliche_Lage_TypeClass() {
		Seitliche_Lage_TypeClassImpl seitliche_Lage_TypeClass = new Seitliche_Lage_TypeClassImpl();
		return seitliche_Lage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Seitlicher_Abstand_TypeClass createSeitlicher_Abstand_TypeClass() {
		Seitlicher_Abstand_TypeClassImpl seitlicher_Abstand_TypeClass = new Seitlicher_Abstand_TypeClassImpl();
		return seitlicher_Abstand_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Km_TypeClass createStrecke_Km_TypeClass() {
		Strecke_Km_TypeClassImpl strecke_Km_TypeClass = new Strecke_Km_TypeClassImpl();
		return strecke_Km_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technischer_Platz_TypeClass createTechnischer_Platz_TypeClass() {
		Technischer_Platz_TypeClassImpl technischer_Platz_TypeClass = new Technischer_Platz_TypeClassImpl();
		return technischer_Platz_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wirkrichtung_TypeClass createWirkrichtung_TypeClass() {
		Wirkrichtung_TypeClassImpl wirkrichtung_TypeClass = new Wirkrichtung_TypeClassImpl();
		return wirkrichtung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zeit_Bearbeitungsvermerk_TypeClass createZeit_Bearbeitungsvermerk_TypeClass() {
		Zeit_Bearbeitungsvermerk_TypeClassImpl zeit_Bearbeitungsvermerk_TypeClass = new Zeit_Bearbeitungsvermerk_TypeClassImpl();
		return zeit_Bearbeitungsvermerk_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAnhangArt createENUMAnhangArtFromString(EDataType eDataType, String initialValue) {
		ENUMAnhangArt result = ENUMAnhangArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAnhangArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBestandsrelevanz createENUMBestandsrelevanzFromString(EDataType eDataType, String initialValue) {
		ENUMBestandsrelevanz result = ENUMBestandsrelevanz.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBestandsrelevanzToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDateityp createENUMDateitypFromString(EDataType eDataType, String initialValue) {
		ENUMDateityp result = ENUMDateityp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDateitypToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLSTObjektArt createENUMLSTObjektArtFromString(EDataType eDataType, String initialValue) {
		ENUMLSTObjektArt result = ENUMLSTObjektArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLSTObjektArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMObjektzustandBesonders createENUMObjektzustandBesondersFromString(EDataType eDataType, String initialValue) {
		ENUMObjektzustandBesonders result = ENUMObjektzustandBesonders.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMObjektzustandBesondersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMRolle createENUMRolleFromString(EDataType eDataType, String initialValue) {
		ENUMRolle result = ENUMRolle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMRolleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAbstand_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstand_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBearbeitungsvermerk_Kennung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBearbeitungsvermerk_Kennung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createBegrenzung_A_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBegrenzung_A_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createBegrenzung_B_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBegrenzung_B_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBeschreibung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBeschreibung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDB_GDI_Referenz_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDB_GDI_Referenz_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAnhangArt createENUMAnhangArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMAnhangArtFromString(BasisobjektePackage.Literals.ENUM_ANHANG_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAnhangArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMAnhangArtToString(BasisobjektePackage.Literals.ENUM_ANHANG_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBestandsrelevanz createENUMBestandsrelevanzObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBestandsrelevanzFromString(BasisobjektePackage.Literals.ENUM_BESTANDSRELEVANZ, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBestandsrelevanzObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBestandsrelevanzToString(BasisobjektePackage.Literals.ENUM_BESTANDSRELEVANZ, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDateityp createENUMDateitypObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMDateitypFromString(BasisobjektePackage.Literals.ENUM_DATEITYP, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDateitypObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMDateitypToString(BasisobjektePackage.Literals.ENUM_DATEITYP, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLSTObjektArt createENUMLSTObjektArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMLSTObjektArtFromString(BasisobjektePackage.Literals.ENUMLST_OBJEKT_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLSTObjektArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMLSTObjektArtToString(BasisobjektePackage.Literals.ENUMLST_OBJEKT_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMObjektzustandBesonders createENUMObjektzustandBesondersObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMObjektzustandBesondersFromString(BasisobjektePackage.Literals.ENUM_OBJEKTZUSTAND_BESONDERS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMObjektzustandBesondersObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMObjektzustandBesondersToString(BasisobjektePackage.Literals.ENUM_OBJEKTZUSTAND_BESONDERS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMRolle createENUMRolleObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMRolleFromString(BasisobjektePackage.Literals.ENUM_ROLLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMRolleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMRolleToString(BasisobjektePackage.Literals.ENUM_ROLLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdentitaet_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GUID_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentitaet_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GUID_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createKommentar_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.FREI_TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKommentar_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.FREI_TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createKurztext_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKurztext_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLO_Ausgabestand_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLO_Ausgabestand_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLO_DB_Freigabe_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLO_DB_Freigabe_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLO_EMA_Nr_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLO_EMA_Nr_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLO_Firmensachnummer_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLO_Firmensachnummer_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLO_Seriennummer_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLO_Seriennummer_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWirkrichtung createRichtungsbezug_TypeFromString(EDataType eDataType, String initialValue) {
		return (ENUMWirkrichtung)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.WIRKRICHTUNG_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRichtungsbezug_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.WIRKRICHTUNG_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinksRechts createSeitliche_Lage_TypeFromString(EDataType eDataType, String initialValue) {
		return (ENUMLinksRechts)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeitliche_Lage_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSeitlicher_Abstand_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeitlicher_Abstand_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStrecke_Km_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.KILOMETRIERUNG_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrecke_Km_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.KILOMETRIERUNG_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTechnischer_Platz_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTechnischer_Platz_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasisobjektePackage getBasisobjektePackage() {
		return (BasisobjektePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasisobjektePackage getPackage() {
		return BasisobjektePackage.eINSTANCE;
	}

} //BasisobjekteFactoryImpl
