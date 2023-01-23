/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zugnummernmeldeanlage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMZN Modem</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getENUMZNModem()
 * @model extendedMetaData="name='ENUMZN_Modem'"
 * @generated
 */
public enum ENUMZNModem implements Enumerator {
	/**
	 * The '<em><b>ENUMZN Modem LOGEM 1200 MD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZN_MODEM_LOGEM_1200_MD_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMZN_MODEM_LOGEM_1200_MD(0, "ENUMZN_Modem_LOGEM_1200_MD", "LOGEM_1200_MD"),

	/**
	 * The '<em><b>ENUMZN Modem NOKIA 1200 SE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZN_MODEM_NOKIA_1200_SE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMZN_MODEM_NOKIA_1200_SE(1, "ENUMZN_Modem_NOKIA_1200_SE", "NOKIA_1200_SE"),

	/**
	 * The '<em><b>ENUMZN Modem SCADA NG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZN_MODEM_SCADA_NG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMZN_MODEM_SCADA_NG(2, "ENUMZN_Modem_SCADA_NG", "SCADA_NG"),

	/**
	 * The '<em><b>ENUMZN Modem sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZN_MODEM_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMZN_MODEM_SONSTIGE(3, "ENUMZN_Modem_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUMZN Modem LOGEM 1200 MD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZN_MODEM_LOGEM_1200_MD
	 * @model name="ENUMZN_Modem_LOGEM_1200_MD" literal="LOGEM_1200_MD"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMZN_MODEM_LOGEM_1200_MD_VALUE = 0;

	/**
	 * The '<em><b>ENUMZN Modem NOKIA 1200 SE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZN_MODEM_NOKIA_1200_SE
	 * @model name="ENUMZN_Modem_NOKIA_1200_SE" literal="NOKIA_1200_SE"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMZN_MODEM_NOKIA_1200_SE_VALUE = 1;

	/**
	 * The '<em><b>ENUMZN Modem SCADA NG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZN_MODEM_SCADA_NG
	 * @model name="ENUMZN_Modem_SCADA_NG" literal="SCADA_NG"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMZN_MODEM_SCADA_NG_VALUE = 2;

	/**
	 * The '<em><b>ENUMZN Modem sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMZN_MODEM_SONSTIGE
	 * @model name="ENUMZN_Modem_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMZN_MODEM_SONSTIGE_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUMZN Modem</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMZNModem[] VALUES_ARRAY =
		new ENUMZNModem[] {
			ENUMZN_MODEM_LOGEM_1200_MD,
			ENUMZN_MODEM_NOKIA_1200_SE,
			ENUMZN_MODEM_SCADA_NG,
			ENUMZN_MODEM_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMZN Modem</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMZNModem> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMZN Modem</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMZNModem get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMZNModem result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMZN Modem</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMZNModem getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMZNModem result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMZN Modem</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMZNModem get(int value) {
		switch (value) {
			case ENUMZN_MODEM_LOGEM_1200_MD_VALUE: return ENUMZN_MODEM_LOGEM_1200_MD;
			case ENUMZN_MODEM_NOKIA_1200_SE_VALUE: return ENUMZN_MODEM_NOKIA_1200_SE;
			case ENUMZN_MODEM_SCADA_NG_VALUE: return ENUMZN_MODEM_SCADA_NG;
			case ENUMZN_MODEM_SONSTIGE_VALUE: return ENUMZN_MODEM_SONSTIGE;
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
	private ENUMZNModem(int value, String name, String literal) {
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
	
} //ENUMZNModem
