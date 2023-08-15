/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Layoutinformationen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Linie Subart</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage#getENUMLinieSubart()
 * @model extendedMetaData="name='ENUMLinie_Subart'"
 * @generated
 */
public enum ENUMLinieSubart implements Enumerator {
	/**
	 * The '<em><b>ENUM Linie Subart breit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LINIE_SUBART_BREIT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LINIE_SUBART_BREIT(0, "ENUMLinie_Subart_breit", "breit"),

	/**
	 * The '<em><b>ENUM Linie Subart extrabreit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LINIE_SUBART_EXTRABREIT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LINIE_SUBART_EXTRABREIT(1, "ENUMLinie_Subart_extrabreit", "extrabreit"),

	/**
	 * The '<em><b>ENUM Linie Subart schmal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LINIE_SUBART_SCHMAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LINIE_SUBART_SCHMAL(2, "ENUMLinie_Subart_schmal", "schmal");

	/**
	 * The '<em><b>ENUM Linie Subart breit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LINIE_SUBART_BREIT
	 * @model name="ENUMLinie_Subart_breit" literal="breit"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LINIE_SUBART_BREIT_VALUE = 0;

	/**
	 * The '<em><b>ENUM Linie Subart extrabreit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LINIE_SUBART_EXTRABREIT
	 * @model name="ENUMLinie_Subart_extrabreit" literal="extrabreit"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LINIE_SUBART_EXTRABREIT_VALUE = 1;

	/**
	 * The '<em><b>ENUM Linie Subart schmal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LINIE_SUBART_SCHMAL
	 * @model name="ENUMLinie_Subart_schmal" literal="schmal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LINIE_SUBART_SCHMAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Linie Subart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMLinieSubart[] VALUES_ARRAY =
		new ENUMLinieSubart[] {
			ENUM_LINIE_SUBART_BREIT,
			ENUM_LINIE_SUBART_EXTRABREIT,
			ENUM_LINIE_SUBART_SCHMAL,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Linie Subart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMLinieSubart> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Linie Subart</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLinieSubart get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMLinieSubart result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Linie Subart</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLinieSubart getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMLinieSubart result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Linie Subart</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLinieSubart get(int value) {
		switch (value) {
			case ENUM_LINIE_SUBART_BREIT_VALUE: return ENUM_LINIE_SUBART_BREIT;
			case ENUM_LINIE_SUBART_EXTRABREIT_VALUE: return ENUM_LINIE_SUBART_EXTRABREIT;
			case ENUM_LINIE_SUBART_SCHMAL_VALUE: return ENUM_LINIE_SUBART_SCHMAL;
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
	private ENUMLinieSubart(int value, String name, String literal) {
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
	
} //ENUMLinieSubart
