/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Weichen_und_Gleissperren;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Elektrischer Antrieb Lage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getENUMElektrischerAntriebLage()
 * @model extendedMetaData="name='ENUMElektrischer_Antrieb_Lage'"
 * @generated
 */
public enum ENUMElektrischerAntriebLage implements Enumerator {
	/**
	 * The '<em><b>ENUM Elektrischer Antrieb Lage links</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ELEKTRISCHER_ANTRIEB_LAGE_LINKS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ELEKTRISCHER_ANTRIEB_LAGE_LINKS(0, "ENUMElektrischer_Antrieb_Lage_links", "links"),

	/**
	 * The '<em><b>ENUM Elektrischer Antrieb Lage mittig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ELEKTRISCHER_ANTRIEB_LAGE_MITTIG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ELEKTRISCHER_ANTRIEB_LAGE_MITTIG(1, "ENUMElektrischer_Antrieb_Lage_mittig", "mittig"),

	/**
	 * The '<em><b>ENUM Elektrischer Antrieb Lage rechts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ELEKTRISCHER_ANTRIEB_LAGE_RECHTS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ELEKTRISCHER_ANTRIEB_LAGE_RECHTS(2, "ENUMElektrischer_Antrieb_Lage_rechts", "rechts"),

	/**
	 * The '<em><b>ENUM Elektrischer Antrieb Lage sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ELEKTRISCHER_ANTRIEB_LAGE_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ELEKTRISCHER_ANTRIEB_LAGE_SONSTIGE(3, "ENUMElektrischer_Antrieb_Lage_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Elektrischer Antrieb Lage links</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ELEKTRISCHER_ANTRIEB_LAGE_LINKS
	 * @model name="ENUMElektrischer_Antrieb_Lage_links" literal="links"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ELEKTRISCHER_ANTRIEB_LAGE_LINKS_VALUE = 0;

	/**
	 * The '<em><b>ENUM Elektrischer Antrieb Lage mittig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ELEKTRISCHER_ANTRIEB_LAGE_MITTIG
	 * @model name="ENUMElektrischer_Antrieb_Lage_mittig" literal="mittig"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ELEKTRISCHER_ANTRIEB_LAGE_MITTIG_VALUE = 1;

	/**
	 * The '<em><b>ENUM Elektrischer Antrieb Lage rechts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ELEKTRISCHER_ANTRIEB_LAGE_RECHTS
	 * @model name="ENUMElektrischer_Antrieb_Lage_rechts" literal="rechts"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ELEKTRISCHER_ANTRIEB_LAGE_RECHTS_VALUE = 2;

	/**
	 * The '<em><b>ENUM Elektrischer Antrieb Lage sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ELEKTRISCHER_ANTRIEB_LAGE_SONSTIGE
	 * @model name="ENUMElektrischer_Antrieb_Lage_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ELEKTRISCHER_ANTRIEB_LAGE_SONSTIGE_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Elektrischer Antrieb Lage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMElektrischerAntriebLage[] VALUES_ARRAY =
		new ENUMElektrischerAntriebLage[] {
			ENUM_ELEKTRISCHER_ANTRIEB_LAGE_LINKS,
			ENUM_ELEKTRISCHER_ANTRIEB_LAGE_MITTIG,
			ENUM_ELEKTRISCHER_ANTRIEB_LAGE_RECHTS,
			ENUM_ELEKTRISCHER_ANTRIEB_LAGE_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Elektrischer Antrieb Lage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMElektrischerAntriebLage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Elektrischer Antrieb Lage</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMElektrischerAntriebLage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMElektrischerAntriebLage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Elektrischer Antrieb Lage</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMElektrischerAntriebLage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMElektrischerAntriebLage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Elektrischer Antrieb Lage</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMElektrischerAntriebLage get(int value) {
		switch (value) {
			case ENUM_ELEKTRISCHER_ANTRIEB_LAGE_LINKS_VALUE: return ENUM_ELEKTRISCHER_ANTRIEB_LAGE_LINKS;
			case ENUM_ELEKTRISCHER_ANTRIEB_LAGE_MITTIG_VALUE: return ENUM_ELEKTRISCHER_ANTRIEB_LAGE_MITTIG;
			case ENUM_ELEKTRISCHER_ANTRIEB_LAGE_RECHTS_VALUE: return ENUM_ELEKTRISCHER_ANTRIEB_LAGE_RECHTS;
			case ENUM_ELEKTRISCHER_ANTRIEB_LAGE_SONSTIGE_VALUE: return ENUM_ELEKTRISCHER_ANTRIEB_LAGE_SONSTIGE;
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
	private ENUMElektrischerAntriebLage(int value, String name, String literal) {
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
	
} //ENUMElektrischerAntriebLage
