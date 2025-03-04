/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zuglenkung;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMZN Stellen</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getENUMZNStellen()
 * @model extendedMetaData="name='ENUMZN_Stellen'"
 * @generated
 */
public enum ENUMZNStellen implements Enumerator {
	/**
	 * The '<em><b>ENUMZN Stellen 5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZN_STELLEN_5_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMZN_STELLEN_5(0, "ENUMZN_Stellen_5", "5"),

	/**
	 * The '<em><b>ENUMZN Stellen 6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZN_STELLEN_6_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMZN_STELLEN_6(1, "ENUMZN_Stellen_6", "6");

	/**
	 * The '<em><b>ENUMZN Stellen 5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZN_STELLEN_5
	 * @model name="ENUMZN_Stellen_5" literal="5"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMZN_STELLEN_5_VALUE = 0;

	/**
	 * The '<em><b>ENUMZN Stellen 6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZN_STELLEN_6
	 * @model name="ENUMZN_Stellen_6" literal="6"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMZN_STELLEN_6_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUMZN Stellen</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMZNStellen[] VALUES_ARRAY =
		new ENUMZNStellen[] {
			ENUMZN_STELLEN_5,
			ENUMZN_STELLEN_6,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMZN Stellen</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMZNStellen> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMZN Stellen</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMZNStellen get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMZNStellen result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMZN Stellen</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMZNStellen getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMZNStellen result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMZN Stellen</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMZNStellen get(int value) {
		switch (value) {
			case ENUMZN_STELLEN_5_VALUE: return ENUMZN_STELLEN_5;
			case ENUMZN_STELLEN_6_VALUE: return ENUMZN_STELLEN_6;
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
	private ENUMZNStellen(int value, String name, String literal) {
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
	
} //ENUMZNStellen
