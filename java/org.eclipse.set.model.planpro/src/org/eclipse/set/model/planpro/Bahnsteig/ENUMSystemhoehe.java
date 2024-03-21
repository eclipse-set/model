/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnsteig;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Systemhoehe</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage#getENUMSystemhoehe()
 * @model extendedMetaData="name='ENUMSystemhoehe'"
 * @generated
 */
public enum ENUMSystemhoehe implements Enumerator {
	/**
	 * The '<em><b>ENUM Systemhoehe 38 cm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SYSTEMHOEHE_38_CM_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SYSTEMHOEHE_38_CM(0, "ENUMSystemhoehe_38_cm", "38_cm"),

	/**
	 * The '<em><b>ENUM Systemhoehe 55 cm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SYSTEMHOEHE_55_CM_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SYSTEMHOEHE_55_CM(1, "ENUMSystemhoehe_55_cm", "55_cm"),

	/**
	 * The '<em><b>ENUM Systemhoehe 76 cm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SYSTEMHOEHE_76_CM_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SYSTEMHOEHE_76_CM(2, "ENUMSystemhoehe_76_cm", "76_cm"),

	/**
	 * The '<em><b>ENUM Systemhoehe 96 cm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SYSTEMHOEHE_96_CM_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SYSTEMHOEHE_96_CM(3, "ENUMSystemhoehe_96_cm", "96_cm"),

	/**
	 * The '<em><b>ENUM Systemhoehe sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SYSTEMHOEHE_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SYSTEMHOEHE_SONSTIGE(4, "ENUMSystemhoehe_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Systemhoehe 38 cm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SYSTEMHOEHE_38_CM
	 * @model name="ENUMSystemhoehe_38_cm" literal="38_cm"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SYSTEMHOEHE_38_CM_VALUE = 0;

	/**
	 * The '<em><b>ENUM Systemhoehe 55 cm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SYSTEMHOEHE_55_CM
	 * @model name="ENUMSystemhoehe_55_cm" literal="55_cm"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SYSTEMHOEHE_55_CM_VALUE = 1;

	/**
	 * The '<em><b>ENUM Systemhoehe 76 cm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SYSTEMHOEHE_76_CM
	 * @model name="ENUMSystemhoehe_76_cm" literal="76_cm"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SYSTEMHOEHE_76_CM_VALUE = 2;

	/**
	 * The '<em><b>ENUM Systemhoehe 96 cm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SYSTEMHOEHE_96_CM
	 * @model name="ENUMSystemhoehe_96_cm" literal="96_cm"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SYSTEMHOEHE_96_CM_VALUE = 3;

	/**
	 * The '<em><b>ENUM Systemhoehe sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SYSTEMHOEHE_SONSTIGE
	 * @model name="ENUMSystemhoehe_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SYSTEMHOEHE_SONSTIGE_VALUE = 4;

	/**
	 * An array of all the '<em><b>ENUM Systemhoehe</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMSystemhoehe[] VALUES_ARRAY =
		new ENUMSystemhoehe[] {
			ENUM_SYSTEMHOEHE_38_CM,
			ENUM_SYSTEMHOEHE_55_CM,
			ENUM_SYSTEMHOEHE_76_CM,
			ENUM_SYSTEMHOEHE_96_CM,
			ENUM_SYSTEMHOEHE_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Systemhoehe</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMSystemhoehe> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Systemhoehe</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSystemhoehe get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMSystemhoehe result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Systemhoehe</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSystemhoehe getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMSystemhoehe result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Systemhoehe</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSystemhoehe get(int value) {
		switch (value) {
			case ENUM_SYSTEMHOEHE_38_CM_VALUE: return ENUM_SYSTEMHOEHE_38_CM;
			case ENUM_SYSTEMHOEHE_55_CM_VALUE: return ENUM_SYSTEMHOEHE_55_CM;
			case ENUM_SYSTEMHOEHE_76_CM_VALUE: return ENUM_SYSTEMHOEHE_76_CM;
			case ENUM_SYSTEMHOEHE_96_CM_VALUE: return ENUM_SYSTEMHOEHE_96_CM;
			case ENUM_SYSTEMHOEHE_SONSTIGE_VALUE: return ENUM_SYSTEMHOEHE_SONSTIGE;
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
	private ENUMSystemhoehe(int value, String name, String literal) {
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
	
} //ENUMSystemhoehe
