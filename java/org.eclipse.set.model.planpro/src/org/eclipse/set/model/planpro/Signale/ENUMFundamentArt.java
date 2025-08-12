/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Fundament Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getENUMFundamentArt()
 * @model extendedMetaData="name='ENUMFundament_Art'"
 * @generated
 */
public enum ENUMFundamentArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Fundament Art groß</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUNDAMENT_ART_GROSS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FUNDAMENT_ART_GROSS(0, "ENUMFundament_Art_groß", "gro\u00df"),

	/**
	 * The '<em><b>ENUM Fundament Art klein</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUNDAMENT_ART_KLEIN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FUNDAMENT_ART_KLEIN(1, "ENUMFundament_Art_klein", "klein"),

	/**
	 * The '<em><b>ENUM Fundament Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUNDAMENT_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FUNDAMENT_ART_SONSTIGE(2, "ENUMFundament_Art_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Fundament Art groß</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUNDAMENT_ART_GROSS
	 * @model name="ENUMFundament_Art_groß" literal="gro\337"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FUNDAMENT_ART_GROSS_VALUE = 0;

	/**
	 * The '<em><b>ENUM Fundament Art klein</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUNDAMENT_ART_KLEIN
	 * @model name="ENUMFundament_Art_klein" literal="klein"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FUNDAMENT_ART_KLEIN_VALUE = 1;

	/**
	 * The '<em><b>ENUM Fundament Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUNDAMENT_ART_SONSTIGE
	 * @model name="ENUMFundament_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FUNDAMENT_ART_SONSTIGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Fundament Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMFundamentArt[] VALUES_ARRAY =
		new ENUMFundamentArt[] {
			ENUM_FUNDAMENT_ART_GROSS,
			ENUM_FUNDAMENT_ART_KLEIN,
			ENUM_FUNDAMENT_ART_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Fundament Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMFundamentArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Fundament Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFundamentArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFundamentArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Fundament Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFundamentArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFundamentArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Fundament Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFundamentArt get(int value) {
		switch (value) {
			case ENUM_FUNDAMENT_ART_GROSS_VALUE: return ENUM_FUNDAMENT_ART_GROSS;
			case ENUM_FUNDAMENT_ART_KLEIN_VALUE: return ENUM_FUNDAMENT_ART_KLEIN;
			case ENUM_FUNDAMENT_ART_SONSTIGE_VALUE: return ENUM_FUNDAMENT_ART_SONSTIGE;
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
	private ENUMFundamentArt(int value, String name, String literal) {
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
	
} //ENUMFundamentArt
