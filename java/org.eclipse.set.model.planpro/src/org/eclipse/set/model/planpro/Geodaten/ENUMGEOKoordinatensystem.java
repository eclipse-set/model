/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMGEO Koordinatensystem</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getENUMGEOKoordinatensystem()
 * @model extendedMetaData="name='ENUMGEO_Koordinatensystem'"
 * @generated
 */
public enum ENUMGEOKoordinatensystem implements Enumerator {
	/**
	 * The '<em><b>ENUMGEO Koordinatensystem CR0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_KOORDINATENSYSTEM_CR0_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGEO_KOORDINATENSYSTEM_CR0(0, "ENUMGEO_Koordinatensystem_CR0", "CR0"),

	/**
	 * The '<em><b>ENUMGEO Koordinatensystem DR0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_KOORDINATENSYSTEM_DR0_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGEO_KOORDINATENSYSTEM_DR0(1, "ENUMGEO_Koordinatensystem_DR0", "DR0"),

	/**
	 * The '<em><b>ENUMGEO Koordinatensystem ER0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_KOORDINATENSYSTEM_ER0_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGEO_KOORDINATENSYSTEM_ER0(2, "ENUMGEO_Koordinatensystem_ER0", "ER0"),

	/**
	 * The '<em><b>ENUMGEO Koordinatensystem FR0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_KOORDINATENSYSTEM_FR0_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGEO_KOORDINATENSYSTEM_FR0(3, "ENUMGEO_Koordinatensystem_FR0", "FR0"),

	/**
	 * The '<em><b>ENUMGEO Koordinatensystem sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_KOORDINATENSYSTEM_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGEO_KOORDINATENSYSTEM_SONSTIGE(4, "ENUMGEO_Koordinatensystem_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUMGEO Koordinatensystem CR0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_KOORDINATENSYSTEM_CR0
	 * @model name="ENUMGEO_Koordinatensystem_CR0" literal="CR0"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGEO_KOORDINATENSYSTEM_CR0_VALUE = 0;

	/**
	 * The '<em><b>ENUMGEO Koordinatensystem DR0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_KOORDINATENSYSTEM_DR0
	 * @model name="ENUMGEO_Koordinatensystem_DR0" literal="DR0"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGEO_KOORDINATENSYSTEM_DR0_VALUE = 1;

	/**
	 * The '<em><b>ENUMGEO Koordinatensystem ER0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_KOORDINATENSYSTEM_ER0
	 * @model name="ENUMGEO_Koordinatensystem_ER0" literal="ER0"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGEO_KOORDINATENSYSTEM_ER0_VALUE = 2;

	/**
	 * The '<em><b>ENUMGEO Koordinatensystem FR0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_KOORDINATENSYSTEM_FR0
	 * @model name="ENUMGEO_Koordinatensystem_FR0" literal="FR0"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGEO_KOORDINATENSYSTEM_FR0_VALUE = 3;

	/**
	 * The '<em><b>ENUMGEO Koordinatensystem sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_KOORDINATENSYSTEM_SONSTIGE
	 * @model name="ENUMGEO_Koordinatensystem_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGEO_KOORDINATENSYSTEM_SONSTIGE_VALUE = 4;

	/**
	 * An array of all the '<em><b>ENUMGEO Koordinatensystem</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMGEOKoordinatensystem[] VALUES_ARRAY =
		new ENUMGEOKoordinatensystem[] {
			ENUMGEO_KOORDINATENSYSTEM_CR0,
			ENUMGEO_KOORDINATENSYSTEM_DR0,
			ENUMGEO_KOORDINATENSYSTEM_ER0,
			ENUMGEO_KOORDINATENSYSTEM_FR0,
			ENUMGEO_KOORDINATENSYSTEM_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMGEO Koordinatensystem</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMGEOKoordinatensystem> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMGEO Koordinatensystem</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGEOKoordinatensystem get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGEOKoordinatensystem result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMGEO Koordinatensystem</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGEOKoordinatensystem getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGEOKoordinatensystem result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMGEO Koordinatensystem</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGEOKoordinatensystem get(int value) {
		switch (value) {
			case ENUMGEO_KOORDINATENSYSTEM_CR0_VALUE: return ENUMGEO_KOORDINATENSYSTEM_CR0;
			case ENUMGEO_KOORDINATENSYSTEM_DR0_VALUE: return ENUMGEO_KOORDINATENSYSTEM_DR0;
			case ENUMGEO_KOORDINATENSYSTEM_ER0_VALUE: return ENUMGEO_KOORDINATENSYSTEM_ER0;
			case ENUMGEO_KOORDINATENSYSTEM_FR0_VALUE: return ENUMGEO_KOORDINATENSYSTEM_FR0;
			case ENUMGEO_KOORDINATENSYSTEM_SONSTIGE_VALUE: return ENUMGEO_KOORDINATENSYSTEM_SONSTIGE;
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
	private ENUMGEOKoordinatensystem(int value, String name, String literal) {
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
	
} //ENUMGEOKoordinatensystem
