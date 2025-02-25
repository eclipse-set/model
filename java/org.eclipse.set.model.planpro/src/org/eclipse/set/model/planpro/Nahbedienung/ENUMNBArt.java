/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Nahbedienung;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMNB Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage#getENUMNBArt()
 * @model extendedMetaData="name='ENUMNB_Art'"
 * @generated
 */
public enum ENUMNBArt implements Enumerator {
	/**
	 * The '<em><b>ENUMNB Art NB G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMNB_ART_NB_G_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMNB_ART_NB_G(0, "ENUMNB_Art_NB_G", "NB_G"),

	/**
	 * The '<em><b>ENUMNB Art NB R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMNB_ART_NB_R_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMNB_ART_NB_R(1, "ENUMNB_Art_NB_R", "NB_R"),

	/**
	 * The '<em><b>ENUMNB Art NB W</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMNB_ART_NB_W_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMNB_ART_NB_W(2, "ENUMNB_Art_NB_W", "NB_W");

	/**
	 * The '<em><b>ENUMNB Art NB G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMNB_ART_NB_G
	 * @model name="ENUMNB_Art_NB_G" literal="NB_G"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMNB_ART_NB_G_VALUE = 0;

	/**
	 * The '<em><b>ENUMNB Art NB R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMNB_ART_NB_R
	 * @model name="ENUMNB_Art_NB_R" literal="NB_R"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMNB_ART_NB_R_VALUE = 1;

	/**
	 * The '<em><b>ENUMNB Art NB W</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMNB_ART_NB_W
	 * @model name="ENUMNB_Art_NB_W" literal="NB_W"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMNB_ART_NB_W_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUMNB Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMNBArt[] VALUES_ARRAY =
		new ENUMNBArt[] {
			ENUMNB_ART_NB_G,
			ENUMNB_ART_NB_R,
			ENUMNB_ART_NB_W,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMNB Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMNBArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMNB Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMNBArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMNBArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMNB Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMNBArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMNBArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMNB Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMNBArt get(int value) {
		switch (value) {
			case ENUMNB_ART_NB_G_VALUE: return ENUMNB_ART_NB_G;
			case ENUMNB_ART_NB_R_VALUE: return ENUMNB_ART_NB_R;
			case ENUMNB_ART_NB_W_VALUE: return ENUMNB_ART_NB_W;
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
	private ENUMNBArt(int value, String name, String literal) {
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
	
} //ENUMNBArt
