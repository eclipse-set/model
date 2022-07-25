/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bedienung;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMC Wert</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getENUMCWert()
 * @model extendedMetaData="name='ENUMC_Wert'"
 * @generated
 */
public enum ENUMCWert implements Enumerator {
	/**
	 * The '<em><b>ENUMC Wert 0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMC_WERT_0_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMC_WERT_0(0, "ENUMC_Wert_0", "0"),

	/**
	 * The '<em><b>ENUMC Wert 64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMC_WERT_64_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMC_WERT_64(1, "ENUMC_Wert_64", "64"),

	/**
	 * The '<em><b>ENUMC Wert 128</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMC_WERT_128_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMC_WERT_128(2, "ENUMC_Wert_128", "128"),

	/**
	 * The '<em><b>ENUMC Wert 192</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMC_WERT_192_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMC_WERT_192(3, "ENUMC_Wert_192", "192");

	/**
	 * The '<em><b>ENUMC Wert 0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMC_WERT_0
	 * @model name="ENUMC_Wert_0" literal="0"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMC_WERT_0_VALUE = 0;

	/**
	 * The '<em><b>ENUMC Wert 64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMC_WERT_64
	 * @model name="ENUMC_Wert_64" literal="64"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMC_WERT_64_VALUE = 1;

	/**
	 * The '<em><b>ENUMC Wert 128</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMC_WERT_128
	 * @model name="ENUMC_Wert_128" literal="128"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMC_WERT_128_VALUE = 2;

	/**
	 * The '<em><b>ENUMC Wert 192</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMC_WERT_192
	 * @model name="ENUMC_Wert_192" literal="192"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMC_WERT_192_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUMC Wert</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMCWert[] VALUES_ARRAY =
		new ENUMCWert[] {
			ENUMC_WERT_0,
			ENUMC_WERT_64,
			ENUMC_WERT_128,
			ENUMC_WERT_192,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMC Wert</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMCWert> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMC Wert</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMCWert get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMCWert result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMC Wert</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMCWert getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMCWert result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMC Wert</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMCWert get(int value) {
		switch (value) {
			case ENUMC_WERT_0_VALUE: return ENUMC_WERT_0;
			case ENUMC_WERT_64_VALUE: return ENUMC_WERT_64;
			case ENUMC_WERT_128_VALUE: return ENUMC_WERT_128;
			case ENUMC_WERT_192_VALUE: return ENUMC_WERT_192;
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
	private ENUMCWert(int value, String name, String literal) {
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
	
} //ENUMCWert
