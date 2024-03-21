/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse.impl;

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

import org.eclipse.set.model.planpro.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.planpro.Fahrstrasse.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FahrstrasseFactoryImpl extends EFactoryImpl implements FahrstrasseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FahrstrasseFactory init() {
		try {
			FahrstrasseFactory theFahrstrasseFactory = (FahrstrasseFactory)EPackage.Registry.INSTANCE.getEFactory(FahrstrassePackage.eNS_URI);
			if (theFahrstrasseFactory != null) {
				return theFahrstrasseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FahrstrasseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FahrstrasseFactoryImpl() {
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
			case FahrstrassePackage.AUFLOESUNG_SSP_ZIELGLEIS_TYPE_CLASS: return createAufloesung_Ssp_Zielgleis_TypeClass();
			case FahrstrassePackage.AUFLOESUNG_VERZOEGERUNG_TYPE_CLASS: return createAufloesung_Verzoegerung_TypeClass();
			case FahrstrassePackage.AUTOMATISCHE_EINSTELLUNG_TYPE_CLASS: return createAutomatische_Einstellung_TypeClass();
			case FahrstrassePackage.BEZEICHNUNG_FSTR_DWEG_TYPE_CLASS: return createBezeichnung_Fstr_DWeg_TypeClass();
			case FahrstrassePackage.BEZEICHNUNG_MARKANTER_PUNKT_TYPE_CLASS: return createBezeichnung_Markanter_Punkt_TypeClass();
			case FahrstrassePackage.DWEG_REIHENFOLGE_TYPE_CLASS: return createDWeg_Reihenfolge_TypeClass();
			case FahrstrassePackage.DWEG_VAUFWERTUNG_VERZICHT_TYPE_CLASS: return createDWeg_V_Aufwertung_Verzicht_TypeClass();
			case FahrstrassePackage.DWEG_VTYPE_CLASS: return createDWeg_V_TypeClass();
			case FahrstrassePackage.DWEG_VORZUG_TYPE_CLASS: return createDWeg_Vorzug_TypeClass();
			case FahrstrassePackage.ELEMENT_VERSCHLUSS_TYPE_CLASS: return createElement_Verschluss_TypeClass();
			case FahrstrassePackage.FBEDIENUNG_TYPE_CLASS: return createF_Bedienung_TypeClass();
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT: return createFstr_Abhaengigkeit();
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP: return createFstr_Abhaengigkeit_Ssp_AttributeGroup();
			case FahrstrassePackage.FSTR_ANEINANDER: return createFstr_Aneinander();
			case FahrstrassePackage.FSTR_ANEINANDER_BEDIENSTRING_TYPE_CLASS: return createFstr_Aneinander_Bedienstring_TypeClass();
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG: return createFstr_Aneinander_Zuordnung();
			case FahrstrassePackage.FSTR_BEDIENSTRING_TYPE_CLASS: return createFstr_Bedienstring_TypeClass();
			case FahrstrassePackage.FSTR_DWEG: return createFstr_DWeg();
			case FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP: return createFstr_DWeg_Allg_AttributeGroup();
			case FahrstrassePackage.FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP: return createFstr_DWeg_Bezeichnung_AttributeGroup();
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP: return createFstr_DWeg_Spezifisch_AttributeGroup();
			case FahrstrassePackage.FSTR_DWEG_WKR: return createFstr_DWeg_W_Kr();
			case FahrstrassePackage.FSTR_FAHRWEG: return createFstr_Fahrweg();
			case FahrstrassePackage.FSTR_MITTEL_ART_TYPE_CLASS: return createFstr_Mittel_Art_TypeClass();
			case FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP: return createFstr_Mittel_AttributeGroup();
			case FahrstrassePackage.FSTR_MITTEL_VAUFWERTUNG_TYPE_CLASS: return createFstr_Mittel_V_Aufwertung_TypeClass();
			case FahrstrassePackage.FSTR_NICHTHALTFALL: return createFstr_Nichthaltfall();
			case FahrstrassePackage.FSTR_RANGIER_ART_TYPE_CLASS: return createFstr_Rangier_Art_TypeClass();
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP: return createFstr_Rangier_AttributeGroup();
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG: return createFstr_Rangier_Fla_Zuordnung();
			case FahrstrassePackage.FSTR_REIHENFOLGE_TYPE_CLASS: return createFstr_Reihenfolge_TypeClass();
			case FahrstrassePackage.FSTR_SIGNALISIERUNG: return createFstr_Signalisierung();
			case FahrstrassePackage.FSTR_UMFAHRPUNKT: return createFstr_Umfahrpunkt();
			case FahrstrassePackage.FSTR_VHG_TYPE_CLASS: return createFstr_V_Hg_TypeClass();
			case FahrstrassePackage.FSTR_VTYPE_CLASS: return createFstr_V_TypeClass();
			case FahrstrassePackage.FSTR_VSIGABSTAND_VERKUERZT_TYPE_CLASS: return createFstr_Vsigabstand_Verkuerzt_TypeClass();
			case FahrstrassePackage.FSTR_ZUG_ART_TYPE_CLASS: return createFstr_Zug_Art_TypeClass();
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP: return createFstr_Zug_AttributeGroup();
			case FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP: return createFstr_Zug_DWeg_AttributeGroup();
			case FahrstrassePackage.FSTR_ZUG_RANGIER: return createFstr_Zug_Rangier();
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP: return createFstr_Zug_Rangier_Allg_AttributeGroup();
			case FahrstrassePackage.LAENGE_SOLL_TYPE_CLASS: return createLaenge_Soll_TypeClass();
			case FahrstrassePackage.MARKANTER_PUNKT: return createMarkanter_Punkt();
			case FahrstrassePackage.MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP: return createMarkanter_Punkt_Bezeichnung_AttributeGroup();
			case FahrstrassePackage.MASSGEBENDE_NEIGUNG_TYPE_CLASS: return createMassgebende_Neigung_TypeClass();
			case FahrstrassePackage.RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS: return createRangier_Gegenfahrtausschluss_TypeClass();
			case FahrstrassePackage.SONSTIGER_PUNKT: return createSonstiger_Punkt();
			case FahrstrassePackage.START_SIGNAL_CHARAKTER_TYPE_CLASS: return createStart_Signal_Charakter_TypeClass();
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
			case FahrstrassePackage.ENUM_AUFLOESUNG_SSP_ZIELGLEIS:
				return createENUMAufloesungSspZielgleisFromString(eDataType, initialValue);
			case FahrstrassePackage.ENUM_AUTOMATISCHE_EINSTELLUNG:
				return createENUMAutomatischeEinstellungFromString(eDataType, initialValue);
			case FahrstrassePackage.ENUM_FSTR_MITTEL_ART:
				return createENUMFstrMittelArtFromString(eDataType, initialValue);
			case FahrstrassePackage.ENUM_FSTR_RANGIER_ART:
				return createENUMFstrRangierArtFromString(eDataType, initialValue);
			case FahrstrassePackage.ENUM_FSTR_ZUG_ART:
				return createENUMFstrZugArtFromString(eDataType, initialValue);
			case FahrstrassePackage.ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS:
				return createENUMRangierGegenfahrtausschlussFromString(eDataType, initialValue);
			case FahrstrassePackage.ENUM_START_SIGNAL_CHARAKTER:
				return createENUMStartSignalCharakterFromString(eDataType, initialValue);
			case FahrstrassePackage.AUFLOESUNG_VERZOEGERUNG_TYPE:
				return createAufloesung_Verzoegerung_TypeFromString(eDataType, initialValue);
			case FahrstrassePackage.BEZEICHNUNG_FSTR_DWEG_TYPE:
				return createBezeichnung_Fstr_DWeg_TypeFromString(eDataType, initialValue);
			case FahrstrassePackage.BEZEICHNUNG_MARKANTER_PUNKT_TYPE:
				return createBezeichnung_Markanter_Punkt_TypeFromString(eDataType, initialValue);
			case FahrstrassePackage.DWEG_REIHENFOLGE_TYPE:
				return createDWeg_Reihenfolge_TypeFromString(eDataType, initialValue);
			case FahrstrassePackage.DWEG_VTYPE:
				return createDWeg_V_TypeFromString(eDataType, initialValue);
			case FahrstrassePackage.ENUM_AUFLOESUNG_SSP_ZIELGLEIS_OBJECT:
				return createENUMAufloesungSspZielgleisObjectFromString(eDataType, initialValue);
			case FahrstrassePackage.ENUM_AUTOMATISCHE_EINSTELLUNG_OBJECT:
				return createENUMAutomatischeEinstellungObjectFromString(eDataType, initialValue);
			case FahrstrassePackage.ENUM_FSTR_MITTEL_ART_OBJECT:
				return createENUMFstrMittelArtObjectFromString(eDataType, initialValue);
			case FahrstrassePackage.ENUM_FSTR_RANGIER_ART_OBJECT:
				return createENUMFstrRangierArtObjectFromString(eDataType, initialValue);
			case FahrstrassePackage.ENUM_FSTR_ZUG_ART_OBJECT:
				return createENUMFstrZugArtObjectFromString(eDataType, initialValue);
			case FahrstrassePackage.ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_OBJECT:
				return createENUMRangierGegenfahrtausschlussObjectFromString(eDataType, initialValue);
			case FahrstrassePackage.ENUM_START_SIGNAL_CHARAKTER_OBJECT:
				return createENUMStartSignalCharakterObjectFromString(eDataType, initialValue);
			case FahrstrassePackage.FSTR_ANEINANDER_BEDIENSTRING_TYPE:
				return createFstr_Aneinander_Bedienstring_TypeFromString(eDataType, initialValue);
			case FahrstrassePackage.FSTR_BEDIENSTRING_TYPE:
				return createFstr_Bedienstring_TypeFromString(eDataType, initialValue);
			case FahrstrassePackage.FSTR_REIHENFOLGE_TYPE:
				return createFstr_Reihenfolge_TypeFromString(eDataType, initialValue);
			case FahrstrassePackage.FSTR_VHG_TYPE:
				return createFstr_V_Hg_TypeFromString(eDataType, initialValue);
			case FahrstrassePackage.FSTR_VTYPE:
				return createFstr_V_TypeFromString(eDataType, initialValue);
			case FahrstrassePackage.LAENGE_SOLL_TYPE:
				return createLaenge_Soll_TypeFromString(eDataType, initialValue);
			case FahrstrassePackage.MASSGEBENDE_NEIGUNG_TYPE:
				return createMassgebende_Neigung_TypeFromString(eDataType, initialValue);
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
			case FahrstrassePackage.ENUM_AUFLOESUNG_SSP_ZIELGLEIS:
				return convertENUMAufloesungSspZielgleisToString(eDataType, instanceValue);
			case FahrstrassePackage.ENUM_AUTOMATISCHE_EINSTELLUNG:
				return convertENUMAutomatischeEinstellungToString(eDataType, instanceValue);
			case FahrstrassePackage.ENUM_FSTR_MITTEL_ART:
				return convertENUMFstrMittelArtToString(eDataType, instanceValue);
			case FahrstrassePackage.ENUM_FSTR_RANGIER_ART:
				return convertENUMFstrRangierArtToString(eDataType, instanceValue);
			case FahrstrassePackage.ENUM_FSTR_ZUG_ART:
				return convertENUMFstrZugArtToString(eDataType, instanceValue);
			case FahrstrassePackage.ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS:
				return convertENUMRangierGegenfahrtausschlussToString(eDataType, instanceValue);
			case FahrstrassePackage.ENUM_START_SIGNAL_CHARAKTER:
				return convertENUMStartSignalCharakterToString(eDataType, instanceValue);
			case FahrstrassePackage.AUFLOESUNG_VERZOEGERUNG_TYPE:
				return convertAufloesung_Verzoegerung_TypeToString(eDataType, instanceValue);
			case FahrstrassePackage.BEZEICHNUNG_FSTR_DWEG_TYPE:
				return convertBezeichnung_Fstr_DWeg_TypeToString(eDataType, instanceValue);
			case FahrstrassePackage.BEZEICHNUNG_MARKANTER_PUNKT_TYPE:
				return convertBezeichnung_Markanter_Punkt_TypeToString(eDataType, instanceValue);
			case FahrstrassePackage.DWEG_REIHENFOLGE_TYPE:
				return convertDWeg_Reihenfolge_TypeToString(eDataType, instanceValue);
			case FahrstrassePackage.DWEG_VTYPE:
				return convertDWeg_V_TypeToString(eDataType, instanceValue);
			case FahrstrassePackage.ENUM_AUFLOESUNG_SSP_ZIELGLEIS_OBJECT:
				return convertENUMAufloesungSspZielgleisObjectToString(eDataType, instanceValue);
			case FahrstrassePackage.ENUM_AUTOMATISCHE_EINSTELLUNG_OBJECT:
				return convertENUMAutomatischeEinstellungObjectToString(eDataType, instanceValue);
			case FahrstrassePackage.ENUM_FSTR_MITTEL_ART_OBJECT:
				return convertENUMFstrMittelArtObjectToString(eDataType, instanceValue);
			case FahrstrassePackage.ENUM_FSTR_RANGIER_ART_OBJECT:
				return convertENUMFstrRangierArtObjectToString(eDataType, instanceValue);
			case FahrstrassePackage.ENUM_FSTR_ZUG_ART_OBJECT:
				return convertENUMFstrZugArtObjectToString(eDataType, instanceValue);
			case FahrstrassePackage.ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_OBJECT:
				return convertENUMRangierGegenfahrtausschlussObjectToString(eDataType, instanceValue);
			case FahrstrassePackage.ENUM_START_SIGNAL_CHARAKTER_OBJECT:
				return convertENUMStartSignalCharakterObjectToString(eDataType, instanceValue);
			case FahrstrassePackage.FSTR_ANEINANDER_BEDIENSTRING_TYPE:
				return convertFstr_Aneinander_Bedienstring_TypeToString(eDataType, instanceValue);
			case FahrstrassePackage.FSTR_BEDIENSTRING_TYPE:
				return convertFstr_Bedienstring_TypeToString(eDataType, instanceValue);
			case FahrstrassePackage.FSTR_REIHENFOLGE_TYPE:
				return convertFstr_Reihenfolge_TypeToString(eDataType, instanceValue);
			case FahrstrassePackage.FSTR_VHG_TYPE:
				return convertFstr_V_Hg_TypeToString(eDataType, instanceValue);
			case FahrstrassePackage.FSTR_VTYPE:
				return convertFstr_V_TypeToString(eDataType, instanceValue);
			case FahrstrassePackage.LAENGE_SOLL_TYPE:
				return convertLaenge_Soll_TypeToString(eDataType, instanceValue);
			case FahrstrassePackage.MASSGEBENDE_NEIGUNG_TYPE:
				return convertMassgebende_Neigung_TypeToString(eDataType, instanceValue);
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
	public Aufloesung_Ssp_Zielgleis_TypeClass createAufloesung_Ssp_Zielgleis_TypeClass() {
		Aufloesung_Ssp_Zielgleis_TypeClassImpl aufloesung_Ssp_Zielgleis_TypeClass = new Aufloesung_Ssp_Zielgleis_TypeClassImpl();
		return aufloesung_Ssp_Zielgleis_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aufloesung_Verzoegerung_TypeClass createAufloesung_Verzoegerung_TypeClass() {
		Aufloesung_Verzoegerung_TypeClassImpl aufloesung_Verzoegerung_TypeClass = new Aufloesung_Verzoegerung_TypeClassImpl();
		return aufloesung_Verzoegerung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Automatische_Einstellung_TypeClass createAutomatische_Einstellung_TypeClass() {
		Automatische_Einstellung_TypeClassImpl automatische_Einstellung_TypeClass = new Automatische_Einstellung_TypeClassImpl();
		return automatische_Einstellung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Fstr_DWeg_TypeClass createBezeichnung_Fstr_DWeg_TypeClass() {
		Bezeichnung_Fstr_DWeg_TypeClassImpl bezeichnung_Fstr_DWeg_TypeClass = new Bezeichnung_Fstr_DWeg_TypeClassImpl();
		return bezeichnung_Fstr_DWeg_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Markanter_Punkt_TypeClass createBezeichnung_Markanter_Punkt_TypeClass() {
		Bezeichnung_Markanter_Punkt_TypeClassImpl bezeichnung_Markanter_Punkt_TypeClass = new Bezeichnung_Markanter_Punkt_TypeClassImpl();
		return bezeichnung_Markanter_Punkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DWeg_Reihenfolge_TypeClass createDWeg_Reihenfolge_TypeClass() {
		DWeg_Reihenfolge_TypeClassImpl dWeg_Reihenfolge_TypeClass = new DWeg_Reihenfolge_TypeClassImpl();
		return dWeg_Reihenfolge_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DWeg_V_Aufwertung_Verzicht_TypeClass createDWeg_V_Aufwertung_Verzicht_TypeClass() {
		DWeg_V_Aufwertung_Verzicht_TypeClassImpl dWeg_V_Aufwertung_Verzicht_TypeClass = new DWeg_V_Aufwertung_Verzicht_TypeClassImpl();
		return dWeg_V_Aufwertung_Verzicht_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DWeg_V_TypeClass createDWeg_V_TypeClass() {
		DWeg_V_TypeClassImpl dWeg_V_TypeClass = new DWeg_V_TypeClassImpl();
		return dWeg_V_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DWeg_Vorzug_TypeClass createDWeg_Vorzug_TypeClass() {
		DWeg_Vorzug_TypeClassImpl dWeg_Vorzug_TypeClass = new DWeg_Vorzug_TypeClassImpl();
		return dWeg_Vorzug_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element_Verschluss_TypeClass createElement_Verschluss_TypeClass() {
		Element_Verschluss_TypeClassImpl element_Verschluss_TypeClass = new Element_Verschluss_TypeClassImpl();
		return element_Verschluss_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public F_Bedienung_TypeClass createF_Bedienung_TypeClass() {
		F_Bedienung_TypeClassImpl f_Bedienung_TypeClass = new F_Bedienung_TypeClassImpl();
		return f_Bedienung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Abhaengigkeit createFstr_Abhaengigkeit() {
		Fstr_AbhaengigkeitImpl fstr_Abhaengigkeit = new Fstr_AbhaengigkeitImpl();
		return fstr_Abhaengigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Abhaengigkeit_Ssp_AttributeGroup createFstr_Abhaengigkeit_Ssp_AttributeGroup() {
		Fstr_Abhaengigkeit_Ssp_AttributeGroupImpl fstr_Abhaengigkeit_Ssp_AttributeGroup = new Fstr_Abhaengigkeit_Ssp_AttributeGroupImpl();
		return fstr_Abhaengigkeit_Ssp_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Aneinander createFstr_Aneinander() {
		Fstr_AneinanderImpl fstr_Aneinander = new Fstr_AneinanderImpl();
		return fstr_Aneinander;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Aneinander_Bedienstring_TypeClass createFstr_Aneinander_Bedienstring_TypeClass() {
		Fstr_Aneinander_Bedienstring_TypeClassImpl fstr_Aneinander_Bedienstring_TypeClass = new Fstr_Aneinander_Bedienstring_TypeClassImpl();
		return fstr_Aneinander_Bedienstring_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Aneinander_Zuordnung createFstr_Aneinander_Zuordnung() {
		Fstr_Aneinander_ZuordnungImpl fstr_Aneinander_Zuordnung = new Fstr_Aneinander_ZuordnungImpl();
		return fstr_Aneinander_Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Bedienstring_TypeClass createFstr_Bedienstring_TypeClass() {
		Fstr_Bedienstring_TypeClassImpl fstr_Bedienstring_TypeClass = new Fstr_Bedienstring_TypeClassImpl();
		return fstr_Bedienstring_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_DWeg createFstr_DWeg() {
		Fstr_DWegImpl fstr_DWeg = new Fstr_DWegImpl();
		return fstr_DWeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_DWeg_Allg_AttributeGroup createFstr_DWeg_Allg_AttributeGroup() {
		Fstr_DWeg_Allg_AttributeGroupImpl fstr_DWeg_Allg_AttributeGroup = new Fstr_DWeg_Allg_AttributeGroupImpl();
		return fstr_DWeg_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_DWeg_Bezeichnung_AttributeGroup createFstr_DWeg_Bezeichnung_AttributeGroup() {
		Fstr_DWeg_Bezeichnung_AttributeGroupImpl fstr_DWeg_Bezeichnung_AttributeGroup = new Fstr_DWeg_Bezeichnung_AttributeGroupImpl();
		return fstr_DWeg_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_DWeg_Spezifisch_AttributeGroup createFstr_DWeg_Spezifisch_AttributeGroup() {
		Fstr_DWeg_Spezifisch_AttributeGroupImpl fstr_DWeg_Spezifisch_AttributeGroup = new Fstr_DWeg_Spezifisch_AttributeGroupImpl();
		return fstr_DWeg_Spezifisch_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_DWeg_W_Kr createFstr_DWeg_W_Kr() {
		Fstr_DWeg_W_KrImpl fstr_DWeg_W_Kr = new Fstr_DWeg_W_KrImpl();
		return fstr_DWeg_W_Kr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Fahrweg createFstr_Fahrweg() {
		Fstr_FahrwegImpl fstr_Fahrweg = new Fstr_FahrwegImpl();
		return fstr_Fahrweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Mittel_Art_TypeClass createFstr_Mittel_Art_TypeClass() {
		Fstr_Mittel_Art_TypeClassImpl fstr_Mittel_Art_TypeClass = new Fstr_Mittel_Art_TypeClassImpl();
		return fstr_Mittel_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Mittel_AttributeGroup createFstr_Mittel_AttributeGroup() {
		Fstr_Mittel_AttributeGroupImpl fstr_Mittel_AttributeGroup = new Fstr_Mittel_AttributeGroupImpl();
		return fstr_Mittel_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Mittel_V_Aufwertung_TypeClass createFstr_Mittel_V_Aufwertung_TypeClass() {
		Fstr_Mittel_V_Aufwertung_TypeClassImpl fstr_Mittel_V_Aufwertung_TypeClass = new Fstr_Mittel_V_Aufwertung_TypeClassImpl();
		return fstr_Mittel_V_Aufwertung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Nichthaltfall createFstr_Nichthaltfall() {
		Fstr_NichthaltfallImpl fstr_Nichthaltfall = new Fstr_NichthaltfallImpl();
		return fstr_Nichthaltfall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Rangier_Art_TypeClass createFstr_Rangier_Art_TypeClass() {
		Fstr_Rangier_Art_TypeClassImpl fstr_Rangier_Art_TypeClass = new Fstr_Rangier_Art_TypeClassImpl();
		return fstr_Rangier_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Rangier_AttributeGroup createFstr_Rangier_AttributeGroup() {
		Fstr_Rangier_AttributeGroupImpl fstr_Rangier_AttributeGroup = new Fstr_Rangier_AttributeGroupImpl();
		return fstr_Rangier_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Rangier_Fla_Zuordnung createFstr_Rangier_Fla_Zuordnung() {
		Fstr_Rangier_Fla_ZuordnungImpl fstr_Rangier_Fla_Zuordnung = new Fstr_Rangier_Fla_ZuordnungImpl();
		return fstr_Rangier_Fla_Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Reihenfolge_TypeClass createFstr_Reihenfolge_TypeClass() {
		Fstr_Reihenfolge_TypeClassImpl fstr_Reihenfolge_TypeClass = new Fstr_Reihenfolge_TypeClassImpl();
		return fstr_Reihenfolge_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Signalisierung createFstr_Signalisierung() {
		Fstr_SignalisierungImpl fstr_Signalisierung = new Fstr_SignalisierungImpl();
		return fstr_Signalisierung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Umfahrpunkt createFstr_Umfahrpunkt() {
		Fstr_UmfahrpunktImpl fstr_Umfahrpunkt = new Fstr_UmfahrpunktImpl();
		return fstr_Umfahrpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_V_Hg_TypeClass createFstr_V_Hg_TypeClass() {
		Fstr_V_Hg_TypeClassImpl fstr_V_Hg_TypeClass = new Fstr_V_Hg_TypeClassImpl();
		return fstr_V_Hg_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_V_TypeClass createFstr_V_TypeClass() {
		Fstr_V_TypeClassImpl fstr_V_TypeClass = new Fstr_V_TypeClassImpl();
		return fstr_V_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Vsigabstand_Verkuerzt_TypeClass createFstr_Vsigabstand_Verkuerzt_TypeClass() {
		Fstr_Vsigabstand_Verkuerzt_TypeClassImpl fstr_Vsigabstand_Verkuerzt_TypeClass = new Fstr_Vsigabstand_Verkuerzt_TypeClassImpl();
		return fstr_Vsigabstand_Verkuerzt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_Art_TypeClass createFstr_Zug_Art_TypeClass() {
		Fstr_Zug_Art_TypeClassImpl fstr_Zug_Art_TypeClass = new Fstr_Zug_Art_TypeClassImpl();
		return fstr_Zug_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_AttributeGroup createFstr_Zug_AttributeGroup() {
		Fstr_Zug_AttributeGroupImpl fstr_Zug_AttributeGroup = new Fstr_Zug_AttributeGroupImpl();
		return fstr_Zug_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_DWeg_AttributeGroup createFstr_Zug_DWeg_AttributeGroup() {
		Fstr_Zug_DWeg_AttributeGroupImpl fstr_Zug_DWeg_AttributeGroup = new Fstr_Zug_DWeg_AttributeGroupImpl();
		return fstr_Zug_DWeg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_Rangier createFstr_Zug_Rangier() {
		Fstr_Zug_RangierImpl fstr_Zug_Rangier = new Fstr_Zug_RangierImpl();
		return fstr_Zug_Rangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_Rangier_Allg_AttributeGroup createFstr_Zug_Rangier_Allg_AttributeGroup() {
		Fstr_Zug_Rangier_Allg_AttributeGroupImpl fstr_Zug_Rangier_Allg_AttributeGroup = new Fstr_Zug_Rangier_Allg_AttributeGroupImpl();
		return fstr_Zug_Rangier_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Laenge_Soll_TypeClass createLaenge_Soll_TypeClass() {
		Laenge_Soll_TypeClassImpl laenge_Soll_TypeClass = new Laenge_Soll_TypeClassImpl();
		return laenge_Soll_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markanter_Punkt createMarkanter_Punkt() {
		Markanter_PunktImpl markanter_Punkt = new Markanter_PunktImpl();
		return markanter_Punkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markanter_Punkt_Bezeichnung_AttributeGroup createMarkanter_Punkt_Bezeichnung_AttributeGroup() {
		Markanter_Punkt_Bezeichnung_AttributeGroupImpl markanter_Punkt_Bezeichnung_AttributeGroup = new Markanter_Punkt_Bezeichnung_AttributeGroupImpl();
		return markanter_Punkt_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Massgebende_Neigung_TypeClass createMassgebende_Neigung_TypeClass() {
		Massgebende_Neigung_TypeClassImpl massgebende_Neigung_TypeClass = new Massgebende_Neigung_TypeClassImpl();
		return massgebende_Neigung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rangier_Gegenfahrtausschluss_TypeClass createRangier_Gegenfahrtausschluss_TypeClass() {
		Rangier_Gegenfahrtausschluss_TypeClassImpl rangier_Gegenfahrtausschluss_TypeClass = new Rangier_Gegenfahrtausschluss_TypeClassImpl();
		return rangier_Gegenfahrtausschluss_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sonstiger_Punkt createSonstiger_Punkt() {
		Sonstiger_PunktImpl sonstiger_Punkt = new Sonstiger_PunktImpl();
		return sonstiger_Punkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start_Signal_Charakter_TypeClass createStart_Signal_Charakter_TypeClass() {
		Start_Signal_Charakter_TypeClassImpl start_Signal_Charakter_TypeClass = new Start_Signal_Charakter_TypeClassImpl();
		return start_Signal_Charakter_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAufloesungSspZielgleis createENUMAufloesungSspZielgleisFromString(EDataType eDataType, String initialValue) {
		ENUMAufloesungSspZielgleis result = ENUMAufloesungSspZielgleis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAufloesungSspZielgleisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAutomatischeEinstellung createENUMAutomatischeEinstellungFromString(EDataType eDataType, String initialValue) {
		ENUMAutomatischeEinstellung result = ENUMAutomatischeEinstellung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAutomatischeEinstellungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFstrMittelArt createENUMFstrMittelArtFromString(EDataType eDataType, String initialValue) {
		ENUMFstrMittelArt result = ENUMFstrMittelArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFstrMittelArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFstrRangierArt createENUMFstrRangierArtFromString(EDataType eDataType, String initialValue) {
		ENUMFstrRangierArt result = ENUMFstrRangierArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFstrRangierArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFstrZugArt createENUMFstrZugArtFromString(EDataType eDataType, String initialValue) {
		ENUMFstrZugArt result = ENUMFstrZugArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFstrZugArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMRangierGegenfahrtausschluss createENUMRangierGegenfahrtausschlussFromString(EDataType eDataType, String initialValue) {
		ENUMRangierGegenfahrtausschluss result = ENUMRangierGegenfahrtausschluss.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMRangierGegenfahrtausschlussToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMStartSignalCharakter createENUMStartSignalCharakterFromString(EDataType eDataType, String initialValue) {
		ENUMStartSignalCharakter result = ENUMStartSignalCharakter.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMStartSignalCharakterToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAufloesung_Verzoegerung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAufloesung_Verzoegerung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Fstr_DWeg_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Fstr_DWeg_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Markanter_Punkt_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Markanter_Punkt_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createDWeg_Reihenfolge_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDWeg_Reihenfolge_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createDWeg_V_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDWeg_V_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAufloesungSspZielgleis createENUMAufloesungSspZielgleisObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMAufloesungSspZielgleisFromString(FahrstrassePackage.Literals.ENUM_AUFLOESUNG_SSP_ZIELGLEIS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAufloesungSspZielgleisObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMAufloesungSspZielgleisToString(FahrstrassePackage.Literals.ENUM_AUFLOESUNG_SSP_ZIELGLEIS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAutomatischeEinstellung createENUMAutomatischeEinstellungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMAutomatischeEinstellungFromString(FahrstrassePackage.Literals.ENUM_AUTOMATISCHE_EINSTELLUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAutomatischeEinstellungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMAutomatischeEinstellungToString(FahrstrassePackage.Literals.ENUM_AUTOMATISCHE_EINSTELLUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFstrMittelArt createENUMFstrMittelArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFstrMittelArtFromString(FahrstrassePackage.Literals.ENUM_FSTR_MITTEL_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFstrMittelArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFstrMittelArtToString(FahrstrassePackage.Literals.ENUM_FSTR_MITTEL_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFstrRangierArt createENUMFstrRangierArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFstrRangierArtFromString(FahrstrassePackage.Literals.ENUM_FSTR_RANGIER_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFstrRangierArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFstrRangierArtToString(FahrstrassePackage.Literals.ENUM_FSTR_RANGIER_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFstrZugArt createENUMFstrZugArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFstrZugArtFromString(FahrstrassePackage.Literals.ENUM_FSTR_ZUG_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFstrZugArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFstrZugArtToString(FahrstrassePackage.Literals.ENUM_FSTR_ZUG_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMRangierGegenfahrtausschluss createENUMRangierGegenfahrtausschlussObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMRangierGegenfahrtausschlussFromString(FahrstrassePackage.Literals.ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMRangierGegenfahrtausschlussObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMRangierGegenfahrtausschlussToString(FahrstrassePackage.Literals.ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMStartSignalCharakter createENUMStartSignalCharakterObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMStartSignalCharakterFromString(FahrstrassePackage.Literals.ENUM_START_SIGNAL_CHARAKTER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMStartSignalCharakterObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMStartSignalCharakterToString(FahrstrassePackage.Literals.ENUM_START_SIGNAL_CHARAKTER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFstr_Aneinander_Bedienstring_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFstr_Aneinander_Bedienstring_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFstr_Bedienstring_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFstr_Bedienstring_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createFstr_Reihenfolge_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFstr_Reihenfolge_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createFstr_V_Hg_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFstr_V_Hg_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createFstr_V_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFstr_V_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLaenge_Soll_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLaenge_Soll_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMassgebende_Neigung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMassgebende_Neigung_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FahrstrassePackage getFahrstrassePackage() {
		return (FahrstrassePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FahrstrassePackage getPackage() {
		return FahrstrassePackage.eINSTANCE;
	}

} //FahrstrasseFactoryImpl
