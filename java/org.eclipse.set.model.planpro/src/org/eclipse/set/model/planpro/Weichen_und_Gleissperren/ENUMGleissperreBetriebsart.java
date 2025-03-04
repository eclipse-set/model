/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Weichen_und_Gleissperren;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Gleissperre Betriebsart</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getENUMGleissperreBetriebsart()
 * @model extendedMetaData="name='ENUMGleissperre_Betriebsart'"
 * @generated
 */
public enum ENUMGleissperreBetriebsart implements Enumerator {
	/**
	 * The '<em><b>ENUM Gleissperre Betriebsart abgelegt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISSPERRE_BETRIEBSART_ABGELEGT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GLEISSPERRE_BETRIEBSART_ABGELEGT(0, "ENUMGleissperre_Betriebsart_abgelegt", "abgelegt"),

	/**
	 * The '<em><b>ENUM Gleissperre Betriebsart aufgelegt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISSPERRE_BETRIEBSART_AUFGELEGT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GLEISSPERRE_BETRIEBSART_AUFGELEGT(1, "ENUMGleissperre_Betriebsart_aufgelegt", "aufgelegt"),

	/**
	 * The '<em><b>ENUM Gleissperre Betriebsart Betrieb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISSPERRE_BETRIEBSART_BETRIEB_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GLEISSPERRE_BETRIEBSART_BETRIEB(2, "ENUMGleissperre_Betriebsart_Betrieb", "Betrieb");

	/**
	 * The '<em><b>ENUM Gleissperre Betriebsart abgelegt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISSPERRE_BETRIEBSART_ABGELEGT
	 * @model name="ENUMGleissperre_Betriebsart_abgelegt" literal="abgelegt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GLEISSPERRE_BETRIEBSART_ABGELEGT_VALUE = 0;

	/**
	 * The '<em><b>ENUM Gleissperre Betriebsart aufgelegt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISSPERRE_BETRIEBSART_AUFGELEGT
	 * @model name="ENUMGleissperre_Betriebsart_aufgelegt" literal="aufgelegt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GLEISSPERRE_BETRIEBSART_AUFGELEGT_VALUE = 1;

	/**
	 * The '<em><b>ENUM Gleissperre Betriebsart Betrieb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISSPERRE_BETRIEBSART_BETRIEB
	 * @model name="ENUMGleissperre_Betriebsart_Betrieb" literal="Betrieb"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GLEISSPERRE_BETRIEBSART_BETRIEB_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Gleissperre Betriebsart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMGleissperreBetriebsart[] VALUES_ARRAY =
		new ENUMGleissperreBetriebsart[] {
			ENUM_GLEISSPERRE_BETRIEBSART_ABGELEGT,
			ENUM_GLEISSPERRE_BETRIEBSART_AUFGELEGT,
			ENUM_GLEISSPERRE_BETRIEBSART_BETRIEB,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Gleissperre Betriebsart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMGleissperreBetriebsart> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Gleissperre Betriebsart</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGleissperreBetriebsart get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGleissperreBetriebsart result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Gleissperre Betriebsart</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGleissperreBetriebsart getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGleissperreBetriebsart result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Gleissperre Betriebsart</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGleissperreBetriebsart get(int value) {
		switch (value) {
			case ENUM_GLEISSPERRE_BETRIEBSART_ABGELEGT_VALUE: return ENUM_GLEISSPERRE_BETRIEBSART_ABGELEGT;
			case ENUM_GLEISSPERRE_BETRIEBSART_AUFGELEGT_VALUE: return ENUM_GLEISSPERRE_BETRIEBSART_AUFGELEGT;
			case ENUM_GLEISSPERRE_BETRIEBSART_BETRIEB_VALUE: return ENUM_GLEISSPERRE_BETRIEBSART_BETRIEB;
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
	private ENUMGleissperreBetriebsart(int value, String name, String literal) {
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
	
} //ENUMGleissperreBetriebsart
