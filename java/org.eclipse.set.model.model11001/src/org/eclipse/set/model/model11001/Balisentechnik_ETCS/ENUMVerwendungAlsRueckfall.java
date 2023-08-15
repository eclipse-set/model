/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Verwendung Als Rueckfall</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMVerwendungAlsRueckfall()
 * @model extendedMetaData="name='ENUMVerwendung_Als_Rueckfall'"
 * @generated
 */
public enum ENUMVerwendungAlsRueckfall implements Enumerator {
	/**
	 * The '<em><b>ENUM Verwendung Als Rueckfall nur Rückfall</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERWENDUNG_ALS_RUECKFALL_NUR_RÜCKFALL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_VERWENDUNG_ALS_RUECKFALL_NUR_RÜCKFALL(0, "ENUMVerwendung_Als_Rueckfall_nur_Rückfall", "nur R\u00fcckfall"),

	/**
	 * The '<em><b>ENUM Verwendung Als Rueckfall Rückfall</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERWENDUNG_ALS_RUECKFALL_RÜCKFALL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_VERWENDUNG_ALS_RUECKFALL_RÜCKFALL(1, "ENUMVerwendung_Als_Rueckfall_Rückfall", "R\u00fcckfall"),

	/**
	 * The '<em><b>ENUM Verwendung Als Rueckfall sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERWENDUNG_ALS_RUECKFALL_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_VERWENDUNG_ALS_RUECKFALL_SONSTIGE(2, "ENUMVerwendung_Als_Rueckfall_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Verwendung Als Rueckfall nur Rückfall</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERWENDUNG_ALS_RUECKFALL_NUR_RÜCKFALL
	 * @model name="ENUMVerwendung_Als_Rueckfall_nur_Rückfall" literal="nur R\374ckfall"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_VERWENDUNG_ALS_RUECKFALL_NUR_RÜCKFALL_VALUE = 0;

	/**
	 * The '<em><b>ENUM Verwendung Als Rueckfall Rückfall</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERWENDUNG_ALS_RUECKFALL_RÜCKFALL
	 * @model name="ENUMVerwendung_Als_Rueckfall_Rückfall" literal="R\374ckfall"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_VERWENDUNG_ALS_RUECKFALL_RÜCKFALL_VALUE = 1;

	/**
	 * The '<em><b>ENUM Verwendung Als Rueckfall sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERWENDUNG_ALS_RUECKFALL_SONSTIGE
	 * @model name="ENUMVerwendung_Als_Rueckfall_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_VERWENDUNG_ALS_RUECKFALL_SONSTIGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Verwendung Als Rueckfall</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMVerwendungAlsRueckfall[] VALUES_ARRAY =
		new ENUMVerwendungAlsRueckfall[] {
			ENUM_VERWENDUNG_ALS_RUECKFALL_NUR_RÜCKFALL,
			ENUM_VERWENDUNG_ALS_RUECKFALL_RÜCKFALL,
			ENUM_VERWENDUNG_ALS_RUECKFALL_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Verwendung Als Rueckfall</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMVerwendungAlsRueckfall> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Verwendung Als Rueckfall</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMVerwendungAlsRueckfall get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMVerwendungAlsRueckfall result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Verwendung Als Rueckfall</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMVerwendungAlsRueckfall getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMVerwendungAlsRueckfall result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Verwendung Als Rueckfall</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMVerwendungAlsRueckfall get(int value) {
		switch (value) {
			case ENUM_VERWENDUNG_ALS_RUECKFALL_NUR_RÜCKFALL_VALUE: return ENUM_VERWENDUNG_ALS_RUECKFALL_NUR_RÜCKFALL;
			case ENUM_VERWENDUNG_ALS_RUECKFALL_RÜCKFALL_VALUE: return ENUM_VERWENDUNG_ALS_RUECKFALL_RÜCKFALL;
			case ENUM_VERWENDUNG_ALS_RUECKFALL_SONSTIGE_VALUE: return ENUM_VERWENDUNG_ALS_RUECKFALL_SONSTIGE;
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
	private ENUMVerwendungAlsRueckfall(int value, String name, String literal) {
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
	
} //ENUMVerwendungAlsRueckfall
