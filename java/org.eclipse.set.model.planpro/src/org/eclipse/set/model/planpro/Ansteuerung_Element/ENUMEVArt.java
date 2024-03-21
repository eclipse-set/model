/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMEV Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * VNB: Versorgungsnetzbetreiber; NEA: Netzersatzaggregat
 * <!-- end-model-doc -->
 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getENUMEVArt()
 * @model extendedMetaData="name='ENUMEV_Art'"
 * @generated
 */
public enum ENUMEVArt implements Enumerator {
	/**
	 * The '<em><b>ENUMEV Art andere Aussenelementansteuerung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_ANDERE_AUSSENELEMENTANSTEUERUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_ART_ANDERE_AUSSENELEMENTANSTEUERUNG(0, "ENUMEV_Art_andere_Aussenelementansteuerung", "andere_Aussenelementansteuerung"),

	/**
	 * The '<em><b>ENUMEV Art Batterie</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_BATTERIE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_ART_BATTERIE(1, "ENUMEV_Art_Batterie", "Batterie"),

	/**
	 * The '<em><b>ENUMEV Art BUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_BUE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_ART_BUE(2, "ENUMEV_Art_BUE", "BUE"),

	/**
	 * The '<em><b>ENUMEV Art ESTW Zentraleinheit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_ESTW_ZENTRALEINHEIT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_ART_ESTW_ZENTRALEINHEIT(3, "ENUMEV_Art_ESTW_Zentraleinheit", "ESTW_Zentraleinheit"),

	/**
	 * The '<em><b>ENUMEV Art Fahrleitung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_FAHRLEITUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_ART_FAHRLEITUNG(4, "ENUMEV_Art_Fahrleitung", "Fahrleitung"),

	/**
	 * The '<em><b>ENUMEV Art Fe Ak 400V DC direkt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_FE_AK_400V_DC_DIREKT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_ART_FE_AK_400V_DC_DIREKT(5, "ENUMEV_Art_FeAk_400V_DC_direkt", "FeAk_400V_DC_direkt"),

	/**
	 * The '<em><b>ENUMEV Art Fe Ak 750V DC Energiebus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_FE_AK_750V_DC_ENERGIEBUS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_ART_FE_AK_750V_DC_ENERGIEBUS(6, "ENUMEV_Art_FeAk_750V_DC_Energiebus", "FeAk_750V_DC_Energiebus"),

	/**
	 * The '<em><b>ENUMEV Art Landesnetz VNB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_LANDESNETZ_VNB_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_ART_LANDESNETZ_VNB(7, "ENUMEV_Art_Landesnetz_VNB", "Landesnetz_VNB"),

	/**
	 * The '<em><b>ENUMEV Art Notstromaggregat NEA stationaer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_NOTSTROMAGGREGAT_NEA_STATIONAER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_ART_NOTSTROMAGGREGAT_NEA_STATIONAER(8, "ENUMEV_Art_Notstromaggregat_NEA_stationaer", "Notstromaggregat_NEA_stationaer"),

	/**
	 * The '<em><b>ENUMEV Art Notstromanschluss NEA mobil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_NOTSTROMANSCHLUSS_NEA_MOBIL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_ART_NOTSTROMANSCHLUSS_NEA_MOBIL(9, "ENUMEV_Art_Notstromanschluss_NEA_mobil", "Notstromanschluss_NEA_mobil"),

	/**
	 * The '<em><b>ENUMEV Art Solar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_SOLAR_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_ART_SOLAR(10, "ENUMEV_Art_Solar", "Solar"),

	/**
	 * The '<em><b>ENUMEV Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_ART_SONSTIGE(11, "ENUMEV_Art_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUMEV Art andere Aussenelementansteuerung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_ANDERE_AUSSENELEMENTANSTEUERUNG
	 * @model name="ENUMEV_Art_andere_Aussenelementansteuerung" literal="andere_Aussenelementansteuerung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_ART_ANDERE_AUSSENELEMENTANSTEUERUNG_VALUE = 0;

	/**
	 * The '<em><b>ENUMEV Art Batterie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_BATTERIE
	 * @model name="ENUMEV_Art_Batterie" literal="Batterie"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_ART_BATTERIE_VALUE = 1;

	/**
	 * The '<em><b>ENUMEV Art BUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_BUE
	 * @model name="ENUMEV_Art_BUE" literal="BUE"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_ART_BUE_VALUE = 2;

	/**
	 * The '<em><b>ENUMEV Art ESTW Zentraleinheit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_ESTW_ZENTRALEINHEIT
	 * @model name="ENUMEV_Art_ESTW_Zentraleinheit" literal="ESTW_Zentraleinheit"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_ART_ESTW_ZENTRALEINHEIT_VALUE = 3;

	/**
	 * The '<em><b>ENUMEV Art Fahrleitung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_FAHRLEITUNG
	 * @model name="ENUMEV_Art_Fahrleitung" literal="Fahrleitung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_ART_FAHRLEITUNG_VALUE = 4;

	/**
	 * The '<em><b>ENUMEV Art Fe Ak 400V DC direkt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_FE_AK_400V_DC_DIREKT
	 * @model name="ENUMEV_Art_FeAk_400V_DC_direkt" literal="FeAk_400V_DC_direkt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_ART_FE_AK_400V_DC_DIREKT_VALUE = 5;

	/**
	 * The '<em><b>ENUMEV Art Fe Ak 750V DC Energiebus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_FE_AK_750V_DC_ENERGIEBUS
	 * @model name="ENUMEV_Art_FeAk_750V_DC_Energiebus" literal="FeAk_750V_DC_Energiebus"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_ART_FE_AK_750V_DC_ENERGIEBUS_VALUE = 6;

	/**
	 * The '<em><b>ENUMEV Art Landesnetz VNB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_LANDESNETZ_VNB
	 * @model name="ENUMEV_Art_Landesnetz_VNB" literal="Landesnetz_VNB"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_ART_LANDESNETZ_VNB_VALUE = 7;

	/**
	 * The '<em><b>ENUMEV Art Notstromaggregat NEA stationaer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_NOTSTROMAGGREGAT_NEA_STATIONAER
	 * @model name="ENUMEV_Art_Notstromaggregat_NEA_stationaer" literal="Notstromaggregat_NEA_stationaer"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_ART_NOTSTROMAGGREGAT_NEA_STATIONAER_VALUE = 8;

	/**
	 * The '<em><b>ENUMEV Art Notstromanschluss NEA mobil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_NOTSTROMANSCHLUSS_NEA_MOBIL
	 * @model name="ENUMEV_Art_Notstromanschluss_NEA_mobil" literal="Notstromanschluss_NEA_mobil"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_ART_NOTSTROMANSCHLUSS_NEA_MOBIL_VALUE = 9;

	/**
	 * The '<em><b>ENUMEV Art Solar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_SOLAR
	 * @model name="ENUMEV_Art_Solar" literal="Solar"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_ART_SOLAR_VALUE = 10;

	/**
	 * The '<em><b>ENUMEV Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_ART_SONSTIGE
	 * @model name="ENUMEV_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_ART_SONSTIGE_VALUE = 11;

	/**
	 * An array of all the '<em><b>ENUMEV Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMEVArt[] VALUES_ARRAY =
		new ENUMEVArt[] {
			ENUMEV_ART_ANDERE_AUSSENELEMENTANSTEUERUNG,
			ENUMEV_ART_BATTERIE,
			ENUMEV_ART_BUE,
			ENUMEV_ART_ESTW_ZENTRALEINHEIT,
			ENUMEV_ART_FAHRLEITUNG,
			ENUMEV_ART_FE_AK_400V_DC_DIREKT,
			ENUMEV_ART_FE_AK_750V_DC_ENERGIEBUS,
			ENUMEV_ART_LANDESNETZ_VNB,
			ENUMEV_ART_NOTSTROMAGGREGAT_NEA_STATIONAER,
			ENUMEV_ART_NOTSTROMANSCHLUSS_NEA_MOBIL,
			ENUMEV_ART_SOLAR,
			ENUMEV_ART_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMEV Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMEVArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMEV Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMEVArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMEVArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMEV Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMEVArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMEVArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMEV Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMEVArt get(int value) {
		switch (value) {
			case ENUMEV_ART_ANDERE_AUSSENELEMENTANSTEUERUNG_VALUE: return ENUMEV_ART_ANDERE_AUSSENELEMENTANSTEUERUNG;
			case ENUMEV_ART_BATTERIE_VALUE: return ENUMEV_ART_BATTERIE;
			case ENUMEV_ART_BUE_VALUE: return ENUMEV_ART_BUE;
			case ENUMEV_ART_ESTW_ZENTRALEINHEIT_VALUE: return ENUMEV_ART_ESTW_ZENTRALEINHEIT;
			case ENUMEV_ART_FAHRLEITUNG_VALUE: return ENUMEV_ART_FAHRLEITUNG;
			case ENUMEV_ART_FE_AK_400V_DC_DIREKT_VALUE: return ENUMEV_ART_FE_AK_400V_DC_DIREKT;
			case ENUMEV_ART_FE_AK_750V_DC_ENERGIEBUS_VALUE: return ENUMEV_ART_FE_AK_750V_DC_ENERGIEBUS;
			case ENUMEV_ART_LANDESNETZ_VNB_VALUE: return ENUMEV_ART_LANDESNETZ_VNB;
			case ENUMEV_ART_NOTSTROMAGGREGAT_NEA_STATIONAER_VALUE: return ENUMEV_ART_NOTSTROMAGGREGAT_NEA_STATIONAER;
			case ENUMEV_ART_NOTSTROMANSCHLUSS_NEA_MOBIL_VALUE: return ENUMEV_ART_NOTSTROMANSCHLUSS_NEA_MOBIL;
			case ENUMEV_ART_SOLAR_VALUE: return ENUMEV_ART_SOLAR;
			case ENUMEV_ART_SONSTIGE_VALUE: return ENUMEV_ART_SONSTIGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ENUMEVArt(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ENUMEVArt
