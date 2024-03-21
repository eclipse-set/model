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
 * A representation of the literals of the enumeration '<em><b>ENUMGFK Kategorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getENUMGFKKategorie()
 * @model extendedMetaData="name='ENUMGFK_Kategorie'"
 * @generated
 */
public enum ENUMGFKKategorie implements Enumerator {
	/**
	 * The '<em><b>ENUMGFK Kategorie gross</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGFK_KATEGORIE_GROSS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGFK_KATEGORIE_GROSS(0, "ENUMGFK_Kategorie_gross", "gross"),

	/**
	 * The '<em><b>ENUMGFK Kategorie klein</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGFK_KATEGORIE_KLEIN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGFK_KATEGORIE_KLEIN(1, "ENUMGFK_Kategorie_klein", "klein"),

	/**
	 * The '<em><b>ENUMGFK Kategorie mittel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGFK_KATEGORIE_MITTEL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGFK_KATEGORIE_MITTEL(2, "ENUMGFK_Kategorie_mittel", "mittel");

	/**
	 * The '<em><b>ENUMGFK Kategorie gross</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGFK_KATEGORIE_GROSS
	 * @model name="ENUMGFK_Kategorie_gross" literal="gross"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGFK_KATEGORIE_GROSS_VALUE = 0;

	/**
	 * The '<em><b>ENUMGFK Kategorie klein</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGFK_KATEGORIE_KLEIN
	 * @model name="ENUMGFK_Kategorie_klein" literal="klein"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGFK_KATEGORIE_KLEIN_VALUE = 1;

	/**
	 * The '<em><b>ENUMGFK Kategorie mittel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGFK_KATEGORIE_MITTEL
	 * @model name="ENUMGFK_Kategorie_mittel" literal="mittel"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGFK_KATEGORIE_MITTEL_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUMGFK Kategorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMGFKKategorie[] VALUES_ARRAY =
		new ENUMGFKKategorie[] {
			ENUMGFK_KATEGORIE_GROSS,
			ENUMGFK_KATEGORIE_KLEIN,
			ENUMGFK_KATEGORIE_MITTEL,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMGFK Kategorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMGFKKategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMGFK Kategorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGFKKategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGFKKategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMGFK Kategorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGFKKategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGFKKategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMGFK Kategorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGFKKategorie get(int value) {
		switch (value) {
			case ENUMGFK_KATEGORIE_GROSS_VALUE: return ENUMGFK_KATEGORIE_GROSS;
			case ENUMGFK_KATEGORIE_KLEIN_VALUE: return ENUMGFK_KATEGORIE_KLEIN;
			case ENUMGFK_KATEGORIE_MITTEL_VALUE: return ENUMGFK_KATEGORIE_MITTEL;
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
	private ENUMGFKKategorie(int value, String name, String literal) {
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
	
} //ENUMGFKKategorie
