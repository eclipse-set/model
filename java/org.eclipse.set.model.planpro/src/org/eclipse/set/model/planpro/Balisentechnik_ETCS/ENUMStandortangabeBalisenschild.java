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
 * A representation of the literals of the enumeration '<em><b>ENUM Standortangabe Balisenschild</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMStandortangabeBalisenschild()
 * @model extendedMetaData="name='ENUMStandortangabe_Balisenschild'"
 * @generated
 */
public enum ENUMStandortangabeBalisenschild implements Enumerator {
	/**
	 * The '<em><b>ENUM Standortangabe Balisenschild Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STANDORTANGABE_BALISENSCHILD_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_STANDORTANGABE_BALISENSCHILD_SIGNAL(0, "ENUMStandortangabe_Balisenschild_Signal", "Signal"),

	/**
	 * The '<em><b>ENUM Standortangabe Balisenschild Signal Gleis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STANDORTANGABE_BALISENSCHILD_SIGNAL_GLEIS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_STANDORTANGABE_BALISENSCHILD_SIGNAL_GLEIS(1, "ENUMStandortangabe_Balisenschild_Signal_Gleis", "Signal Gleis"),

	/**
	 * The '<em><b>ENUM Standortangabe Balisenschild Streckenkilometer Gleis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STANDORTANGABE_BALISENSCHILD_STRECKENKILOMETER_GLEIS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_STANDORTANGABE_BALISENSCHILD_STRECKENKILOMETER_GLEIS(2, "ENUMStandortangabe_Balisenschild_Streckenkilometer_Gleis", "Streckenkilometer Gleis"),

	/**
	 * The '<em><b>ENUM Standortangabe Balisenschild Strecke sonstiger Standort</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STANDORTANGABE_BALISENSCHILD_STRECKE_SONSTIGER_STANDORT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_STANDORTANGABE_BALISENSCHILD_STRECKE_SONSTIGER_STANDORT(3, "ENUMStandortangabe_Balisenschild_Strecke_sonstiger_Standort", "Strecke sonstiger Standort");

	/**
	 * The '<em><b>ENUM Standortangabe Balisenschild Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STANDORTANGABE_BALISENSCHILD_SIGNAL
	 * @model name="ENUMStandortangabe_Balisenschild_Signal" literal="Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_STANDORTANGABE_BALISENSCHILD_SIGNAL_VALUE = 0;

	/**
	 * The '<em><b>ENUM Standortangabe Balisenschild Signal Gleis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STANDORTANGABE_BALISENSCHILD_SIGNAL_GLEIS
	 * @model name="ENUMStandortangabe_Balisenschild_Signal_Gleis" literal="Signal Gleis"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_STANDORTANGABE_BALISENSCHILD_SIGNAL_GLEIS_VALUE = 1;

	/**
	 * The '<em><b>ENUM Standortangabe Balisenschild Streckenkilometer Gleis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STANDORTANGABE_BALISENSCHILD_STRECKENKILOMETER_GLEIS
	 * @model name="ENUMStandortangabe_Balisenschild_Streckenkilometer_Gleis" literal="Streckenkilometer Gleis"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_STANDORTANGABE_BALISENSCHILD_STRECKENKILOMETER_GLEIS_VALUE = 2;

	/**
	 * The '<em><b>ENUM Standortangabe Balisenschild Strecke sonstiger Standort</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STANDORTANGABE_BALISENSCHILD_STRECKE_SONSTIGER_STANDORT
	 * @model name="ENUMStandortangabe_Balisenschild_Strecke_sonstiger_Standort" literal="Strecke sonstiger Standort"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_STANDORTANGABE_BALISENSCHILD_STRECKE_SONSTIGER_STANDORT_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Standortangabe Balisenschild</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMStandortangabeBalisenschild[] VALUES_ARRAY =
		new ENUMStandortangabeBalisenschild[] {
			ENUM_STANDORTANGABE_BALISENSCHILD_SIGNAL,
			ENUM_STANDORTANGABE_BALISENSCHILD_SIGNAL_GLEIS,
			ENUM_STANDORTANGABE_BALISENSCHILD_STRECKENKILOMETER_GLEIS,
			ENUM_STANDORTANGABE_BALISENSCHILD_STRECKE_SONSTIGER_STANDORT,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Standortangabe Balisenschild</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMStandortangabeBalisenschild> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Standortangabe Balisenschild</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMStandortangabeBalisenschild get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMStandortangabeBalisenschild result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Standortangabe Balisenschild</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMStandortangabeBalisenschild getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMStandortangabeBalisenschild result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Standortangabe Balisenschild</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMStandortangabeBalisenschild get(int value) {
		switch (value) {
			case ENUM_STANDORTANGABE_BALISENSCHILD_SIGNAL_VALUE: return ENUM_STANDORTANGABE_BALISENSCHILD_SIGNAL;
			case ENUM_STANDORTANGABE_BALISENSCHILD_SIGNAL_GLEIS_VALUE: return ENUM_STANDORTANGABE_BALISENSCHILD_SIGNAL_GLEIS;
			case ENUM_STANDORTANGABE_BALISENSCHILD_STRECKENKILOMETER_GLEIS_VALUE: return ENUM_STANDORTANGABE_BALISENSCHILD_STRECKENKILOMETER_GLEIS;
			case ENUM_STANDORTANGABE_BALISENSCHILD_STRECKE_SONSTIGER_STANDORT_VALUE: return ENUM_STANDORTANGABE_BALISENSCHILD_STRECKE_SONSTIGER_STANDORT;
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
	private ENUMStandortangabeBalisenschild(int value, String name, String literal) {
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
	
} //ENUMStandortangabeBalisenschild
