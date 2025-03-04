/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMFT Hinweis Funktion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMFTHinweisFunktion()
 * @model extendedMetaData="name='ENUMFT_Hinweis_Funktion'"
 * @generated
 */
public enum ENUMFTHinweisFunktion implements Enumerator {
	/**
	 * The '<em><b>ENUMFT Hinweis Funktion Ortung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFT_HINWEIS_FUNKTION_ORTUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFT_HINWEIS_FUNKTION_ORTUNG(0, "ENUMFT_Hinweis_Funktion_Ortung", "Ortung"),

	/**
	 * The '<em><b>ENUMFT Hinweis Funktion sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFT_HINWEIS_FUNKTION_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFT_HINWEIS_FUNKTION_SONSTIGE(1, "ENUMFT_Hinweis_Funktion_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUMFT Hinweis Funktion ZBS Ende</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFT_HINWEIS_FUNKTION_ZBS_ENDE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFT_HINWEIS_FUNKTION_ZBS_ENDE(2, "ENUMFT_Hinweis_Funktion_ZBS_Ende", "ZBS Ende");

	/**
	 * The '<em><b>ENUMFT Hinweis Funktion Ortung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFT_HINWEIS_FUNKTION_ORTUNG
	 * @model name="ENUMFT_Hinweis_Funktion_Ortung" literal="Ortung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFT_HINWEIS_FUNKTION_ORTUNG_VALUE = 0;

	/**
	 * The '<em><b>ENUMFT Hinweis Funktion sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFT_HINWEIS_FUNKTION_SONSTIGE
	 * @model name="ENUMFT_Hinweis_Funktion_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFT_HINWEIS_FUNKTION_SONSTIGE_VALUE = 1;

	/**
	 * The '<em><b>ENUMFT Hinweis Funktion ZBS Ende</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFT_HINWEIS_FUNKTION_ZBS_ENDE
	 * @model name="ENUMFT_Hinweis_Funktion_ZBS_Ende" literal="ZBS Ende"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFT_HINWEIS_FUNKTION_ZBS_ENDE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUMFT Hinweis Funktion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMFTHinweisFunktion[] VALUES_ARRAY =
		new ENUMFTHinweisFunktion[] {
			ENUMFT_HINWEIS_FUNKTION_ORTUNG,
			ENUMFT_HINWEIS_FUNKTION_SONSTIGE,
			ENUMFT_HINWEIS_FUNKTION_ZBS_ENDE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMFT Hinweis Funktion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMFTHinweisFunktion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMFT Hinweis Funktion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFTHinweisFunktion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFTHinweisFunktion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMFT Hinweis Funktion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFTHinweisFunktion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFTHinweisFunktion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMFT Hinweis Funktion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFTHinweisFunktion get(int value) {
		switch (value) {
			case ENUMFT_HINWEIS_FUNKTION_ORTUNG_VALUE: return ENUMFT_HINWEIS_FUNKTION_ORTUNG;
			case ENUMFT_HINWEIS_FUNKTION_SONSTIGE_VALUE: return ENUMFT_HINWEIS_FUNKTION_SONSTIGE;
			case ENUMFT_HINWEIS_FUNKTION_ZBS_ENDE_VALUE: return ENUMFT_HINWEIS_FUNKTION_ZBS_ENDE;
			default: return null;
		}
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
	private ENUMFTHinweisFunktion(int value, String name, String literal) {
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
	
} //ENUMFTHinweisFunktion
