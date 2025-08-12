/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.BasisTypen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Ausrichtung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage#getENUMAusrichtung()
 * @model extendedMetaData="name='ENUMAusrichtung'"
 * @generated
 */
public enum ENUMAusrichtung implements Enumerator {
	/**
	 * The '<em><b>ENUM Ausrichtung gegen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSRICHTUNG_GEGEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUSRICHTUNG_GEGEN(0, "ENUMAusrichtung_gegen", "gegen"),

	/**
	 * The '<em><b>ENUM Ausrichtung in</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSRICHTUNG_IN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUSRICHTUNG_IN(1, "ENUMAusrichtung_in", "in"),

	/**
	 * The '<em><b>ENUM Ausrichtung keine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSRICHTUNG_KEINE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUSRICHTUNG_KEINE(2, "ENUMAusrichtung_keine", "keine");

	/**
	 * The '<em><b>ENUM Ausrichtung gegen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSRICHTUNG_GEGEN
	 * @model name="ENUMAusrichtung_gegen" literal="gegen"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUSRICHTUNG_GEGEN_VALUE = 0;

	/**
	 * The '<em><b>ENUM Ausrichtung in</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSRICHTUNG_IN
	 * @model name="ENUMAusrichtung_in" literal="in"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUSRICHTUNG_IN_VALUE = 1;

	/**
	 * The '<em><b>ENUM Ausrichtung keine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSRICHTUNG_KEINE
	 * @model name="ENUMAusrichtung_keine" literal="keine"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUSRICHTUNG_KEINE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Ausrichtung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMAusrichtung[] VALUES_ARRAY =
		new ENUMAusrichtung[] {
			ENUM_AUSRICHTUNG_GEGEN,
			ENUM_AUSRICHTUNG_IN,
			ENUM_AUSRICHTUNG_KEINE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Ausrichtung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMAusrichtung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Ausrichtung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAusrichtung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAusrichtung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Ausrichtung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAusrichtung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAusrichtung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Ausrichtung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAusrichtung get(int value) {
		switch (value) {
			case ENUM_AUSRICHTUNG_GEGEN_VALUE: return ENUM_AUSRICHTUNG_GEGEN;
			case ENUM_AUSRICHTUNG_IN_VALUE: return ENUM_AUSRICHTUNG_IN;
			case ENUM_AUSRICHTUNG_KEINE_VALUE: return ENUM_AUSRICHTUNG_KEINE;
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
	private ENUMAusrichtung(int value, String name, String literal) {
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
	
} //ENUMAusrichtung
