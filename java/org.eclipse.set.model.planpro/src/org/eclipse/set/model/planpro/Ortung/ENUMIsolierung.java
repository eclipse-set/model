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
 * A representation of the literals of the enumeration '<em><b>ENUM Isolierung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getENUMIsolierung()
 * @model extendedMetaData="name='ENUMIsolierung'"
 * @generated
 */
public enum ENUMIsolierung implements Enumerator {
	/**
	 * The '<em><b>ENUM Isolierung einschienig L</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ISOLIERUNG_EINSCHIENIG_L_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ISOLIERUNG_EINSCHIENIG_L(0, "ENUMIsolierung_einschienig_L", "einschienig_L"),

	/**
	 * The '<em><b>ENUM Isolierung einschienig R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ISOLIERUNG_EINSCHIENIG_R_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ISOLIERUNG_EINSCHIENIG_R(1, "ENUMIsolierung_einschienig_R", "einschienig_R"),

	/**
	 * The '<em><b>ENUM Isolierung sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ISOLIERUNG_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ISOLIERUNG_SONSTIGE(2, "ENUMIsolierung_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Isolierung zweischienig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ISOLIERUNG_ZWEISCHIENIG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ISOLIERUNG_ZWEISCHIENIG(3, "ENUMIsolierung_zweischienig", "zweischienig");

	/**
	 * The '<em><b>ENUM Isolierung einschienig L</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ISOLIERUNG_EINSCHIENIG_L
	 * @model name="ENUMIsolierung_einschienig_L" literal="einschienig_L"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ISOLIERUNG_EINSCHIENIG_L_VALUE = 0;

	/**
	 * The '<em><b>ENUM Isolierung einschienig R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ISOLIERUNG_EINSCHIENIG_R
	 * @model name="ENUMIsolierung_einschienig_R" literal="einschienig_R"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ISOLIERUNG_EINSCHIENIG_R_VALUE = 1;

	/**
	 * The '<em><b>ENUM Isolierung sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ISOLIERUNG_SONSTIGE
	 * @model name="ENUMIsolierung_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ISOLIERUNG_SONSTIGE_VALUE = 2;

	/**
	 * The '<em><b>ENUM Isolierung zweischienig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ISOLIERUNG_ZWEISCHIENIG
	 * @model name="ENUMIsolierung_zweischienig" literal="zweischienig"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ISOLIERUNG_ZWEISCHIENIG_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Isolierung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMIsolierung[] VALUES_ARRAY =
		new ENUMIsolierung[] {
			ENUM_ISOLIERUNG_EINSCHIENIG_L,
			ENUM_ISOLIERUNG_EINSCHIENIG_R,
			ENUM_ISOLIERUNG_SONSTIGE,
			ENUM_ISOLIERUNG_ZWEISCHIENIG,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Isolierung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMIsolierung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Isolierung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMIsolierung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMIsolierung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Isolierung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMIsolierung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMIsolierung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Isolierung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMIsolierung get(int value) {
		switch (value) {
			case ENUM_ISOLIERUNG_EINSCHIENIG_L_VALUE: return ENUM_ISOLIERUNG_EINSCHIENIG_L;
			case ENUM_ISOLIERUNG_EINSCHIENIG_R_VALUE: return ENUM_ISOLIERUNG_EINSCHIENIG_R;
			case ENUM_ISOLIERUNG_SONSTIGE_VALUE: return ENUM_ISOLIERUNG_SONSTIGE;
			case ENUM_ISOLIERUNG_ZWEISCHIENIG_VALUE: return ENUM_ISOLIERUNG_ZWEISCHIENIG;
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
	private ENUMIsolierung(int value, String name, String literal) {
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
	
} //ENUMIsolierung
