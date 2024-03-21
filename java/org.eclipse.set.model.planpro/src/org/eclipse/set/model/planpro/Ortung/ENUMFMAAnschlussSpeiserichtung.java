/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ortung;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMFMA Anschluss Speiserichtung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getENUMFMAAnschlussSpeiserichtung()
 * @model extendedMetaData="name='ENUMFMA_Anschluss_Speiserichtung'"
 * @generated
 */
public enum ENUMFMAAnschlussSpeiserichtung implements Enumerator {
	/**
	 * The '<em><b>ENUMFMA Anschluss Speiserichtung Ausspeisung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_AUSSPEISUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_AUSSPEISUNG(0, "ENUMFMA_Anschluss_Speiserichtung_Ausspeisung", "Ausspeisung"),

	/**
	 * The '<em><b>ENUMFMA Anschluss Speiserichtung Einspeisung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_EINSPEISUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_EINSPEISUNG(1, "ENUMFMA_Anschluss_Speiserichtung_Einspeisung", "Einspeisung");

	/**
	 * The '<em><b>ENUMFMA Anschluss Speiserichtung Ausspeisung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_AUSSPEISUNG
	 * @model name="ENUMFMA_Anschluss_Speiserichtung_Ausspeisung" literal="Ausspeisung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_AUSSPEISUNG_VALUE = 0;

	/**
	 * The '<em><b>ENUMFMA Anschluss Speiserichtung Einspeisung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_EINSPEISUNG
	 * @model name="ENUMFMA_Anschluss_Speiserichtung_Einspeisung" literal="Einspeisung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_EINSPEISUNG_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUMFMA Anschluss Speiserichtung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMFMAAnschlussSpeiserichtung[] VALUES_ARRAY =
		new ENUMFMAAnschlussSpeiserichtung[] {
			ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_AUSSPEISUNG,
			ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_EINSPEISUNG,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMFMA Anschluss Speiserichtung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMFMAAnschlussSpeiserichtung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMFMA Anschluss Speiserichtung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFMAAnschlussSpeiserichtung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFMAAnschlussSpeiserichtung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMFMA Anschluss Speiserichtung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFMAAnschlussSpeiserichtung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFMAAnschlussSpeiserichtung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMFMA Anschluss Speiserichtung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFMAAnschlussSpeiserichtung get(int value) {
		switch (value) {
			case ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_AUSSPEISUNG_VALUE: return ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_AUSSPEISUNG;
			case ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_EINSPEISUNG_VALUE: return ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_EINSPEISUNG;
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
	private ENUMFMAAnschlussSpeiserichtung(int value, String name, String literal) {
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
	
} //ENUMFMAAnschlussSpeiserichtung
