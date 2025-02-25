/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Hp Ersatzstecker</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * \"sonstige\"==nur BÜ-Ersatzstecker sollen abgebildet werden; \"Abhaengigkeit_aufgehoben\"==Ersatzstecker an der Hp-Schnittstelle im Stellwerk hebt die Hp-Abhängigkeit auf, sodass eine Fahrstraße über den BÜ eingestellt werden kann, ohne dass der BÜ dabei berücksichtigt wird
 * <!-- end-model-doc -->
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getENUMHpErsatzstecker()
 * @model extendedMetaData="name='ENUMHp_Ersatzstecker'"
 * @generated
 */
public enum ENUMHpErsatzstecker implements Enumerator {
	/**
	 * The '<em><b>ENUM Hp Ersatzstecker Abhaengigkeit aufgehoben</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_HP_ERSATZSTECKER_ABHAENGIGKEIT_AUFGEHOBEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_HP_ERSATZSTECKER_ABHAENGIGKEIT_AUFGEHOBEN(0, "ENUMHp_Ersatzstecker_Abhaengigkeit_aufgehoben", "Abhaengigkeit_aufgehoben"),

	/**
	 * The '<em><b>ENUM Hp Ersatzstecker sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_HP_ERSATZSTECKER_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_HP_ERSATZSTECKER_SONSTIGE(1, "ENUMHp_Ersatzstecker_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Hp Ersatzstecker Abhaengigkeit aufgehoben</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_HP_ERSATZSTECKER_ABHAENGIGKEIT_AUFGEHOBEN
	 * @model name="ENUMHp_Ersatzstecker_Abhaengigkeit_aufgehoben" literal="Abhaengigkeit_aufgehoben"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_HP_ERSATZSTECKER_ABHAENGIGKEIT_AUFGEHOBEN_VALUE = 0;

	/**
	 * The '<em><b>ENUM Hp Ersatzstecker sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_HP_ERSATZSTECKER_SONSTIGE
	 * @model name="ENUMHp_Ersatzstecker_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_HP_ERSATZSTECKER_SONSTIGE_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUM Hp Ersatzstecker</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMHpErsatzstecker[] VALUES_ARRAY =
		new ENUMHpErsatzstecker[] {
			ENUM_HP_ERSATZSTECKER_ABHAENGIGKEIT_AUFGEHOBEN,
			ENUM_HP_ERSATZSTECKER_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Hp Ersatzstecker</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMHpErsatzstecker> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Hp Ersatzstecker</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMHpErsatzstecker get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMHpErsatzstecker result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Hp Ersatzstecker</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMHpErsatzstecker getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMHpErsatzstecker result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Hp Ersatzstecker</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMHpErsatzstecker get(int value) {
		switch (value) {
			case ENUM_HP_ERSATZSTECKER_ABHAENGIGKEIT_AUFGEHOBEN_VALUE: return ENUM_HP_ERSATZSTECKER_ABHAENGIGKEIT_AUFGEHOBEN;
			case ENUM_HP_ERSATZSTECKER_SONSTIGE_VALUE: return ENUM_HP_ERSATZSTECKER_SONSTIGE;
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
	private ENUMHpErsatzstecker(int value, String name, String literal) {
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
	
} //ENUMHpErsatzstecker
