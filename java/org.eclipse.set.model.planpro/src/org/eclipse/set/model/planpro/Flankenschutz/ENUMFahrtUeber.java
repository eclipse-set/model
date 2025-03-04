/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Flankenschutz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Fahrt Ueber</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getENUMFahrtUeber()
 * @model extendedMetaData="name='ENUMFahrt_Ueber'"
 * @generated
 */
public enum ENUMFahrtUeber implements Enumerator {
	/**
	 * The '<em><b>ENUM Fahrt Ueber links</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FAHRT_UEBER_LINKS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FAHRT_UEBER_LINKS(0, "ENUMFahrt_Ueber_links", "links"),

	/**
	 * The '<em><b>ENUM Fahrt Ueber rechts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FAHRT_UEBER_RECHTS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FAHRT_UEBER_RECHTS(1, "ENUMFahrt_Ueber_rechts", "rechts"),

	/**
	 * The '<em><b>ENUM Fahrt Ueber Spitze</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FAHRT_UEBER_SPITZE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FAHRT_UEBER_SPITZE(2, "ENUMFahrt_Ueber_Spitze", "Spitze");

	/**
	 * The '<em><b>ENUM Fahrt Ueber links</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FAHRT_UEBER_LINKS
	 * @model name="ENUMFahrt_Ueber_links" literal="links"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FAHRT_UEBER_LINKS_VALUE = 0;

	/**
	 * The '<em><b>ENUM Fahrt Ueber rechts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FAHRT_UEBER_RECHTS
	 * @model name="ENUMFahrt_Ueber_rechts" literal="rechts"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FAHRT_UEBER_RECHTS_VALUE = 1;

	/**
	 * The '<em><b>ENUM Fahrt Ueber Spitze</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FAHRT_UEBER_SPITZE
	 * @model name="ENUMFahrt_Ueber_Spitze" literal="Spitze"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FAHRT_UEBER_SPITZE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Fahrt Ueber</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMFahrtUeber[] VALUES_ARRAY =
		new ENUMFahrtUeber[] {
			ENUM_FAHRT_UEBER_LINKS,
			ENUM_FAHRT_UEBER_RECHTS,
			ENUM_FAHRT_UEBER_SPITZE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Fahrt Ueber</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMFahrtUeber> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Fahrt Ueber</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFahrtUeber get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFahrtUeber result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Fahrt Ueber</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFahrtUeber getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFahrtUeber result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Fahrt Ueber</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFahrtUeber get(int value) {
		switch (value) {
			case ENUM_FAHRT_UEBER_LINKS_VALUE: return ENUM_FAHRT_UEBER_LINKS;
			case ENUM_FAHRT_UEBER_RECHTS_VALUE: return ENUM_FAHRT_UEBER_RECHTS;
			case ENUM_FAHRT_UEBER_SPITZE_VALUE: return ENUM_FAHRT_UEBER_SPITZE;
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
	private ENUMFahrtUeber(int value, String name, String literal) {
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
	
} //ENUMFahrtUeber
