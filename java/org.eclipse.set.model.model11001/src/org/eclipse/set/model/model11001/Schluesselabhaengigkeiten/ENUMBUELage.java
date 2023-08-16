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
 * A representation of the literals of the enumeration '<em><b>ENUMBUE Lage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getENUMBUELage()
 * @model extendedMetaData="name='ENUMBUE_Lage'"
 * @generated
 */
public enum ENUMBUELage implements Enumerator {
	/**
	 * The '<em><b>ENUMBUE Lage geoeffnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMBUE_LAGE_GEOEFFNET_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMBUE_LAGE_GEOEFFNET(0, "ENUMBUE_Lage_geoeffnet", "geoeffnet"),

	/**
	 * The '<em><b>ENUMBUE Lage geschlossen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMBUE_LAGE_GESCHLOSSEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMBUE_LAGE_GESCHLOSSEN(1, "ENUMBUE_Lage_geschlossen", "geschlossen");

	/**
	 * The '<em><b>ENUMBUE Lage geoeffnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMBUE_LAGE_GEOEFFNET
	 * @model name="ENUMBUE_Lage_geoeffnet" literal="geoeffnet"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMBUE_LAGE_GEOEFFNET_VALUE = 0;

	/**
	 * The '<em><b>ENUMBUE Lage geschlossen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMBUE_LAGE_GESCHLOSSEN
	 * @model name="ENUMBUE_Lage_geschlossen" literal="geschlossen"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMBUE_LAGE_GESCHLOSSEN_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUMBUE Lage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMBUELage[] VALUES_ARRAY =
		new ENUMBUELage[] {
			ENUMBUE_LAGE_GEOEFFNET,
			ENUMBUE_LAGE_GESCHLOSSEN,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMBUE Lage</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMBUELage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMBUE Lage</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBUELage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBUELage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMBUE Lage</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBUELage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBUELage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMBUE Lage</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBUELage get(int value) {
		switch (value) {
			case ENUMBUE_LAGE_GEOEFFNET_VALUE: return ENUMBUE_LAGE_GEOEFFNET;
			case ENUMBUE_LAGE_GESCHLOSSEN_VALUE: return ENUMBUE_LAGE_GESCHLOSSEN;
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
	private ENUMBUELage(int value, String name, String literal) {
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
	
} //ENUMBUELage
