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
 * A representation of the literals of the enumeration '<em><b>ENUMW Anschluss</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMWAnschluss()
 * @model extendedMetaData="name='ENUMW_Anschluss'"
 * @generated
 */
public enum ENUMWAnschluss implements Enumerator {
	/**
	 * The '<em><b>ENUMW Anschluss links</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMW_ANSCHLUSS_LINKS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMW_ANSCHLUSS_LINKS(0, "ENUMW_Anschluss_links", "links"),

	/**
	 * The '<em><b>ENUMW Anschluss rechts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMW_ANSCHLUSS_RECHTS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMW_ANSCHLUSS_RECHTS(1, "ENUMW_Anschluss_rechts", "rechts"),

	/**
	 * The '<em><b>ENUMW Anschluss Spitze</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMW_ANSCHLUSS_SPITZE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMW_ANSCHLUSS_SPITZE(2, "ENUMW_Anschluss_Spitze", "Spitze");

	/**
	 * The '<em><b>ENUMW Anschluss links</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMW_ANSCHLUSS_LINKS
	 * @model name="ENUMW_Anschluss_links" literal="links"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMW_ANSCHLUSS_LINKS_VALUE = 0;

	/**
	 * The '<em><b>ENUMW Anschluss rechts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMW_ANSCHLUSS_RECHTS
	 * @model name="ENUMW_Anschluss_rechts" literal="rechts"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMW_ANSCHLUSS_RECHTS_VALUE = 1;

	/**
	 * The '<em><b>ENUMW Anschluss Spitze</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMW_ANSCHLUSS_SPITZE
	 * @model name="ENUMW_Anschluss_Spitze" literal="Spitze"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMW_ANSCHLUSS_SPITZE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUMW Anschluss</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMWAnschluss[] VALUES_ARRAY =
		new ENUMWAnschluss[] {
			ENUMW_ANSCHLUSS_LINKS,
			ENUMW_ANSCHLUSS_RECHTS,
			ENUMW_ANSCHLUSS_SPITZE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMW Anschluss</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMWAnschluss> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMW Anschluss</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWAnschluss get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMWAnschluss result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMW Anschluss</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWAnschluss getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMWAnschluss result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMW Anschluss</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWAnschluss get(int value) {
		switch (value) {
			case ENUMW_ANSCHLUSS_LINKS_VALUE: return ENUMW_ANSCHLUSS_LINKS;
			case ENUMW_ANSCHLUSS_RECHTS_VALUE: return ENUMW_ANSCHLUSS_RECHTS;
			case ENUMW_ANSCHLUSS_SPITZE_VALUE: return ENUMW_ANSCHLUSS_SPITZE;
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
	private ENUMWAnschluss(int value, String name, String literal) {
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
	
} //ENUMWAnschluss
