/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Hoehenlinie Form</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * spa/WS 31.07.2018
 * <!-- end-model-doc -->
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getENUMHoehenlinieForm()
 * @model extendedMetaData="name='ENUMHoehenlinie_Form'"
 * @generated
 */
public enum ENUMHoehenlinieForm implements Enumerator {
	/**
	 * The '<em><b>ENUM Hoehenlinie Form Gerade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_HOEHENLINIE_FORM_GERADE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_HOEHENLINIE_FORM_GERADE(0, "ENUMHoehenlinie_Form_Gerade", "Gerade"),

	/**
	 * The '<em><b>ENUM Hoehenlinie Form Parabel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_HOEHENLINIE_FORM_PARABEL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_HOEHENLINIE_FORM_PARABEL(1, "ENUMHoehenlinie_Form_Parabel", "Parabel"),

	/**
	 * The '<em><b>ENUM Hoehenlinie Form Weichenabzweig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_HOEHENLINIE_FORM_WEICHENABZWEIG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_HOEHENLINIE_FORM_WEICHENABZWEIG(2, "ENUMHoehenlinie_Form_Weichenabzweig", "Weichenabzweig");

	/**
	 * The '<em><b>ENUM Hoehenlinie Form Gerade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_HOEHENLINIE_FORM_GERADE
	 * @model name="ENUMHoehenlinie_Form_Gerade" literal="Gerade"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_HOEHENLINIE_FORM_GERADE_VALUE = 0;

	/**
	 * The '<em><b>ENUM Hoehenlinie Form Parabel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_HOEHENLINIE_FORM_PARABEL
	 * @model name="ENUMHoehenlinie_Form_Parabel" literal="Parabel"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_HOEHENLINIE_FORM_PARABEL_VALUE = 1;

	/**
	 * The '<em><b>ENUM Hoehenlinie Form Weichenabzweig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_HOEHENLINIE_FORM_WEICHENABZWEIG
	 * @model name="ENUMHoehenlinie_Form_Weichenabzweig" literal="Weichenabzweig"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_HOEHENLINIE_FORM_WEICHENABZWEIG_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Hoehenlinie Form</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMHoehenlinieForm[] VALUES_ARRAY =
		new ENUMHoehenlinieForm[] {
			ENUM_HOEHENLINIE_FORM_GERADE,
			ENUM_HOEHENLINIE_FORM_PARABEL,
			ENUM_HOEHENLINIE_FORM_WEICHENABZWEIG,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Hoehenlinie Form</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMHoehenlinieForm> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Hoehenlinie Form</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMHoehenlinieForm get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMHoehenlinieForm result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Hoehenlinie Form</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMHoehenlinieForm getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMHoehenlinieForm result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Hoehenlinie Form</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMHoehenlinieForm get(int value) {
		switch (value) {
			case ENUM_HOEHENLINIE_FORM_GERADE_VALUE: return ENUM_HOEHENLINIE_FORM_GERADE;
			case ENUM_HOEHENLINIE_FORM_PARABEL_VALUE: return ENUM_HOEHENLINIE_FORM_PARABEL;
			case ENUM_HOEHENLINIE_FORM_WEICHENABZWEIG_VALUE: return ENUM_HOEHENLINIE_FORM_WEICHENABZWEIG;
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
	private ENUMHoehenlinieForm(int value, String name, String literal) {
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
	
} //ENUMHoehenlinieForm
