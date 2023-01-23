/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMDP Typ GNT</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMDPTypGNT()
 * @model extendedMetaData="name='ENUMDP_Typ_GNT'"
 * @generated
 */
public enum ENUMDPTypGNT implements Enumerator {
	/**
	 * The '<em><b>ENUMDP Typ GNT B1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_GNT_B1_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_TYP_GNT_B1(0, "ENUMDP_Typ_GNT_B1", "B1"),

	/**
	 * The '<em><b>ENUMDP Typ GNT B2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_GNT_B2_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_TYP_GNT_B2(1, "ENUMDP_Typ_GNT_B2", "B2"),

	/**
	 * The '<em><b>ENUMDP Typ GNT B3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_GNT_B3_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_TYP_GNT_B3(2, "ENUMDP_Typ_GNT_B3", "B3"),

	/**
	 * The '<em><b>ENUMDP Typ GNT sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_GNT_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_TYP_GNT_SONSTIGE(3, "ENUMDP_Typ_GNT_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUMDP Typ GNT B1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_GNT_B1
	 * @model name="ENUMDP_Typ_GNT_B1" literal="B1"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_TYP_GNT_B1_VALUE = 0;

	/**
	 * The '<em><b>ENUMDP Typ GNT B2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_GNT_B2
	 * @model name="ENUMDP_Typ_GNT_B2" literal="B2"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_TYP_GNT_B2_VALUE = 1;

	/**
	 * The '<em><b>ENUMDP Typ GNT B3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_GNT_B3
	 * @model name="ENUMDP_Typ_GNT_B3" literal="B3"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_TYP_GNT_B3_VALUE = 2;

	/**
	 * The '<em><b>ENUMDP Typ GNT sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_GNT_SONSTIGE
	 * @model name="ENUMDP_Typ_GNT_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_TYP_GNT_SONSTIGE_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUMDP Typ GNT</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMDPTypGNT[] VALUES_ARRAY =
		new ENUMDPTypGNT[] {
			ENUMDP_TYP_GNT_B1,
			ENUMDP_TYP_GNT_B2,
			ENUMDP_TYP_GNT_B3,
			ENUMDP_TYP_GNT_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMDP Typ GNT</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMDPTypGNT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMDP Typ GNT</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPTypGNT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMDPTypGNT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMDP Typ GNT</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPTypGNT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMDPTypGNT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMDP Typ GNT</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPTypGNT get(int value) {
		switch (value) {
			case ENUMDP_TYP_GNT_B1_VALUE: return ENUMDP_TYP_GNT_B1;
			case ENUMDP_TYP_GNT_B2_VALUE: return ENUMDP_TYP_GNT_B2;
			case ENUMDP_TYP_GNT_B3_VALUE: return ENUMDP_TYP_GNT_B3;
			case ENUMDP_TYP_GNT_SONSTIGE_VALUE: return ENUMDP_TYP_GNT_SONSTIGE;
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
	private ENUMDPTypGNT(int value, String name, String literal) {
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
	
} //ENUMDPTypGNT
