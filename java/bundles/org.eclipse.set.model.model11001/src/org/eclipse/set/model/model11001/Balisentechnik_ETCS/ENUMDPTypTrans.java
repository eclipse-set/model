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
 * A representation of the literals of the enumeration '<em><b>ENUMDP Typ Trans</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMDPTypTrans()
 * @model extendedMetaData="name='ENUMDP_Typ_Trans'"
 * @generated
 */
public enum ENUMDPTypTrans implements Enumerator {
	/**
	 * The '<em><b>ENUMDP Typ Trans A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_TRANS_A_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_TYP_TRANS_A(0, "ENUMDP_Typ_Trans_A", "A"),

	/**
	 * The '<em><b>ENUMDP Typ Trans sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_TRANS_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_TYP_TRANS_SONSTIGE(1, "ENUMDP_Typ_Trans_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUMDP Typ Trans TR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_TRANS_TR_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_TYP_TRANS_TR(2, "ENUMDP_Typ_Trans_TR", "TR");

	/**
	 * The '<em><b>ENUMDP Typ Trans A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_TRANS_A
	 * @model name="ENUMDP_Typ_Trans_A" literal="A"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_TYP_TRANS_A_VALUE = 0;

	/**
	 * The '<em><b>ENUMDP Typ Trans sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_TRANS_SONSTIGE
	 * @model name="ENUMDP_Typ_Trans_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_TYP_TRANS_SONSTIGE_VALUE = 1;

	/**
	 * The '<em><b>ENUMDP Typ Trans TR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_TYP_TRANS_TR
	 * @model name="ENUMDP_Typ_Trans_TR" literal="TR"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_TYP_TRANS_TR_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUMDP Typ Trans</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMDPTypTrans[] VALUES_ARRAY =
		new ENUMDPTypTrans[] {
			ENUMDP_TYP_TRANS_A,
			ENUMDP_TYP_TRANS_SONSTIGE,
			ENUMDP_TYP_TRANS_TR,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMDP Typ Trans</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMDPTypTrans> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMDP Typ Trans</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPTypTrans get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMDPTypTrans result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMDP Typ Trans</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPTypTrans getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMDPTypTrans result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMDP Typ Trans</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPTypTrans get(int value) {
		switch (value) {
			case ENUMDP_TYP_TRANS_A_VALUE: return ENUMDP_TYP_TRANS_A;
			case ENUMDP_TYP_TRANS_SONSTIGE_VALUE: return ENUMDP_TYP_TRANS_SONSTIGE;
			case ENUMDP_TYP_TRANS_TR_VALUE: return ENUMDP_TYP_TRANS_TR;
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
	private ENUMDPTypTrans(int value, String name, String literal) {
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
	
} //ENUMDPTypTrans
