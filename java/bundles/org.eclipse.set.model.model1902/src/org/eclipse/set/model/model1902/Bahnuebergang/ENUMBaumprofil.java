/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Baumprofil</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getENUMBaumprofil()
 * @model extendedMetaData="name='ENUMBaumprofil'"
 * @generated
 */
public enum ENUMBaumprofil implements Enumerator {
	/**
	 * The '<em><b>ENUM Baumprofil Rechteck</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BAUMPROFIL_RECHTECK_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BAUMPROFIL_RECHTECK(0, "ENUMBaumprofil_Rechteck", "Rechteck"),

	/**
	 * The '<em><b>ENUM Baumprofil rund</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BAUMPROFIL_RUND_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BAUMPROFIL_RUND(1, "ENUMBaumprofil_rund", "rund"),

	/**
	 * The '<em><b>ENUM Baumprofil sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BAUMPROFIL_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BAUMPROFIL_SONSTIGE(2, "ENUMBaumprofil_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Baumprofil Rechteck</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BAUMPROFIL_RECHTECK
	 * @model name="ENUMBaumprofil_Rechteck" literal="Rechteck"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BAUMPROFIL_RECHTECK_VALUE = 0;

	/**
	 * The '<em><b>ENUM Baumprofil rund</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BAUMPROFIL_RUND
	 * @model name="ENUMBaumprofil_rund" literal="rund"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BAUMPROFIL_RUND_VALUE = 1;

	/**
	 * The '<em><b>ENUM Baumprofil sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BAUMPROFIL_SONSTIGE
	 * @model name="ENUMBaumprofil_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BAUMPROFIL_SONSTIGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Baumprofil</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMBaumprofil[] VALUES_ARRAY =
		new ENUMBaumprofil[] {
			ENUM_BAUMPROFIL_RECHTECK,
			ENUM_BAUMPROFIL_RUND,
			ENUM_BAUMPROFIL_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Baumprofil</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMBaumprofil> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Baumprofil</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBaumprofil get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBaumprofil result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Baumprofil</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBaumprofil getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBaumprofil result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Baumprofil</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBaumprofil get(int value) {
		switch (value) {
			case ENUM_BAUMPROFIL_RECHTECK_VALUE: return ENUM_BAUMPROFIL_RECHTECK;
			case ENUM_BAUMPROFIL_RUND_VALUE: return ENUM_BAUMPROFIL_RUND;
			case ENUM_BAUMPROFIL_SONSTIGE_VALUE: return ENUM_BAUMPROFIL_SONSTIGE;
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
	private ENUMBaumprofil(int value, String name, String literal) {
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
	
} //ENUMBaumprofil
