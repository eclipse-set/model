/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Durchfahrt</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getENUMDurchfahrt()
 * @model extendedMetaData="name='ENUMDurchfahrt'"
 * @generated
 */
public enum ENUMDurchfahrt implements Enumerator {
	/**
	 * The '<em><b>ENUM Durchfahrt erlaubt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_DURCHFAHRT_ERLAUBT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_DURCHFAHRT_ERLAUBT(0, "ENUMDurchfahrt_erlaubt", "erlaubt"),

	/**
	 * The '<em><b>ENUM Durchfahrt nur mit Sh1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_DURCHFAHRT_NUR_MIT_SH1_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_DURCHFAHRT_NUR_MIT_SH1(1, "ENUMDurchfahrt_nur_mit_Sh1", "nur_mit_Sh1"),

	/**
	 * The '<em><b>ENUM Durchfahrt verboten</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_DURCHFAHRT_VERBOTEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_DURCHFAHRT_VERBOTEN(2, "ENUMDurchfahrt_verboten", "verboten");

	/**
	 * The '<em><b>ENUM Durchfahrt erlaubt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_DURCHFAHRT_ERLAUBT
	 * @model name="ENUMDurchfahrt_erlaubt" literal="erlaubt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_DURCHFAHRT_ERLAUBT_VALUE = 0;

	/**
	 * The '<em><b>ENUM Durchfahrt nur mit Sh1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_DURCHFAHRT_NUR_MIT_SH1
	 * @model name="ENUMDurchfahrt_nur_mit_Sh1" literal="nur_mit_Sh1"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_DURCHFAHRT_NUR_MIT_SH1_VALUE = 1;

	/**
	 * The '<em><b>ENUM Durchfahrt verboten</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_DURCHFAHRT_VERBOTEN
	 * @model name="ENUMDurchfahrt_verboten" literal="verboten"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_DURCHFAHRT_VERBOTEN_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Durchfahrt</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMDurchfahrt[] VALUES_ARRAY =
		new ENUMDurchfahrt[] {
			ENUM_DURCHFAHRT_ERLAUBT,
			ENUM_DURCHFAHRT_NUR_MIT_SH1,
			ENUM_DURCHFAHRT_VERBOTEN,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Durchfahrt</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMDurchfahrt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Durchfahrt</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDurchfahrt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMDurchfahrt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Durchfahrt</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDurchfahrt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMDurchfahrt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Durchfahrt</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDurchfahrt get(int value) {
		switch (value) {
			case ENUM_DURCHFAHRT_ERLAUBT_VALUE: return ENUM_DURCHFAHRT_ERLAUBT;
			case ENUM_DURCHFAHRT_NUR_MIT_SH1_VALUE: return ENUM_DURCHFAHRT_NUR_MIT_SH1;
			case ENUM_DURCHFAHRT_VERBOTEN_VALUE: return ENUM_DURCHFAHRT_VERBOTEN;
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
	private ENUMDurchfahrt(int value, String name, String literal) {
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
	
} //ENUMDurchfahrt
