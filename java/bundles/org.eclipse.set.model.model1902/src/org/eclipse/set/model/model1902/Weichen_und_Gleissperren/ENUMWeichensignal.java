/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Weichen_und_Gleissperren;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Weichensignal</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getENUMWeichensignal()
 * @model extendedMetaData="name='ENUMWeichensignal'"
 * @generated
 */
public enum ENUMWeichensignal implements Enumerator {
	/**
	 * The '<em><b>ENUM Weichensignal innenbeleuchtet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WEICHENSIGNAL_INNENBELEUCHTET_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WEICHENSIGNAL_INNENBELEUCHTET(0, "ENUMWeichensignal_innenbeleuchtet", "innenbeleuchtet"),

	/**
	 * The '<em><b>ENUM Weichensignal reflektierend</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WEICHENSIGNAL_REFLEKTIEREND_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WEICHENSIGNAL_REFLEKTIEREND(1, "ENUMWeichensignal_reflektierend", "reflektierend");

	/**
	 * The '<em><b>ENUM Weichensignal innenbeleuchtet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WEICHENSIGNAL_INNENBELEUCHTET
	 * @model name="ENUMWeichensignal_innenbeleuchtet" literal="innenbeleuchtet"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WEICHENSIGNAL_INNENBELEUCHTET_VALUE = 0;

	/**
	 * The '<em><b>ENUM Weichensignal reflektierend</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WEICHENSIGNAL_REFLEKTIEREND
	 * @model name="ENUMWeichensignal_reflektierend" literal="reflektierend"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WEICHENSIGNAL_REFLEKTIEREND_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUM Weichensignal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMWeichensignal[] VALUES_ARRAY =
		new ENUMWeichensignal[] {
			ENUM_WEICHENSIGNAL_INNENBELEUCHTET,
			ENUM_WEICHENSIGNAL_REFLEKTIEREND,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Weichensignal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMWeichensignal> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Weichensignal</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWeichensignal get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMWeichensignal result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Weichensignal</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWeichensignal getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMWeichensignal result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Weichensignal</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWeichensignal get(int value) {
		switch (value) {
			case ENUM_WEICHENSIGNAL_INNENBELEUCHTET_VALUE: return ENUM_WEICHENSIGNAL_INNENBELEUCHTET;
			case ENUM_WEICHENSIGNAL_REFLEKTIEREND_VALUE: return ENUM_WEICHENSIGNAL_REFLEKTIEREND;
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
	private ENUMWeichensignal(int value, String name, String literal) {
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
	
} //ENUMWeichensignal
