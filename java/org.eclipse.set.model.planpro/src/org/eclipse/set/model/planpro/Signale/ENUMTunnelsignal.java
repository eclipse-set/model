/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Tunnelsignal</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getENUMTunnelsignal()
 * @model extendedMetaData="name='ENUMTunnelsignal'"
 * @generated
 */
public enum ENUMTunnelsignal implements Enumerator {
	/**
	 * The '<em><b>ENUM Tunnelsignal mit Dauernachtschaltung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TUNNELSIGNAL_MIT_DAUERNACHTSCHALTUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_TUNNELSIGNAL_MIT_DAUERNACHTSCHALTUNG(0, "ENUMTunnelsignal_mit_Dauernachtschaltung", "mit_Dauernachtschaltung"),

	/**
	 * The '<em><b>ENUM Tunnelsignal nein</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TUNNELSIGNAL_NEIN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_TUNNELSIGNAL_NEIN(1, "ENUMTunnelsignal_nein", "nein"),

	/**
	 * The '<em><b>ENUM Tunnelsignal ohne Dauernachtschaltung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TUNNELSIGNAL_OHNE_DAUERNACHTSCHALTUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_TUNNELSIGNAL_OHNE_DAUERNACHTSCHALTUNG(2, "ENUMTunnelsignal_ohne_Dauernachtschaltung", "ohne_Dauernachtschaltung");

	/**
	 * The '<em><b>ENUM Tunnelsignal mit Dauernachtschaltung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TUNNELSIGNAL_MIT_DAUERNACHTSCHALTUNG
	 * @model name="ENUMTunnelsignal_mit_Dauernachtschaltung" literal="mit_Dauernachtschaltung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_TUNNELSIGNAL_MIT_DAUERNACHTSCHALTUNG_VALUE = 0;

	/**
	 * The '<em><b>ENUM Tunnelsignal nein</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TUNNELSIGNAL_NEIN
	 * @model name="ENUMTunnelsignal_nein" literal="nein"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_TUNNELSIGNAL_NEIN_VALUE = 1;

	/**
	 * The '<em><b>ENUM Tunnelsignal ohne Dauernachtschaltung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TUNNELSIGNAL_OHNE_DAUERNACHTSCHALTUNG
	 * @model name="ENUMTunnelsignal_ohne_Dauernachtschaltung" literal="ohne_Dauernachtschaltung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_TUNNELSIGNAL_OHNE_DAUERNACHTSCHALTUNG_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Tunnelsignal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMTunnelsignal[] VALUES_ARRAY =
		new ENUMTunnelsignal[] {
			ENUM_TUNNELSIGNAL_MIT_DAUERNACHTSCHALTUNG,
			ENUM_TUNNELSIGNAL_NEIN,
			ENUM_TUNNELSIGNAL_OHNE_DAUERNACHTSCHALTUNG,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Tunnelsignal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMTunnelsignal> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Tunnelsignal</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTunnelsignal get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMTunnelsignal result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Tunnelsignal</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTunnelsignal getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMTunnelsignal result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Tunnelsignal</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTunnelsignal get(int value) {
		switch (value) {
			case ENUM_TUNNELSIGNAL_MIT_DAUERNACHTSCHALTUNG_VALUE: return ENUM_TUNNELSIGNAL_MIT_DAUERNACHTSCHALTUNG;
			case ENUM_TUNNELSIGNAL_NEIN_VALUE: return ENUM_TUNNELSIGNAL_NEIN;
			case ENUM_TUNNELSIGNAL_OHNE_DAUERNACHTSCHALTUNG_VALUE: return ENUM_TUNNELSIGNAL_OHNE_DAUERNACHTSCHALTUNG;
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
	private ENUMTunnelsignal(int value, String name, String literal) {
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
	
} //ENUMTunnelsignal
