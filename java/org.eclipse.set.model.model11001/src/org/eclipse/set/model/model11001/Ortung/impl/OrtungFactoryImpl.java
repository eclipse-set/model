/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ortung.impl;

import java.math.BigDecimal;

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

import org.eclipse.set.model.model11001.Ortung.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrtungFactoryImpl extends EFactoryImpl implements OrtungFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrtungFactory init() {
		try {
			OrtungFactory theOrtungFactory = (OrtungFactory)EPackage.Registry.INSTANCE.getEFactory(OrtungPackage.eNS_URI);
			if (theOrtungFactory != null) {
				return theOrtungFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrtungFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrtungFactoryImpl() {
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
			case OrtungPackage.BETTUNGSWIDERSTAND_TYPE_CLASS: return createBettungswiderstand_TypeClass();
			case OrtungPackage.BEZEICHNUNG_KENNBUCHSTABE_TYPE_CLASS: return createBezeichnung_Kennbuchstabe_TypeClass();
			case OrtungPackage.FMA_ANLAGE: return createFMA_Anlage();
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP: return createFMA_Anlage_Allg_AttributeGroup();
			case OrtungPackage.FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP: return createFMA_Anlage_Bezeichnung_AttributeGroup();
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP: return createFMA_Anlage_Elektr_Merkmale_AttributeGroup();
			case OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP: return createFMA_Anlage_Kaskade_AttributeGroup();
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP: return createFMA_Anlage_Uebertragung_FMinfo_AttributeGroup();
			case OrtungPackage.FMA_ANSCHLUSS_BEZEICHNUNG_TYPE_CLASS: return createFMA_Anschluss_Bezeichnung_TypeClass();
			case OrtungPackage.FMA_ANSCHLUSS_SPEISERICHTUNG_TYPE_CLASS: return createFMA_Anschluss_Speiserichtung_TypeClass();
			case OrtungPackage.FMA_ART_TYPE_CLASS: return createFMA_Art_TypeClass();
			case OrtungPackage.FMA_ELEMENT: return createFMA_Element();
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP: return createFMA_Element_Allg_AttributeGroup();
			case OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP: return createFMA_Element_Anschluss_AttributeGroup();
			case OrtungPackage.FMA_ELEMENT_ART_TYPE_CLASS: return createFMA_Element_Art_TypeClass();
			case OrtungPackage.FMA_ELEMENT_SEILANZAHL_TYPE_CLASS: return createFMA_Element_Seilanzahl_TypeClass();
			case OrtungPackage.FMA_ELEMENT_SEILTYP_TYPE_CLASS: return createFMA_Element_Seiltyp_TypeClass();
			case OrtungPackage.FMA_HILFFREIMELDUNG_TYPE_CLASS: return createFMA_Hilffreimeldung_TypeClass();
			case OrtungPackage.FMA_ISOLIERUNG_TYPE_CLASS: return createFMA_Isolierung_TypeClass();
			case OrtungPackage.FMA_KASKADE_BEZEICHNUNG_TYPE_CLASS: return createFMA_Kaskade_Bezeichnung_TypeClass();
			case OrtungPackage.FMA_KASKADE_EINZELAUSWERTUNG_TYPE_CLASS: return createFMA_Kaskade_Einzelauswertung_TypeClass();
			case OrtungPackage.FMA_KOMPONENTE: return createFMA_Komponente();
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP: return createFMA_Komponente_Achszaehlpunkt_AttributeGroup();
			case OrtungPackage.FMA_KOMPONENTE_ART_TYPE_CLASS: return createFMA_Komponente_Art_TypeClass();
			case OrtungPackage.FMA_KOMPONENTE_SCHIENENPROFIL_TYPE_CLASS: return createFMA_Komponente_Schienenprofil_TypeClass();
			case OrtungPackage.FMA_KOMPONENTE_STROMVERSORGUNG_TYPE_CLASS: return createFMA_Komponente_Stromversorgung_TypeClass();
			case OrtungPackage.FMA_KOMPONENTE_TYP_TYPE_CLASS: return createFMA_Komponente_Typ_TypeClass();
			case OrtungPackage.FMA_LAENGE_BEEINFLUSST_TYPE_CLASS: return createFMA_Laenge_Beeinflusst_TypeClass();
			case OrtungPackage.FMA_LAENGE_E1_TYPE_CLASS: return createFMA_Laenge_E1_TypeClass();
			case OrtungPackage.FMA_LAENGE_E2_TYPE_CLASS: return createFMA_Laenge_E2_TypeClass();
			case OrtungPackage.FMA_LAENGE_E3_TYPE_CLASS: return createFMA_Laenge_E3_TypeClass();
			case OrtungPackage.FMA_LAENGE_STYPE_CLASS: return createFMA_Laenge_S_TypeClass();
			case OrtungPackage.FMA_LAENGE_TYPE_CLASS: return createFMA_Laenge_TypeClass();
			case OrtungPackage.FMA_TYP_TYPE_CLASS: return createFMA_Typ_TypeClass();
			case OrtungPackage.SCHALTMITTEL_FUNKTION_TYPE_CLASS: return createSchaltmittel_Funktion_TypeClass();
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG: return createSchaltmittel_Zuordnung();
			case OrtungPackage.UEBERTRAGUNG_FMINFO_RICHTUNG_TYPE_CLASS: return createUebertragung_FMinfo_Richtung_TypeClass();
			case OrtungPackage.UEBERTRAGUNG_FMINFO_TYP_TYPE_CLASS: return createUebertragung_FMinfo_Typ_TypeClass();
			case OrtungPackage.ZUGEINWIRKUNG: return createZugeinwirkung();
			case OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP: return createZugeinwirkung_Allg_AttributeGroup();
			case OrtungPackage.ZUGEINWIRKUNG_ART_TYPE_CLASS: return createZugeinwirkung_Art_TypeClass();
			case OrtungPackage.ZUGEINWIRKUNG_TYP_TYPE_CLASS: return createZugeinwirkung_Typ_TypeClass();
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
			case OrtungPackage.ENUM_BEZEICHNUNG_KENNBUCHSTABE:
				return createENUMBezeichnungKennbuchstabeFromString(eDataType, initialValue);
			case OrtungPackage.ENUMFMA_ANSCHLUSS_SPEISERICHTUNG:
				return createENUMFMAAnschlussSpeiserichtungFromString(eDataType, initialValue);
			case OrtungPackage.ENUMFMA_ART:
				return createENUMFMAArtFromString(eDataType, initialValue);
			case OrtungPackage.ENUMFMA_ELEMENT_ART:
				return createENUMFMAElementArtFromString(eDataType, initialValue);
			case OrtungPackage.ENUMFMA_ELEMENT_SEILANZAHL:
				return createENUMFMAElementSeilanzahlFromString(eDataType, initialValue);
			case OrtungPackage.ENUMFMA_KOMPONENTE_ART:
				return createENUMFMAKomponenteArtFromString(eDataType, initialValue);
			case OrtungPackage.ENUM_ISOLIERUNG:
				return createENUMIsolierungFromString(eDataType, initialValue);
			case OrtungPackage.ENUM_SCHALTMITTEL_FUNKTION:
				return createENUMSchaltmittelFunktionFromString(eDataType, initialValue);
			case OrtungPackage.ENUM_SCHIENENPROFIL:
				return createENUMSchienenprofilFromString(eDataType, initialValue);
			case OrtungPackage.ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG:
				return createENUMUebertragungFMinfoRichtungFromString(eDataType, initialValue);
			case OrtungPackage.ENUM_ZUGEINWIRKUNG_ART:
				return createENUMZugeinwirkungArtFromString(eDataType, initialValue);
			case OrtungPackage.BETTUNGSWIDERSTAND_TYPE:
				return createBettungswiderstand_TypeFromString(eDataType, initialValue);
			case OrtungPackage.ENUM_BEZEICHNUNG_KENNBUCHSTABE_OBJECT:
				return createENUMBezeichnungKennbuchstabeObjectFromString(eDataType, initialValue);
			case OrtungPackage.ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_OBJECT:
				return createENUMFMAAnschlussSpeiserichtungObjectFromString(eDataType, initialValue);
			case OrtungPackage.ENUMFMA_ART_OBJECT:
				return createENUMFMAArtObjectFromString(eDataType, initialValue);
			case OrtungPackage.ENUMFMA_ELEMENT_ART_OBJECT:
				return createENUMFMAElementArtObjectFromString(eDataType, initialValue);
			case OrtungPackage.ENUMFMA_ELEMENT_SEILANZAHL_OBJECT:
				return createENUMFMAElementSeilanzahlObjectFromString(eDataType, initialValue);
			case OrtungPackage.ENUMFMA_KOMPONENTE_ART_OBJECT:
				return createENUMFMAKomponenteArtObjectFromString(eDataType, initialValue);
			case OrtungPackage.ENUM_ISOLIERUNG_OBJECT:
				return createENUMIsolierungObjectFromString(eDataType, initialValue);
			case OrtungPackage.ENUM_SCHALTMITTEL_FUNKTION_OBJECT:
				return createENUMSchaltmittelFunktionObjectFromString(eDataType, initialValue);
			case OrtungPackage.ENUM_SCHIENENPROFIL_OBJECT:
				return createENUMSchienenprofilObjectFromString(eDataType, initialValue);
			case OrtungPackage.ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_OBJECT:
				return createENUMUebertragungFMinfoRichtungObjectFromString(eDataType, initialValue);
			case OrtungPackage.ENUM_ZUGEINWIRKUNG_ART_OBJECT:
				return createENUMZugeinwirkungArtObjectFromString(eDataType, initialValue);
			case OrtungPackage.FMA_ANSCHLUSS_BEZEICHNUNG_TYPE:
				return createFMA_Anschluss_Bezeichnung_TypeFromString(eDataType, initialValue);
			case OrtungPackage.FMA_ELEMENT_SEILTYP_TYPE:
				return createFMA_Element_Seiltyp_TypeFromString(eDataType, initialValue);
			case OrtungPackage.FMA_KASKADE_BEZEICHNUNG_TYPE:
				return createFMA_Kaskade_Bezeichnung_TypeFromString(eDataType, initialValue);
			case OrtungPackage.FMA_KOMPONENTE_TYP_TYPE:
				return createFMA_Komponente_Typ_TypeFromString(eDataType, initialValue);
			case OrtungPackage.FMA_LAENGE_BEEINFLUSST_TYPE:
				return createFMA_Laenge_Beeinflusst_TypeFromString(eDataType, initialValue);
			case OrtungPackage.FMA_LAENGE_E1_TYPE:
				return createFMA_Laenge_E1_TypeFromString(eDataType, initialValue);
			case OrtungPackage.FMA_LAENGE_E2_TYPE:
				return createFMA_Laenge_E2_TypeFromString(eDataType, initialValue);
			case OrtungPackage.FMA_LAENGE_E3_TYPE:
				return createFMA_Laenge_E3_TypeFromString(eDataType, initialValue);
			case OrtungPackage.FMA_LAENGE_STYPE:
				return createFMA_Laenge_S_TypeFromString(eDataType, initialValue);
			case OrtungPackage.FMA_LAENGE_TYPE:
				return createFMA_Laenge_TypeFromString(eDataType, initialValue);
			case OrtungPackage.FMA_TYP_TYPE:
				return createFMA_Typ_TypeFromString(eDataType, initialValue);
			case OrtungPackage.UEBERTRAGUNG_FMINFO_TYP_TYPE:
				return createUebertragung_FMinfo_Typ_TypeFromString(eDataType, initialValue);
			case OrtungPackage.ZUGEINWIRKUNG_TYP_TYPE:
				return createZugeinwirkung_Typ_TypeFromString(eDataType, initialValue);
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
			case OrtungPackage.ENUM_BEZEICHNUNG_KENNBUCHSTABE:
				return convertENUMBezeichnungKennbuchstabeToString(eDataType, instanceValue);
			case OrtungPackage.ENUMFMA_ANSCHLUSS_SPEISERICHTUNG:
				return convertENUMFMAAnschlussSpeiserichtungToString(eDataType, instanceValue);
			case OrtungPackage.ENUMFMA_ART:
				return convertENUMFMAArtToString(eDataType, instanceValue);
			case OrtungPackage.ENUMFMA_ELEMENT_ART:
				return convertENUMFMAElementArtToString(eDataType, instanceValue);
			case OrtungPackage.ENUMFMA_ELEMENT_SEILANZAHL:
				return convertENUMFMAElementSeilanzahlToString(eDataType, instanceValue);
			case OrtungPackage.ENUMFMA_KOMPONENTE_ART:
				return convertENUMFMAKomponenteArtToString(eDataType, instanceValue);
			case OrtungPackage.ENUM_ISOLIERUNG:
				return convertENUMIsolierungToString(eDataType, instanceValue);
			case OrtungPackage.ENUM_SCHALTMITTEL_FUNKTION:
				return convertENUMSchaltmittelFunktionToString(eDataType, instanceValue);
			case OrtungPackage.ENUM_SCHIENENPROFIL:
				return convertENUMSchienenprofilToString(eDataType, instanceValue);
			case OrtungPackage.ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG:
				return convertENUMUebertragungFMinfoRichtungToString(eDataType, instanceValue);
			case OrtungPackage.ENUM_ZUGEINWIRKUNG_ART:
				return convertENUMZugeinwirkungArtToString(eDataType, instanceValue);
			case OrtungPackage.BETTUNGSWIDERSTAND_TYPE:
				return convertBettungswiderstand_TypeToString(eDataType, instanceValue);
			case OrtungPackage.ENUM_BEZEICHNUNG_KENNBUCHSTABE_OBJECT:
				return convertENUMBezeichnungKennbuchstabeObjectToString(eDataType, instanceValue);
			case OrtungPackage.ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_OBJECT:
				return convertENUMFMAAnschlussSpeiserichtungObjectToString(eDataType, instanceValue);
			case OrtungPackage.ENUMFMA_ART_OBJECT:
				return convertENUMFMAArtObjectToString(eDataType, instanceValue);
			case OrtungPackage.ENUMFMA_ELEMENT_ART_OBJECT:
				return convertENUMFMAElementArtObjectToString(eDataType, instanceValue);
			case OrtungPackage.ENUMFMA_ELEMENT_SEILANZAHL_OBJECT:
				return convertENUMFMAElementSeilanzahlObjectToString(eDataType, instanceValue);
			case OrtungPackage.ENUMFMA_KOMPONENTE_ART_OBJECT:
				return convertENUMFMAKomponenteArtObjectToString(eDataType, instanceValue);
			case OrtungPackage.ENUM_ISOLIERUNG_OBJECT:
				return convertENUMIsolierungObjectToString(eDataType, instanceValue);
			case OrtungPackage.ENUM_SCHALTMITTEL_FUNKTION_OBJECT:
				return convertENUMSchaltmittelFunktionObjectToString(eDataType, instanceValue);
			case OrtungPackage.ENUM_SCHIENENPROFIL_OBJECT:
				return convertENUMSchienenprofilObjectToString(eDataType, instanceValue);
			case OrtungPackage.ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_OBJECT:
				return convertENUMUebertragungFMinfoRichtungObjectToString(eDataType, instanceValue);
			case OrtungPackage.ENUM_ZUGEINWIRKUNG_ART_OBJECT:
				return convertENUMZugeinwirkungArtObjectToString(eDataType, instanceValue);
			case OrtungPackage.FMA_ANSCHLUSS_BEZEICHNUNG_TYPE:
				return convertFMA_Anschluss_Bezeichnung_TypeToString(eDataType, instanceValue);
			case OrtungPackage.FMA_ELEMENT_SEILTYP_TYPE:
				return convertFMA_Element_Seiltyp_TypeToString(eDataType, instanceValue);
			case OrtungPackage.FMA_KASKADE_BEZEICHNUNG_TYPE:
				return convertFMA_Kaskade_Bezeichnung_TypeToString(eDataType, instanceValue);
			case OrtungPackage.FMA_KOMPONENTE_TYP_TYPE:
				return convertFMA_Komponente_Typ_TypeToString(eDataType, instanceValue);
			case OrtungPackage.FMA_LAENGE_BEEINFLUSST_TYPE:
				return convertFMA_Laenge_Beeinflusst_TypeToString(eDataType, instanceValue);
			case OrtungPackage.FMA_LAENGE_E1_TYPE:
				return convertFMA_Laenge_E1_TypeToString(eDataType, instanceValue);
			case OrtungPackage.FMA_LAENGE_E2_TYPE:
				return convertFMA_Laenge_E2_TypeToString(eDataType, instanceValue);
			case OrtungPackage.FMA_LAENGE_E3_TYPE:
				return convertFMA_Laenge_E3_TypeToString(eDataType, instanceValue);
			case OrtungPackage.FMA_LAENGE_STYPE:
				return convertFMA_Laenge_S_TypeToString(eDataType, instanceValue);
			case OrtungPackage.FMA_LAENGE_TYPE:
				return convertFMA_Laenge_TypeToString(eDataType, instanceValue);
			case OrtungPackage.FMA_TYP_TYPE:
				return convertFMA_Typ_TypeToString(eDataType, instanceValue);
			case OrtungPackage.UEBERTRAGUNG_FMINFO_TYP_TYPE:
				return convertUebertragung_FMinfo_Typ_TypeToString(eDataType, instanceValue);
			case OrtungPackage.ZUGEINWIRKUNG_TYP_TYPE:
				return convertZugeinwirkung_Typ_TypeToString(eDataType, instanceValue);
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
	public Bettungswiderstand_TypeClass createBettungswiderstand_TypeClass() {
		Bettungswiderstand_TypeClassImpl bettungswiderstand_TypeClass = new Bettungswiderstand_TypeClassImpl();
		return bettungswiderstand_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Kennbuchstabe_TypeClass createBezeichnung_Kennbuchstabe_TypeClass() {
		Bezeichnung_Kennbuchstabe_TypeClassImpl bezeichnung_Kennbuchstabe_TypeClass = new Bezeichnung_Kennbuchstabe_TypeClassImpl();
		return bezeichnung_Kennbuchstabe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anlage createFMA_Anlage() {
		FMA_AnlageImpl fmA_Anlage = new FMA_AnlageImpl();
		return fmA_Anlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anlage_Allg_AttributeGroup createFMA_Anlage_Allg_AttributeGroup() {
		FMA_Anlage_Allg_AttributeGroupImpl fmA_Anlage_Allg_AttributeGroup = new FMA_Anlage_Allg_AttributeGroupImpl();
		return fmA_Anlage_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anlage_Bezeichnung_AttributeGroup createFMA_Anlage_Bezeichnung_AttributeGroup() {
		FMA_Anlage_Bezeichnung_AttributeGroupImpl fmA_Anlage_Bezeichnung_AttributeGroup = new FMA_Anlage_Bezeichnung_AttributeGroupImpl();
		return fmA_Anlage_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anlage_Elektr_Merkmale_AttributeGroup createFMA_Anlage_Elektr_Merkmale_AttributeGroup() {
		FMA_Anlage_Elektr_Merkmale_AttributeGroupImpl fmA_Anlage_Elektr_Merkmale_AttributeGroup = new FMA_Anlage_Elektr_Merkmale_AttributeGroupImpl();
		return fmA_Anlage_Elektr_Merkmale_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anlage_Kaskade_AttributeGroup createFMA_Anlage_Kaskade_AttributeGroup() {
		FMA_Anlage_Kaskade_AttributeGroupImpl fmA_Anlage_Kaskade_AttributeGroup = new FMA_Anlage_Kaskade_AttributeGroupImpl();
		return fmA_Anlage_Kaskade_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anlage_Uebertragung_FMinfo_AttributeGroup createFMA_Anlage_Uebertragung_FMinfo_AttributeGroup() {
		FMA_Anlage_Uebertragung_FMinfo_AttributeGroupImpl fmA_Anlage_Uebertragung_FMinfo_AttributeGroup = new FMA_Anlage_Uebertragung_FMinfo_AttributeGroupImpl();
		return fmA_Anlage_Uebertragung_FMinfo_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anschluss_Bezeichnung_TypeClass createFMA_Anschluss_Bezeichnung_TypeClass() {
		FMA_Anschluss_Bezeichnung_TypeClassImpl fmA_Anschluss_Bezeichnung_TypeClass = new FMA_Anschluss_Bezeichnung_TypeClassImpl();
		return fmA_Anschluss_Bezeichnung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anschluss_Speiserichtung_TypeClass createFMA_Anschluss_Speiserichtung_TypeClass() {
		FMA_Anschluss_Speiserichtung_TypeClassImpl fmA_Anschluss_Speiserichtung_TypeClass = new FMA_Anschluss_Speiserichtung_TypeClassImpl();
		return fmA_Anschluss_Speiserichtung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Art_TypeClass createFMA_Art_TypeClass() {
		FMA_Art_TypeClassImpl fmA_Art_TypeClass = new FMA_Art_TypeClassImpl();
		return fmA_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Element createFMA_Element() {
		FMA_ElementImpl fmA_Element = new FMA_ElementImpl();
		return fmA_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Element_Allg_AttributeGroup createFMA_Element_Allg_AttributeGroup() {
		FMA_Element_Allg_AttributeGroupImpl fmA_Element_Allg_AttributeGroup = new FMA_Element_Allg_AttributeGroupImpl();
		return fmA_Element_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Element_Anschluss_AttributeGroup createFMA_Element_Anschluss_AttributeGroup() {
		FMA_Element_Anschluss_AttributeGroupImpl fmA_Element_Anschluss_AttributeGroup = new FMA_Element_Anschluss_AttributeGroupImpl();
		return fmA_Element_Anschluss_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Element_Art_TypeClass createFMA_Element_Art_TypeClass() {
		FMA_Element_Art_TypeClassImpl fmA_Element_Art_TypeClass = new FMA_Element_Art_TypeClassImpl();
		return fmA_Element_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Element_Seilanzahl_TypeClass createFMA_Element_Seilanzahl_TypeClass() {
		FMA_Element_Seilanzahl_TypeClassImpl fmA_Element_Seilanzahl_TypeClass = new FMA_Element_Seilanzahl_TypeClassImpl();
		return fmA_Element_Seilanzahl_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Element_Seiltyp_TypeClass createFMA_Element_Seiltyp_TypeClass() {
		FMA_Element_Seiltyp_TypeClassImpl fmA_Element_Seiltyp_TypeClass = new FMA_Element_Seiltyp_TypeClassImpl();
		return fmA_Element_Seiltyp_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Hilffreimeldung_TypeClass createFMA_Hilffreimeldung_TypeClass() {
		FMA_Hilffreimeldung_TypeClassImpl fmA_Hilffreimeldung_TypeClass = new FMA_Hilffreimeldung_TypeClassImpl();
		return fmA_Hilffreimeldung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Isolierung_TypeClass createFMA_Isolierung_TypeClass() {
		FMA_Isolierung_TypeClassImpl fmA_Isolierung_TypeClass = new FMA_Isolierung_TypeClassImpl();
		return fmA_Isolierung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Kaskade_Bezeichnung_TypeClass createFMA_Kaskade_Bezeichnung_TypeClass() {
		FMA_Kaskade_Bezeichnung_TypeClassImpl fmA_Kaskade_Bezeichnung_TypeClass = new FMA_Kaskade_Bezeichnung_TypeClassImpl();
		return fmA_Kaskade_Bezeichnung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Kaskade_Einzelauswertung_TypeClass createFMA_Kaskade_Einzelauswertung_TypeClass() {
		FMA_Kaskade_Einzelauswertung_TypeClassImpl fmA_Kaskade_Einzelauswertung_TypeClass = new FMA_Kaskade_Einzelauswertung_TypeClassImpl();
		return fmA_Kaskade_Einzelauswertung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Komponente createFMA_Komponente() {
		FMA_KomponenteImpl fmA_Komponente = new FMA_KomponenteImpl();
		return fmA_Komponente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Komponente_Achszaehlpunkt_AttributeGroup createFMA_Komponente_Achszaehlpunkt_AttributeGroup() {
		FMA_Komponente_Achszaehlpunkt_AttributeGroupImpl fmA_Komponente_Achszaehlpunkt_AttributeGroup = new FMA_Komponente_Achszaehlpunkt_AttributeGroupImpl();
		return fmA_Komponente_Achszaehlpunkt_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Komponente_Art_TypeClass createFMA_Komponente_Art_TypeClass() {
		FMA_Komponente_Art_TypeClassImpl fmA_Komponente_Art_TypeClass = new FMA_Komponente_Art_TypeClassImpl();
		return fmA_Komponente_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Komponente_Schienenprofil_TypeClass createFMA_Komponente_Schienenprofil_TypeClass() {
		FMA_Komponente_Schienenprofil_TypeClassImpl fmA_Komponente_Schienenprofil_TypeClass = new FMA_Komponente_Schienenprofil_TypeClassImpl();
		return fmA_Komponente_Schienenprofil_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Komponente_Stromversorgung_TypeClass createFMA_Komponente_Stromversorgung_TypeClass() {
		FMA_Komponente_Stromversorgung_TypeClassImpl fmA_Komponente_Stromversorgung_TypeClass = new FMA_Komponente_Stromversorgung_TypeClassImpl();
		return fmA_Komponente_Stromversorgung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Komponente_Typ_TypeClass createFMA_Komponente_Typ_TypeClass() {
		FMA_Komponente_Typ_TypeClassImpl fmA_Komponente_Typ_TypeClass = new FMA_Komponente_Typ_TypeClassImpl();
		return fmA_Komponente_Typ_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Laenge_Beeinflusst_TypeClass createFMA_Laenge_Beeinflusst_TypeClass() {
		FMA_Laenge_Beeinflusst_TypeClassImpl fmA_Laenge_Beeinflusst_TypeClass = new FMA_Laenge_Beeinflusst_TypeClassImpl();
		return fmA_Laenge_Beeinflusst_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Laenge_E1_TypeClass createFMA_Laenge_E1_TypeClass() {
		FMA_Laenge_E1_TypeClassImpl fmA_Laenge_E1_TypeClass = new FMA_Laenge_E1_TypeClassImpl();
		return fmA_Laenge_E1_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Laenge_E2_TypeClass createFMA_Laenge_E2_TypeClass() {
		FMA_Laenge_E2_TypeClassImpl fmA_Laenge_E2_TypeClass = new FMA_Laenge_E2_TypeClassImpl();
		return fmA_Laenge_E2_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Laenge_E3_TypeClass createFMA_Laenge_E3_TypeClass() {
		FMA_Laenge_E3_TypeClassImpl fmA_Laenge_E3_TypeClass = new FMA_Laenge_E3_TypeClassImpl();
		return fmA_Laenge_E3_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Laenge_S_TypeClass createFMA_Laenge_S_TypeClass() {
		FMA_Laenge_S_TypeClassImpl fmA_Laenge_S_TypeClass = new FMA_Laenge_S_TypeClassImpl();
		return fmA_Laenge_S_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Laenge_TypeClass createFMA_Laenge_TypeClass() {
		FMA_Laenge_TypeClassImpl fmA_Laenge_TypeClass = new FMA_Laenge_TypeClassImpl();
		return fmA_Laenge_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Typ_TypeClass createFMA_Typ_TypeClass() {
		FMA_Typ_TypeClassImpl fmA_Typ_TypeClass = new FMA_Typ_TypeClassImpl();
		return fmA_Typ_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schaltmittel_Funktion_TypeClass createSchaltmittel_Funktion_TypeClass() {
		Schaltmittel_Funktion_TypeClassImpl schaltmittel_Funktion_TypeClass = new Schaltmittel_Funktion_TypeClassImpl();
		return schaltmittel_Funktion_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schaltmittel_Zuordnung createSchaltmittel_Zuordnung() {
		Schaltmittel_ZuordnungImpl schaltmittel_Zuordnung = new Schaltmittel_ZuordnungImpl();
		return schaltmittel_Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uebertragung_FMinfo_Richtung_TypeClass createUebertragung_FMinfo_Richtung_TypeClass() {
		Uebertragung_FMinfo_Richtung_TypeClassImpl uebertragung_FMinfo_Richtung_TypeClass = new Uebertragung_FMinfo_Richtung_TypeClassImpl();
		return uebertragung_FMinfo_Richtung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uebertragung_FMinfo_Typ_TypeClass createUebertragung_FMinfo_Typ_TypeClass() {
		Uebertragung_FMinfo_Typ_TypeClassImpl uebertragung_FMinfo_Typ_TypeClass = new Uebertragung_FMinfo_Typ_TypeClassImpl();
		return uebertragung_FMinfo_Typ_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zugeinwirkung createZugeinwirkung() {
		ZugeinwirkungImpl zugeinwirkung = new ZugeinwirkungImpl();
		return zugeinwirkung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zugeinwirkung_Allg_AttributeGroup createZugeinwirkung_Allg_AttributeGroup() {
		Zugeinwirkung_Allg_AttributeGroupImpl zugeinwirkung_Allg_AttributeGroup = new Zugeinwirkung_Allg_AttributeGroupImpl();
		return zugeinwirkung_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zugeinwirkung_Art_TypeClass createZugeinwirkung_Art_TypeClass() {
		Zugeinwirkung_Art_TypeClassImpl zugeinwirkung_Art_TypeClass = new Zugeinwirkung_Art_TypeClassImpl();
		return zugeinwirkung_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zugeinwirkung_Typ_TypeClass createZugeinwirkung_Typ_TypeClass() {
		Zugeinwirkung_Typ_TypeClassImpl zugeinwirkung_Typ_TypeClass = new Zugeinwirkung_Typ_TypeClassImpl();
		return zugeinwirkung_Typ_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBezeichnungKennbuchstabe createENUMBezeichnungKennbuchstabeFromString(EDataType eDataType, String initialValue) {
		ENUMBezeichnungKennbuchstabe result = ENUMBezeichnungKennbuchstabe.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBezeichnungKennbuchstabeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFMAAnschlussSpeiserichtung createENUMFMAAnschlussSpeiserichtungFromString(EDataType eDataType, String initialValue) {
		ENUMFMAAnschlussSpeiserichtung result = ENUMFMAAnschlussSpeiserichtung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFMAAnschlussSpeiserichtungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFMAArt createENUMFMAArtFromString(EDataType eDataType, String initialValue) {
		ENUMFMAArt result = ENUMFMAArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFMAArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFMAElementArt createENUMFMAElementArtFromString(EDataType eDataType, String initialValue) {
		ENUMFMAElementArt result = ENUMFMAElementArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFMAElementArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFMAElementSeilanzahl createENUMFMAElementSeilanzahlFromString(EDataType eDataType, String initialValue) {
		ENUMFMAElementSeilanzahl result = ENUMFMAElementSeilanzahl.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFMAElementSeilanzahlToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFMAKomponenteArt createENUMFMAKomponenteArtFromString(EDataType eDataType, String initialValue) {
		ENUMFMAKomponenteArt result = ENUMFMAKomponenteArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFMAKomponenteArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMIsolierung createENUMIsolierungFromString(EDataType eDataType, String initialValue) {
		ENUMIsolierung result = ENUMIsolierung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMIsolierungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSchaltmittelFunktion createENUMSchaltmittelFunktionFromString(EDataType eDataType, String initialValue) {
		ENUMSchaltmittelFunktion result = ENUMSchaltmittelFunktion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSchaltmittelFunktionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSchienenprofil createENUMSchienenprofilFromString(EDataType eDataType, String initialValue) {
		ENUMSchienenprofil result = ENUMSchienenprofil.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSchienenprofilToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMUebertragungFMinfoRichtung createENUMUebertragungFMinfoRichtungFromString(EDataType eDataType, String initialValue) {
		ENUMUebertragungFMinfoRichtung result = ENUMUebertragungFMinfoRichtung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMUebertragungFMinfoRichtungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZugeinwirkungArt createENUMZugeinwirkungArtFromString(EDataType eDataType, String initialValue) {
		ENUMZugeinwirkungArt result = ENUMZugeinwirkungArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZugeinwirkungArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createBettungswiderstand_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBettungswiderstand_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBezeichnungKennbuchstabe createENUMBezeichnungKennbuchstabeObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBezeichnungKennbuchstabeFromString(OrtungPackage.Literals.ENUM_BEZEICHNUNG_KENNBUCHSTABE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBezeichnungKennbuchstabeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBezeichnungKennbuchstabeToString(OrtungPackage.Literals.ENUM_BEZEICHNUNG_KENNBUCHSTABE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFMAAnschlussSpeiserichtung createENUMFMAAnschlussSpeiserichtungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFMAAnschlussSpeiserichtungFromString(OrtungPackage.Literals.ENUMFMA_ANSCHLUSS_SPEISERICHTUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFMAAnschlussSpeiserichtungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFMAAnschlussSpeiserichtungToString(OrtungPackage.Literals.ENUMFMA_ANSCHLUSS_SPEISERICHTUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFMAArt createENUMFMAArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFMAArtFromString(OrtungPackage.Literals.ENUMFMA_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFMAArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFMAArtToString(OrtungPackage.Literals.ENUMFMA_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFMAElementArt createENUMFMAElementArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFMAElementArtFromString(OrtungPackage.Literals.ENUMFMA_ELEMENT_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFMAElementArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFMAElementArtToString(OrtungPackage.Literals.ENUMFMA_ELEMENT_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFMAElementSeilanzahl createENUMFMAElementSeilanzahlObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFMAElementSeilanzahlFromString(OrtungPackage.Literals.ENUMFMA_ELEMENT_SEILANZAHL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFMAElementSeilanzahlObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFMAElementSeilanzahlToString(OrtungPackage.Literals.ENUMFMA_ELEMENT_SEILANZAHL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFMAKomponenteArt createENUMFMAKomponenteArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFMAKomponenteArtFromString(OrtungPackage.Literals.ENUMFMA_KOMPONENTE_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFMAKomponenteArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFMAKomponenteArtToString(OrtungPackage.Literals.ENUMFMA_KOMPONENTE_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMIsolierung createENUMIsolierungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMIsolierungFromString(OrtungPackage.Literals.ENUM_ISOLIERUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMIsolierungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMIsolierungToString(OrtungPackage.Literals.ENUM_ISOLIERUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSchaltmittelFunktion createENUMSchaltmittelFunktionObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSchaltmittelFunktionFromString(OrtungPackage.Literals.ENUM_SCHALTMITTEL_FUNKTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSchaltmittelFunktionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSchaltmittelFunktionToString(OrtungPackage.Literals.ENUM_SCHALTMITTEL_FUNKTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSchienenprofil createENUMSchienenprofilObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSchienenprofilFromString(OrtungPackage.Literals.ENUM_SCHIENENPROFIL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSchienenprofilObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSchienenprofilToString(OrtungPackage.Literals.ENUM_SCHIENENPROFIL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMUebertragungFMinfoRichtung createENUMUebertragungFMinfoRichtungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMUebertragungFMinfoRichtungFromString(OrtungPackage.Literals.ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMUebertragungFMinfoRichtungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMUebertragungFMinfoRichtungToString(OrtungPackage.Literals.ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZugeinwirkungArt createENUMZugeinwirkungArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMZugeinwirkungArtFromString(OrtungPackage.Literals.ENUM_ZUGEINWIRKUNG_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZugeinwirkungArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMZugeinwirkungArtToString(OrtungPackage.Literals.ENUM_ZUGEINWIRKUNG_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFMA_Anschluss_Bezeichnung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFMA_Anschluss_Bezeichnung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFMA_Element_Seiltyp_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFMA_Element_Seiltyp_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFMA_Kaskade_Bezeichnung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFMA_Kaskade_Bezeichnung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFMA_Komponente_Typ_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFMA_Komponente_Typ_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createFMA_Laenge_Beeinflusst_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFMA_Laenge_Beeinflusst_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createFMA_Laenge_E1_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFMA_Laenge_E1_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createFMA_Laenge_E2_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFMA_Laenge_E2_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createFMA_Laenge_E3_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFMA_Laenge_E3_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createFMA_Laenge_S_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFMA_Laenge_S_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createFMA_Laenge_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFMA_Laenge_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFMA_Typ_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFMA_Typ_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUebertragung_FMinfo_Typ_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUebertragung_FMinfo_Typ_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createZugeinwirkung_Typ_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZugeinwirkung_Typ_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrtungPackage getOrtungPackage() {
		return (OrtungPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OrtungPackage getPackage() {
		return OrtungPackage.eINSTANCE;
	}

} //OrtungFactoryImpl
