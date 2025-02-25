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
 * A representation of the literals of the enumeration '<em><b>ENUMGUE Anordnung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getENUMGUEAnordnung()
 * @model extendedMetaData="name='ENUMGUE_Anordnung'"
 * @generated
 */
public enum ENUMGUEAnordnung implements Enumerator {
	/**
	 * The '<em><b>ENUMGUE Anordnung 1EA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_ANORDNUNG_1EA_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGUE_ANORDNUNG_1EA(0, "ENUMGUE_Anordnung_1_EA", "1_EA"),

	/**
	 * The '<em><b>ENUMGUE Anordnung 2AE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_ANORDNUNG_2AE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGUE_ANORDNUNG_2AE(1, "ENUMGUE_Anordnung_2_AE", "2_AE");

	/**
	 * The '<em><b>ENUMGUE Anordnung 1EA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_ANORDNUNG_1EA
	 * @model name="ENUMGUE_Anordnung_1_EA" literal="1_EA"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGUE_ANORDNUNG_1EA_VALUE = 0;

	/**
	 * The '<em><b>ENUMGUE Anordnung 2AE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGUE_ANORDNUNG_2AE
	 * @model name="ENUMGUE_Anordnung_2_AE" literal="2_AE"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGUE_ANORDNUNG_2AE_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUMGUE Anordnung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMGUEAnordnung[] VALUES_ARRAY =
		new ENUMGUEAnordnung[] {
			ENUMGUE_ANORDNUNG_1EA,
			ENUMGUE_ANORDNUNG_2AE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMGUE Anordnung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMGUEAnordnung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMGUE Anordnung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGUEAnordnung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGUEAnordnung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMGUE Anordnung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGUEAnordnung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGUEAnordnung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMGUE Anordnung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGUEAnordnung get(int value) {
		switch (value) {
			case ENUMGUE_ANORDNUNG_1EA_VALUE: return ENUMGUE_ANORDNUNG_1EA;
			case ENUMGUE_ANORDNUNG_2AE_VALUE: return ENUMGUE_ANORDNUNG_2AE;
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
	private ENUMGUEAnordnung(int value, String name, String literal) {
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
	
} //ENUMGUEAnordnung
