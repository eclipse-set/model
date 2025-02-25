/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Gleis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Baubereich Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Gleis.GleisPackage#getENUMBaubereichArt()
 * @model extendedMetaData="name='ENUMBaubereich_Art'"
 * @generated
 */
public enum ENUMBaubereichArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Baubereich Art ausgebaut</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BAUBEREICH_ART_AUSGEBAUT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BAUBEREICH_ART_AUSGEBAUT(0, "ENUMBaubereich_Art_ausgebaut", "ausgebaut"),

	/**
	 * The '<em><b>ENUM Baubereich Art Baugleis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BAUBEREICH_ART_BAUGLEIS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BAUBEREICH_ART_BAUGLEIS(1, "ENUMBaubereich_Art_Baugleis", "Baugleis"),

	/**
	 * The '<em><b>ENUM Baubereich Art gesperrt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BAUBEREICH_ART_GESPERRT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BAUBEREICH_ART_GESPERRT(2, "ENUMBaubereich_Art_gesperrt", "gesperrt"),

	/**
	 * The '<em><b>ENUM Baubereich Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BAUBEREICH_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BAUBEREICH_ART_SONSTIGE(3, "ENUMBaubereich_Art_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Baubereich Art ausgebaut</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BAUBEREICH_ART_AUSGEBAUT
	 * @model name="ENUMBaubereich_Art_ausgebaut" literal="ausgebaut"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BAUBEREICH_ART_AUSGEBAUT_VALUE = 0;

	/**
	 * The '<em><b>ENUM Baubereich Art Baugleis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BAUBEREICH_ART_BAUGLEIS
	 * @model name="ENUMBaubereich_Art_Baugleis" literal="Baugleis"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BAUBEREICH_ART_BAUGLEIS_VALUE = 1;

	/**
	 * The '<em><b>ENUM Baubereich Art gesperrt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BAUBEREICH_ART_GESPERRT
	 * @model name="ENUMBaubereich_Art_gesperrt" literal="gesperrt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BAUBEREICH_ART_GESPERRT_VALUE = 2;

	/**
	 * The '<em><b>ENUM Baubereich Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BAUBEREICH_ART_SONSTIGE
	 * @model name="ENUMBaubereich_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BAUBEREICH_ART_SONSTIGE_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Baubereich Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMBaubereichArt[] VALUES_ARRAY =
		new ENUMBaubereichArt[] {
			ENUM_BAUBEREICH_ART_AUSGEBAUT,
			ENUM_BAUBEREICH_ART_BAUGLEIS,
			ENUM_BAUBEREICH_ART_GESPERRT,
			ENUM_BAUBEREICH_ART_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Baubereich Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMBaubereichArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Baubereich Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBaubereichArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBaubereichArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Baubereich Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBaubereichArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBaubereichArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Baubereich Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBaubereichArt get(int value) {
		switch (value) {
			case ENUM_BAUBEREICH_ART_AUSGEBAUT_VALUE: return ENUM_BAUBEREICH_ART_AUSGEBAUT;
			case ENUM_BAUBEREICH_ART_BAUGLEIS_VALUE: return ENUM_BAUBEREICH_ART_BAUGLEIS;
			case ENUM_BAUBEREICH_ART_GESPERRT_VALUE: return ENUM_BAUBEREICH_ART_GESPERRT;
			case ENUM_BAUBEREICH_ART_SONSTIGE_VALUE: return ENUM_BAUBEREICH_ART_SONSTIGE;
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
	private ENUMBaubereichArt(int value, String name, String literal) {
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
	
} //ENUMBaubereichArt
