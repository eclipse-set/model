/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Block;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Schaltung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getENUMSchaltung()
 * @model extendedMetaData="name='ENUMSchaltung'"
 * @generated
 */
public enum ENUMSchaltung implements Enumerator {
	/**
	 * The '<em><b>ENUM Schaltung 3Drahtschaltung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHALTUNG_3DRAHTSCHALTUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SCHALTUNG_3DRAHTSCHALTUNG(0, "ENUMSchaltung_3_Drahtschaltung", "3_Drahtschaltung"),

	/**
	 * The '<em><b>ENUM Schaltung 6Drahtschaltung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHALTUNG_6DRAHTSCHALTUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SCHALTUNG_6DRAHTSCHALTUNG(1, "ENUMSchaltung_6_Drahtschaltung", "6_Drahtschaltung"),

	/**
	 * The '<em><b>ENUM Schaltung 9Drahtschaltung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHALTUNG_9DRAHTSCHALTUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SCHALTUNG_9DRAHTSCHALTUNG(2, "ENUMSchaltung_9_Drahtschaltung", "9_Drahtschaltung"),

	/**
	 * The '<em><b>ENUM Schaltung sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHALTUNG_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SCHALTUNG_SONSTIGE(3, "ENUMSchaltung_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Schaltung 3Drahtschaltung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHALTUNG_3DRAHTSCHALTUNG
	 * @model name="ENUMSchaltung_3_Drahtschaltung" literal="3_Drahtschaltung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SCHALTUNG_3DRAHTSCHALTUNG_VALUE = 0;

	/**
	 * The '<em><b>ENUM Schaltung 6Drahtschaltung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHALTUNG_6DRAHTSCHALTUNG
	 * @model name="ENUMSchaltung_6_Drahtschaltung" literal="6_Drahtschaltung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SCHALTUNG_6DRAHTSCHALTUNG_VALUE = 1;

	/**
	 * The '<em><b>ENUM Schaltung 9Drahtschaltung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHALTUNG_9DRAHTSCHALTUNG
	 * @model name="ENUMSchaltung_9_Drahtschaltung" literal="9_Drahtschaltung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SCHALTUNG_9DRAHTSCHALTUNG_VALUE = 2;

	/**
	 * The '<em><b>ENUM Schaltung sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SCHALTUNG_SONSTIGE
	 * @model name="ENUMSchaltung_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SCHALTUNG_SONSTIGE_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Schaltung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMSchaltung[] VALUES_ARRAY =
		new ENUMSchaltung[] {
			ENUM_SCHALTUNG_3DRAHTSCHALTUNG,
			ENUM_SCHALTUNG_6DRAHTSCHALTUNG,
			ENUM_SCHALTUNG_9DRAHTSCHALTUNG,
			ENUM_SCHALTUNG_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Schaltung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMSchaltung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Schaltung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSchaltung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMSchaltung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Schaltung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSchaltung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMSchaltung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Schaltung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSchaltung get(int value) {
		switch (value) {
			case ENUM_SCHALTUNG_3DRAHTSCHALTUNG_VALUE: return ENUM_SCHALTUNG_3DRAHTSCHALTUNG;
			case ENUM_SCHALTUNG_6DRAHTSCHALTUNG_VALUE: return ENUM_SCHALTUNG_6DRAHTSCHALTUNG;
			case ENUM_SCHALTUNG_9DRAHTSCHALTUNG_VALUE: return ENUM_SCHALTUNG_9DRAHTSCHALTUNG;
			case ENUM_SCHALTUNG_SONSTIGE_VALUE: return ENUM_SCHALTUNG_SONSTIGE;
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
	private ENUMSchaltung(int value, String name, String literal) {
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
	
} //ENUMSchaltung
