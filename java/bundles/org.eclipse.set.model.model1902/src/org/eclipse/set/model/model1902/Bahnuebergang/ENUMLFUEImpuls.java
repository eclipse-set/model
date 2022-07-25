/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMLFUE Impuls</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getENUMLFUEImpuls()
 * @model extendedMetaData="name='ENUMLFUE_Impuls'"
 * @generated
 */
public enum ENUMLFUEImpuls implements Enumerator {
	/**
	 * The '<em><b>ENUMLFUE Impuls 1zu 40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMLFUE_IMPULS_1ZU_40_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMLFUE_IMPULS_1ZU_40(0, "ENUMLFUE_Impuls_1_zu_40", "1_zu_40"),

	/**
	 * The '<em><b>ENUMLFUE Impuls Dauerimpuls</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMLFUE_IMPULS_DAUERIMPULS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMLFUE_IMPULS_DAUERIMPULS(1, "ENUMLFUE_Impuls_Dauerimpuls", "Dauerimpuls"),

	/**
	 * The '<em><b>ENUMLFUE Impuls sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMLFUE_IMPULS_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMLFUE_IMPULS_SONSTIGE(2, "ENUMLFUE_Impuls_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUMLFUE Impuls 1zu 40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMLFUE_IMPULS_1ZU_40
	 * @model name="ENUMLFUE_Impuls_1_zu_40" literal="1_zu_40"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMLFUE_IMPULS_1ZU_40_VALUE = 0;

	/**
	 * The '<em><b>ENUMLFUE Impuls Dauerimpuls</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMLFUE_IMPULS_DAUERIMPULS
	 * @model name="ENUMLFUE_Impuls_Dauerimpuls" literal="Dauerimpuls"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMLFUE_IMPULS_DAUERIMPULS_VALUE = 1;

	/**
	 * The '<em><b>ENUMLFUE Impuls sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMLFUE_IMPULS_SONSTIGE
	 * @model name="ENUMLFUE_Impuls_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMLFUE_IMPULS_SONSTIGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUMLFUE Impuls</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMLFUEImpuls[] VALUES_ARRAY =
		new ENUMLFUEImpuls[] {
			ENUMLFUE_IMPULS_1ZU_40,
			ENUMLFUE_IMPULS_DAUERIMPULS,
			ENUMLFUE_IMPULS_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMLFUE Impuls</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMLFUEImpuls> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMLFUE Impuls</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLFUEImpuls get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMLFUEImpuls result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMLFUE Impuls</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLFUEImpuls getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMLFUEImpuls result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMLFUE Impuls</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLFUEImpuls get(int value) {
		switch (value) {
			case ENUMLFUE_IMPULS_1ZU_40_VALUE: return ENUMLFUE_IMPULS_1ZU_40;
			case ENUMLFUE_IMPULS_DAUERIMPULS_VALUE: return ENUMLFUE_IMPULS_DAUERIMPULS;
			case ENUMLFUE_IMPULS_SONSTIGE_VALUE: return ENUMLFUE_IMPULS_SONSTIGE;
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
	private ENUMLFUEImpuls(int value, String name, String literal) {
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
	
} //ENUMLFUEImpuls
