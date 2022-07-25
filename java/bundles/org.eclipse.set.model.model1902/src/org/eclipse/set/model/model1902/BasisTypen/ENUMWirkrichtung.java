/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.BasisTypen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Wirkrichtung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage#getENUMWirkrichtung()
 * @model extendedMetaData="name='ENUMWirkrichtung'"
 * @generated
 */
public enum ENUMWirkrichtung implements Enumerator {
	/**
	 * The '<em><b>ENUM Wirkrichtung beide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKRICHTUNG_BEIDE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WIRKRICHTUNG_BEIDE(0, "ENUMWirkrichtung_beide", "beide"),

	/**
	 * The '<em><b>ENUM Wirkrichtung gegen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKRICHTUNG_GEGEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WIRKRICHTUNG_GEGEN(1, "ENUMWirkrichtung_gegen", "gegen"),

	/**
	 * The '<em><b>ENUM Wirkrichtung in</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKRICHTUNG_IN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WIRKRICHTUNG_IN(2, "ENUMWirkrichtung_in", "in");

	/**
	 * The '<em><b>ENUM Wirkrichtung beide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKRICHTUNG_BEIDE
	 * @model name="ENUMWirkrichtung_beide" literal="beide"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WIRKRICHTUNG_BEIDE_VALUE = 0;

	/**
	 * The '<em><b>ENUM Wirkrichtung gegen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKRICHTUNG_GEGEN
	 * @model name="ENUMWirkrichtung_gegen" literal="gegen"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WIRKRICHTUNG_GEGEN_VALUE = 1;

	/**
	 * The '<em><b>ENUM Wirkrichtung in</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKRICHTUNG_IN
	 * @model name="ENUMWirkrichtung_in" literal="in"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WIRKRICHTUNG_IN_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Wirkrichtung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMWirkrichtung[] VALUES_ARRAY =
		new ENUMWirkrichtung[] {
			ENUM_WIRKRICHTUNG_BEIDE,
			ENUM_WIRKRICHTUNG_GEGEN,
			ENUM_WIRKRICHTUNG_IN,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Wirkrichtung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMWirkrichtung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Wirkrichtung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWirkrichtung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMWirkrichtung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Wirkrichtung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWirkrichtung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMWirkrichtung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Wirkrichtung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWirkrichtung get(int value) {
		switch (value) {
			case ENUM_WIRKRICHTUNG_BEIDE_VALUE: return ENUM_WIRKRICHTUNG_BEIDE;
			case ENUM_WIRKRICHTUNG_GEGEN_VALUE: return ENUM_WIRKRICHTUNG_GEGEN;
			case ENUM_WIRKRICHTUNG_IN_VALUE: return ENUM_WIRKRICHTUNG_IN;
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
	private ENUMWirkrichtung(int value, String name, String literal) {
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
	
} //ENUMWirkrichtung
