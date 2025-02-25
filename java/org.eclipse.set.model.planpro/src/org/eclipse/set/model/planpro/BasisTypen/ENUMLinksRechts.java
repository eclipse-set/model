/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.BasisTypen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Links Rechts</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Attribute dieses Basistyps können den ENUM-Wert 'links' oder 'rechts' annehmen.
 * <!-- end-model-doc -->
 * @see org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage#getENUMLinksRechts()
 * @model extendedMetaData="name='ENUMLinksRechts'"
 * @generated
 */
public enum ENUMLinksRechts implements Enumerator {
	/**
	 * The '<em><b>ENUM Links Rechts links</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LINKS_RECHTS_LINKS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LINKS_RECHTS_LINKS(0, "ENUMLinksRechts_links", "links"),

	/**
	 * The '<em><b>ENUM Links Rechts rechts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LINKS_RECHTS_RECHTS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LINKS_RECHTS_RECHTS(1, "ENUMLinksRechts_rechts", "rechts");

	/**
	 * The '<em><b>ENUM Links Rechts links</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LINKS_RECHTS_LINKS
	 * @model name="ENUMLinksRechts_links" literal="links"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LINKS_RECHTS_LINKS_VALUE = 0;

	/**
	 * The '<em><b>ENUM Links Rechts rechts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LINKS_RECHTS_RECHTS
	 * @model name="ENUMLinksRechts_rechts" literal="rechts"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LINKS_RECHTS_RECHTS_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUM Links Rechts</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMLinksRechts[] VALUES_ARRAY =
		new ENUMLinksRechts[] {
			ENUM_LINKS_RECHTS_LINKS,
			ENUM_LINKS_RECHTS_RECHTS,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Links Rechts</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMLinksRechts> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Links Rechts</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLinksRechts get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMLinksRechts result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Links Rechts</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLinksRechts getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMLinksRechts result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Links Rechts</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLinksRechts get(int value) {
		switch (value) {
			case ENUM_LINKS_RECHTS_LINKS_VALUE: return ENUM_LINKS_RECHTS_LINKS;
			case ENUM_LINKS_RECHTS_RECHTS_VALUE: return ENUM_LINKS_RECHTS_RECHTS;
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
	private ENUMLinksRechts(int value, String name, String literal) {
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
	
} //ENUMLinksRechts
