/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Uebertragungsweg Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getENUMUebertragungswegArt()
 * @model extendedMetaData="name='ENUMUebertragungsweg_Art'"
 * @generated
 */
public enum ENUMUebertragungswegArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Uebertragungsweg Art Bahnuebergang</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UEBERTRAGUNGSWEG_ART_BAHNUEBERGANG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_UEBERTRAGUNGSWEG_ART_BAHNUEBERGANG(0, "ENUMUebertragungsweg_Art_Bahnuebergang", "Bahnuebergang"),

	/**
	 * The '<em><b>ENUM Uebertragungsweg Art Diagnose</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UEBERTRAGUNGSWEG_ART_DIAGNOSE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_UEBERTRAGUNGSWEG_ART_DIAGNOSE(1, "ENUMUebertragungsweg_Art_Diagnose", "Diagnose"),

	/**
	 * The '<em><b>ENUM Uebertragungsweg Art ESTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UEBERTRAGUNGSWEG_ART_ESTW_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_UEBERTRAGUNGSWEG_ART_ESTW(2, "ENUMUebertragungsweg_Art_ESTW", "ESTW"),

	/**
	 * The '<em><b>ENUM Uebertragungsweg Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UEBERTRAGUNGSWEG_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_UEBERTRAGUNGSWEG_ART_SONSTIGE(3, "ENUMUebertragungsweg_Art_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Uebertragungsweg Art ZBS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UEBERTRAGUNGSWEG_ART_ZBS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_UEBERTRAGUNGSWEG_ART_ZBS(4, "ENUMUebertragungsweg_Art_ZBS", "ZBS");

	/**
	 * The '<em><b>ENUM Uebertragungsweg Art Bahnuebergang</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UEBERTRAGUNGSWEG_ART_BAHNUEBERGANG
	 * @model name="ENUMUebertragungsweg_Art_Bahnuebergang" literal="Bahnuebergang"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_UEBERTRAGUNGSWEG_ART_BAHNUEBERGANG_VALUE = 0;

	/**
	 * The '<em><b>ENUM Uebertragungsweg Art Diagnose</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UEBERTRAGUNGSWEG_ART_DIAGNOSE
	 * @model name="ENUMUebertragungsweg_Art_Diagnose" literal="Diagnose"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_UEBERTRAGUNGSWEG_ART_DIAGNOSE_VALUE = 1;

	/**
	 * The '<em><b>ENUM Uebertragungsweg Art ESTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UEBERTRAGUNGSWEG_ART_ESTW
	 * @model name="ENUMUebertragungsweg_Art_ESTW" literal="ESTW"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_UEBERTRAGUNGSWEG_ART_ESTW_VALUE = 2;

	/**
	 * The '<em><b>ENUM Uebertragungsweg Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UEBERTRAGUNGSWEG_ART_SONSTIGE
	 * @model name="ENUMUebertragungsweg_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_UEBERTRAGUNGSWEG_ART_SONSTIGE_VALUE = 3;

	/**
	 * The '<em><b>ENUM Uebertragungsweg Art ZBS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UEBERTRAGUNGSWEG_ART_ZBS
	 * @model name="ENUMUebertragungsweg_Art_ZBS" literal="ZBS"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_UEBERTRAGUNGSWEG_ART_ZBS_VALUE = 4;

	/**
	 * An array of all the '<em><b>ENUM Uebertragungsweg Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMUebertragungswegArt[] VALUES_ARRAY =
		new ENUMUebertragungswegArt[] {
			ENUM_UEBERTRAGUNGSWEG_ART_BAHNUEBERGANG,
			ENUM_UEBERTRAGUNGSWEG_ART_DIAGNOSE,
			ENUM_UEBERTRAGUNGSWEG_ART_ESTW,
			ENUM_UEBERTRAGUNGSWEG_ART_SONSTIGE,
			ENUM_UEBERTRAGUNGSWEG_ART_ZBS,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Uebertragungsweg Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMUebertragungswegArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Uebertragungsweg Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMUebertragungswegArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMUebertragungswegArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Uebertragungsweg Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMUebertragungswegArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMUebertragungswegArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Uebertragungsweg Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMUebertragungswegArt get(int value) {
		switch (value) {
			case ENUM_UEBERTRAGUNGSWEG_ART_BAHNUEBERGANG_VALUE: return ENUM_UEBERTRAGUNGSWEG_ART_BAHNUEBERGANG;
			case ENUM_UEBERTRAGUNGSWEG_ART_DIAGNOSE_VALUE: return ENUM_UEBERTRAGUNGSWEG_ART_DIAGNOSE;
			case ENUM_UEBERTRAGUNGSWEG_ART_ESTW_VALUE: return ENUM_UEBERTRAGUNGSWEG_ART_ESTW;
			case ENUM_UEBERTRAGUNGSWEG_ART_SONSTIGE_VALUE: return ENUM_UEBERTRAGUNGSWEG_ART_SONSTIGE;
			case ENUM_UEBERTRAGUNGSWEG_ART_ZBS_VALUE: return ENUM_UEBERTRAGUNGSWEG_ART_ZBS;
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
	private ENUMUebertragungswegArt(int value, String name, String literal) {
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
	
} //ENUMUebertragungswegArt
