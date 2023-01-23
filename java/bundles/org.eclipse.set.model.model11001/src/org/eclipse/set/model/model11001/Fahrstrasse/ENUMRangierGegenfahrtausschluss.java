/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Fahrstrasse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Rangier Gegenfahrtausschluss</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getENUMRangierGegenfahrtausschluss()
 * @model extendedMetaData="name='ENUMRangier_Gegenfahrtausschluss'"
 * @generated
 */
public enum ENUMRangierGegenfahrtausschluss implements Enumerator {
	/**
	 * The '<em><b>ENUM Rangier Gegenfahrtausschluss Inselgleis frei</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_INSELGLEIS_FREI_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_INSELGLEIS_FREI(0, "ENUMRangier_Gegenfahrtausschluss_Inselgleis_frei", "Inselgleis_frei"),

	/**
	 * The '<em><b>ENUM Rangier Gegenfahrtausschluss ja</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_JA_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_JA(1, "ENUMRangier_Gegenfahrtausschluss_ja", "ja"),

	/**
	 * The '<em><b>ENUM Rangier Gegenfahrtausschluss nein</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_NEIN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_NEIN(2, "ENUMRangier_Gegenfahrtausschluss_nein", "nein");

	/**
	 * The '<em><b>ENUM Rangier Gegenfahrtausschluss Inselgleis frei</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_INSELGLEIS_FREI
	 * @model name="ENUMRangier_Gegenfahrtausschluss_Inselgleis_frei" literal="Inselgleis_frei"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_INSELGLEIS_FREI_VALUE = 0;

	/**
	 * The '<em><b>ENUM Rangier Gegenfahrtausschluss ja</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_JA
	 * @model name="ENUMRangier_Gegenfahrtausschluss_ja" literal="ja"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_JA_VALUE = 1;

	/**
	 * The '<em><b>ENUM Rangier Gegenfahrtausschluss nein</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_NEIN
	 * @model name="ENUMRangier_Gegenfahrtausschluss_nein" literal="nein"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_NEIN_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Rangier Gegenfahrtausschluss</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMRangierGegenfahrtausschluss[] VALUES_ARRAY =
		new ENUMRangierGegenfahrtausschluss[] {
			ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_INSELGLEIS_FREI,
			ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_JA,
			ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_NEIN,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Rangier Gegenfahrtausschluss</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMRangierGegenfahrtausschluss> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Rangier Gegenfahrtausschluss</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMRangierGegenfahrtausschluss get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMRangierGegenfahrtausschluss result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Rangier Gegenfahrtausschluss</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMRangierGegenfahrtausschluss getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMRangierGegenfahrtausschluss result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Rangier Gegenfahrtausschluss</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMRangierGegenfahrtausschluss get(int value) {
		switch (value) {
			case ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_INSELGLEIS_FREI_VALUE: return ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_INSELGLEIS_FREI;
			case ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_JA_VALUE: return ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_JA;
			case ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_NEIN_VALUE: return ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_NEIN;
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
	private ENUMRangierGegenfahrtausschluss(int value, String name, String literal) {
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
	
} //ENUMRangierGegenfahrtausschluss
