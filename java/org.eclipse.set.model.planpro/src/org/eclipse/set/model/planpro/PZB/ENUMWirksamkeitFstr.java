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
 * A representation of the literals of the enumeration '<em><b>ENUM Wirksamkeit Fstr</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getENUMWirksamkeitFstr()
 * @model extendedMetaData="name='ENUMWirksamkeit_Fstr'"
 * @generated
 */
public enum ENUMWirksamkeitFstr implements Enumerator {
	/**
	 * The '<em><b>ENUM Wirksamkeit Fstr sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKSAMKEIT_FSTR_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WIRKSAMKEIT_FSTR_SONSTIGE(0, "ENUMWirksamkeit_Fstr_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Wirksamkeit Fstr staendig wirksam wenn Fahrstrasse eingestellt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKSAMKEIT_FSTR_STAENDIG_WIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WIRKSAMKEIT_FSTR_STAENDIG_WIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT(1, "ENUMWirksamkeit_Fstr_staendig_wirksam_wenn_Fahrstrasse_eingestellt", "staendig_wirksam_wenn_Fahrstrasse_eingestellt"),

	/**
	 * The '<em><b>ENUM Wirksamkeit Fstr unwirksam wenn Fahrstrasse eingestellt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKSAMKEIT_FSTR_UNWIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WIRKSAMKEIT_FSTR_UNWIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT(2, "ENUMWirksamkeit_Fstr_unwirksam_wenn_Fahrstrasse_eingestellt", "unwirksam_wenn_Fahrstrasse_eingestellt");

	/**
	 * The '<em><b>ENUM Wirksamkeit Fstr sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKSAMKEIT_FSTR_SONSTIGE
	 * @model name="ENUMWirksamkeit_Fstr_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WIRKSAMKEIT_FSTR_SONSTIGE_VALUE = 0;

	/**
	 * The '<em><b>ENUM Wirksamkeit Fstr staendig wirksam wenn Fahrstrasse eingestellt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKSAMKEIT_FSTR_STAENDIG_WIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT
	 * @model name="ENUMWirksamkeit_Fstr_staendig_wirksam_wenn_Fahrstrasse_eingestellt" literal="staendig_wirksam_wenn_Fahrstrasse_eingestellt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WIRKSAMKEIT_FSTR_STAENDIG_WIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT_VALUE = 1;

	/**
	 * The '<em><b>ENUM Wirksamkeit Fstr unwirksam wenn Fahrstrasse eingestellt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKSAMKEIT_FSTR_UNWIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT
	 * @model name="ENUMWirksamkeit_Fstr_unwirksam_wenn_Fahrstrasse_eingestellt" literal="unwirksam_wenn_Fahrstrasse_eingestellt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WIRKSAMKEIT_FSTR_UNWIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Wirksamkeit Fstr</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMWirksamkeitFstr[] VALUES_ARRAY =
		new ENUMWirksamkeitFstr[] {
			ENUM_WIRKSAMKEIT_FSTR_SONSTIGE,
			ENUM_WIRKSAMKEIT_FSTR_STAENDIG_WIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT,
			ENUM_WIRKSAMKEIT_FSTR_UNWIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Wirksamkeit Fstr</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMWirksamkeitFstr> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Wirksamkeit Fstr</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWirksamkeitFstr get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMWirksamkeitFstr result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Wirksamkeit Fstr</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWirksamkeitFstr getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMWirksamkeitFstr result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Wirksamkeit Fstr</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWirksamkeitFstr get(int value) {
		switch (value) {
			case ENUM_WIRKSAMKEIT_FSTR_SONSTIGE_VALUE: return ENUM_WIRKSAMKEIT_FSTR_SONSTIGE;
			case ENUM_WIRKSAMKEIT_FSTR_STAENDIG_WIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT_VALUE: return ENUM_WIRKSAMKEIT_FSTR_STAENDIG_WIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT;
			case ENUM_WIRKSAMKEIT_FSTR_UNWIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT_VALUE: return ENUM_WIRKSAMKEIT_FSTR_UNWIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT;
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
	private ENUMWirksamkeitFstr(int value, String name, String literal) {
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
	
} //ENUMWirksamkeitFstr
