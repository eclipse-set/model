/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Layoutinformationen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Fuellung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getENUMFuellung()
 * @model extendedMetaData="name='ENUMFuellung'"
 * @generated
 */
public enum ENUMFuellung implements Enumerator {
	/**
	 * The '<em><b>ENUM Fuellung doppelte Schraffur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUELLUNG_DOPPELTE_SCHRAFFUR_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FUELLUNG_DOPPELTE_SCHRAFFUR(0, "ENUMFuellung_doppelte_Schraffur", "doppelte Schraffur"),

	/**
	 * The '<em><b>ENUM Fuellung einfache Schraffur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUELLUNG_EINFACHE_SCHRAFFUR_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FUELLUNG_EINFACHE_SCHRAFFUR(1, "ENUMFuellung_einfache_Schraffur", "einfache Schraffur"),

	/**
	 * The '<em><b>ENUM Fuellung einfache Schraffur gestrichelt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUELLUNG_EINFACHE_SCHRAFFUR_GESTRICHELT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FUELLUNG_EINFACHE_SCHRAFFUR_GESTRICHELT(2, "ENUMFuellung_einfache_Schraffur_gestrichelt", "einfache Schraffur gestrichelt"),

	/**
	 * The '<em><b>ENUM Fuellung sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUELLUNG_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FUELLUNG_SONSTIGE(3, "ENUMFuellung_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Fuellung doppelte Schraffur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUELLUNG_DOPPELTE_SCHRAFFUR
	 * @model name="ENUMFuellung_doppelte_Schraffur" literal="doppelte Schraffur"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FUELLUNG_DOPPELTE_SCHRAFFUR_VALUE = 0;

	/**
	 * The '<em><b>ENUM Fuellung einfache Schraffur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUELLUNG_EINFACHE_SCHRAFFUR
	 * @model name="ENUMFuellung_einfache_Schraffur" literal="einfache Schraffur"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FUELLUNG_EINFACHE_SCHRAFFUR_VALUE = 1;

	/**
	 * The '<em><b>ENUM Fuellung einfache Schraffur gestrichelt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUELLUNG_EINFACHE_SCHRAFFUR_GESTRICHELT
	 * @model name="ENUMFuellung_einfache_Schraffur_gestrichelt" literal="einfache Schraffur gestrichelt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FUELLUNG_EINFACHE_SCHRAFFUR_GESTRICHELT_VALUE = 2;

	/**
	 * The '<em><b>ENUM Fuellung sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUELLUNG_SONSTIGE
	 * @model name="ENUMFuellung_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FUELLUNG_SONSTIGE_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Fuellung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMFuellung[] VALUES_ARRAY =
		new ENUMFuellung[] {
			ENUM_FUELLUNG_DOPPELTE_SCHRAFFUR,
			ENUM_FUELLUNG_EINFACHE_SCHRAFFUR,
			ENUM_FUELLUNG_EINFACHE_SCHRAFFUR_GESTRICHELT,
			ENUM_FUELLUNG_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Fuellung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMFuellung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Fuellung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFuellung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFuellung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Fuellung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFuellung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFuellung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Fuellung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFuellung get(int value) {
		switch (value) {
			case ENUM_FUELLUNG_DOPPELTE_SCHRAFFUR_VALUE: return ENUM_FUELLUNG_DOPPELTE_SCHRAFFUR;
			case ENUM_FUELLUNG_EINFACHE_SCHRAFFUR_VALUE: return ENUM_FUELLUNG_EINFACHE_SCHRAFFUR;
			case ENUM_FUELLUNG_EINFACHE_SCHRAFFUR_GESTRICHELT_VALUE: return ENUM_FUELLUNG_EINFACHE_SCHRAFFUR_GESTRICHELT;
			case ENUM_FUELLUNG_SONSTIGE_VALUE: return ENUM_FUELLUNG_SONSTIGE;
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
	private ENUMFuellung(int value, String name, String literal) {
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
	
} //ENUMFuellung
