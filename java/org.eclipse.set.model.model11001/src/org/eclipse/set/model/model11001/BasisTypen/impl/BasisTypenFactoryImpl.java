/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.BasisTypen.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.set.model.model11001.BasisTypen.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasisTypenFactoryImpl extends EFactoryImpl implements BasisTypenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasisTypenFactory init() {
		try {
			BasisTypenFactory theBasisTypenFactory = (BasisTypenFactory)EPackage.Registry.INSTANCE.getEFactory(BasisTypenPackage.eNS_URI);
			if (theBasisTypenFactory != null) {
				return theBasisTypenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasisTypenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisTypenFactoryImpl() {
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
			case BasisTypenPackage.BEZEICHNUNG_AUSSENANLAGE_TYPE_CLASS: return createBezeichnung_Aussenanlage_TypeClass();
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP: return createBezeichnung_Element_AttributeGroup();
			case BasisTypenPackage.BEZEICHNUNG_LAGEPLAN_KURZ_TYPE_CLASS: return createBezeichnung_Lageplan_Kurz_TypeClass();
			case BasisTypenPackage.BEZEICHNUNG_LAGEPLAN_LANG_TYPE_CLASS: return createBezeichnung_Lageplan_Lang_TypeClass();
			case BasisTypenPackage.BEZEICHNUNG_TABELLE_TYPE_CLASS: return createBezeichnung_Tabelle_TypeClass();
			case BasisTypenPackage.DATUM_AUSLIEFERUNG_TYPE_CLASS: return createDatum_Auslieferung_TypeClass();
			case BasisTypenPackage.ID_BEARBEITUNGSVERMERK_TYPE_CLASS: return createID_Bearbeitungsvermerk_TypeClass();
			case BasisTypenPackage.KENNZAHL_TYPE_CLASS: return createKennzahl_TypeClass();
			case BasisTypenPackage.OERTLICHER_ELEMENTNAME_TYPE_CLASS: return createOertlicher_Elementname_TypeClass();
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP: return createPruefmerkmale_Daten_AttributeGroup();
			case BasisTypenPackage.PRUEFSUMME_ART_TYPE_CLASS: return createPruefsumme_Art_TypeClass();
			case BasisTypenPackage.PRUEFSUMME_TYPE_CLASS: return createPruefsumme_TypeClass();
			case BasisTypenPackage.VERSION_AUSLIEFERUNG_TYPE_CLASS: return createVersion_Auslieferung_TypeClass();
			case BasisTypenPackage.ZEIGER_TYPE_CLASS: return createZeiger_TypeClass();
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
			case BasisTypenPackage.ENUM_ANWENDUNGSSYSTEM:
				return createENUMAnwendungssystemFromString(eDataType, initialValue);
			case BasisTypenPackage.ENUM_AUSRICHTUNG:
				return createENUMAusrichtungFromString(eDataType, initialValue);
			case BasisTypenPackage.ENUM_BREMSWEG:
				return createENUMBremswegFromString(eDataType, initialValue);
			case BasisTypenPackage.ENUM_FAHRSTROM:
				return createENUMFahrstromFromString(eDataType, initialValue);
			case BasisTypenPackage.ENUM_LINKS_RECHTS:
				return createENUMLinksRechtsFromString(eDataType, initialValue);
			case BasisTypenPackage.ENUM_PRUEFSUMME_ART:
				return createENUMPruefsummeArtFromString(eDataType, initialValue);
			case BasisTypenPackage.ENUM_REGIONALBEREICH:
				return createENUMRegionalbereichFromString(eDataType, initialValue);
			case BasisTypenPackage.ENUM_WIRKRICHTUNG:
				return createENUMWirkrichtungFromString(eDataType, initialValue);
			case BasisTypenPackage.ANWENDUNGSSYSTEM_TYPE:
				return createAnwendungssystem_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.AUSRICHTUNG_TYPE:
				return createAusrichtung_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.BEZEICHNUNG_AUSSENANLAGE_TYPE:
				return createBezeichnung_Aussenanlage_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.BEZEICHNUNG_LAGEPLAN_KURZ_TYPE:
				return createBezeichnung_Lageplan_Kurz_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.BEZEICHNUNG_LAGEPLAN_LANG_TYPE:
				return createBezeichnung_Lageplan_Lang_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.BEZEICHNUNG_TABELLE_TYPE:
				return createBezeichnung_Tabelle_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.BREMSWEG_TYPE:
				return createBremsweg_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.DATEINAME_TYPE:
				return createDateiname_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.DATUM_AUSLIEFERUNG_TYPE:
				return createDatum_Auslieferung_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.ENUM_ANWENDUNGSSYSTEM_OBJECT:
				return createENUMAnwendungssystemObjectFromString(eDataType, initialValue);
			case BasisTypenPackage.ENUM_AUSRICHTUNG_OBJECT:
				return createENUMAusrichtungObjectFromString(eDataType, initialValue);
			case BasisTypenPackage.ENUM_BREMSWEG_OBJECT:
				return createENUMBremswegObjectFromString(eDataType, initialValue);
			case BasisTypenPackage.ENUM_FAHRSTROM_OBJECT:
				return createENUMFahrstromObjectFromString(eDataType, initialValue);
			case BasisTypenPackage.ENUM_LINKS_RECHTS_OBJECT:
				return createENUMLinksRechtsObjectFromString(eDataType, initialValue);
			case BasisTypenPackage.ENUM_PRUEFSUMME_ART_OBJECT:
				return createENUMPruefsummeArtObjectFromString(eDataType, initialValue);
			case BasisTypenPackage.ENUM_REGIONALBEREICH_OBJECT:
				return createENUMRegionalbereichObjectFromString(eDataType, initialValue);
			case BasisTypenPackage.ENUM_WIRKRICHTUNG_OBJECT:
				return createENUMWirkrichtungObjectFromString(eDataType, initialValue);
			case BasisTypenPackage.FAHRSTROM_TYPE:
				return createFahrstrom_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.FREI_TEXT_TYPE:
				return createFreiText_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.GESCHWINDIGKEIT_TYPE:
				return createGeschwindigkeit_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.GUID_TYPE:
				return createGUID_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.HERSTELLER_TYPE:
				return createHersteller_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.KENNZAHL_TYPE:
				return createKennzahl_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.KILOMETRIERUNG_TYPE:
				return createKilometrierung_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.LINKS_RECHTS_TYPE:
				return createLinksRechts_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.METER_TYPE:
				return createMeter_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.OBJEKTNAME_TYPE:
				return createObjektname_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.OERTLICHER_ELEMENTNAME_TYPE:
				return createOertlicher_Elementname_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.REGIONALBEREICH_TYPE:
				return createRegionalbereich_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.SEKUNDE_TYPE:
				return createSekunde_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.TEXT_TYPE:
				return createText_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.VERSION_AUSLIEFERUNG_TYPE:
				return createVersion_Auslieferung_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.WIRKRICHTUNG_TYPE:
				return createWirkrichtung_TypeFromString(eDataType, initialValue);
			case BasisTypenPackage.ZEICHENKETTE_TYPE:
				return createZeichenkette_TypeFromString(eDataType, initialValue);
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
			case BasisTypenPackage.ENUM_ANWENDUNGSSYSTEM:
				return convertENUMAnwendungssystemToString(eDataType, instanceValue);
			case BasisTypenPackage.ENUM_AUSRICHTUNG:
				return convertENUMAusrichtungToString(eDataType, instanceValue);
			case BasisTypenPackage.ENUM_BREMSWEG:
				return convertENUMBremswegToString(eDataType, instanceValue);
			case BasisTypenPackage.ENUM_FAHRSTROM:
				return convertENUMFahrstromToString(eDataType, instanceValue);
			case BasisTypenPackage.ENUM_LINKS_RECHTS:
				return convertENUMLinksRechtsToString(eDataType, instanceValue);
			case BasisTypenPackage.ENUM_PRUEFSUMME_ART:
				return convertENUMPruefsummeArtToString(eDataType, instanceValue);
			case BasisTypenPackage.ENUM_REGIONALBEREICH:
				return convertENUMRegionalbereichToString(eDataType, instanceValue);
			case BasisTypenPackage.ENUM_WIRKRICHTUNG:
				return convertENUMWirkrichtungToString(eDataType, instanceValue);
			case BasisTypenPackage.ANWENDUNGSSYSTEM_TYPE:
				return convertAnwendungssystem_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.AUSRICHTUNG_TYPE:
				return convertAusrichtung_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.BEZEICHNUNG_AUSSENANLAGE_TYPE:
				return convertBezeichnung_Aussenanlage_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.BEZEICHNUNG_LAGEPLAN_KURZ_TYPE:
				return convertBezeichnung_Lageplan_Kurz_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.BEZEICHNUNG_LAGEPLAN_LANG_TYPE:
				return convertBezeichnung_Lageplan_Lang_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.BEZEICHNUNG_TABELLE_TYPE:
				return convertBezeichnung_Tabelle_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.BREMSWEG_TYPE:
				return convertBremsweg_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.DATEINAME_TYPE:
				return convertDateiname_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.DATUM_AUSLIEFERUNG_TYPE:
				return convertDatum_Auslieferung_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.ENUM_ANWENDUNGSSYSTEM_OBJECT:
				return convertENUMAnwendungssystemObjectToString(eDataType, instanceValue);
			case BasisTypenPackage.ENUM_AUSRICHTUNG_OBJECT:
				return convertENUMAusrichtungObjectToString(eDataType, instanceValue);
			case BasisTypenPackage.ENUM_BREMSWEG_OBJECT:
				return convertENUMBremswegObjectToString(eDataType, instanceValue);
			case BasisTypenPackage.ENUM_FAHRSTROM_OBJECT:
				return convertENUMFahrstromObjectToString(eDataType, instanceValue);
			case BasisTypenPackage.ENUM_LINKS_RECHTS_OBJECT:
				return convertENUMLinksRechtsObjectToString(eDataType, instanceValue);
			case BasisTypenPackage.ENUM_PRUEFSUMME_ART_OBJECT:
				return convertENUMPruefsummeArtObjectToString(eDataType, instanceValue);
			case BasisTypenPackage.ENUM_REGIONALBEREICH_OBJECT:
				return convertENUMRegionalbereichObjectToString(eDataType, instanceValue);
			case BasisTypenPackage.ENUM_WIRKRICHTUNG_OBJECT:
				return convertENUMWirkrichtungObjectToString(eDataType, instanceValue);
			case BasisTypenPackage.FAHRSTROM_TYPE:
				return convertFahrstrom_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.FREI_TEXT_TYPE:
				return convertFreiText_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.GESCHWINDIGKEIT_TYPE:
				return convertGeschwindigkeit_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.GUID_TYPE:
				return convertGUID_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.HERSTELLER_TYPE:
				return convertHersteller_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.KENNZAHL_TYPE:
				return convertKennzahl_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.KILOMETRIERUNG_TYPE:
				return convertKilometrierung_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.LINKS_RECHTS_TYPE:
				return convertLinksRechts_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.METER_TYPE:
				return convertMeter_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.OBJEKTNAME_TYPE:
				return convertObjektname_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.OERTLICHER_ELEMENTNAME_TYPE:
				return convertOertlicher_Elementname_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.REGIONALBEREICH_TYPE:
				return convertRegionalbereich_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.SEKUNDE_TYPE:
				return convertSekunde_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.TEXT_TYPE:
				return convertText_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.VERSION_AUSLIEFERUNG_TYPE:
				return convertVersion_Auslieferung_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.WIRKRICHTUNG_TYPE:
				return convertWirkrichtung_TypeToString(eDataType, instanceValue);
			case BasisTypenPackage.ZEICHENKETTE_TYPE:
				return convertZeichenkette_TypeToString(eDataType, instanceValue);
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
	public Bezeichnung_Aussenanlage_TypeClass createBezeichnung_Aussenanlage_TypeClass() {
		Bezeichnung_Aussenanlage_TypeClassImpl bezeichnung_Aussenanlage_TypeClass = new Bezeichnung_Aussenanlage_TypeClassImpl();
		return bezeichnung_Aussenanlage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Element_AttributeGroup createBezeichnung_Element_AttributeGroup() {
		Bezeichnung_Element_AttributeGroupImpl bezeichnung_Element_AttributeGroup = new Bezeichnung_Element_AttributeGroupImpl();
		return bezeichnung_Element_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Lageplan_Kurz_TypeClass createBezeichnung_Lageplan_Kurz_TypeClass() {
		Bezeichnung_Lageplan_Kurz_TypeClassImpl bezeichnung_Lageplan_Kurz_TypeClass = new Bezeichnung_Lageplan_Kurz_TypeClassImpl();
		return bezeichnung_Lageplan_Kurz_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Lageplan_Lang_TypeClass createBezeichnung_Lageplan_Lang_TypeClass() {
		Bezeichnung_Lageplan_Lang_TypeClassImpl bezeichnung_Lageplan_Lang_TypeClass = new Bezeichnung_Lageplan_Lang_TypeClassImpl();
		return bezeichnung_Lageplan_Lang_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Tabelle_TypeClass createBezeichnung_Tabelle_TypeClass() {
		Bezeichnung_Tabelle_TypeClassImpl bezeichnung_Tabelle_TypeClass = new Bezeichnung_Tabelle_TypeClassImpl();
		return bezeichnung_Tabelle_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datum_Auslieferung_TypeClass createDatum_Auslieferung_TypeClass() {
		Datum_Auslieferung_TypeClassImpl datum_Auslieferung_TypeClass = new Datum_Auslieferung_TypeClassImpl();
		return datum_Auslieferung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bearbeitungsvermerk_TypeClass createID_Bearbeitungsvermerk_TypeClass() {
		ID_Bearbeitungsvermerk_TypeClassImpl iD_Bearbeitungsvermerk_TypeClass = new ID_Bearbeitungsvermerk_TypeClassImpl();
		return iD_Bearbeitungsvermerk_TypeClass;
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
	public Oertlicher_Elementname_TypeClass createOertlicher_Elementname_TypeClass() {
		Oertlicher_Elementname_TypeClassImpl oertlicher_Elementname_TypeClass = new Oertlicher_Elementname_TypeClassImpl();
		return oertlicher_Elementname_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pruefmerkmale_Daten_AttributeGroup createPruefmerkmale_Daten_AttributeGroup() {
		Pruefmerkmale_Daten_AttributeGroupImpl pruefmerkmale_Daten_AttributeGroup = new Pruefmerkmale_Daten_AttributeGroupImpl();
		return pruefmerkmale_Daten_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pruefsumme_Art_TypeClass createPruefsumme_Art_TypeClass() {
		Pruefsumme_Art_TypeClassImpl pruefsumme_Art_TypeClass = new Pruefsumme_Art_TypeClassImpl();
		return pruefsumme_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pruefsumme_TypeClass createPruefsumme_TypeClass() {
		Pruefsumme_TypeClassImpl pruefsumme_TypeClass = new Pruefsumme_TypeClassImpl();
		return pruefsumme_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Version_Auslieferung_TypeClass createVersion_Auslieferung_TypeClass() {
		Version_Auslieferung_TypeClassImpl version_Auslieferung_TypeClass = new Version_Auslieferung_TypeClassImpl();
		return version_Auslieferung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zeiger_TypeClass createZeiger_TypeClass() {
		Zeiger_TypeClassImpl zeiger_TypeClass = new Zeiger_TypeClassImpl();
		return zeiger_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAnwendungssystem createENUMAnwendungssystemFromString(EDataType eDataType, String initialValue) {
		ENUMAnwendungssystem result = ENUMAnwendungssystem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAnwendungssystemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAusrichtung createENUMAusrichtungFromString(EDataType eDataType, String initialValue) {
		ENUMAusrichtung result = ENUMAusrichtung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAusrichtungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBremsweg createENUMBremswegFromString(EDataType eDataType, String initialValue) {
		ENUMBremsweg result = ENUMBremsweg.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBremswegToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFahrstrom createENUMFahrstromFromString(EDataType eDataType, String initialValue) {
		ENUMFahrstrom result = ENUMFahrstrom.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFahrstromToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinksRechts createENUMLinksRechtsFromString(EDataType eDataType, String initialValue) {
		ENUMLinksRechts result = ENUMLinksRechts.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLinksRechtsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMPruefsummeArt createENUMPruefsummeArtFromString(EDataType eDataType, String initialValue) {
		ENUMPruefsummeArt result = ENUMPruefsummeArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMPruefsummeArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMRegionalbereich createENUMRegionalbereichFromString(EDataType eDataType, String initialValue) {
		ENUMRegionalbereich result = ENUMRegionalbereich.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMRegionalbereichToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWirkrichtung createENUMWirkrichtungFromString(EDataType eDataType, String initialValue) {
		ENUMWirkrichtung result = ENUMWirkrichtung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWirkrichtungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAnwendungssystem createAnwendungssystem_TypeFromString(EDataType eDataType, String initialValue) {
		return createENUMAnwendungssystemFromString(BasisTypenPackage.Literals.ENUM_ANWENDUNGSSYSTEM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnwendungssystem_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertENUMAnwendungssystemToString(BasisTypenPackage.Literals.ENUM_ANWENDUNGSSYSTEM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAusrichtung createAusrichtung_TypeFromString(EDataType eDataType, String initialValue) {
		return createENUMAusrichtungFromString(BasisTypenPackage.Literals.ENUM_AUSRICHTUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAusrichtung_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertENUMAusrichtungToString(BasisTypenPackage.Literals.ENUM_AUSRICHTUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Aussenanlage_TypeFromString(EDataType eDataType, String initialValue) {
		return createText_TypeFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Aussenanlage_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertText_TypeToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Lageplan_Kurz_TypeFromString(EDataType eDataType, String initialValue) {
		return createText_TypeFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Lageplan_Kurz_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertText_TypeToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Lageplan_Lang_TypeFromString(EDataType eDataType, String initialValue) {
		return createText_TypeFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Lageplan_Lang_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertText_TypeToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Tabelle_TypeFromString(EDataType eDataType, String initialValue) {
		return createText_TypeFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Tabelle_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertText_TypeToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBremsweg createBremsweg_TypeFromString(EDataType eDataType, String initialValue) {
		return createENUMBremswegFromString(BasisTypenPackage.Literals.ENUM_BREMSWEG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBremsweg_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBremswegToString(BasisTypenPackage.Literals.ENUM_BREMSWEG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDateiname_TypeFromString(EDataType eDataType, String initialValue) {
		return createText_TypeFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateiname_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertText_TypeToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDatum_Auslieferung_TypeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatum_Auslieferung_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAnwendungssystem createENUMAnwendungssystemObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMAnwendungssystemFromString(BasisTypenPackage.Literals.ENUM_ANWENDUNGSSYSTEM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAnwendungssystemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMAnwendungssystemToString(BasisTypenPackage.Literals.ENUM_ANWENDUNGSSYSTEM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAusrichtung createENUMAusrichtungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMAusrichtungFromString(BasisTypenPackage.Literals.ENUM_AUSRICHTUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAusrichtungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMAusrichtungToString(BasisTypenPackage.Literals.ENUM_AUSRICHTUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBremsweg createENUMBremswegObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBremswegFromString(BasisTypenPackage.Literals.ENUM_BREMSWEG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBremswegObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBremswegToString(BasisTypenPackage.Literals.ENUM_BREMSWEG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFahrstrom createENUMFahrstromObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFahrstromFromString(BasisTypenPackage.Literals.ENUM_FAHRSTROM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFahrstromObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFahrstromToString(BasisTypenPackage.Literals.ENUM_FAHRSTROM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinksRechts createENUMLinksRechtsObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMLinksRechtsFromString(BasisTypenPackage.Literals.ENUM_LINKS_RECHTS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLinksRechtsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMLinksRechtsToString(BasisTypenPackage.Literals.ENUM_LINKS_RECHTS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMPruefsummeArt createENUMPruefsummeArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMPruefsummeArtFromString(BasisTypenPackage.Literals.ENUM_PRUEFSUMME_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMPruefsummeArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMPruefsummeArtToString(BasisTypenPackage.Literals.ENUM_PRUEFSUMME_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMRegionalbereich createENUMRegionalbereichObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMRegionalbereichFromString(BasisTypenPackage.Literals.ENUM_REGIONALBEREICH, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMRegionalbereichObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMRegionalbereichToString(BasisTypenPackage.Literals.ENUM_REGIONALBEREICH, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWirkrichtung createENUMWirkrichtungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMWirkrichtungFromString(BasisTypenPackage.Literals.ENUM_WIRKRICHTUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWirkrichtungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMWirkrichtungToString(BasisTypenPackage.Literals.ENUM_WIRKRICHTUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFahrstrom createFahrstrom_TypeFromString(EDataType eDataType, String initialValue) {
		return createENUMFahrstromFromString(BasisTypenPackage.Literals.ENUM_FAHRSTROM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFahrstrom_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFahrstromToString(BasisTypenPackage.Literals.ENUM_FAHRSTROM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFreiText_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFreiText_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createGeschwindigkeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeschwindigkeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createGUID_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGUID_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHersteller_TypeFromString(EDataType eDataType, String initialValue) {
		return createText_TypeFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHersteller_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertText_TypeToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createKennzahl_TypeFromString(EDataType eDataType, String initialValue) {
		return createZeichenkette_TypeFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKennzahl_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertZeichenkette_TypeToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createKilometrierung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKilometrierung_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinksRechts createLinksRechts_TypeFromString(EDataType eDataType, String initialValue) {
		return createENUMLinksRechtsFromString(BasisTypenPackage.Literals.ENUM_LINKS_RECHTS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinksRechts_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertENUMLinksRechtsToString(BasisTypenPackage.Literals.ENUM_LINKS_RECHTS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMeter_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeter_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createObjektname_TypeFromString(EDataType eDataType, String initialValue) {
		return createText_TypeFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjektname_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertText_TypeToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOertlicher_Elementname_TypeFromString(EDataType eDataType, String initialValue) {
		return createZeichenkette_TypeFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOertlicher_Elementname_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertZeichenkette_TypeToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMRegionalbereich createRegionalbereich_TypeFromString(EDataType eDataType, String initialValue) {
		return createENUMRegionalbereichFromString(BasisTypenPackage.Literals.ENUM_REGIONALBEREICH, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegionalbereich_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertENUMRegionalbereichToString(BasisTypenPackage.Literals.ENUM_REGIONALBEREICH, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSekunde_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSekunde_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createText_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertText_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersion_Auslieferung_TypeFromString(EDataType eDataType, String initialValue) {
		return createText_TypeFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersion_Auslieferung_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertText_TypeToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWirkrichtung createWirkrichtung_TypeFromString(EDataType eDataType, String initialValue) {
		return createENUMWirkrichtungFromString(BasisTypenPackage.Literals.ENUM_WIRKRICHTUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWirkrichtung_TypeToString(EDataType eDataType, Object instanceValue) {
		return convertENUMWirkrichtungToString(BasisTypenPackage.Literals.ENUM_WIRKRICHTUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createZeichenkette_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZeichenkette_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasisTypenPackage getBasisTypenPackage() {
		return (BasisTypenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasisTypenPackage getPackage() {
		return BasisTypenPackage.eINSTANCE;
	}

} //BasisTypenFactoryImpl
