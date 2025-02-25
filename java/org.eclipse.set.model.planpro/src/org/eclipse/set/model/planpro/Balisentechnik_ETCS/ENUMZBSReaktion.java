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
 * A representation of the literals of the enumeration '<em><b>ENUMZBS Reaktion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMZBSReaktion()
 * @model extendedMetaData="name='ENUMZBS_Reaktion'"
 * @generated
 */
public enum ENUMZBSReaktion implements Enumerator {
	/**
	 * The '<em><b>ENUMZBS Reaktion Meldereaktion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZBS_REAKTION_MELDEREAKTION_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMZBS_REAKTION_MELDEREAKTION(0, "ENUMZBS_Reaktion_Meldereaktion", "Meldereaktion"),

	/**
	 * The '<em><b>ENUMZBS Reaktion Sicherheitsreaktion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZBS_REAKTION_SICHERHEITSREAKTION_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMZBS_REAKTION_SICHERHEITSREAKTION(1, "ENUMZBS_Reaktion_Sicherheitsreaktion", "Sicherheitsreaktion"),

	/**
	 * The '<em><b>ENUMZBS Reaktion sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZBS_REAKTION_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMZBS_REAKTION_SONSTIGE(2, "ENUMZBS_Reaktion_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUMZBS Reaktion Meldereaktion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZBS_REAKTION_MELDEREAKTION
	 * @model name="ENUMZBS_Reaktion_Meldereaktion" literal="Meldereaktion"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMZBS_REAKTION_MELDEREAKTION_VALUE = 0;

	/**
	 * The '<em><b>ENUMZBS Reaktion Sicherheitsreaktion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZBS_REAKTION_SICHERHEITSREAKTION
	 * @model name="ENUMZBS_Reaktion_Sicherheitsreaktion" literal="Sicherheitsreaktion"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMZBS_REAKTION_SICHERHEITSREAKTION_VALUE = 1;

	/**
	 * The '<em><b>ENUMZBS Reaktion sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZBS_REAKTION_SONSTIGE
	 * @model name="ENUMZBS_Reaktion_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMZBS_REAKTION_SONSTIGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUMZBS Reaktion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMZBSReaktion[] VALUES_ARRAY =
		new ENUMZBSReaktion[] {
			ENUMZBS_REAKTION_MELDEREAKTION,
			ENUMZBS_REAKTION_SICHERHEITSREAKTION,
			ENUMZBS_REAKTION_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMZBS Reaktion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMZBSReaktion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMZBS Reaktion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMZBSReaktion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMZBSReaktion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMZBS Reaktion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMZBSReaktion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMZBSReaktion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMZBS Reaktion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMZBSReaktion get(int value) {
		switch (value) {
			case ENUMZBS_REAKTION_MELDEREAKTION_VALUE: return ENUMZBS_REAKTION_MELDEREAKTION;
			case ENUMZBS_REAKTION_SICHERHEITSREAKTION_VALUE: return ENUMZBS_REAKTION_SICHERHEITSREAKTION;
			case ENUMZBS_REAKTION_SONSTIGE_VALUE: return ENUMZBS_REAKTION_SONSTIGE;
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
	private ENUMZBSReaktion(int value, String name, String literal) {
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
	
} //ENUMZBSReaktion
