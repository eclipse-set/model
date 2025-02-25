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
 * A representation of the literals of the enumeration '<em><b>ENUMFTGNT Punktart</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMFTGNTPunktart()
 * @model extendedMetaData="name='ENUMFT_GNT_Punktart'"
 * @generated
 */
public enum ENUMFTGNTPunktart implements Enumerator {
	/**
	 * The '<em><b>ENUMFT GNT Punktart 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFT_GNT_PUNKTART_1_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFT_GNT_PUNKTART_1(0, "ENUMFT_GNT_Punktart_1", "1"),

	/**
	 * The '<em><b>ENUMFT GNT Punktart 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFT_GNT_PUNKTART_2_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFT_GNT_PUNKTART_2(1, "ENUMFT_GNT_Punktart_2", "2"),

	/**
	 * The '<em><b>ENUMFT GNT Punktart 3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFT_GNT_PUNKTART_3_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFT_GNT_PUNKTART_3(2, "ENUMFT_GNT_Punktart_3", "3");

	/**
	 * The '<em><b>ENUMFT GNT Punktart 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFT_GNT_PUNKTART_1
	 * @model name="ENUMFT_GNT_Punktart_1" literal="1"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFT_GNT_PUNKTART_1_VALUE = 0;

	/**
	 * The '<em><b>ENUMFT GNT Punktart 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFT_GNT_PUNKTART_2
	 * @model name="ENUMFT_GNT_Punktart_2" literal="2"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFT_GNT_PUNKTART_2_VALUE = 1;

	/**
	 * The '<em><b>ENUMFT GNT Punktart 3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFT_GNT_PUNKTART_3
	 * @model name="ENUMFT_GNT_Punktart_3" literal="3"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFT_GNT_PUNKTART_3_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUMFTGNT Punktart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMFTGNTPunktart[] VALUES_ARRAY =
		new ENUMFTGNTPunktart[] {
			ENUMFT_GNT_PUNKTART_1,
			ENUMFT_GNT_PUNKTART_2,
			ENUMFT_GNT_PUNKTART_3,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMFTGNT Punktart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMFTGNTPunktart> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMFTGNT Punktart</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFTGNTPunktart get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFTGNTPunktart result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMFTGNT Punktart</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFTGNTPunktart getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFTGNTPunktart result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMFTGNT Punktart</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFTGNTPunktart get(int value) {
		switch (value) {
			case ENUMFT_GNT_PUNKTART_1_VALUE: return ENUMFT_GNT_PUNKTART_1;
			case ENUMFT_GNT_PUNKTART_2_VALUE: return ENUMFT_GNT_PUNKTART_2;
			case ENUMFT_GNT_PUNKTART_3_VALUE: return ENUMFT_GNT_PUNKTART_3;
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
	private ENUMFTGNTPunktart(int value, String name, String literal) {
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
	
} //ENUMFTGNTPunktart
