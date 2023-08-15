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
 * A representation of the literals of the enumeration '<em><b>ENUM Funktion Ohne Signal</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Signale.SignalePackage#getENUMFunktionOhneSignal()
 * @model extendedMetaData="name='ENUMFunktion_Ohne_Signal'"
 * @generated
 */
public enum ENUMFunktionOhneSignal implements Enumerator {
	/**
	 * The '<em><b>ENUM Funktion Ohne Signal RS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUNKTION_OHNE_SIGNAL_RS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FUNKTION_OHNE_SIGNAL_RS(0, "ENUMFunktion_Ohne_Signal_RS", "RS"),

	/**
	 * The '<em><b>ENUM Funktion Ohne Signal sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUNKTION_OHNE_SIGNAL_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FUNKTION_OHNE_SIGNAL_SONSTIGE(1, "ENUMFunktion_Ohne_Signal_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Funktion Ohne Signal ZS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUNKTION_OHNE_SIGNAL_ZS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FUNKTION_OHNE_SIGNAL_ZS(2, "ENUMFunktion_Ohne_Signal_ZS", "ZS");

	/**
	 * The '<em><b>ENUM Funktion Ohne Signal RS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUNKTION_OHNE_SIGNAL_RS
	 * @model name="ENUMFunktion_Ohne_Signal_RS" literal="RS"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FUNKTION_OHNE_SIGNAL_RS_VALUE = 0;

	/**
	 * The '<em><b>ENUM Funktion Ohne Signal sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUNKTION_OHNE_SIGNAL_SONSTIGE
	 * @model name="ENUMFunktion_Ohne_Signal_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FUNKTION_OHNE_SIGNAL_SONSTIGE_VALUE = 1;

	/**
	 * The '<em><b>ENUM Funktion Ohne Signal ZS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUNKTION_OHNE_SIGNAL_ZS
	 * @model name="ENUMFunktion_Ohne_Signal_ZS" literal="ZS"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FUNKTION_OHNE_SIGNAL_ZS_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Funktion Ohne Signal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMFunktionOhneSignal[] VALUES_ARRAY =
		new ENUMFunktionOhneSignal[] {
			ENUM_FUNKTION_OHNE_SIGNAL_RS,
			ENUM_FUNKTION_OHNE_SIGNAL_SONSTIGE,
			ENUM_FUNKTION_OHNE_SIGNAL_ZS,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Funktion Ohne Signal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMFunktionOhneSignal> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Funktion Ohne Signal</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFunktionOhneSignal get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFunktionOhneSignal result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Funktion Ohne Signal</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFunktionOhneSignal getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFunktionOhneSignal result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Funktion Ohne Signal</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFunktionOhneSignal get(int value) {
		switch (value) {
			case ENUM_FUNKTION_OHNE_SIGNAL_RS_VALUE: return ENUM_FUNKTION_OHNE_SIGNAL_RS;
			case ENUM_FUNKTION_OHNE_SIGNAL_SONSTIGE_VALUE: return ENUM_FUNKTION_OHNE_SIGNAL_SONSTIGE;
			case ENUM_FUNKTION_OHNE_SIGNAL_ZS_VALUE: return ENUM_FUNKTION_OHNE_SIGNAL_ZS;
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
	private ENUMFunktionOhneSignal(int value, String name, String literal) {
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
	
} //ENUMFunktionOhneSignal
