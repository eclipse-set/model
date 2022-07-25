/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Gleis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Konstruktion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Gleis.GleisPackage#getENUMKonstruktion()
 * @model extendedMetaData="name='ENUMKonstruktion'"
 * @generated
 */
public enum ENUMKonstruktion implements Enumerator {
	/**
	 * The '<em><b>ENUM Konstruktion Feste Fahrbahn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KONSTRUKTION_FESTE_FAHRBAHN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_KONSTRUKTION_FESTE_FAHRBAHN(0, "ENUMKonstruktion_Feste_Fahrbahn", "Feste_Fahrbahn"),

	/**
	 * The '<em><b>ENUM Konstruktion Schutzschiene links</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KONSTRUKTION_SCHUTZSCHIENE_LINKS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_KONSTRUKTION_SCHUTZSCHIENE_LINKS(1, "ENUMKonstruktion_Schutzschiene_links", "Schutzschiene_links"),

	/**
	 * The '<em><b>ENUM Konstruktion Schutzschiene rechts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KONSTRUKTION_SCHUTZSCHIENE_RECHTS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_KONSTRUKTION_SCHUTZSCHIENE_RECHTS(2, "ENUMKonstruktion_Schutzschiene_rechts", "Schutzschiene_rechts"),

	/**
	 * The '<em><b>ENUM Konstruktion sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KONSTRUKTION_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_KONSTRUKTION_SONSTIGE(3, "ENUMKonstruktion_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Konstruktion Feste Fahrbahn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KONSTRUKTION_FESTE_FAHRBAHN
	 * @model name="ENUMKonstruktion_Feste_Fahrbahn" literal="Feste_Fahrbahn"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_KONSTRUKTION_FESTE_FAHRBAHN_VALUE = 0;

	/**
	 * The '<em><b>ENUM Konstruktion Schutzschiene links</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KONSTRUKTION_SCHUTZSCHIENE_LINKS
	 * @model name="ENUMKonstruktion_Schutzschiene_links" literal="Schutzschiene_links"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_KONSTRUKTION_SCHUTZSCHIENE_LINKS_VALUE = 1;

	/**
	 * The '<em><b>ENUM Konstruktion Schutzschiene rechts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KONSTRUKTION_SCHUTZSCHIENE_RECHTS
	 * @model name="ENUMKonstruktion_Schutzschiene_rechts" literal="Schutzschiene_rechts"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_KONSTRUKTION_SCHUTZSCHIENE_RECHTS_VALUE = 2;

	/**
	 * The '<em><b>ENUM Konstruktion sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KONSTRUKTION_SONSTIGE
	 * @model name="ENUMKonstruktion_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_KONSTRUKTION_SONSTIGE_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Konstruktion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMKonstruktion[] VALUES_ARRAY =
		new ENUMKonstruktion[] {
			ENUM_KONSTRUKTION_FESTE_FAHRBAHN,
			ENUM_KONSTRUKTION_SCHUTZSCHIENE_LINKS,
			ENUM_KONSTRUKTION_SCHUTZSCHIENE_RECHTS,
			ENUM_KONSTRUKTION_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Konstruktion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMKonstruktion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Konstruktion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMKonstruktion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMKonstruktion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Konstruktion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMKonstruktion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMKonstruktion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Konstruktion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMKonstruktion get(int value) {
		switch (value) {
			case ENUM_KONSTRUKTION_FESTE_FAHRBAHN_VALUE: return ENUM_KONSTRUKTION_FESTE_FAHRBAHN;
			case ENUM_KONSTRUKTION_SCHUTZSCHIENE_LINKS_VALUE: return ENUM_KONSTRUKTION_SCHUTZSCHIENE_LINKS;
			case ENUM_KONSTRUKTION_SCHUTZSCHIENE_RECHTS_VALUE: return ENUM_KONSTRUKTION_SCHUTZSCHIENE_RECHTS;
			case ENUM_KONSTRUKTION_SONSTIGE_VALUE: return ENUM_KONSTRUKTION_SONSTIGE;
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
	private ENUMKonstruktion(int value, String name, String literal) {
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
	
} //ENUMKonstruktion
