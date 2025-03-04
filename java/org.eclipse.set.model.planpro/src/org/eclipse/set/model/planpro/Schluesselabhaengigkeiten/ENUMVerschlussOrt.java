/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Schluesselabhaengigkeiten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Verschluss Ort</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getENUMVerschlussOrt()
 * @model extendedMetaData="name='ENUMVerschluss_Ort'"
 * @generated
 */
public enum ENUMVerschlussOrt implements Enumerator {
	/**
	 * The '<em><b>ENUM Verschluss Ort Herzstück</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERSCHLUSS_ORT_HERZSTÜCK_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_VERSCHLUSS_ORT_HERZSTÜCK(0, "ENUMVerschluss_Ort_Herzstück", "Herzst\u00fcck"),

	/**
	 * The '<em><b>ENUM Verschluss Ort Mitte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERSCHLUSS_ORT_MITTE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_VERSCHLUSS_ORT_MITTE(1, "ENUMVerschluss_Ort_Mitte", "Mitte"),

	/**
	 * The '<em><b>ENUM Verschluss Ort sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERSCHLUSS_ORT_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_VERSCHLUSS_ORT_SONSTIGE(2, "ENUMVerschluss_Ort_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Verschluss Ort Spitze</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERSCHLUSS_ORT_SPITZE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_VERSCHLUSS_ORT_SPITZE(3, "ENUMVerschluss_Ort_Spitze", "Spitze");

	/**
	 * The '<em><b>ENUM Verschluss Ort Herzstück</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERSCHLUSS_ORT_HERZSTÜCK
	 * @model name="ENUMVerschluss_Ort_Herzstück" literal="Herzst\374ck"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_VERSCHLUSS_ORT_HERZSTÜCK_VALUE = 0;

	/**
	 * The '<em><b>ENUM Verschluss Ort Mitte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERSCHLUSS_ORT_MITTE
	 * @model name="ENUMVerschluss_Ort_Mitte" literal="Mitte"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_VERSCHLUSS_ORT_MITTE_VALUE = 1;

	/**
	 * The '<em><b>ENUM Verschluss Ort sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERSCHLUSS_ORT_SONSTIGE
	 * @model name="ENUMVerschluss_Ort_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_VERSCHLUSS_ORT_SONSTIGE_VALUE = 2;

	/**
	 * The '<em><b>ENUM Verschluss Ort Spitze</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERSCHLUSS_ORT_SPITZE
	 * @model name="ENUMVerschluss_Ort_Spitze" literal="Spitze"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_VERSCHLUSS_ORT_SPITZE_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Verschluss Ort</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMVerschlussOrt[] VALUES_ARRAY =
		new ENUMVerschlussOrt[] {
			ENUM_VERSCHLUSS_ORT_HERZSTÜCK,
			ENUM_VERSCHLUSS_ORT_MITTE,
			ENUM_VERSCHLUSS_ORT_SONSTIGE,
			ENUM_VERSCHLUSS_ORT_SPITZE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Verschluss Ort</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMVerschlussOrt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Verschluss Ort</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMVerschlussOrt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMVerschlussOrt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Verschluss Ort</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMVerschlussOrt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMVerschlussOrt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Verschluss Ort</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMVerschlussOrt get(int value) {
		switch (value) {
			case ENUM_VERSCHLUSS_ORT_HERZSTÜCK_VALUE: return ENUM_VERSCHLUSS_ORT_HERZSTÜCK;
			case ENUM_VERSCHLUSS_ORT_MITTE_VALUE: return ENUM_VERSCHLUSS_ORT_MITTE;
			case ENUM_VERSCHLUSS_ORT_SONSTIGE_VALUE: return ENUM_VERSCHLUSS_ORT_SONSTIGE;
			case ENUM_VERSCHLUSS_ORT_SPITZE_VALUE: return ENUM_VERSCHLUSS_ORT_SPITZE;
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
	private ENUMVerschlussOrt(int value, String name, String literal) {
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
	
} //ENUMVerschlussOrt
