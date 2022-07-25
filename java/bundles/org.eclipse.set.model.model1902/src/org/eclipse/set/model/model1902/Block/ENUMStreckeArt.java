/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Block;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Strecke Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getENUMStreckeArt()
 * @model extendedMetaData="name='ENUMStrecke_Art'"
 * @generated
 */
public enum ENUMStreckeArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Strecke Art Hauptbahn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STRECKE_ART_HAUPTBAHN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_STRECKE_ART_HAUPTBAHN(0, "ENUMStrecke_Art_Hauptbahn", "Hauptbahn"),

	/**
	 * The '<em><b>ENUM Strecke Art Nebenbahn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STRECKE_ART_NEBENBAHN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_STRECKE_ART_NEBENBAHN(1, "ENUMStrecke_Art_Nebenbahn", "Nebenbahn");

	/**
	 * The '<em><b>ENUM Strecke Art Hauptbahn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STRECKE_ART_HAUPTBAHN
	 * @model name="ENUMStrecke_Art_Hauptbahn" literal="Hauptbahn"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_STRECKE_ART_HAUPTBAHN_VALUE = 0;

	/**
	 * The '<em><b>ENUM Strecke Art Nebenbahn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_STRECKE_ART_NEBENBAHN
	 * @model name="ENUMStrecke_Art_Nebenbahn" literal="Nebenbahn"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_STRECKE_ART_NEBENBAHN_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUM Strecke Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMStreckeArt[] VALUES_ARRAY =
		new ENUMStreckeArt[] {
			ENUM_STRECKE_ART_HAUPTBAHN,
			ENUM_STRECKE_ART_NEBENBAHN,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Strecke Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMStreckeArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Strecke Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMStreckeArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMStreckeArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Strecke Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMStreckeArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMStreckeArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Strecke Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMStreckeArt get(int value) {
		switch (value) {
			case ENUM_STRECKE_ART_HAUPTBAHN_VALUE: return ENUM_STRECKE_ART_HAUPTBAHN;
			case ENUM_STRECKE_ART_NEBENBAHN_VALUE: return ENUM_STRECKE_ART_NEBENBAHN;
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
	private ENUMStreckeArt(int value, String name, String literal) {
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
	
} //ENUMStreckeArt
