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
 * A representation of the literals of the enumeration '<em><b>ENUM Akustik Sonst</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getENUMAkustikSonst()
 * @model extendedMetaData="name='ENUMAkustik_Sonst'"
 * @generated
 */
public enum ENUMAkustikSonst implements Enumerator {
	/**
	 * The '<em><b>ENUM Akustik Sonst 5s</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AKUSTIK_SONST_5S_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AKUSTIK_SONST_5S(0, "ENUMAkustik_Sonst_5_s", "5_s"),

	/**
	 * The '<em><b>ENUM Akustik Sonst keine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AKUSTIK_SONST_KEINE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AKUSTIK_SONST_KEINE(1, "ENUMAkustik_Sonst_keine", "keine");

	/**
	 * The '<em><b>ENUM Akustik Sonst 5s</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AKUSTIK_SONST_5S
	 * @model name="ENUMAkustik_Sonst_5_s" literal="5_s"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AKUSTIK_SONST_5S_VALUE = 0;

	/**
	 * The '<em><b>ENUM Akustik Sonst keine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AKUSTIK_SONST_KEINE
	 * @model name="ENUMAkustik_Sonst_keine" literal="keine"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AKUSTIK_SONST_KEINE_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUM Akustik Sonst</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMAkustikSonst[] VALUES_ARRAY =
		new ENUMAkustikSonst[] {
			ENUM_AKUSTIK_SONST_5S,
			ENUM_AKUSTIK_SONST_KEINE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Akustik Sonst</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMAkustikSonst> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Akustik Sonst</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAkustikSonst get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAkustikSonst result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Akustik Sonst</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAkustikSonst getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAkustikSonst result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Akustik Sonst</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAkustikSonst get(int value) {
		switch (value) {
			case ENUM_AKUSTIK_SONST_5S_VALUE: return ENUM_AKUSTIK_SONST_5S;
			case ENUM_AKUSTIK_SONST_KEINE_VALUE: return ENUM_AKUSTIK_SONST_KEINE;
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
	private ENUMAkustikSonst(int value, String name, String literal) {
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
	
} //ENUMAkustikSonst
