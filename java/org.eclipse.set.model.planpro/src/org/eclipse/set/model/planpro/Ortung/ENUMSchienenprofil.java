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
 * A representation of the literals of the enumeration '<em><b>ENUM Schienenprofil</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getENUMSchienenprofil()
 * @model extendedMetaData="name='ENUMSchienenprofil'"
 * @generated
 */
public enum ENUMSchienenprofil implements Enumerator {
	/**
	 * The '<em><b>ENUM Schienenprofil R65</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHIENENPROFIL_R65_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SCHIENENPROFIL_R65(0, "ENUMSchienenprofil_R65", "R65"),

	/**
	 * The '<em><b>ENUM Schienenprofil S49</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHIENENPROFIL_S49_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SCHIENENPROFIL_S49(1, "ENUMSchienenprofil_S49", "S49"),

	/**
	 * The '<em><b>ENUM Schienenprofil S54</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHIENENPROFIL_S54_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SCHIENENPROFIL_S54(2, "ENUMSchienenprofil_S54", "S54"),

	/**
	 * The '<em><b>ENUM Schienenprofil sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHIENENPROFIL_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SCHIENENPROFIL_SONSTIGE(3, "ENUMSchienenprofil_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Schienenprofil UIC60</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHIENENPROFIL_UIC60_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SCHIENENPROFIL_UIC60(4, "ENUMSchienenprofil_UIC60", "UIC60");

	/**
	 * The '<em><b>ENUM Schienenprofil R65</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHIENENPROFIL_R65
	 * @model name="ENUMSchienenprofil_R65" literal="R65"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SCHIENENPROFIL_R65_VALUE = 0;

	/**
	 * The '<em><b>ENUM Schienenprofil S49</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHIENENPROFIL_S49
	 * @model name="ENUMSchienenprofil_S49" literal="S49"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SCHIENENPROFIL_S49_VALUE = 1;

	/**
	 * The '<em><b>ENUM Schienenprofil S54</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHIENENPROFIL_S54
	 * @model name="ENUMSchienenprofil_S54" literal="S54"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SCHIENENPROFIL_S54_VALUE = 2;

	/**
	 * The '<em><b>ENUM Schienenprofil sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHIENENPROFIL_SONSTIGE
	 * @model name="ENUMSchienenprofil_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SCHIENENPROFIL_SONSTIGE_VALUE = 3;

	/**
	 * The '<em><b>ENUM Schienenprofil UIC60</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHIENENPROFIL_UIC60
	 * @model name="ENUMSchienenprofil_UIC60" literal="UIC60"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SCHIENENPROFIL_UIC60_VALUE = 4;

	/**
	 * An array of all the '<em><b>ENUM Schienenprofil</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMSchienenprofil[] VALUES_ARRAY =
		new ENUMSchienenprofil[] {
			ENUM_SCHIENENPROFIL_R65,
			ENUM_SCHIENENPROFIL_S49,
			ENUM_SCHIENENPROFIL_S54,
			ENUM_SCHIENENPROFIL_SONSTIGE,
			ENUM_SCHIENENPROFIL_UIC60,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Schienenprofil</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMSchienenprofil> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Schienenprofil</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSchienenprofil get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMSchienenprofil result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Schienenprofil</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSchienenprofil getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMSchienenprofil result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Schienenprofil</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSchienenprofil get(int value) {
		switch (value) {
			case ENUM_SCHIENENPROFIL_R65_VALUE: return ENUM_SCHIENENPROFIL_R65;
			case ENUM_SCHIENENPROFIL_S49_VALUE: return ENUM_SCHIENENPROFIL_S49;
			case ENUM_SCHIENENPROFIL_S54_VALUE: return ENUM_SCHIENENPROFIL_S54;
			case ENUM_SCHIENENPROFIL_SONSTIGE_VALUE: return ENUM_SCHIENENPROFIL_SONSTIGE;
			case ENUM_SCHIENENPROFIL_UIC60_VALUE: return ENUM_SCHIENENPROFIL_UIC60;
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
	private ENUMSchienenprofil(int value, String name, String literal) {
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
	
} //ENUMSchienenprofil
