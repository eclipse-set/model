/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Geodaten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Strecke Richtung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getENUMStreckeRichtung()
 * @model extendedMetaData="name='ENUMStrecke_Richtung'"
 * @generated
 */
public enum ENUMStreckeRichtung implements Enumerator {
	/**
	 * The '<em><b>ENUM Strecke Richtung a</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STRECKE_RICHTUNG_A_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_STRECKE_RICHTUNG_A(0, "ENUMStrecke_Richtung_a", "a"),

	/**
	 * The '<em><b>ENUM Strecke Richtung b</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STRECKE_RICHTUNG_B_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_STRECKE_RICHTUNG_B(1, "ENUMStrecke_Richtung_b", "b"),

	/**
	 * The '<em><b>ENUM Strecke Richtung sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STRECKE_RICHTUNG_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_STRECKE_RICHTUNG_SONSTIGE(2, "ENUMStrecke_Richtung_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Strecke Richtung a</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STRECKE_RICHTUNG_A
	 * @model name="ENUMStrecke_Richtung_a" literal="a"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_STRECKE_RICHTUNG_A_VALUE = 0;

	/**
	 * The '<em><b>ENUM Strecke Richtung b</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STRECKE_RICHTUNG_B
	 * @model name="ENUMStrecke_Richtung_b" literal="b"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_STRECKE_RICHTUNG_B_VALUE = 1;

	/**
	 * The '<em><b>ENUM Strecke Richtung sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STRECKE_RICHTUNG_SONSTIGE
	 * @model name="ENUMStrecke_Richtung_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_STRECKE_RICHTUNG_SONSTIGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Strecke Richtung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMStreckeRichtung[] VALUES_ARRAY =
		new ENUMStreckeRichtung[] {
			ENUM_STRECKE_RICHTUNG_A,
			ENUM_STRECKE_RICHTUNG_B,
			ENUM_STRECKE_RICHTUNG_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Strecke Richtung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMStreckeRichtung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Strecke Richtung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMStreckeRichtung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMStreckeRichtung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Strecke Richtung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMStreckeRichtung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMStreckeRichtung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Strecke Richtung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMStreckeRichtung get(int value) {
		switch (value) {
			case ENUM_STRECKE_RICHTUNG_A_VALUE: return ENUM_STRECKE_RICHTUNG_A;
			case ENUM_STRECKE_RICHTUNG_B_VALUE: return ENUM_STRECKE_RICHTUNG_B;
			case ENUM_STRECKE_RICHTUNG_SONSTIGE_VALUE: return ENUM_STRECKE_RICHTUNG_SONSTIGE;
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
	private ENUMStreckeRichtung(int value, String name, String literal) {
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
	
} //ENUMStreckeRichtung
