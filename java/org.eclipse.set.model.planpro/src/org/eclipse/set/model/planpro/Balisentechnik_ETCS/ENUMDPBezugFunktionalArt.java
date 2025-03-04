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
 * A representation of the literals of the enumeration '<em><b>ENUMDP Bezug Funktional Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMDPBezugFunktionalArt()
 * @model extendedMetaData="name='ENUMDP_Bezug_Funktional_Art'"
 * @generated
 */
public enum ENUMDPBezugFunktionalArt implements Enumerator {
	/**
	 * The '<em><b>ENUMDP Bezug Funktional Art mittelbar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_BEZUG_FUNKTIONAL_ART_MITTELBAR_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_BEZUG_FUNKTIONAL_ART_MITTELBAR(0, "ENUMDP_Bezug_Funktional_Art_mittelbar", "mittelbar"),

	/**
	 * The '<em><b>ENUMDP Bezug Funktional Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_BEZUG_FUNKTIONAL_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_BEZUG_FUNKTIONAL_ART_SONSTIGE(1, "ENUMDP_Bezug_Funktional_Art_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUMDP Bezug Funktional Art unmittelbar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_BEZUG_FUNKTIONAL_ART_UNMITTELBAR_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_BEZUG_FUNKTIONAL_ART_UNMITTELBAR(2, "ENUMDP_Bezug_Funktional_Art_unmittelbar", "unmittelbar");

	/**
	 * The '<em><b>ENUMDP Bezug Funktional Art mittelbar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_BEZUG_FUNKTIONAL_ART_MITTELBAR
	 * @model name="ENUMDP_Bezug_Funktional_Art_mittelbar" literal="mittelbar"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_BEZUG_FUNKTIONAL_ART_MITTELBAR_VALUE = 0;

	/**
	 * The '<em><b>ENUMDP Bezug Funktional Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_BEZUG_FUNKTIONAL_ART_SONSTIGE
	 * @model name="ENUMDP_Bezug_Funktional_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_BEZUG_FUNKTIONAL_ART_SONSTIGE_VALUE = 1;

	/**
	 * The '<em><b>ENUMDP Bezug Funktional Art unmittelbar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_BEZUG_FUNKTIONAL_ART_UNMITTELBAR
	 * @model name="ENUMDP_Bezug_Funktional_Art_unmittelbar" literal="unmittelbar"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_BEZUG_FUNKTIONAL_ART_UNMITTELBAR_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUMDP Bezug Funktional Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMDPBezugFunktionalArt[] VALUES_ARRAY =
		new ENUMDPBezugFunktionalArt[] {
			ENUMDP_BEZUG_FUNKTIONAL_ART_MITTELBAR,
			ENUMDP_BEZUG_FUNKTIONAL_ART_SONSTIGE,
			ENUMDP_BEZUG_FUNKTIONAL_ART_UNMITTELBAR,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMDP Bezug Funktional Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMDPBezugFunktionalArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMDP Bezug Funktional Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPBezugFunktionalArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMDPBezugFunktionalArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMDP Bezug Funktional Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPBezugFunktionalArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMDPBezugFunktionalArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMDP Bezug Funktional Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPBezugFunktionalArt get(int value) {
		switch (value) {
			case ENUMDP_BEZUG_FUNKTIONAL_ART_MITTELBAR_VALUE: return ENUMDP_BEZUG_FUNKTIONAL_ART_MITTELBAR;
			case ENUMDP_BEZUG_FUNKTIONAL_ART_SONSTIGE_VALUE: return ENUMDP_BEZUG_FUNKTIONAL_ART_SONSTIGE;
			case ENUMDP_BEZUG_FUNKTIONAL_ART_UNMITTELBAR_VALUE: return ENUMDP_BEZUG_FUNKTIONAL_ART_UNMITTELBAR;
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
	private ENUMDPBezugFunktionalArt(int value, String name, String literal) {
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
	
} //ENUMDPBezugFunktionalArt
