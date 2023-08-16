/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bahnuebergang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Fue Schaltfall</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getENUMFueSchaltfall()
 * @model extendedMetaData="name='ENUMFue_Schaltfall'"
 * @generated
 */
public enum ENUMFueSchaltfall implements Enumerator {
	/**
	 * The '<em><b>ENUM Fue Schaltfall 12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUE_SCHALTFALL_12_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FUE_SCHALTFALL_12(0, "ENUMFue_Schaltfall_12", "12"),

	/**
	 * The '<em><b>ENUM Fue Schaltfall 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUE_SCHALTFALL_2_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FUE_SCHALTFALL_2(1, "ENUMFue_Schaltfall_2", "2");

	/**
	 * The '<em><b>ENUM Fue Schaltfall 12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUE_SCHALTFALL_12
	 * @model name="ENUMFue_Schaltfall_12" literal="12"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FUE_SCHALTFALL_12_VALUE = 0;

	/**
	 * The '<em><b>ENUM Fue Schaltfall 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUE_SCHALTFALL_2
	 * @model name="ENUMFue_Schaltfall_2" literal="2"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FUE_SCHALTFALL_2_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUM Fue Schaltfall</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMFueSchaltfall[] VALUES_ARRAY =
		new ENUMFueSchaltfall[] {
			ENUM_FUE_SCHALTFALL_12,
			ENUM_FUE_SCHALTFALL_2,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Fue Schaltfall</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMFueSchaltfall> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Fue Schaltfall</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFueSchaltfall get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFueSchaltfall result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Fue Schaltfall</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFueSchaltfall getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFueSchaltfall result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Fue Schaltfall</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFueSchaltfall get(int value) {
		switch (value) {
			case ENUM_FUE_SCHALTFALL_12_VALUE: return ENUM_FUE_SCHALTFALL_12;
			case ENUM_FUE_SCHALTFALL_2_VALUE: return ENUM_FUE_SCHALTFALL_2;
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
	private ENUMFueSchaltfall(int value, String name, String literal) {
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
	
} //ENUMFueSchaltfall
