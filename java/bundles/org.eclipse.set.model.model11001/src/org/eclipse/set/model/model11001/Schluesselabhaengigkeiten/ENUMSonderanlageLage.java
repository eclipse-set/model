/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Schluesselabhaengigkeiten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Sonderanlage Lage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getENUMSonderanlageLage()
 * @model extendedMetaData="name='ENUMSonderanlage_Lage'"
 * @generated
 */
public enum ENUMSonderanlageLage implements Enumerator {
	/**
	 * The '<em><b>ENUM Sonderanlage Lage befahrbar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SONDERANLAGE_LAGE_BEFAHRBAR_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SONDERANLAGE_LAGE_BEFAHRBAR(0, "ENUMSonderanlage_Lage_befahrbar", "befahrbar"),

	/**
	 * The '<em><b>ENUM Sonderanlage Lage nicht befahrbar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SONDERANLAGE_LAGE_NICHT_BEFAHRBAR_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SONDERANLAGE_LAGE_NICHT_BEFAHRBAR(1, "ENUMSonderanlage_Lage_nicht_befahrbar", "nicht befahrbar"),

	/**
	 * The '<em><b>ENUM Sonderanlage Lage sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SONDERANLAGE_LAGE_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SONDERANLAGE_LAGE_SONSTIGE(2, "ENUMSonderanlage_Lage_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Sonderanlage Lage befahrbar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SONDERANLAGE_LAGE_BEFAHRBAR
	 * @model name="ENUMSonderanlage_Lage_befahrbar" literal="befahrbar"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SONDERANLAGE_LAGE_BEFAHRBAR_VALUE = 0;

	/**
	 * The '<em><b>ENUM Sonderanlage Lage nicht befahrbar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SONDERANLAGE_LAGE_NICHT_BEFAHRBAR
	 * @model name="ENUMSonderanlage_Lage_nicht_befahrbar" literal="nicht befahrbar"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SONDERANLAGE_LAGE_NICHT_BEFAHRBAR_VALUE = 1;

	/**
	 * The '<em><b>ENUM Sonderanlage Lage sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SONDERANLAGE_LAGE_SONSTIGE
	 * @model name="ENUMSonderanlage_Lage_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SONDERANLAGE_LAGE_SONSTIGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Sonderanlage Lage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMSonderanlageLage[] VALUES_ARRAY =
		new ENUMSonderanlageLage[] {
			ENUM_SONDERANLAGE_LAGE_BEFAHRBAR,
			ENUM_SONDERANLAGE_LAGE_NICHT_BEFAHRBAR,
			ENUM_SONDERANLAGE_LAGE_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Sonderanlage Lage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMSonderanlageLage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Sonderanlage Lage</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSonderanlageLage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMSonderanlageLage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Sonderanlage Lage</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSonderanlageLage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMSonderanlageLage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Sonderanlage Lage</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSonderanlageLage get(int value) {
		switch (value) {
			case ENUM_SONDERANLAGE_LAGE_BEFAHRBAR_VALUE: return ENUM_SONDERANLAGE_LAGE_BEFAHRBAR;
			case ENUM_SONDERANLAGE_LAGE_NICHT_BEFAHRBAR_VALUE: return ENUM_SONDERANLAGE_LAGE_NICHT_BEFAHRBAR;
			case ENUM_SONDERANLAGE_LAGE_SONSTIGE_VALUE: return ENUM_SONDERANLAGE_LAGE_SONSTIGE;
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
	private ENUMSonderanlageLage(int value, String name, String literal) {
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
	
} //ENUMSonderanlageLage
