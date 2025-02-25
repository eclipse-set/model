/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMTSO Teilsystem Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getENUMTSOTeilsystemArt()
 * @model extendedMetaData="name='ENUMTSO_Teilsystem_Art'"
 * @generated
 */
public enum ENUMTSOTeilsystemArt implements Enumerator {
	/**
	 * The '<em><b>ENUMTSO Teilsystem Art Doku ZMA ZL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTSO_TEILSYSTEM_ART_DOKU_ZMA_ZL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTSO_TEILSYSTEM_ART_DOKU_ZMA_ZL(0, "ENUMTSO_Teilsystem_Art_Doku_ZMA_ZL", "Doku ZMA ZL"),

	/**
	 * The '<em><b>ENUMTSO Teilsystem Art MDM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTSO_TEILSYSTEM_ART_MDM_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTSO_TEILSYSTEM_ART_MDM(1, "ENUMTSO_Teilsystem_Art_MDM", "MDM"),

	/**
	 * The '<em><b>ENUMTSO Teilsystem Art RBC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTSO_TEILSYSTEM_ART_RBC_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTSO_TEILSYSTEM_ART_RBC(2, "ENUMTSO_Teilsystem_Art_RBC", "RBC"),

	/**
	 * The '<em><b>ENUMTSO Teilsystem Art Transfernetz mit SI LST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTSO_TEILSYSTEM_ART_TRANSFERNETZ_MIT_SI_LST_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTSO_TEILSYSTEM_ART_TRANSFERNETZ_MIT_SI_LST(3, "ENUMTSO_Teilsystem_Art_Transfernetz_mit_SI_LST", "Transfernetz mit SI LST"),

	/**
	 * The '<em><b>ENUMTSO Teilsystem Art ZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTSO_TEILSYSTEM_ART_ZE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTSO_TEILSYSTEM_ART_ZE(4, "ENUMTSO_Teilsystem_Art_ZE", "ZE");

	/**
	 * The '<em><b>ENUMTSO Teilsystem Art Doku ZMA ZL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTSO_TEILSYSTEM_ART_DOKU_ZMA_ZL
	 * @model name="ENUMTSO_Teilsystem_Art_Doku_ZMA_ZL" literal="Doku ZMA ZL"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTSO_TEILSYSTEM_ART_DOKU_ZMA_ZL_VALUE = 0;

	/**
	 * The '<em><b>ENUMTSO Teilsystem Art MDM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTSO_TEILSYSTEM_ART_MDM
	 * @model name="ENUMTSO_Teilsystem_Art_MDM" literal="MDM"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTSO_TEILSYSTEM_ART_MDM_VALUE = 1;

	/**
	 * The '<em><b>ENUMTSO Teilsystem Art RBC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTSO_TEILSYSTEM_ART_RBC
	 * @model name="ENUMTSO_Teilsystem_Art_RBC" literal="RBC"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTSO_TEILSYSTEM_ART_RBC_VALUE = 2;

	/**
	 * The '<em><b>ENUMTSO Teilsystem Art Transfernetz mit SI LST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTSO_TEILSYSTEM_ART_TRANSFERNETZ_MIT_SI_LST
	 * @model name="ENUMTSO_Teilsystem_Art_Transfernetz_mit_SI_LST" literal="Transfernetz mit SI LST"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTSO_TEILSYSTEM_ART_TRANSFERNETZ_MIT_SI_LST_VALUE = 3;

	/**
	 * The '<em><b>ENUMTSO Teilsystem Art ZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTSO_TEILSYSTEM_ART_ZE
	 * @model name="ENUMTSO_Teilsystem_Art_ZE" literal="ZE"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTSO_TEILSYSTEM_ART_ZE_VALUE = 4;

	/**
	 * An array of all the '<em><b>ENUMTSO Teilsystem Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMTSOTeilsystemArt[] VALUES_ARRAY =
		new ENUMTSOTeilsystemArt[] {
			ENUMTSO_TEILSYSTEM_ART_DOKU_ZMA_ZL,
			ENUMTSO_TEILSYSTEM_ART_MDM,
			ENUMTSO_TEILSYSTEM_ART_RBC,
			ENUMTSO_TEILSYSTEM_ART_TRANSFERNETZ_MIT_SI_LST,
			ENUMTSO_TEILSYSTEM_ART_ZE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMTSO Teilsystem Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMTSOTeilsystemArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMTSO Teilsystem Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTSOTeilsystemArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMTSOTeilsystemArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMTSO Teilsystem Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTSOTeilsystemArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMTSOTeilsystemArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMTSO Teilsystem Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTSOTeilsystemArt get(int value) {
		switch (value) {
			case ENUMTSO_TEILSYSTEM_ART_DOKU_ZMA_ZL_VALUE: return ENUMTSO_TEILSYSTEM_ART_DOKU_ZMA_ZL;
			case ENUMTSO_TEILSYSTEM_ART_MDM_VALUE: return ENUMTSO_TEILSYSTEM_ART_MDM;
			case ENUMTSO_TEILSYSTEM_ART_RBC_VALUE: return ENUMTSO_TEILSYSTEM_ART_RBC;
			case ENUMTSO_TEILSYSTEM_ART_TRANSFERNETZ_MIT_SI_LST_VALUE: return ENUMTSO_TEILSYSTEM_ART_TRANSFERNETZ_MIT_SI_LST;
			case ENUMTSO_TEILSYSTEM_ART_ZE_VALUE: return ENUMTSO_TEILSYSTEM_ART_ZE;
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
	private ENUMTSOTeilsystemArt(int value, String name, String literal) {
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
	
} //ENUMTSOTeilsystemArt
