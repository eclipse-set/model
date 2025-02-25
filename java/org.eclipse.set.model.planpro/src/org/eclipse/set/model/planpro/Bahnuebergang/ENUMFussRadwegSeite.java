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
 * A representation of the literals of the enumeration '<em><b>ENUM Fuss Radweg Seite</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getENUMFussRadwegSeite()
 * @model extendedMetaData="name='ENUMFuss_Radweg_Seite'"
 * @generated
 */
public enum ENUMFussRadwegSeite implements Enumerator {
	/**
	 * The '<em><b>ENUM Fuss Radweg Seite beidseitig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUSS_RADWEG_SEITE_BEIDSEITIG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FUSS_RADWEG_SEITE_BEIDSEITIG(0, "ENUMFuss_Radweg_Seite_beidseitig", "beidseitig"),

	/**
	 * The '<em><b>ENUM Fuss Radweg Seite Quadrant 12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUSS_RADWEG_SEITE_QUADRANT_12_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FUSS_RADWEG_SEITE_QUADRANT_12(1, "ENUMFuss_Radweg_Seite_Quadrant_1_2", "Quadrant_1_2"),

	/**
	 * The '<em><b>ENUM Fuss Radweg Seite Quadrant 34</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUSS_RADWEG_SEITE_QUADRANT_34_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_FUSS_RADWEG_SEITE_QUADRANT_34(2, "ENUMFuss_Radweg_Seite_Quadrant_3_4", "Quadrant_3_4");

	/**
	 * The '<em><b>ENUM Fuss Radweg Seite beidseitig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUSS_RADWEG_SEITE_BEIDSEITIG
	 * @model name="ENUMFuss_Radweg_Seite_beidseitig" literal="beidseitig"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FUSS_RADWEG_SEITE_BEIDSEITIG_VALUE = 0;

	/**
	 * The '<em><b>ENUM Fuss Radweg Seite Quadrant 12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUSS_RADWEG_SEITE_QUADRANT_12
	 * @model name="ENUMFuss_Radweg_Seite_Quadrant_1_2" literal="Quadrant_1_2"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FUSS_RADWEG_SEITE_QUADRANT_12_VALUE = 1;

	/**
	 * The '<em><b>ENUM Fuss Radweg Seite Quadrant 34</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_FUSS_RADWEG_SEITE_QUADRANT_34
	 * @model name="ENUMFuss_Radweg_Seite_Quadrant_3_4" literal="Quadrant_3_4"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_FUSS_RADWEG_SEITE_QUADRANT_34_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Fuss Radweg Seite</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMFussRadwegSeite[] VALUES_ARRAY =
		new ENUMFussRadwegSeite[] {
			ENUM_FUSS_RADWEG_SEITE_BEIDSEITIG,
			ENUM_FUSS_RADWEG_SEITE_QUADRANT_12,
			ENUM_FUSS_RADWEG_SEITE_QUADRANT_34,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Fuss Radweg Seite</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMFussRadwegSeite> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Fuss Radweg Seite</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFussRadwegSeite get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFussRadwegSeite result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Fuss Radweg Seite</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFussRadwegSeite getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFussRadwegSeite result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Fuss Radweg Seite</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFussRadwegSeite get(int value) {
		switch (value) {
			case ENUM_FUSS_RADWEG_SEITE_BEIDSEITIG_VALUE: return ENUM_FUSS_RADWEG_SEITE_BEIDSEITIG;
			case ENUM_FUSS_RADWEG_SEITE_QUADRANT_12_VALUE: return ENUM_FUSS_RADWEG_SEITE_QUADRANT_12;
			case ENUM_FUSS_RADWEG_SEITE_QUADRANT_34_VALUE: return ENUM_FUSS_RADWEG_SEITE_QUADRANT_34;
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
	private ENUMFussRadwegSeite(int value, String name, String literal) {
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
	
} //ENUMFussRadwegSeite
