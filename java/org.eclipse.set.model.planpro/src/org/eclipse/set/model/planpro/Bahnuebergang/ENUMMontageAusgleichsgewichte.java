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
 * A representation of the literals of the enumeration '<em><b>ENUM Montage Ausgleichsgewichte</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getENUMMontageAusgleichsgewichte()
 * @model extendedMetaData="name='ENUMMontage_Ausgleichsgewichte'"
 * @generated
 */
public enum ENUMMontageAusgleichsgewichte implements Enumerator {
	/**
	 * The '<em><b>ENUM Montage Ausgleichsgewichte beidseitig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MONTAGE_AUSGLEICHSGEWICHTE_BEIDSEITIG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MONTAGE_AUSGLEICHSGEWICHTE_BEIDSEITIG(0, "ENUMMontage_Ausgleichsgewichte_beidseitig", "beidseitig"),

	/**
	 * The '<em><b>ENUM Montage Ausgleichsgewichte einseitig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MONTAGE_AUSGLEICHSGEWICHTE_EINSEITIG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MONTAGE_AUSGLEICHSGEWICHTE_EINSEITIG(1, "ENUMMontage_Ausgleichsgewichte_einseitig", "einseitig");

	/**
	 * The '<em><b>ENUM Montage Ausgleichsgewichte beidseitig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MONTAGE_AUSGLEICHSGEWICHTE_BEIDSEITIG
	 * @model name="ENUMMontage_Ausgleichsgewichte_beidseitig" literal="beidseitig"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MONTAGE_AUSGLEICHSGEWICHTE_BEIDSEITIG_VALUE = 0;

	/**
	 * The '<em><b>ENUM Montage Ausgleichsgewichte einseitig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MONTAGE_AUSGLEICHSGEWICHTE_EINSEITIG
	 * @model name="ENUMMontage_Ausgleichsgewichte_einseitig" literal="einseitig"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MONTAGE_AUSGLEICHSGEWICHTE_EINSEITIG_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUM Montage Ausgleichsgewichte</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMMontageAusgleichsgewichte[] VALUES_ARRAY =
		new ENUMMontageAusgleichsgewichte[] {
			ENUM_MONTAGE_AUSGLEICHSGEWICHTE_BEIDSEITIG,
			ENUM_MONTAGE_AUSGLEICHSGEWICHTE_EINSEITIG,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Montage Ausgleichsgewichte</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMMontageAusgleichsgewichte> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Montage Ausgleichsgewichte</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMMontageAusgleichsgewichte get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMMontageAusgleichsgewichte result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Montage Ausgleichsgewichte</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMMontageAusgleichsgewichte getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMMontageAusgleichsgewichte result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Montage Ausgleichsgewichte</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMMontageAusgleichsgewichte get(int value) {
		switch (value) {
			case ENUM_MONTAGE_AUSGLEICHSGEWICHTE_BEIDSEITIG_VALUE: return ENUM_MONTAGE_AUSGLEICHSGEWICHTE_BEIDSEITIG;
			case ENUM_MONTAGE_AUSGLEICHSGEWICHTE_EINSEITIG_VALUE: return ENUM_MONTAGE_AUSGLEICHSGEWICHTE_EINSEITIG;
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
	private ENUMMontageAusgleichsgewichte(int value, String name, String literal) {
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
	
} //ENUMMontageAusgleichsgewichte
