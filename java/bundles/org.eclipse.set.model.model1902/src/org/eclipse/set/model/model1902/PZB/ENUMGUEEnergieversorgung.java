/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PZB;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMGUE Energieversorgung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getENUMGUEEnergieversorgung()
 * @model extendedMetaData="name='ENUMGUE_Energieversorgung'"
 * @generated
 */
public enum ENUMGUEEnergieversorgung implements Enumerator {
	/**
	 * The '<em><b>ENUMGUE Energieversorgung Solar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_ENERGIEVERSORGUNG_SOLAR_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGUE_ENERGIEVERSORGUNG_SOLAR(0, "ENUMGUE_Energieversorgung_Solar", "Solar"),

	/**
	 * The '<em><b>ENUMGUE Energieversorgung sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_ENERGIEVERSORGUNG_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGUE_ENERGIEVERSORGUNG_SONSTIGE(1, "ENUMGUE_Energieversorgung_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUMGUE Energieversorgung Stellwerk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_ENERGIEVERSORGUNG_STELLWERK_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGUE_ENERGIEVERSORGUNG_STELLWERK(2, "ENUMGUE_Energieversorgung_Stellwerk", "Stellwerk");

	/**
	 * The '<em><b>ENUMGUE Energieversorgung Solar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_ENERGIEVERSORGUNG_SOLAR
	 * @model name="ENUMGUE_Energieversorgung_Solar" literal="Solar"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGUE_ENERGIEVERSORGUNG_SOLAR_VALUE = 0;

	/**
	 * The '<em><b>ENUMGUE Energieversorgung sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_ENERGIEVERSORGUNG_SONSTIGE
	 * @model name="ENUMGUE_Energieversorgung_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGUE_ENERGIEVERSORGUNG_SONSTIGE_VALUE = 1;

	/**
	 * The '<em><b>ENUMGUE Energieversorgung Stellwerk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_ENERGIEVERSORGUNG_STELLWERK
	 * @model name="ENUMGUE_Energieversorgung_Stellwerk" literal="Stellwerk"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGUE_ENERGIEVERSORGUNG_STELLWERK_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUMGUE Energieversorgung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMGUEEnergieversorgung[] VALUES_ARRAY =
		new ENUMGUEEnergieversorgung[] {
			ENUMGUE_ENERGIEVERSORGUNG_SOLAR,
			ENUMGUE_ENERGIEVERSORGUNG_SONSTIGE,
			ENUMGUE_ENERGIEVERSORGUNG_STELLWERK,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMGUE Energieversorgung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMGUEEnergieversorgung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMGUE Energieversorgung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGUEEnergieversorgung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGUEEnergieversorgung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMGUE Energieversorgung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGUEEnergieversorgung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGUEEnergieversorgung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMGUE Energieversorgung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGUEEnergieversorgung get(int value) {
		switch (value) {
			case ENUMGUE_ENERGIEVERSORGUNG_SOLAR_VALUE: return ENUMGUE_ENERGIEVERSORGUNG_SOLAR;
			case ENUMGUE_ENERGIEVERSORGUNG_SONSTIGE_VALUE: return ENUMGUE_ENERGIEVERSORGUNG_SONSTIGE;
			case ENUMGUE_ENERGIEVERSORGUNG_STELLWERK_VALUE: return ENUMGUE_ENERGIEVERSORGUNG_STELLWERK;
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
	private ENUMGUEEnergieversorgung(int value, String name, String literal) {
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
	
} //ENUMGUEEnergieversorgung
