/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Schluesselabhaengigkeiten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Gsp Lage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getENUMGspLage()
 * @model extendedMetaData="name='ENUMGsp_Lage'"
 * @generated
 */
public enum ENUMGspLage implements Enumerator {
	/**
	 * The '<em><b>ENUM Gsp Lage abgelegt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GSP_LAGE_ABGELEGT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GSP_LAGE_ABGELEGT(0, "ENUMGsp_Lage_abgelegt", "abgelegt"),

	/**
	 * The '<em><b>ENUM Gsp Lage aufgelegt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GSP_LAGE_AUFGELEGT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GSP_LAGE_AUFGELEGT(1, "ENUMGsp_Lage_aufgelegt", "aufgelegt");

	/**
	 * The '<em><b>ENUM Gsp Lage abgelegt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GSP_LAGE_ABGELEGT
	 * @model name="ENUMGsp_Lage_abgelegt" literal="abgelegt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GSP_LAGE_ABGELEGT_VALUE = 0;

	/**
	 * The '<em><b>ENUM Gsp Lage aufgelegt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GSP_LAGE_AUFGELEGT
	 * @model name="ENUMGsp_Lage_aufgelegt" literal="aufgelegt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GSP_LAGE_AUFGELEGT_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUM Gsp Lage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMGspLage[] VALUES_ARRAY =
		new ENUMGspLage[] {
			ENUM_GSP_LAGE_ABGELEGT,
			ENUM_GSP_LAGE_AUFGELEGT,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Gsp Lage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMGspLage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Gsp Lage</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGspLage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGspLage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Gsp Lage</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGspLage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGspLage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Gsp Lage</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGspLage get(int value) {
		switch (value) {
			case ENUM_GSP_LAGE_ABGELEGT_VALUE: return ENUM_GSP_LAGE_ABGELEGT;
			case ENUM_GSP_LAGE_AUFGELEGT_VALUE: return ENUM_GSP_LAGE_AUFGELEGT;
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
	private ENUMGspLage(int value, String name, String literal) {
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
	
} //ENUMGspLage
