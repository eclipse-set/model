/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Signale;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Anschaltdauer</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getENUMAnschaltdauer()
 * @model extendedMetaData="name='ENUMAnschaltdauer'"
 * @generated
 */
public enum ENUMAnschaltdauer implements Enumerator {
	/**
	 * The '<em><b>ENUM Anschaltdauer G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ANSCHALTDAUER_G_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ANSCHALTDAUER_G(0, "ENUMAnschaltdauer_G", "G"),

	/**
	 * The '<em><b>ENUM Anschaltdauer T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ANSCHALTDAUER_T_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ANSCHALTDAUER_T(1, "ENUMAnschaltdauer_T", "T"),

	/**
	 * The '<em><b>ENUM Anschaltdauer Z</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ANSCHALTDAUER_Z_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ANSCHALTDAUER_Z(2, "ENUMAnschaltdauer_Z", "Z");

	/**
	 * The '<em><b>ENUM Anschaltdauer G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ANSCHALTDAUER_G
	 * @model name="ENUMAnschaltdauer_G" literal="G"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ANSCHALTDAUER_G_VALUE = 0;

	/**
	 * The '<em><b>ENUM Anschaltdauer T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ANSCHALTDAUER_T
	 * @model name="ENUMAnschaltdauer_T" literal="T"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ANSCHALTDAUER_T_VALUE = 1;

	/**
	 * The '<em><b>ENUM Anschaltdauer Z</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ANSCHALTDAUER_Z
	 * @model name="ENUMAnschaltdauer_Z" literal="Z"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ANSCHALTDAUER_Z_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Anschaltdauer</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMAnschaltdauer[] VALUES_ARRAY =
		new ENUMAnschaltdauer[] {
			ENUM_ANSCHALTDAUER_G,
			ENUM_ANSCHALTDAUER_T,
			ENUM_ANSCHALTDAUER_Z,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Anschaltdauer</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMAnschaltdauer> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Anschaltdauer</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAnschaltdauer get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAnschaltdauer result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Anschaltdauer</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAnschaltdauer getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAnschaltdauer result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Anschaltdauer</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAnschaltdauer get(int value) {
		switch (value) {
			case ENUM_ANSCHALTDAUER_G_VALUE: return ENUM_ANSCHALTDAUER_G;
			case ENUM_ANSCHALTDAUER_T_VALUE: return ENUM_ANSCHALTDAUER_T;
			case ENUM_ANSCHALTDAUER_Z_VALUE: return ENUM_ANSCHALTDAUER_Z;
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
	private ENUMAnschaltdauer(int value, String name, String literal) {
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
	
} //ENUMAnschaltdauer
