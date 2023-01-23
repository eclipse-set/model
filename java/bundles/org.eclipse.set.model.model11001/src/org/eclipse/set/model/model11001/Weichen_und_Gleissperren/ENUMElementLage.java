/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Weichen_und_Gleissperren;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Element Lage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getENUMElementLage()
 * @model extendedMetaData="name='ENUMElement_Lage'"
 * @generated
 */
public enum ENUMElementLage implements Enumerator {
	/**
	 * The '<em><b>ENUM Element Lage Abschnitt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ELEMENT_LAGE_ABSCHNITT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ELEMENT_LAGE_ABSCHNITT(0, "ENUMElement_Lage_Abschnitt", "Abschnitt"),

	/**
	 * The '<em><b>ENUM Element Lage Weiche</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ELEMENT_LAGE_WEICHE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ELEMENT_LAGE_WEICHE(1, "ENUMElement_Lage_Weiche", "Weiche"),

	/**
	 * The '<em><b>ENUM Element Lage Weiche L</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ELEMENT_LAGE_WEICHE_L_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ELEMENT_LAGE_WEICHE_L(2, "ENUMElement_Lage_WeicheL", "WeicheL"),

	/**
	 * The '<em><b>ENUM Element Lage Weiche R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ELEMENT_LAGE_WEICHE_R_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ELEMENT_LAGE_WEICHE_R(3, "ENUMElement_Lage_WeicheR", "WeicheR");

	/**
	 * The '<em><b>ENUM Element Lage Abschnitt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ELEMENT_LAGE_ABSCHNITT
	 * @model name="ENUMElement_Lage_Abschnitt" literal="Abschnitt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ELEMENT_LAGE_ABSCHNITT_VALUE = 0;

	/**
	 * The '<em><b>ENUM Element Lage Weiche</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ELEMENT_LAGE_WEICHE
	 * @model name="ENUMElement_Lage_Weiche" literal="Weiche"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ELEMENT_LAGE_WEICHE_VALUE = 1;

	/**
	 * The '<em><b>ENUM Element Lage Weiche L</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ELEMENT_LAGE_WEICHE_L
	 * @model name="ENUMElement_Lage_WeicheL" literal="WeicheL"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ELEMENT_LAGE_WEICHE_L_VALUE = 2;

	/**
	 * The '<em><b>ENUM Element Lage Weiche R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ELEMENT_LAGE_WEICHE_R
	 * @model name="ENUMElement_Lage_WeicheR" literal="WeicheR"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ELEMENT_LAGE_WEICHE_R_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Element Lage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMElementLage[] VALUES_ARRAY =
		new ENUMElementLage[] {
			ENUM_ELEMENT_LAGE_ABSCHNITT,
			ENUM_ELEMENT_LAGE_WEICHE,
			ENUM_ELEMENT_LAGE_WEICHE_L,
			ENUM_ELEMENT_LAGE_WEICHE_R,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Element Lage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMElementLage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Element Lage</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMElementLage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMElementLage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Element Lage</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMElementLage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMElementLage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Element Lage</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMElementLage get(int value) {
		switch (value) {
			case ENUM_ELEMENT_LAGE_ABSCHNITT_VALUE: return ENUM_ELEMENT_LAGE_ABSCHNITT;
			case ENUM_ELEMENT_LAGE_WEICHE_VALUE: return ENUM_ELEMENT_LAGE_WEICHE;
			case ENUM_ELEMENT_LAGE_WEICHE_L_VALUE: return ENUM_ELEMENT_LAGE_WEICHE_L;
			case ENUM_ELEMENT_LAGE_WEICHE_R_VALUE: return ENUM_ELEMENT_LAGE_WEICHE_R;
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
	private ENUMElementLage(int value, String name, String literal) {
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
	
} //ENUMElementLage
