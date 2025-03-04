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
 * A representation of the literals of the enumeration '<em><b>ENUM Ausstieg ETCS Sperre</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMAusstiegETCSSperre()
 * @model extendedMetaData="name='ENUMAusstieg_ETCS_Sperre'"
 * @generated
 */
public enum ENUMAusstiegETCSSperre implements Enumerator {
	/**
	 * The '<em><b>ENUM Ausstieg ETCS Sperre ja</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSTIEG_ETCS_SPERRE_JA_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUSSTIEG_ETCS_SPERRE_JA(0, "ENUMAusstieg_ETCS_Sperre_ja", "ja"),

	/**
	 * The '<em><b>ENUM Ausstieg ETCS Sperre nein</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSTIEG_ETCS_SPERRE_NEIN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUSSTIEG_ETCS_SPERRE_NEIN(1, "ENUMAusstieg_ETCS_Sperre_nein", "nein"),

	/**
	 * The '<em><b>ENUM Ausstieg ETCS Sperre regulaer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSTIEG_ETCS_SPERRE_REGULAER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUSSTIEG_ETCS_SPERRE_REGULAER(2, "ENUMAusstieg_ETCS_Sperre_regulaer", "regulaer");

	/**
	 * The '<em><b>ENUM Ausstieg ETCS Sperre ja</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSTIEG_ETCS_SPERRE_JA
	 * @model name="ENUMAusstieg_ETCS_Sperre_ja" literal="ja"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUSSTIEG_ETCS_SPERRE_JA_VALUE = 0;

	/**
	 * The '<em><b>ENUM Ausstieg ETCS Sperre nein</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSTIEG_ETCS_SPERRE_NEIN
	 * @model name="ENUMAusstieg_ETCS_Sperre_nein" literal="nein"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUSSTIEG_ETCS_SPERRE_NEIN_VALUE = 1;

	/**
	 * The '<em><b>ENUM Ausstieg ETCS Sperre regulaer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSTIEG_ETCS_SPERRE_REGULAER
	 * @model name="ENUMAusstieg_ETCS_Sperre_regulaer" literal="regulaer"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUSSTIEG_ETCS_SPERRE_REGULAER_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Ausstieg ETCS Sperre</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMAusstiegETCSSperre[] VALUES_ARRAY =
		new ENUMAusstiegETCSSperre[] {
			ENUM_AUSSTIEG_ETCS_SPERRE_JA,
			ENUM_AUSSTIEG_ETCS_SPERRE_NEIN,
			ENUM_AUSSTIEG_ETCS_SPERRE_REGULAER,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Ausstieg ETCS Sperre</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMAusstiegETCSSperre> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Ausstieg ETCS Sperre</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAusstiegETCSSperre get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAusstiegETCSSperre result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Ausstieg ETCS Sperre</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAusstiegETCSSperre getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAusstiegETCSSperre result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Ausstieg ETCS Sperre</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAusstiegETCSSperre get(int value) {
		switch (value) {
			case ENUM_AUSSTIEG_ETCS_SPERRE_JA_VALUE: return ENUM_AUSSTIEG_ETCS_SPERRE_JA;
			case ENUM_AUSSTIEG_ETCS_SPERRE_NEIN_VALUE: return ENUM_AUSSTIEG_ETCS_SPERRE_NEIN;
			case ENUM_AUSSTIEG_ETCS_SPERRE_REGULAER_VALUE: return ENUM_AUSSTIEG_ETCS_SPERRE_REGULAER;
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
	private ENUMAusstiegETCSSperre(int value, String name, String literal) {
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
	
} //ENUMAusstiegETCSSperre
