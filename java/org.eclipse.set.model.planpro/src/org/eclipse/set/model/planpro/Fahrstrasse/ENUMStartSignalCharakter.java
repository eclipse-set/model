/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Start Signal Charakter</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage#getENUMStartSignalCharakter()
 * @model extendedMetaData="name='ENUMStart_Signal_Charakter'"
 * @generated
 */
public enum ENUMStartSignalCharakter implements Enumerator {
	/**
	 * The '<em><b>ENUM Start Signal Charakter Ausfahr Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_START_SIGNAL_CHARAKTER_AUSFAHR_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_START_SIGNAL_CHARAKTER_AUSFAHR_SIGNAL(0, "ENUMStart_Signal_Charakter_Ausfahr_Signal", "Ausfahr_Signal"),

	/**
	 * The '<em><b>ENUM Start Signal Charakter Ausfahr Signal nachgelagert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_START_SIGNAL_CHARAKTER_AUSFAHR_SIGNAL_NACHGELAGERT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_START_SIGNAL_CHARAKTER_AUSFAHR_SIGNAL_NACHGELAGERT(1, "ENUMStart_Signal_Charakter_Ausfahr_Signal_nachgelagert", "Ausfahr_Signal_nachgelagert"),

	/**
	 * The '<em><b>ENUM Start Signal Charakter Block Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_START_SIGNAL_CHARAKTER_BLOCK_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_START_SIGNAL_CHARAKTER_BLOCK_SIGNAL(2, "ENUMStart_Signal_Charakter_Block_Signal", "Block_Signal"),

	/**
	 * The '<em><b>ENUM Start Signal Charakter Einfahr Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_START_SIGNAL_CHARAKTER_EINFAHR_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_START_SIGNAL_CHARAKTER_EINFAHR_SIGNAL(3, "ENUMStart_Signal_Charakter_Einfahr_Signal", "Einfahr_Signal"),

	/**
	 * The '<em><b>ENUM Start Signal Charakter Nachrueck Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_START_SIGNAL_CHARAKTER_NACHRUECK_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_START_SIGNAL_CHARAKTER_NACHRUECK_SIGNAL(4, "ENUMStart_Signal_Charakter_Nachrueck_Signal", "Nachrueck_Signal");

	/**
	 * The '<em><b>ENUM Start Signal Charakter Ausfahr Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_START_SIGNAL_CHARAKTER_AUSFAHR_SIGNAL
	 * @model name="ENUMStart_Signal_Charakter_Ausfahr_Signal" literal="Ausfahr_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_START_SIGNAL_CHARAKTER_AUSFAHR_SIGNAL_VALUE = 0;

	/**
	 * The '<em><b>ENUM Start Signal Charakter Ausfahr Signal nachgelagert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_START_SIGNAL_CHARAKTER_AUSFAHR_SIGNAL_NACHGELAGERT
	 * @model name="ENUMStart_Signal_Charakter_Ausfahr_Signal_nachgelagert" literal="Ausfahr_Signal_nachgelagert"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_START_SIGNAL_CHARAKTER_AUSFAHR_SIGNAL_NACHGELAGERT_VALUE = 1;

	/**
	 * The '<em><b>ENUM Start Signal Charakter Block Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_START_SIGNAL_CHARAKTER_BLOCK_SIGNAL
	 * @model name="ENUMStart_Signal_Charakter_Block_Signal" literal="Block_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_START_SIGNAL_CHARAKTER_BLOCK_SIGNAL_VALUE = 2;

	/**
	 * The '<em><b>ENUM Start Signal Charakter Einfahr Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_START_SIGNAL_CHARAKTER_EINFAHR_SIGNAL
	 * @model name="ENUMStart_Signal_Charakter_Einfahr_Signal" literal="Einfahr_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_START_SIGNAL_CHARAKTER_EINFAHR_SIGNAL_VALUE = 3;

	/**
	 * The '<em><b>ENUM Start Signal Charakter Nachrueck Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_START_SIGNAL_CHARAKTER_NACHRUECK_SIGNAL
	 * @model name="ENUMStart_Signal_Charakter_Nachrueck_Signal" literal="Nachrueck_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_START_SIGNAL_CHARAKTER_NACHRUECK_SIGNAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>ENUM Start Signal Charakter</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMStartSignalCharakter[] VALUES_ARRAY =
		new ENUMStartSignalCharakter[] {
			ENUM_START_SIGNAL_CHARAKTER_AUSFAHR_SIGNAL,
			ENUM_START_SIGNAL_CHARAKTER_AUSFAHR_SIGNAL_NACHGELAGERT,
			ENUM_START_SIGNAL_CHARAKTER_BLOCK_SIGNAL,
			ENUM_START_SIGNAL_CHARAKTER_EINFAHR_SIGNAL,
			ENUM_START_SIGNAL_CHARAKTER_NACHRUECK_SIGNAL,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Start Signal Charakter</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMStartSignalCharakter> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Start Signal Charakter</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMStartSignalCharakter get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMStartSignalCharakter result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Start Signal Charakter</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMStartSignalCharakter getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMStartSignalCharakter result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Start Signal Charakter</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMStartSignalCharakter get(int value) {
		switch (value) {
			case ENUM_START_SIGNAL_CHARAKTER_AUSFAHR_SIGNAL_VALUE: return ENUM_START_SIGNAL_CHARAKTER_AUSFAHR_SIGNAL;
			case ENUM_START_SIGNAL_CHARAKTER_AUSFAHR_SIGNAL_NACHGELAGERT_VALUE: return ENUM_START_SIGNAL_CHARAKTER_AUSFAHR_SIGNAL_NACHGELAGERT;
			case ENUM_START_SIGNAL_CHARAKTER_BLOCK_SIGNAL_VALUE: return ENUM_START_SIGNAL_CHARAKTER_BLOCK_SIGNAL;
			case ENUM_START_SIGNAL_CHARAKTER_EINFAHR_SIGNAL_VALUE: return ENUM_START_SIGNAL_CHARAKTER_EINFAHR_SIGNAL;
			case ENUM_START_SIGNAL_CHARAKTER_NACHRUECK_SIGNAL_VALUE: return ENUM_START_SIGNAL_CHARAKTER_NACHRUECK_SIGNAL;
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
	private ENUMStartSignalCharakter(int value, String name, String literal) {
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
	
} //ENUMStartSignalCharakter
