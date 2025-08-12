/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Basisobjekte;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Rolle</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getENUMRolle()
 * @model extendedMetaData="name='ENUMRolle'"
 * @generated
 */
public enum ENUMRolle implements Enumerator {
	/**
	 * The '<em><b>ENUM Rolle GEO Planer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ROLLE_GEO_PLANER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ROLLE_GEO_PLANER(0, "ENUMRolle_GEO_Planer", "GEO_Planer"),

	/**
	 * The '<em><b>ENUM Rolle GIS Daten</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ROLLE_GIS_DATEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ROLLE_GIS_DATEN(1, "ENUMRolle_GIS_Daten", "GIS_Daten"),

	/**
	 * The '<em><b>ENUM Rolle LST Fachplaner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ROLLE_LST_FACHPLANER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ROLLE_LST_FACHPLANER(2, "ENUMRolle_LST_Fachplaner", "LST_Fachplaner"),

	/**
	 * The '<em><b>ENUM Rolle sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ROLLE_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ROLLE_SONSTIGE(3, "ENUMRolle_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Rolle GEO Planer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ROLLE_GEO_PLANER
	 * @model name="ENUMRolle_GEO_Planer" literal="GEO_Planer"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ROLLE_GEO_PLANER_VALUE = 0;

	/**
	 * The '<em><b>ENUM Rolle GIS Daten</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ROLLE_GIS_DATEN
	 * @model name="ENUMRolle_GIS_Daten" literal="GIS_Daten"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ROLLE_GIS_DATEN_VALUE = 1;

	/**
	 * The '<em><b>ENUM Rolle LST Fachplaner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ROLLE_LST_FACHPLANER
	 * @model name="ENUMRolle_LST_Fachplaner" literal="LST_Fachplaner"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ROLLE_LST_FACHPLANER_VALUE = 2;

	/**
	 * The '<em><b>ENUM Rolle sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ROLLE_SONSTIGE
	 * @model name="ENUMRolle_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ROLLE_SONSTIGE_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Rolle</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMRolle[] VALUES_ARRAY =
		new ENUMRolle[] {
			ENUM_ROLLE_GEO_PLANER,
			ENUM_ROLLE_GIS_DATEN,
			ENUM_ROLLE_LST_FACHPLANER,
			ENUM_ROLLE_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Rolle</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMRolle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Rolle</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMRolle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMRolle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Rolle</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMRolle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMRolle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Rolle</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMRolle get(int value) {
		switch (value) {
			case ENUM_ROLLE_GEO_PLANER_VALUE: return ENUM_ROLLE_GEO_PLANER;
			case ENUM_ROLLE_GIS_DATEN_VALUE: return ENUM_ROLLE_GIS_DATEN;
			case ENUM_ROLLE_LST_FACHPLANER_VALUE: return ENUM_ROLLE_LST_FACHPLANER;
			case ENUM_ROLLE_SONSTIGE_VALUE: return ENUM_ROLLE_SONSTIGE;
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
	private ENUMRolle(int value, String name, String literal) {
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
	
} //ENUMRolle
