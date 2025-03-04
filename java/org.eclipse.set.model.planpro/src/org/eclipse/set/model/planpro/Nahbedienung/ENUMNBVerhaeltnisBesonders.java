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
 * A representation of the literals of the enumeration '<em><b>ENUMNB Verhaeltnis Besonders</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage#getENUMNBVerhaeltnisBesonders()
 * @model extendedMetaData="name='ENUMNB_Verhaeltnis_Besonders'"
 * @generated
 */
public enum ENUMNBVerhaeltnisBesonders implements Enumerator {
	/**
	 * The '<em><b>ENUMNB Verhaeltnis Besonders ueberlappend</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMNB_VERHAELTNIS_BESONDERS_UEBERLAPPEND_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMNB_VERHAELTNIS_BESONDERS_UEBERLAPPEND(0, "ENUMNB_Verhaeltnis_Besonders_ueberlappend", "ueberlappend"),

	/**
	 * The '<em><b>ENUMNB Verhaeltnis Besonders vereinigt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMNB_VERHAELTNIS_BESONDERS_VEREINIGT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMNB_VERHAELTNIS_BESONDERS_VEREINIGT(1, "ENUMNB_Verhaeltnis_Besonders_vereinigt", "vereinigt");

	/**
	 * The '<em><b>ENUMNB Verhaeltnis Besonders ueberlappend</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMNB_VERHAELTNIS_BESONDERS_UEBERLAPPEND
	 * @model name="ENUMNB_Verhaeltnis_Besonders_ueberlappend" literal="ueberlappend"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMNB_VERHAELTNIS_BESONDERS_UEBERLAPPEND_VALUE = 0;

	/**
	 * The '<em><b>ENUMNB Verhaeltnis Besonders vereinigt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMNB_VERHAELTNIS_BESONDERS_VEREINIGT
	 * @model name="ENUMNB_Verhaeltnis_Besonders_vereinigt" literal="vereinigt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMNB_VERHAELTNIS_BESONDERS_VEREINIGT_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUMNB Verhaeltnis Besonders</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMNBVerhaeltnisBesonders[] VALUES_ARRAY =
		new ENUMNBVerhaeltnisBesonders[] {
			ENUMNB_VERHAELTNIS_BESONDERS_UEBERLAPPEND,
			ENUMNB_VERHAELTNIS_BESONDERS_VEREINIGT,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMNB Verhaeltnis Besonders</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMNBVerhaeltnisBesonders> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMNB Verhaeltnis Besonders</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMNBVerhaeltnisBesonders get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMNBVerhaeltnisBesonders result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMNB Verhaeltnis Besonders</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMNBVerhaeltnisBesonders getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMNBVerhaeltnisBesonders result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMNB Verhaeltnis Besonders</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMNBVerhaeltnisBesonders get(int value) {
		switch (value) {
			case ENUMNB_VERHAELTNIS_BESONDERS_UEBERLAPPEND_VALUE: return ENUMNB_VERHAELTNIS_BESONDERS_UEBERLAPPEND;
			case ENUMNB_VERHAELTNIS_BESONDERS_VEREINIGT_VALUE: return ENUMNB_VERHAELTNIS_BESONDERS_VEREINIGT;
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
	private ENUMNBVerhaeltnisBesonders(int value, String name, String literal) {
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
	
} //ENUMNBVerhaeltnisBesonders
