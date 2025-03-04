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
 * A representation of the literals of the enumeration '<em><b>ENUM Fstr Mittel Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage#getENUMFstrMittelArt()
 * @model extendedMetaData="name='ENUMFstr_Mittel_Art'"
 * @generated
 */
public enum ENUMFstrMittelArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Fstr Mittel Art ZM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FSTR_MITTEL_ART_ZM_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FSTR_MITTEL_ART_ZM(0, "ENUMFstr_Mittel_Art_ZM", "ZM"),

	/**
	 * The '<em><b>ENUM Fstr Mittel Art ZUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FSTR_MITTEL_ART_ZUM_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FSTR_MITTEL_ART_ZUM(1, "ENUMFstr_Mittel_Art_ZUM", "ZUM");

	/**
	 * The '<em><b>ENUM Fstr Mittel Art ZM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FSTR_MITTEL_ART_ZM
	 * @model name="ENUMFstr_Mittel_Art_ZM" literal="ZM"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FSTR_MITTEL_ART_ZM_VALUE = 0;

	/**
	 * The '<em><b>ENUM Fstr Mittel Art ZUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FSTR_MITTEL_ART_ZUM
	 * @model name="ENUMFstr_Mittel_Art_ZUM" literal="ZUM"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FSTR_MITTEL_ART_ZUM_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUM Fstr Mittel Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMFstrMittelArt[] VALUES_ARRAY =
		new ENUMFstrMittelArt[] {
			ENUM_FSTR_MITTEL_ART_ZM,
			ENUM_FSTR_MITTEL_ART_ZUM,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Fstr Mittel Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMFstrMittelArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Fstr Mittel Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFstrMittelArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFstrMittelArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Fstr Mittel Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFstrMittelArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFstrMittelArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Fstr Mittel Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFstrMittelArt get(int value) {
		switch (value) {
			case ENUM_FSTR_MITTEL_ART_ZM_VALUE: return ENUM_FSTR_MITTEL_ART_ZM;
			case ENUM_FSTR_MITTEL_ART_ZUM_VALUE: return ENUM_FSTR_MITTEL_ART_ZUM;
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
	private ENUMFstrMittelArt(int value, String name, String literal) {
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
	
} //ENUMFstrMittelArt
