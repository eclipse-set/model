/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Art Bedingung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMArtBedingung()
 * @model extendedMetaData="name='ENUMArt_Bedingung'"
 * @generated
 */
public enum ENUMArtBedingung implements Enumerator {
	/**
	 * The '<em><b>ENUM Art Bedingung Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ART_BEDINGUNG_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ART_BEDINGUNG_DEFAULT(0, "ENUMArt_Bedingung_Default", "Default"),

	/**
	 * The '<em><b>ENUM Art Bedingung Festdaten</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ART_BEDINGUNG_FESTDATEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ART_BEDINGUNG_FESTDATEN(1, "ENUMArt_Bedingung_Festdaten", "Festdaten"),

	/**
	 * The '<em><b>ENUM Art Bedingung sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ART_BEDINGUNG_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ART_BEDINGUNG_SONSTIGE(2, "ENUMArt_Bedingung_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Art Bedingung Störtelegramm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ART_BEDINGUNG_STÖRTELEGRAMM_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ART_BEDINGUNG_STÖRTELEGRAMM(3, "ENUMArt_Bedingung_Störtelegramm", "St\u00f6rtelegramm");

	/**
	 * The '<em><b>ENUM Art Bedingung Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ART_BEDINGUNG_DEFAULT
	 * @model name="ENUMArt_Bedingung_Default" literal="Default"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ART_BEDINGUNG_DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>ENUM Art Bedingung Festdaten</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ART_BEDINGUNG_FESTDATEN
	 * @model name="ENUMArt_Bedingung_Festdaten" literal="Festdaten"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ART_BEDINGUNG_FESTDATEN_VALUE = 1;

	/**
	 * The '<em><b>ENUM Art Bedingung sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ART_BEDINGUNG_SONSTIGE
	 * @model name="ENUMArt_Bedingung_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ART_BEDINGUNG_SONSTIGE_VALUE = 2;

	/**
	 * The '<em><b>ENUM Art Bedingung Störtelegramm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ART_BEDINGUNG_STÖRTELEGRAMM
	 * @model name="ENUMArt_Bedingung_Störtelegramm" literal="St\366rtelegramm"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ART_BEDINGUNG_STÖRTELEGRAMM_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Art Bedingung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMArtBedingung[] VALUES_ARRAY =
		new ENUMArtBedingung[] {
			ENUM_ART_BEDINGUNG_DEFAULT,
			ENUM_ART_BEDINGUNG_FESTDATEN,
			ENUM_ART_BEDINGUNG_SONSTIGE,
			ENUM_ART_BEDINGUNG_STÖRTELEGRAMM,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Art Bedingung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMArtBedingung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Art Bedingung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMArtBedingung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMArtBedingung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Art Bedingung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMArtBedingung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMArtBedingung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Art Bedingung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMArtBedingung get(int value) {
		switch (value) {
			case ENUM_ART_BEDINGUNG_DEFAULT_VALUE: return ENUM_ART_BEDINGUNG_DEFAULT;
			case ENUM_ART_BEDINGUNG_FESTDATEN_VALUE: return ENUM_ART_BEDINGUNG_FESTDATEN;
			case ENUM_ART_BEDINGUNG_SONSTIGE_VALUE: return ENUM_ART_BEDINGUNG_SONSTIGE;
			case ENUM_ART_BEDINGUNG_STÖRTELEGRAMM_VALUE: return ENUM_ART_BEDINGUNG_STÖRTELEGRAMM;
			default: return null;
		}
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
	private ENUMArtBedingung(int value, String name, String literal) {
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
	
} //ENUMArtBedingung
