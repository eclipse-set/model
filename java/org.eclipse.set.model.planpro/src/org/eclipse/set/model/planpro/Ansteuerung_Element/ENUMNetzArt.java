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
 * A representation of the literals of the enumeration '<em><b>ENUM Netz Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getENUMNetzArt()
 * @model extendedMetaData="name='ENUMNetz_Art'"
 * @generated
 */
public enum ENUMNetzArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Netz Art geschlossen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_NETZ_ART_GESCHLOSSEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_NETZ_ART_GESCHLOSSEN(0, "ENUMNetz_Art_geschlossen", "geschlossen"),

	/**
	 * The '<em><b>ENUM Netz Art KISA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_NETZ_ART_KISA_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_NETZ_ART_KISA(1, "ENUMNetz_Art_KISA", "KISA"),

	/**
	 * The '<em><b>ENUM Netz Art offen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_NETZ_ART_OFFEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_NETZ_ART_OFFEN(2, "ENUMNetz_Art_offen", "offen"),

	/**
	 * The '<em><b>ENUM Netz Art SBI intern</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_NETZ_ART_SBI_INTERN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_NETZ_ART_SBI_INTERN(3, "ENUMNetz_Art_SBI_intern", "SBI_intern"),

	/**
	 * The '<em><b>ENUM Netz Art SG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_NETZ_ART_SG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_NETZ_ART_SG(4, "ENUMNetz_Art_SG", "SG"),

	/**
	 * The '<em><b>ENUM Netz Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_NETZ_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_NETZ_ART_SONSTIGE(5, "ENUMNetz_Art_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Netz Art geschlossen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_NETZ_ART_GESCHLOSSEN
	 * @model name="ENUMNetz_Art_geschlossen" literal="geschlossen"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_NETZ_ART_GESCHLOSSEN_VALUE = 0;

	/**
	 * The '<em><b>ENUM Netz Art KISA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_NETZ_ART_KISA
	 * @model name="ENUMNetz_Art_KISA" literal="KISA"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_NETZ_ART_KISA_VALUE = 1;

	/**
	 * The '<em><b>ENUM Netz Art offen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_NETZ_ART_OFFEN
	 * @model name="ENUMNetz_Art_offen" literal="offen"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_NETZ_ART_OFFEN_VALUE = 2;

	/**
	 * The '<em><b>ENUM Netz Art SBI intern</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_NETZ_ART_SBI_INTERN
	 * @model name="ENUMNetz_Art_SBI_intern" literal="SBI_intern"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_NETZ_ART_SBI_INTERN_VALUE = 3;

	/**
	 * The '<em><b>ENUM Netz Art SG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_NETZ_ART_SG
	 * @model name="ENUMNetz_Art_SG" literal="SG"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_NETZ_ART_SG_VALUE = 4;

	/**
	 * The '<em><b>ENUM Netz Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_NETZ_ART_SONSTIGE
	 * @model name="ENUMNetz_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_NETZ_ART_SONSTIGE_VALUE = 5;

	/**
	 * An array of all the '<em><b>ENUM Netz Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMNetzArt[] VALUES_ARRAY =
		new ENUMNetzArt[] {
			ENUM_NETZ_ART_GESCHLOSSEN,
			ENUM_NETZ_ART_KISA,
			ENUM_NETZ_ART_OFFEN,
			ENUM_NETZ_ART_SBI_INTERN,
			ENUM_NETZ_ART_SG,
			ENUM_NETZ_ART_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Netz Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMNetzArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Netz Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMNetzArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMNetzArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Netz Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMNetzArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMNetzArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Netz Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMNetzArt get(int value) {
		switch (value) {
			case ENUM_NETZ_ART_GESCHLOSSEN_VALUE: return ENUM_NETZ_ART_GESCHLOSSEN;
			case ENUM_NETZ_ART_KISA_VALUE: return ENUM_NETZ_ART_KISA;
			case ENUM_NETZ_ART_OFFEN_VALUE: return ENUM_NETZ_ART_OFFEN;
			case ENUM_NETZ_ART_SBI_INTERN_VALUE: return ENUM_NETZ_ART_SBI_INTERN;
			case ENUM_NETZ_ART_SG_VALUE: return ENUM_NETZ_ART_SG;
			case ENUM_NETZ_ART_SONSTIGE_VALUE: return ENUM_NETZ_ART_SONSTIGE;
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
	private ENUMNetzArt(int value, String name, String literal) {
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
	
} //ENUMNetzArt
