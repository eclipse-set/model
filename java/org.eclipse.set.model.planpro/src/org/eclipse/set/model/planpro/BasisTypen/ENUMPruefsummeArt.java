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
 * A representation of the literals of the enumeration '<em><b>ENUM Pruefsumme Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Art der verwendeten Prüfsumme (z. B. MD4).
 * <!-- end-model-doc -->
 * @see org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage#getENUMPruefsummeArt()
 * @model extendedMetaData="name='ENUMPruefsumme_Art'"
 * @generated
 */
public enum ENUMPruefsummeArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Pruefsumme Art MD4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PRUEFSUMME_ART_MD4_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PRUEFSUMME_ART_MD4(0, "ENUMPruefsumme_Art_MD4", "MD4"),

	/**
	 * The '<em><b>ENUM Pruefsumme Art MD5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PRUEFSUMME_ART_MD5_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PRUEFSUMME_ART_MD5(1, "ENUMPruefsumme_Art_MD5", "MD5"),

	/**
	 * The '<em><b>ENUM Pruefsumme Art SHA1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PRUEFSUMME_ART_SHA1_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PRUEFSUMME_ART_SHA1(2, "ENUMPruefsumme_Art_SHA1", "SHA1"),

	/**
	 * The '<em><b>ENUM Pruefsumme Art SHA256</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PRUEFSUMME_ART_SHA256_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PRUEFSUMME_ART_SHA256(3, "ENUMPruefsumme_Art_SHA256", "SHA256");

	/**
	 * The '<em><b>ENUM Pruefsumme Art MD4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PRUEFSUMME_ART_MD4
	 * @model name="ENUMPruefsumme_Art_MD4" literal="MD4"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PRUEFSUMME_ART_MD4_VALUE = 0;

	/**
	 * The '<em><b>ENUM Pruefsumme Art MD5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PRUEFSUMME_ART_MD5
	 * @model name="ENUMPruefsumme_Art_MD5" literal="MD5"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PRUEFSUMME_ART_MD5_VALUE = 1;

	/**
	 * The '<em><b>ENUM Pruefsumme Art SHA1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PRUEFSUMME_ART_SHA1
	 * @model name="ENUMPruefsumme_Art_SHA1" literal="SHA1"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PRUEFSUMME_ART_SHA1_VALUE = 2;

	/**
	 * The '<em><b>ENUM Pruefsumme Art SHA256</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PRUEFSUMME_ART_SHA256
	 * @model name="ENUMPruefsumme_Art_SHA256" literal="SHA256"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PRUEFSUMME_ART_SHA256_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Pruefsumme Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMPruefsummeArt[] VALUES_ARRAY =
		new ENUMPruefsummeArt[] {
			ENUM_PRUEFSUMME_ART_MD4,
			ENUM_PRUEFSUMME_ART_MD5,
			ENUM_PRUEFSUMME_ART_SHA1,
			ENUM_PRUEFSUMME_ART_SHA256,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Pruefsumme Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMPruefsummeArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Pruefsumme Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMPruefsummeArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMPruefsummeArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Pruefsumme Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMPruefsummeArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMPruefsummeArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Pruefsumme Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMPruefsummeArt get(int value) {
		switch (value) {
			case ENUM_PRUEFSUMME_ART_MD4_VALUE: return ENUM_PRUEFSUMME_ART_MD4;
			case ENUM_PRUEFSUMME_ART_MD5_VALUE: return ENUM_PRUEFSUMME_ART_MD5;
			case ENUM_PRUEFSUMME_ART_SHA1_VALUE: return ENUM_PRUEFSUMME_ART_SHA1;
			case ENUM_PRUEFSUMME_ART_SHA256_VALUE: return ENUM_PRUEFSUMME_ART_SHA256;
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
	private ENUMPruefsummeArt(int value, String name, String literal) {
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
	
} //ENUMPruefsummeArt
