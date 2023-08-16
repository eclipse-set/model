/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ortung;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Bezeichnung Kennbuchstabe</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getENUMBezeichnungKennbuchstabe()
 * @model extendedMetaData="name='ENUMBezeichnung_Kennbuchstabe'"
 * @generated
 */
public enum ENUMBezeichnungKennbuchstabe implements Enumerator {
	/**
	 * The '<em><b>ENUM Bezeichnung Kennbuchstabe B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEZEICHNUNG_KENNBUCHSTABE_B_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEZEICHNUNG_KENNBUCHSTABE_B(0, "ENUMBezeichnung_Kennbuchstabe_B", "B"),

	/**
	 * The '<em><b>ENUM Bezeichnung Kennbuchstabe G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEZEICHNUNG_KENNBUCHSTABE_G_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEZEICHNUNG_KENNBUCHSTABE_G(1, "ENUMBezeichnung_Kennbuchstabe_G", "G"),

	/**
	 * The '<em><b>ENUM Bezeichnung Kennbuchstabe K</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEZEICHNUNG_KENNBUCHSTABE_K_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEZEICHNUNG_KENNBUCHSTABE_K(2, "ENUMBezeichnung_Kennbuchstabe_K", "K"),

	/**
	 * The '<em><b>ENUM Bezeichnung Kennbuchstabe W</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEZEICHNUNG_KENNBUCHSTABE_W_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEZEICHNUNG_KENNBUCHSTABE_W(3, "ENUMBezeichnung_Kennbuchstabe_W", "W");

	/**
	 * The '<em><b>ENUM Bezeichnung Kennbuchstabe B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEZEICHNUNG_KENNBUCHSTABE_B
	 * @model name="ENUMBezeichnung_Kennbuchstabe_B" literal="B"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEZEICHNUNG_KENNBUCHSTABE_B_VALUE = 0;

	/**
	 * The '<em><b>ENUM Bezeichnung Kennbuchstabe G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEZEICHNUNG_KENNBUCHSTABE_G
	 * @model name="ENUMBezeichnung_Kennbuchstabe_G" literal="G"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEZEICHNUNG_KENNBUCHSTABE_G_VALUE = 1;

	/**
	 * The '<em><b>ENUM Bezeichnung Kennbuchstabe K</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEZEICHNUNG_KENNBUCHSTABE_K
	 * @model name="ENUMBezeichnung_Kennbuchstabe_K" literal="K"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEZEICHNUNG_KENNBUCHSTABE_K_VALUE = 2;

	/**
	 * The '<em><b>ENUM Bezeichnung Kennbuchstabe W</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEZEICHNUNG_KENNBUCHSTABE_W
	 * @model name="ENUMBezeichnung_Kennbuchstabe_W" literal="W"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEZEICHNUNG_KENNBUCHSTABE_W_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Bezeichnung Kennbuchstabe</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMBezeichnungKennbuchstabe[] VALUES_ARRAY =
		new ENUMBezeichnungKennbuchstabe[] {
			ENUM_BEZEICHNUNG_KENNBUCHSTABE_B,
			ENUM_BEZEICHNUNG_KENNBUCHSTABE_G,
			ENUM_BEZEICHNUNG_KENNBUCHSTABE_K,
			ENUM_BEZEICHNUNG_KENNBUCHSTABE_W,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Bezeichnung Kennbuchstabe</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMBezeichnungKennbuchstabe> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Bezeichnung Kennbuchstabe</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBezeichnungKennbuchstabe get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBezeichnungKennbuchstabe result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Bezeichnung Kennbuchstabe</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBezeichnungKennbuchstabe getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBezeichnungKennbuchstabe result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Bezeichnung Kennbuchstabe</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBezeichnungKennbuchstabe get(int value) {
		switch (value) {
			case ENUM_BEZEICHNUNG_KENNBUCHSTABE_B_VALUE: return ENUM_BEZEICHNUNG_KENNBUCHSTABE_B;
			case ENUM_BEZEICHNUNG_KENNBUCHSTABE_G_VALUE: return ENUM_BEZEICHNUNG_KENNBUCHSTABE_G;
			case ENUM_BEZEICHNUNG_KENNBUCHSTABE_K_VALUE: return ENUM_BEZEICHNUNG_KENNBUCHSTABE_K;
			case ENUM_BEZEICHNUNG_KENNBUCHSTABE_W_VALUE: return ENUM_BEZEICHNUNG_KENNBUCHSTABE_W;
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
	private ENUMBezeichnungKennbuchstabe(int value, String name, String literal) {
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
	
} //ENUMBezeichnungKennbuchstabe
