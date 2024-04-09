/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Bandbreite</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getENUMBandbreite()
 * @model extendedMetaData="name='ENUMBandbreite'"
 * @generated
 */
public enum ENUMBandbreite implements Enumerator {
	/**
	 * The '<em><b>ENUM Bandbreite 100 Mbit s</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BANDBREITE_100_MBIT_S_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BANDBREITE_100_MBIT_S(0, "ENUMBandbreite_100Mbit_s", "100Mbit_s"),

	/**
	 * The '<em><b>ENUM Bandbreite 10 Mbit s</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BANDBREITE_10_MBIT_S_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BANDBREITE_10_MBIT_S(1, "ENUMBandbreite_10Mbit_s", "10Mbit_s"),

	/**
	 * The '<em><b>ENUM Bandbreite 2Mbit s</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BANDBREITE_2MBIT_S_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BANDBREITE_2MBIT_S(2, "ENUMBandbreite_2Mbit_s", "2Mbit_s"),

	/**
	 * The '<em><b>ENUM Bandbreite 64kbit s</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BANDBREITE_64KBIT_S_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BANDBREITE_64KBIT_S(3, "ENUMBandbreite_64kbit_s", "64kbit_s"),

	/**
	 * The '<em><b>ENUM Bandbreite sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BANDBREITE_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BANDBREITE_SONSTIGE(4, "ENUMBandbreite_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Bandbreite 100 Mbit s</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BANDBREITE_100_MBIT_S
	 * @model name="ENUMBandbreite_100Mbit_s" literal="100Mbit_s"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BANDBREITE_100_MBIT_S_VALUE = 0;

	/**
	 * The '<em><b>ENUM Bandbreite 10 Mbit s</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BANDBREITE_10_MBIT_S
	 * @model name="ENUMBandbreite_10Mbit_s" literal="10Mbit_s"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BANDBREITE_10_MBIT_S_VALUE = 1;

	/**
	 * The '<em><b>ENUM Bandbreite 2Mbit s</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BANDBREITE_2MBIT_S
	 * @model name="ENUMBandbreite_2Mbit_s" literal="2Mbit_s"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BANDBREITE_2MBIT_S_VALUE = 2;

	/**
	 * The '<em><b>ENUM Bandbreite 64kbit s</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BANDBREITE_64KBIT_S
	 * @model name="ENUMBandbreite_64kbit_s" literal="64kbit_s"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BANDBREITE_64KBIT_S_VALUE = 3;

	/**
	 * The '<em><b>ENUM Bandbreite sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BANDBREITE_SONSTIGE
	 * @model name="ENUMBandbreite_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BANDBREITE_SONSTIGE_VALUE = 4;

	/**
	 * An array of all the '<em><b>ENUM Bandbreite</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMBandbreite[] VALUES_ARRAY =
		new ENUMBandbreite[] {
			ENUM_BANDBREITE_100_MBIT_S,
			ENUM_BANDBREITE_10_MBIT_S,
			ENUM_BANDBREITE_2MBIT_S,
			ENUM_BANDBREITE_64KBIT_S,
			ENUM_BANDBREITE_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Bandbreite</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMBandbreite> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Bandbreite</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBandbreite get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBandbreite result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Bandbreite</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBandbreite getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBandbreite result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Bandbreite</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBandbreite get(int value) {
		switch (value) {
			case ENUM_BANDBREITE_100_MBIT_S_VALUE: return ENUM_BANDBREITE_100_MBIT_S;
			case ENUM_BANDBREITE_10_MBIT_S_VALUE: return ENUM_BANDBREITE_10_MBIT_S;
			case ENUM_BANDBREITE_2MBIT_S_VALUE: return ENUM_BANDBREITE_2MBIT_S;
			case ENUM_BANDBREITE_64KBIT_S_VALUE: return ENUM_BANDBREITE_64KBIT_S;
			case ENUM_BANDBREITE_SONSTIGE_VALUE: return ENUM_BANDBREITE_SONSTIGE;
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
	private ENUMBandbreite(int value, String name, String literal) {
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
	
} //ENUMBandbreite
