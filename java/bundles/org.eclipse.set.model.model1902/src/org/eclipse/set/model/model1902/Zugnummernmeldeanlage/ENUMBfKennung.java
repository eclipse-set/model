/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zugnummernmeldeanlage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Bf Kennung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getENUMBfKennung()
 * @model extendedMetaData="name='ENUMBf_Kennung'"
 * @generated
 */
public enum ENUMBfKennung implements Enumerator {
	/**
	 * The '<em><b>ENUM Bf Kennung 0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BF_KENNUNG_0_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BF_KENNUNG_0(0, "ENUMBf_Kennung_0", "0"),

	/**
	 * The '<em><b>ENUM Bf Kennung 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BF_KENNUNG_1_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BF_KENNUNG_1(1, "ENUMBf_Kennung_1", "1"),

	/**
	 * The '<em><b>ENUM Bf Kennung 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BF_KENNUNG_2_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BF_KENNUNG_2(2, "ENUMBf_Kennung_2", "2"),

	/**
	 * The '<em><b>ENUM Bf Kennung 3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BF_KENNUNG_3_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BF_KENNUNG_3(3, "ENUMBf_Kennung_3", "3"),

	/**
	 * The '<em><b>ENUM Bf Kennung 4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BF_KENNUNG_4_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BF_KENNUNG_4(4, "ENUMBf_Kennung_4", "4");

	/**
	 * The '<em><b>ENUM Bf Kennung 0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BF_KENNUNG_0
	 * @model name="ENUMBf_Kennung_0" literal="0"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BF_KENNUNG_0_VALUE = 0;

	/**
	 * The '<em><b>ENUM Bf Kennung 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BF_KENNUNG_1
	 * @model name="ENUMBf_Kennung_1" literal="1"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BF_KENNUNG_1_VALUE = 1;

	/**
	 * The '<em><b>ENUM Bf Kennung 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BF_KENNUNG_2
	 * @model name="ENUMBf_Kennung_2" literal="2"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BF_KENNUNG_2_VALUE = 2;

	/**
	 * The '<em><b>ENUM Bf Kennung 3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BF_KENNUNG_3
	 * @model name="ENUMBf_Kennung_3" literal="3"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BF_KENNUNG_3_VALUE = 3;

	/**
	 * The '<em><b>ENUM Bf Kennung 4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BF_KENNUNG_4
	 * @model name="ENUMBf_Kennung_4" literal="4"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BF_KENNUNG_4_VALUE = 4;

	/**
	 * An array of all the '<em><b>ENUM Bf Kennung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMBfKennung[] VALUES_ARRAY =
		new ENUMBfKennung[] {
			ENUM_BF_KENNUNG_0,
			ENUM_BF_KENNUNG_1,
			ENUM_BF_KENNUNG_2,
			ENUM_BF_KENNUNG_3,
			ENUM_BF_KENNUNG_4,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Bf Kennung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMBfKennung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Bf Kennung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBfKennung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBfKennung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Bf Kennung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBfKennung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBfKennung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Bf Kennung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBfKennung get(int value) {
		switch (value) {
			case ENUM_BF_KENNUNG_0_VALUE: return ENUM_BF_KENNUNG_0;
			case ENUM_BF_KENNUNG_1_VALUE: return ENUM_BF_KENNUNG_1;
			case ENUM_BF_KENNUNG_2_VALUE: return ENUM_BF_KENNUNG_2;
			case ENUM_BF_KENNUNG_3_VALUE: return ENUM_BF_KENNUNG_3;
			case ENUM_BF_KENNUNG_4_VALUE: return ENUM_BF_KENNUNG_4;
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
	private ENUMBfKennung(int value, String name, String literal) {
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
	
} //ENUMBfKennung
