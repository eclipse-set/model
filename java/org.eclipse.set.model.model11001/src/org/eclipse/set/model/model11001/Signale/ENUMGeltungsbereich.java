/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Signale;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Geltungsbereich</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Signale.SignalePackage#getENUMGeltungsbereich()
 * @model extendedMetaData="name='ENUMGeltungsbereich'"
 * @generated
 */
public enum ENUMGeltungsbereich implements Enumerator {
	/**
	 * The '<em><b>ENUM Geltungsbereich DS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GELTUNGSBEREICH_DS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GELTUNGSBEREICH_DS(0, "ENUMGeltungsbereich_DS", "DS"),

	/**
	 * The '<em><b>ENUM Geltungsbereich DV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GELTUNGSBEREICH_DV_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GELTUNGSBEREICH_DV(1, "ENUMGeltungsbereich_DV", "DV"),

	/**
	 * The '<em><b>ENUM Geltungsbereich SBahn B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GELTUNGSBEREICH_SBAHN_B_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GELTUNGSBEREICH_SBAHN_B(2, "ENUMGeltungsbereich_S_Bahn_B", "S-Bahn B"),

	/**
	 * The '<em><b>ENUM Geltungsbereich SBahn HH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GELTUNGSBEREICH_SBAHN_HH_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GELTUNGSBEREICH_SBAHN_HH(3, "ENUMGeltungsbereich_S_Bahn_HH", "S-Bahn HH");

	/**
	 * The '<em><b>ENUM Geltungsbereich DS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GELTUNGSBEREICH_DS
	 * @model name="ENUMGeltungsbereich_DS" literal="DS"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GELTUNGSBEREICH_DS_VALUE = 0;

	/**
	 * The '<em><b>ENUM Geltungsbereich DV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GELTUNGSBEREICH_DV
	 * @model name="ENUMGeltungsbereich_DV" literal="DV"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GELTUNGSBEREICH_DV_VALUE = 1;

	/**
	 * The '<em><b>ENUM Geltungsbereich SBahn B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GELTUNGSBEREICH_SBAHN_B
	 * @model name="ENUMGeltungsbereich_S_Bahn_B" literal="S-Bahn B"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GELTUNGSBEREICH_SBAHN_B_VALUE = 2;

	/**
	 * The '<em><b>ENUM Geltungsbereich SBahn HH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GELTUNGSBEREICH_SBAHN_HH
	 * @model name="ENUMGeltungsbereich_S_Bahn_HH" literal="S-Bahn HH"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GELTUNGSBEREICH_SBAHN_HH_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Geltungsbereich</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMGeltungsbereich[] VALUES_ARRAY =
		new ENUMGeltungsbereich[] {
			ENUM_GELTUNGSBEREICH_DS,
			ENUM_GELTUNGSBEREICH_DV,
			ENUM_GELTUNGSBEREICH_SBAHN_B,
			ENUM_GELTUNGSBEREICH_SBAHN_HH,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Geltungsbereich</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMGeltungsbereich> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Geltungsbereich</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGeltungsbereich get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGeltungsbereich result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Geltungsbereich</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGeltungsbereich getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGeltungsbereich result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Geltungsbereich</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGeltungsbereich get(int value) {
		switch (value) {
			case ENUM_GELTUNGSBEREICH_DS_VALUE: return ENUM_GELTUNGSBEREICH_DS;
			case ENUM_GELTUNGSBEREICH_DV_VALUE: return ENUM_GELTUNGSBEREICH_DV;
			case ENUM_GELTUNGSBEREICH_SBAHN_B_VALUE: return ENUM_GELTUNGSBEREICH_SBAHN_B;
			case ENUM_GELTUNGSBEREICH_SBAHN_HH_VALUE: return ENUM_GELTUNGSBEREICH_SBAHN_HH;
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
	private ENUMGeltungsbereich(int value, String name, String literal) {
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
	
} //ENUMGeltungsbereich
