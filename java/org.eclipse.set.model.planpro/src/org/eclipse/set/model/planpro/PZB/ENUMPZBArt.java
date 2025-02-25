/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PZB;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMPZB Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getENUMPZBArt()
 * @model extendedMetaData="name='ENUMPZB_Art'"
 * @generated
 */
public enum ENUMPZBArt implements Enumerator {
	/**
	 * The '<em><b>ENUMPZB Art 1000 2000 Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMPZB_ART_1000_2000_HZ_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMPZB_ART_1000_2000_HZ(0, "ENUMPZB_Art_1000_2000_Hz", "1000_2000_Hz"),

	/**
	 * The '<em><b>ENUMPZB Art 1000 Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMPZB_ART_1000_HZ_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMPZB_ART_1000_HZ(1, "ENUMPZB_Art_1000_Hz", "1000_Hz"),

	/**
	 * The '<em><b>ENUMPZB Art 2000 Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMPZB_ART_2000_HZ_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMPZB_ART_2000_HZ(2, "ENUMPZB_Art_2000_Hz", "2000_Hz"),

	/**
	 * The '<em><b>ENUMPZB Art 500 Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMPZB_ART_500_HZ_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMPZB_ART_500_HZ(3, "ENUMPZB_Art_500_Hz", "500_Hz");

	/**
	 * The '<em><b>ENUMPZB Art 1000 2000 Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMPZB_ART_1000_2000_HZ
	 * @model name="ENUMPZB_Art_1000_2000_Hz" literal="1000_2000_Hz"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMPZB_ART_1000_2000_HZ_VALUE = 0;

	/**
	 * The '<em><b>ENUMPZB Art 1000 Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMPZB_ART_1000_HZ
	 * @model name="ENUMPZB_Art_1000_Hz" literal="1000_Hz"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMPZB_ART_1000_HZ_VALUE = 1;

	/**
	 * The '<em><b>ENUMPZB Art 2000 Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMPZB_ART_2000_HZ
	 * @model name="ENUMPZB_Art_2000_Hz" literal="2000_Hz"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMPZB_ART_2000_HZ_VALUE = 2;

	/**
	 * The '<em><b>ENUMPZB Art 500 Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMPZB_ART_500_HZ
	 * @model name="ENUMPZB_Art_500_Hz" literal="500_Hz"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMPZB_ART_500_HZ_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUMPZB Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMPZBArt[] VALUES_ARRAY =
		new ENUMPZBArt[] {
			ENUMPZB_ART_1000_2000_HZ,
			ENUMPZB_ART_1000_HZ,
			ENUMPZB_ART_2000_HZ,
			ENUMPZB_ART_500_HZ,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMPZB Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMPZBArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMPZB Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMPZBArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMPZBArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMPZB Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMPZBArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMPZBArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMPZB Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMPZBArt get(int value) {
		switch (value) {
			case ENUMPZB_ART_1000_2000_HZ_VALUE: return ENUMPZB_ART_1000_2000_HZ;
			case ENUMPZB_ART_1000_HZ_VALUE: return ENUMPZB_ART_1000_HZ;
			case ENUMPZB_ART_2000_HZ_VALUE: return ENUMPZB_ART_2000_HZ;
			case ENUMPZB_ART_500_HZ_VALUE: return ENUMPZB_ART_500_HZ;
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
	private ENUMPZBArt(int value, String name, String literal) {
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
	
} //ENUMPZBArt
