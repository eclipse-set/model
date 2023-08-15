/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Signale;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Beleuchtet</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Signale.SignalePackage#getENUMBeleuchtet()
 * @model extendedMetaData="name='ENUMBeleuchtet'"
 * @generated
 */
public enum ENUMBeleuchtet implements Enumerator {
	/**
	 * The '<em><b>ENUM Beleuchtet angestrahlt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BELEUCHTET_ANGESTRAHLT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BELEUCHTET_ANGESTRAHLT(0, "ENUMBeleuchtet_angestrahlt", "angestrahlt"),

	/**
	 * The '<em><b>ENUM Beleuchtet innenbeleuchtet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BELEUCHTET_INNENBELEUCHTET_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BELEUCHTET_INNENBELEUCHTET(1, "ENUMBeleuchtet_innenbeleuchtet", "innenbeleuchtet"),

	/**
	 * The '<em><b>ENUM Beleuchtet nein</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BELEUCHTET_NEIN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BELEUCHTET_NEIN(2, "ENUMBeleuchtet_nein", "nein");

	/**
	 * The '<em><b>ENUM Beleuchtet angestrahlt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BELEUCHTET_ANGESTRAHLT
	 * @model name="ENUMBeleuchtet_angestrahlt" literal="angestrahlt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BELEUCHTET_ANGESTRAHLT_VALUE = 0;

	/**
	 * The '<em><b>ENUM Beleuchtet innenbeleuchtet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BELEUCHTET_INNENBELEUCHTET
	 * @model name="ENUMBeleuchtet_innenbeleuchtet" literal="innenbeleuchtet"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BELEUCHTET_INNENBELEUCHTET_VALUE = 1;

	/**
	 * The '<em><b>ENUM Beleuchtet nein</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BELEUCHTET_NEIN
	 * @model name="ENUMBeleuchtet_nein" literal="nein"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BELEUCHTET_NEIN_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Beleuchtet</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMBeleuchtet[] VALUES_ARRAY =
		new ENUMBeleuchtet[] {
			ENUM_BELEUCHTET_ANGESTRAHLT,
			ENUM_BELEUCHTET_INNENBELEUCHTET,
			ENUM_BELEUCHTET_NEIN,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Beleuchtet</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMBeleuchtet> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Beleuchtet</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBeleuchtet get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBeleuchtet result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Beleuchtet</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBeleuchtet getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBeleuchtet result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Beleuchtet</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBeleuchtet get(int value) {
		switch (value) {
			case ENUM_BELEUCHTET_ANGESTRAHLT_VALUE: return ENUM_BELEUCHTET_ANGESTRAHLT;
			case ENUM_BELEUCHTET_INNENBELEUCHTET_VALUE: return ENUM_BELEUCHTET_INNENBELEUCHTET;
			case ENUM_BELEUCHTET_NEIN_VALUE: return ENUM_BELEUCHTET_NEIN;
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
	private ENUMBeleuchtet(int value, String name, String literal) {
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
	
} //ENUMBeleuchtet
