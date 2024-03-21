/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Auto Einstellung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getENUMAutoEinstellung()
 * @model extendedMetaData="name='ENUMAuto_Einstellung'"
 * @generated
 */
public enum ENUMAutoEinstellung implements Enumerator {
	/**
	 * The '<em><b>ENUM Auto Einstellung SB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUTO_EINSTELLUNG_SB_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUTO_EINSTELLUNG_SB(0, "ENUMAuto_Einstellung_SB", "SB"),

	/**
	 * The '<em><b>ENUM Auto Einstellung sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUTO_EINSTELLUNG_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUTO_EINSTELLUNG_SONSTIGE(1, "ENUMAuto_Einstellung_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Auto Einstellung ZL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUTO_EINSTELLUNG_ZL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUTO_EINSTELLUNG_ZL(2, "ENUMAuto_Einstellung_ZL", "ZL");

	/**
	 * The '<em><b>ENUM Auto Einstellung SB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUTO_EINSTELLUNG_SB
	 * @model name="ENUMAuto_Einstellung_SB" literal="SB"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUTO_EINSTELLUNG_SB_VALUE = 0;

	/**
	 * The '<em><b>ENUM Auto Einstellung sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUTO_EINSTELLUNG_SONSTIGE
	 * @model name="ENUMAuto_Einstellung_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUTO_EINSTELLUNG_SONSTIGE_VALUE = 1;

	/**
	 * The '<em><b>ENUM Auto Einstellung ZL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUTO_EINSTELLUNG_ZL
	 * @model name="ENUMAuto_Einstellung_ZL" literal="ZL"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUTO_EINSTELLUNG_ZL_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Auto Einstellung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMAutoEinstellung[] VALUES_ARRAY =
		new ENUMAutoEinstellung[] {
			ENUM_AUTO_EINSTELLUNG_SB,
			ENUM_AUTO_EINSTELLUNG_SONSTIGE,
			ENUM_AUTO_EINSTELLUNG_ZL,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Auto Einstellung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMAutoEinstellung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Auto Einstellung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAutoEinstellung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAutoEinstellung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Auto Einstellung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAutoEinstellung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAutoEinstellung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Auto Einstellung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAutoEinstellung get(int value) {
		switch (value) {
			case ENUM_AUTO_EINSTELLUNG_SB_VALUE: return ENUM_AUTO_EINSTELLUNG_SB;
			case ENUM_AUTO_EINSTELLUNG_SONSTIGE_VALUE: return ENUM_AUTO_EINSTELLUNG_SONSTIGE;
			case ENUM_AUTO_EINSTELLUNG_ZL_VALUE: return ENUM_AUTO_EINSTELLUNG_ZL;
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
	private ENUMAutoEinstellung(int value, String name, String literal) {
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
	
} //ENUMAutoEinstellung
