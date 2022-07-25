/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.BasisTypen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Bremsweg</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage#getENUMBremsweg()
 * @model extendedMetaData="name='ENUMBremsweg'"
 * @generated
 */
public enum ENUMBremsweg implements Enumerator {
	/**
	 * The '<em><b>ENUM Bremsweg 1000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BREMSWEG_1000_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BREMSWEG_1000(0, "ENUMBremsweg_1000", "1000"),

	/**
	 * The '<em><b>ENUM Bremsweg 400</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BREMSWEG_400_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BREMSWEG_400(1, "ENUMBremsweg_400", "400"),

	/**
	 * The '<em><b>ENUM Bremsweg 700</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BREMSWEG_700_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BREMSWEG_700(2, "ENUMBremsweg_700", "700"),

	/**
	 * The '<em><b>ENUM Bremsweg sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BREMSWEG_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BREMSWEG_SONSTIGE(3, "ENUMBremsweg_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Bremsweg 1000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BREMSWEG_1000
	 * @model name="ENUMBremsweg_1000" literal="1000"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BREMSWEG_1000_VALUE = 0;

	/**
	 * The '<em><b>ENUM Bremsweg 400</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BREMSWEG_400
	 * @model name="ENUMBremsweg_400" literal="400"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BREMSWEG_400_VALUE = 1;

	/**
	 * The '<em><b>ENUM Bremsweg 700</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BREMSWEG_700
	 * @model name="ENUMBremsweg_700" literal="700"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BREMSWEG_700_VALUE = 2;

	/**
	 * The '<em><b>ENUM Bremsweg sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BREMSWEG_SONSTIGE
	 * @model name="ENUMBremsweg_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BREMSWEG_SONSTIGE_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Bremsweg</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMBremsweg[] VALUES_ARRAY =
		new ENUMBremsweg[] {
			ENUM_BREMSWEG_1000,
			ENUM_BREMSWEG_400,
			ENUM_BREMSWEG_700,
			ENUM_BREMSWEG_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Bremsweg</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMBremsweg> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Bremsweg</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBremsweg get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBremsweg result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Bremsweg</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBremsweg getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBremsweg result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Bremsweg</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBremsweg get(int value) {
		switch (value) {
			case ENUM_BREMSWEG_1000_VALUE: return ENUM_BREMSWEG_1000;
			case ENUM_BREMSWEG_400_VALUE: return ENUM_BREMSWEG_400;
			case ENUM_BREMSWEG_700_VALUE: return ENUM_BREMSWEG_700;
			case ENUM_BREMSWEG_SONSTIGE_VALUE: return ENUM_BREMSWEG_SONSTIGE;
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
	private ENUMBremsweg(int value, String name, String literal) {
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
	
} //ENUMBremsweg
