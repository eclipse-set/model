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
 * A representation of the literals of the enumeration '<em><b>ENUMLEU Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMLEUArt()
 * @model extendedMetaData="name='ENUMLEU_Art'"
 * @generated
 */
public enum ENUMLEUArt implements Enumerator {
	/**
	 * The '<em><b>ENUMLEU Art LEU P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMLEU_ART_LEU_P_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMLEU_ART_LEU_P(0, "ENUMLEU_Art_LEU_P", "LEU-P"),

	/**
	 * The '<em><b>ENUMLEU Art Voll LEU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMLEU_ART_VOLL_LEU_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMLEU_ART_VOLL_LEU(1, "ENUMLEU_Art_Voll_LEU", "Voll-LEU");

	/**
	 * The '<em><b>ENUMLEU Art LEU P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMLEU_ART_LEU_P
	 * @model name="ENUMLEU_Art_LEU_P" literal="LEU-P"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMLEU_ART_LEU_P_VALUE = 0;

	/**
	 * The '<em><b>ENUMLEU Art Voll LEU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMLEU_ART_VOLL_LEU
	 * @model name="ENUMLEU_Art_Voll_LEU" literal="Voll-LEU"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMLEU_ART_VOLL_LEU_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUMLEU Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMLEUArt[] VALUES_ARRAY =
		new ENUMLEUArt[] {
			ENUMLEU_ART_LEU_P,
			ENUMLEU_ART_VOLL_LEU,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMLEU Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMLEUArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMLEU Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLEUArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMLEUArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMLEU Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLEUArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMLEUArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMLEU Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLEUArt get(int value) {
		switch (value) {
			case ENUMLEU_ART_LEU_P_VALUE: return ENUMLEU_ART_LEU_P;
			case ENUMLEU_ART_VOLL_LEU_VALUE: return ENUMLEU_ART_VOLL_LEU;
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
	private ENUMLEUArt(int value, String name, String literal) {
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
	
} //ENUMLEUArt
