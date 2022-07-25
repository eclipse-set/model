/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zuglenkung;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Lenkziffernstellen</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage#getENUMLenkziffernstellen()
 * @model extendedMetaData="name='ENUMLenkziffernstellen'"
 * @generated
 */
public enum ENUMLenkziffernstellen implements Enumerator {
	/**
	 * The '<em><b>ENUM Lenkziffernstellen 0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LENKZIFFERNSTELLEN_0_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LENKZIFFERNSTELLEN_0(0, "ENUMLenkziffernstellen_0", "0"),

	/**
	 * The '<em><b>ENUM Lenkziffernstellen 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LENKZIFFERNSTELLEN_1_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LENKZIFFERNSTELLEN_1(1, "ENUMLenkziffernstellen_1", "1");

	/**
	 * The '<em><b>ENUM Lenkziffernstellen 0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LENKZIFFERNSTELLEN_0
	 * @model name="ENUMLenkziffernstellen_0" literal="0"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LENKZIFFERNSTELLEN_0_VALUE = 0;

	/**
	 * The '<em><b>ENUM Lenkziffernstellen 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LENKZIFFERNSTELLEN_1
	 * @model name="ENUMLenkziffernstellen_1" literal="1"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LENKZIFFERNSTELLEN_1_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUM Lenkziffernstellen</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMLenkziffernstellen[] VALUES_ARRAY =
		new ENUMLenkziffernstellen[] {
			ENUM_LENKZIFFERNSTELLEN_0,
			ENUM_LENKZIFFERNSTELLEN_1,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Lenkziffernstellen</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMLenkziffernstellen> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Lenkziffernstellen</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLenkziffernstellen get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMLenkziffernstellen result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Lenkziffernstellen</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLenkziffernstellen getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMLenkziffernstellen result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Lenkziffernstellen</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLenkziffernstellen get(int value) {
		switch (value) {
			case ENUM_LENKZIFFERNSTELLEN_0_VALUE: return ENUM_LENKZIFFERNSTELLEN_0;
			case ENUM_LENKZIFFERNSTELLEN_1_VALUE: return ENUM_LENKZIFFERNSTELLEN_1;
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
	private ENUMLenkziffernstellen(int value, String name, String literal) {
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
	
} //ENUMLenkziffernstellen
