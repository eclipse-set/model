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
 * A representation of the literals of the enumeration '<em><b>ENUM Aufloesung Ssp Zielgleis</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage#getENUMAufloesungSspZielgleis()
 * @model extendedMetaData="name='ENUMAufloesung_Ssp_Zielgleis'"
 * @generated
 */
public enum ENUMAufloesungSspZielgleis implements Enumerator {
	/**
	 * The '<em><b>ENUM Aufloesung Ssp Zielgleis besetzt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUFLOESUNG_SSP_ZIELGLEIS_BESETZT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUFLOESUNG_SSP_ZIELGLEIS_BESETZT(0, "ENUMAufloesung_Ssp_Zielgleis_besetzt", "besetzt"),

	/**
	 * The '<em><b>ENUM Aufloesung Ssp Zielgleis frei</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUFLOESUNG_SSP_ZIELGLEIS_FREI_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUFLOESUNG_SSP_ZIELGLEIS_FREI(1, "ENUMAufloesung_Ssp_Zielgleis_frei", "frei");

	/**
	 * The '<em><b>ENUM Aufloesung Ssp Zielgleis besetzt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUFLOESUNG_SSP_ZIELGLEIS_BESETZT
	 * @model name="ENUMAufloesung_Ssp_Zielgleis_besetzt" literal="besetzt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUFLOESUNG_SSP_ZIELGLEIS_BESETZT_VALUE = 0;

	/**
	 * The '<em><b>ENUM Aufloesung Ssp Zielgleis frei</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUFLOESUNG_SSP_ZIELGLEIS_FREI
	 * @model name="ENUMAufloesung_Ssp_Zielgleis_frei" literal="frei"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUFLOESUNG_SSP_ZIELGLEIS_FREI_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUM Aufloesung Ssp Zielgleis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMAufloesungSspZielgleis[] VALUES_ARRAY =
		new ENUMAufloesungSspZielgleis[] {
			ENUM_AUFLOESUNG_SSP_ZIELGLEIS_BESETZT,
			ENUM_AUFLOESUNG_SSP_ZIELGLEIS_FREI,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Aufloesung Ssp Zielgleis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMAufloesungSspZielgleis> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Aufloesung Ssp Zielgleis</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAufloesungSspZielgleis get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAufloesungSspZielgleis result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Aufloesung Ssp Zielgleis</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAufloesungSspZielgleis getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAufloesungSspZielgleis result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Aufloesung Ssp Zielgleis</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAufloesungSspZielgleis get(int value) {
		switch (value) {
			case ENUM_AUFLOESUNG_SSP_ZIELGLEIS_BESETZT_VALUE: return ENUM_AUFLOESUNG_SSP_ZIELGLEIS_BESETZT;
			case ENUM_AUFLOESUNG_SSP_ZIELGLEIS_FREI_VALUE: return ENUM_AUFLOESUNG_SSP_ZIELGLEIS_FREI;
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
	private ENUMAufloesungSspZielgleis(int value, String name, String literal) {
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
	
} //ENUMAufloesungSspZielgleis
