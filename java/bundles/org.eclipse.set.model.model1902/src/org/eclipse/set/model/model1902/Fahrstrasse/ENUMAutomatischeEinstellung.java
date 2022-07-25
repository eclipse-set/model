/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Fahrstrasse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Automatische Einstellung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getENUMAutomatischeEinstellung()
 * @model extendedMetaData="name='ENUMAutomatische_Einstellung'"
 * @generated
 */
public enum ENUMAutomatischeEinstellung implements Enumerator {
	/**
	 * The '<em><b>ENUM Automatische Einstellung SB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUTOMATISCHE_EINSTELLUNG_SB_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUTOMATISCHE_EINSTELLUNG_SB(0, "ENUMAutomatische_Einstellung_SB", "SB"),

	/**
	 * The '<em><b>ENUM Automatische Einstellung ZL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUTOMATISCHE_EINSTELLUNG_ZL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUTOMATISCHE_EINSTELLUNG_ZL(1, "ENUMAutomatische_Einstellung_ZL", "ZL");

	/**
	 * The '<em><b>ENUM Automatische Einstellung SB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUTOMATISCHE_EINSTELLUNG_SB
	 * @model name="ENUMAutomatische_Einstellung_SB" literal="SB"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUTOMATISCHE_EINSTELLUNG_SB_VALUE = 0;

	/**
	 * The '<em><b>ENUM Automatische Einstellung ZL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUTOMATISCHE_EINSTELLUNG_ZL
	 * @model name="ENUMAutomatische_Einstellung_ZL" literal="ZL"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUTOMATISCHE_EINSTELLUNG_ZL_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUM Automatische Einstellung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMAutomatischeEinstellung[] VALUES_ARRAY =
		new ENUMAutomatischeEinstellung[] {
			ENUM_AUTOMATISCHE_EINSTELLUNG_SB,
			ENUM_AUTOMATISCHE_EINSTELLUNG_ZL,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Automatische Einstellung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMAutomatischeEinstellung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Automatische Einstellung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAutomatischeEinstellung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAutomatischeEinstellung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Automatische Einstellung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAutomatischeEinstellung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAutomatischeEinstellung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Automatische Einstellung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAutomatischeEinstellung get(int value) {
		switch (value) {
			case ENUM_AUTOMATISCHE_EINSTELLUNG_SB_VALUE: return ENUM_AUTOMATISCHE_EINSTELLUNG_SB;
			case ENUM_AUTOMATISCHE_EINSTELLUNG_ZL_VALUE: return ENUM_AUTOMATISCHE_EINSTELLUNG_ZL;
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
	private ENUMAutomatischeEinstellung(int value, String name, String literal) {
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
	
} //ENUMAutomatischeEinstellung
