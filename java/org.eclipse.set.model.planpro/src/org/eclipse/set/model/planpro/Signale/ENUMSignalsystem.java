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
 * A representation of the literals of the enumeration '<em><b>ENUM Signalsystem</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getENUMSignalsystem()
 * @model extendedMetaData="name='ENUMSignalsystem'"
 * @generated
 */
public enum ENUMSignalsystem implements Enumerator {
	/**
	 * The '<em><b>ENUM Signalsystem Hl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNALSYSTEM_HL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNALSYSTEM_HL(0, "ENUMSignalsystem_Hl", "Hl"),

	/**
	 * The '<em><b>ENUM Signalsystem HV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNALSYSTEM_HV_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNALSYSTEM_HV(1, "ENUMSignalsystem_HV", "HV"),

	/**
	 * The '<em><b>ENUM Signalsystem Ks</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNALSYSTEM_KS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNALSYSTEM_KS(2, "ENUMSignalsystem_Ks", "Ks"),

	/**
	 * The '<em><b>ENUM Signalsystem sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNALSYSTEM_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNALSYSTEM_SONSTIGE(3, "ENUMSignalsystem_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Signalsystem SV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNALSYSTEM_SV_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNALSYSTEM_SV(4, "ENUMSignalsystem_SV", "SV");

	/**
	 * The '<em><b>ENUM Signalsystem Hl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNALSYSTEM_HL
	 * @model name="ENUMSignalsystem_Hl" literal="Hl"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNALSYSTEM_HL_VALUE = 0;

	/**
	 * The '<em><b>ENUM Signalsystem HV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNALSYSTEM_HV
	 * @model name="ENUMSignalsystem_HV" literal="HV"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNALSYSTEM_HV_VALUE = 1;

	/**
	 * The '<em><b>ENUM Signalsystem Ks</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNALSYSTEM_KS
	 * @model name="ENUMSignalsystem_Ks" literal="Ks"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNALSYSTEM_KS_VALUE = 2;

	/**
	 * The '<em><b>ENUM Signalsystem sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNALSYSTEM_SONSTIGE
	 * @model name="ENUMSignalsystem_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNALSYSTEM_SONSTIGE_VALUE = 3;

	/**
	 * The '<em><b>ENUM Signalsystem SV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNALSYSTEM_SV
	 * @model name="ENUMSignalsystem_SV" literal="SV"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNALSYSTEM_SV_VALUE = 4;

	/**
	 * An array of all the '<em><b>ENUM Signalsystem</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMSignalsystem[] VALUES_ARRAY =
		new ENUMSignalsystem[] {
			ENUM_SIGNALSYSTEM_HL,
			ENUM_SIGNALSYSTEM_HV,
			ENUM_SIGNALSYSTEM_KS,
			ENUM_SIGNALSYSTEM_SONSTIGE,
			ENUM_SIGNALSYSTEM_SV,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Signalsystem</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMSignalsystem> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Signalsystem</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSignalsystem get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMSignalsystem result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Signalsystem</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSignalsystem getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMSignalsystem result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Signalsystem</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSignalsystem get(int value) {
		switch (value) {
			case ENUM_SIGNALSYSTEM_HL_VALUE: return ENUM_SIGNALSYSTEM_HL;
			case ENUM_SIGNALSYSTEM_HV_VALUE: return ENUM_SIGNALSYSTEM_HV;
			case ENUM_SIGNALSYSTEM_KS_VALUE: return ENUM_SIGNALSYSTEM_KS;
			case ENUM_SIGNALSYSTEM_SONSTIGE_VALUE: return ENUM_SIGNALSYSTEM_SONSTIGE;
			case ENUM_SIGNALSYSTEM_SV_VALUE: return ENUM_SIGNALSYSTEM_SV;
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
	private ENUMSignalsystem(int value, String name, String literal) {
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
	
} //ENUMSignalsystem
