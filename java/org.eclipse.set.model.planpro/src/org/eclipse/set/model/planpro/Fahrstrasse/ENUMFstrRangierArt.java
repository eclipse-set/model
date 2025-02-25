/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Fstr Rangier Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage#getENUMFstrRangierArt()
 * @model extendedMetaData="name='ENUMFstr_Rangier_Art'"
 * @generated
 */
public enum ENUMFstrRangierArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Fstr Rangier Art RR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FSTR_RANGIER_ART_RR_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FSTR_RANGIER_ART_RR(0, "ENUMFstr_Rangier_Art_RR", "RR"),

	/**
	 * The '<em><b>ENUM Fstr Rangier Art RT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FSTR_RANGIER_ART_RT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FSTR_RANGIER_ART_RT(1, "ENUMFstr_Rangier_Art_RT", "RT"),

	/**
	 * The '<em><b>ENUM Fstr Rangier Art RTU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FSTR_RANGIER_ART_RTU_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FSTR_RANGIER_ART_RTU(2, "ENUMFstr_Rangier_Art_RTU", "RTU"),

	/**
	 * The '<em><b>ENUM Fstr Rangier Art RU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FSTR_RANGIER_ART_RU_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FSTR_RANGIER_ART_RU(3, "ENUMFstr_Rangier_Art_RU", "RU");

	/**
	 * The '<em><b>ENUM Fstr Rangier Art RR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FSTR_RANGIER_ART_RR
	 * @model name="ENUMFstr_Rangier_Art_RR" literal="RR"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FSTR_RANGIER_ART_RR_VALUE = 0;

	/**
	 * The '<em><b>ENUM Fstr Rangier Art RT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FSTR_RANGIER_ART_RT
	 * @model name="ENUMFstr_Rangier_Art_RT" literal="RT"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FSTR_RANGIER_ART_RT_VALUE = 1;

	/**
	 * The '<em><b>ENUM Fstr Rangier Art RTU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FSTR_RANGIER_ART_RTU
	 * @model name="ENUMFstr_Rangier_Art_RTU" literal="RTU"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FSTR_RANGIER_ART_RTU_VALUE = 2;

	/**
	 * The '<em><b>ENUM Fstr Rangier Art RU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FSTR_RANGIER_ART_RU
	 * @model name="ENUMFstr_Rangier_Art_RU" literal="RU"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FSTR_RANGIER_ART_RU_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Fstr Rangier Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMFstrRangierArt[] VALUES_ARRAY =
		new ENUMFstrRangierArt[] {
			ENUM_FSTR_RANGIER_ART_RR,
			ENUM_FSTR_RANGIER_ART_RT,
			ENUM_FSTR_RANGIER_ART_RTU,
			ENUM_FSTR_RANGIER_ART_RU,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Fstr Rangier Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMFstrRangierArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Fstr Rangier Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFstrRangierArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFstrRangierArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Fstr Rangier Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFstrRangierArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFstrRangierArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Fstr Rangier Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFstrRangierArt get(int value) {
		switch (value) {
			case ENUM_FSTR_RANGIER_ART_RR_VALUE: return ENUM_FSTR_RANGIER_ART_RR;
			case ENUM_FSTR_RANGIER_ART_RT_VALUE: return ENUM_FSTR_RANGIER_ART_RT;
			case ENUM_FSTR_RANGIER_ART_RTU_VALUE: return ENUM_FSTR_RANGIER_ART_RTU;
			case ENUM_FSTR_RANGIER_ART_RU_VALUE: return ENUM_FSTR_RANGIER_ART_RU;
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
	private ENUMFstrRangierArt(int value, String name, String literal) {
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
	
} //ENUMFstrRangierArt
