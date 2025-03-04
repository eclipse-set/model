/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ortung;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMFMA Element Seilanzahl</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getENUMFMAElementSeilanzahl()
 * @model extendedMetaData="name='ENUMFMA_Element_Seilanzahl'"
 * @generated
 */
public enum ENUMFMAElementSeilanzahl implements Enumerator {
	/**
	 * The '<em><b>ENUMFMA Element Seilanzahl 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ELEMENT_SEILANZAHL_1_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFMA_ELEMENT_SEILANZAHL_1(0, "ENUMFMA_Element_Seilanzahl_1", "1"),

	/**
	 * The '<em><b>ENUMFMA Element Seilanzahl 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ELEMENT_SEILANZAHL_2_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFMA_ELEMENT_SEILANZAHL_2(1, "ENUMFMA_Element_Seilanzahl_2", "2"),

	/**
	 * The '<em><b>ENUMFMA Element Seilanzahl 4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ELEMENT_SEILANZAHL_4_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFMA_ELEMENT_SEILANZAHL_4(2, "ENUMFMA_Element_Seilanzahl_4", "4"),

	/**
	 * The '<em><b>ENUMFMA Element Seilanzahl sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ELEMENT_SEILANZAHL_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFMA_ELEMENT_SEILANZAHL_SONSTIGE(3, "ENUMFMA_Element_Seilanzahl_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUMFMA Element Seilanzahl 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ELEMENT_SEILANZAHL_1
	 * @model name="ENUMFMA_Element_Seilanzahl_1" literal="1"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFMA_ELEMENT_SEILANZAHL_1_VALUE = 0;

	/**
	 * The '<em><b>ENUMFMA Element Seilanzahl 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ELEMENT_SEILANZAHL_2
	 * @model name="ENUMFMA_Element_Seilanzahl_2" literal="2"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFMA_ELEMENT_SEILANZAHL_2_VALUE = 1;

	/**
	 * The '<em><b>ENUMFMA Element Seilanzahl 4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ELEMENT_SEILANZAHL_4
	 * @model name="ENUMFMA_Element_Seilanzahl_4" literal="4"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFMA_ELEMENT_SEILANZAHL_4_VALUE = 2;

	/**
	 * The '<em><b>ENUMFMA Element Seilanzahl sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ELEMENT_SEILANZAHL_SONSTIGE
	 * @model name="ENUMFMA_Element_Seilanzahl_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFMA_ELEMENT_SEILANZAHL_SONSTIGE_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUMFMA Element Seilanzahl</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMFMAElementSeilanzahl[] VALUES_ARRAY =
		new ENUMFMAElementSeilanzahl[] {
			ENUMFMA_ELEMENT_SEILANZAHL_1,
			ENUMFMA_ELEMENT_SEILANZAHL_2,
			ENUMFMA_ELEMENT_SEILANZAHL_4,
			ENUMFMA_ELEMENT_SEILANZAHL_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMFMA Element Seilanzahl</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMFMAElementSeilanzahl> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMFMA Element Seilanzahl</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFMAElementSeilanzahl get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFMAElementSeilanzahl result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMFMA Element Seilanzahl</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFMAElementSeilanzahl getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFMAElementSeilanzahl result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMFMA Element Seilanzahl</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFMAElementSeilanzahl get(int value) {
		switch (value) {
			case ENUMFMA_ELEMENT_SEILANZAHL_1_VALUE: return ENUMFMA_ELEMENT_SEILANZAHL_1;
			case ENUMFMA_ELEMENT_SEILANZAHL_2_VALUE: return ENUMFMA_ELEMENT_SEILANZAHL_2;
			case ENUMFMA_ELEMENT_SEILANZAHL_4_VALUE: return ENUMFMA_ELEMENT_SEILANZAHL_4;
			case ENUMFMA_ELEMENT_SEILANZAHL_SONSTIGE_VALUE: return ENUMFMA_ELEMENT_SEILANZAHL_SONSTIGE;
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
	private ENUMFMAElementSeilanzahl(int value, String name, String literal) {
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
	
} //ENUMFMAElementSeilanzahl
