/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PZB;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMGUE Bauart</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getENUMGUEBauart()
 * @model extendedMetaData="name='ENUMGUE_Bauart'"
 * @generated
 */
public enum ENUMGUEBauart implements Enumerator {
	/**
	 * The '<em><b>ENUMGUE Bauart GPE 90R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_BAUART_GPE_90R_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGUE_BAUART_GPE_90R(0, "ENUMGUE_Bauart_GPE_90R", "GPE_90R"),

	/**
	 * The '<em><b>ENUMGUE Bauart GUE 60</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_BAUART_GUE_60_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGUE_BAUART_GUE_60(1, "ENUMGUE_Bauart_GUE_60", "GUE_60"),

	/**
	 * The '<em><b>ENUMGUE Bauart PZ 80</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_BAUART_PZ_80_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGUE_BAUART_PZ_80(2, "ENUMGUE_Bauart_PZ_80", "PZ_80"),

	/**
	 * The '<em><b>ENUMGUE Bauart sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_BAUART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGUE_BAUART_SONSTIGE(3, "ENUMGUE_Bauart_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUMGUE Bauart GPE 90R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_BAUART_GPE_90R
	 * @model name="ENUMGUE_Bauart_GPE_90R" literal="GPE_90R"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGUE_BAUART_GPE_90R_VALUE = 0;

	/**
	 * The '<em><b>ENUMGUE Bauart GUE 60</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_BAUART_GUE_60
	 * @model name="ENUMGUE_Bauart_GUE_60" literal="GUE_60"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGUE_BAUART_GUE_60_VALUE = 1;

	/**
	 * The '<em><b>ENUMGUE Bauart PZ 80</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_BAUART_PZ_80
	 * @model name="ENUMGUE_Bauart_PZ_80" literal="PZ_80"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGUE_BAUART_PZ_80_VALUE = 2;

	/**
	 * The '<em><b>ENUMGUE Bauart sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_BAUART_SONSTIGE
	 * @model name="ENUMGUE_Bauart_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGUE_BAUART_SONSTIGE_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUMGUE Bauart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMGUEBauart[] VALUES_ARRAY =
		new ENUMGUEBauart[] {
			ENUMGUE_BAUART_GPE_90R,
			ENUMGUE_BAUART_GUE_60,
			ENUMGUE_BAUART_PZ_80,
			ENUMGUE_BAUART_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMGUE Bauart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMGUEBauart> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMGUE Bauart</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGUEBauart get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGUEBauart result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMGUE Bauart</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGUEBauart getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGUEBauart result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMGUE Bauart</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGUEBauart get(int value) {
		switch (value) {
			case ENUMGUE_BAUART_GPE_90R_VALUE: return ENUMGUE_BAUART_GPE_90R;
			case ENUMGUE_BAUART_GUE_60_VALUE: return ENUMGUE_BAUART_GUE_60;
			case ENUMGUE_BAUART_PZ_80_VALUE: return ENUMGUE_BAUART_PZ_80;
			case ENUMGUE_BAUART_SONSTIGE_VALUE: return ENUMGUE_BAUART_SONSTIGE;
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
	private ENUMGUEBauart(int value, String name, String literal) {
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
	
} //ENUMGUEBauart
