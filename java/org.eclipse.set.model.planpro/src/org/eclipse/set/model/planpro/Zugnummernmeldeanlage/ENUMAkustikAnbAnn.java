/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Akustik Anb Ann</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getENUMAkustikAnbAnn()
 * @model extendedMetaData="name='ENUMAkustik_Anb_Ann'"
 * @generated
 */
public enum ENUMAkustikAnbAnn implements Enumerator {
	/**
	 * The '<em><b>ENUM Akustik Anb Ann 5s</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AKUSTIK_ANB_ANN_5S_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AKUSTIK_ANB_ANN_5S(0, "ENUMAkustik_Anb_Ann_5_s", "5_s"),

	/**
	 * The '<em><b>ENUM Akustik Anb Ann bis Ankunft Zug</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AKUSTIK_ANB_ANN_BIS_ANKUNFT_ZUG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AKUSTIK_ANB_ANN_BIS_ANKUNFT_ZUG(1, "ENUMAkustik_Anb_Ann_bis_Ankunft_Zug", "bis_Ankunft_Zug");

	/**
	 * The '<em><b>ENUM Akustik Anb Ann 5s</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AKUSTIK_ANB_ANN_5S
	 * @model name="ENUMAkustik_Anb_Ann_5_s" literal="5_s"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AKUSTIK_ANB_ANN_5S_VALUE = 0;

	/**
	 * The '<em><b>ENUM Akustik Anb Ann bis Ankunft Zug</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AKUSTIK_ANB_ANN_BIS_ANKUNFT_ZUG
	 * @model name="ENUMAkustik_Anb_Ann_bis_Ankunft_Zug" literal="bis_Ankunft_Zug"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AKUSTIK_ANB_ANN_BIS_ANKUNFT_ZUG_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUM Akustik Anb Ann</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMAkustikAnbAnn[] VALUES_ARRAY =
		new ENUMAkustikAnbAnn[] {
			ENUM_AKUSTIK_ANB_ANN_5S,
			ENUM_AKUSTIK_ANB_ANN_BIS_ANKUNFT_ZUG,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Akustik Anb Ann</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMAkustikAnbAnn> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Akustik Anb Ann</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAkustikAnbAnn get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAkustikAnbAnn result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Akustik Anb Ann</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAkustikAnbAnn getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAkustikAnbAnn result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Akustik Anb Ann</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAkustikAnbAnn get(int value) {
		switch (value) {
			case ENUM_AKUSTIK_ANB_ANN_5S_VALUE: return ENUM_AKUSTIK_ANB_ANN_5S;
			case ENUM_AKUSTIK_ANB_ANN_BIS_ANKUNFT_ZUG_VALUE: return ENUM_AKUSTIK_ANB_ANN_BIS_ANKUNFT_ZUG;
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
	private ENUMAkustikAnbAnn(int value, String name, String literal) {
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
	
} //ENUMAkustikAnbAnn
