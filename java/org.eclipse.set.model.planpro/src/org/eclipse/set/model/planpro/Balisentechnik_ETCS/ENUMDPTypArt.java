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
 * A representation of the literals of the enumeration '<em><b>ENUMDP Typ Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMDPTypArt()
 * @model extendedMetaData="name='ENUMDP_Typ_Art'"
 * @generated
 */
public enum ENUMDPTypArt implements Enumerator {
	/**
	 * The '<em><b>ENUMDP Typ Art primaer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_ART_PRIMAER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_TYP_ART_PRIMAER(0, "ENUMDP_Typ_Art_primaer", "primaer"),

	/**
	 * The '<em><b>ENUMDP Typ Art sekundaer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_ART_SEKUNDAER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_TYP_ART_SEKUNDAER(1, "ENUMDP_Typ_Art_sekundaer", "sekundaer");

	/**
	 * The '<em><b>ENUMDP Typ Art primaer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_ART_PRIMAER
	 * @model name="ENUMDP_Typ_Art_primaer" literal="primaer"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_TYP_ART_PRIMAER_VALUE = 0;

	/**
	 * The '<em><b>ENUMDP Typ Art sekundaer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_ART_SEKUNDAER
	 * @model name="ENUMDP_Typ_Art_sekundaer" literal="sekundaer"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_TYP_ART_SEKUNDAER_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUMDP Typ Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMDPTypArt[] VALUES_ARRAY =
		new ENUMDPTypArt[] {
			ENUMDP_TYP_ART_PRIMAER,
			ENUMDP_TYP_ART_SEKUNDAER,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMDP Typ Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMDPTypArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMDP Typ Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPTypArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMDPTypArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMDP Typ Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPTypArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMDPTypArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMDP Typ Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPTypArt get(int value) {
		switch (value) {
			case ENUMDP_TYP_ART_PRIMAER_VALUE: return ENUMDP_TYP_ART_PRIMAER;
			case ENUMDP_TYP_ART_SEKUNDAER_VALUE: return ENUMDP_TYP_ART_SEKUNDAER;
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
	private ENUMDPTypArt(int value, String name, String literal) {
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
	
} //ENUMDPTypArt
