/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Basisobjekte;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Bestandsrelevanz</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getENUMBestandsrelevanz()
 * @model extendedMetaData="name='ENUMBestandsrelevanz'"
 * @generated
 */
public enum ENUMBestandsrelevanz implements Enumerator {
	/**
	 * The '<em><b>ENUM Bestandsrelevanz Bestandsdaten</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BESTANDSRELEVANZ_BESTANDSDATEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BESTANDSRELEVANZ_BESTANDSDATEN(0, "ENUMBestandsrelevanz_Bestandsdaten", "Bestandsdaten"),

	/**
	 * The '<em><b>ENUM Bestandsrelevanz Bestandsdokumentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BESTANDSRELEVANZ_BESTANDSDOKUMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BESTANDSRELEVANZ_BESTANDSDOKUMENTATION(1, "ENUMBestandsrelevanz_Bestandsdokumentation", "Bestandsdokumentation"),

	/**
	 * The '<em><b>ENUM Bestandsrelevanz dauerhaft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BESTANDSRELEVANZ_DAUERHAFT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BESTANDSRELEVANZ_DAUERHAFT(2, "ENUMBestandsrelevanz_dauerhaft", "dauerhaft"),

	/**
	 * The '<em><b>ENUM Bestandsrelevanz nein</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BESTANDSRELEVANZ_NEIN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BESTANDSRELEVANZ_NEIN(3, "ENUMBestandsrelevanz_nein", "nein");

	/**
	 * The '<em><b>ENUM Bestandsrelevanz Bestandsdaten</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BESTANDSRELEVANZ_BESTANDSDATEN
	 * @model name="ENUMBestandsrelevanz_Bestandsdaten" literal="Bestandsdaten"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BESTANDSRELEVANZ_BESTANDSDATEN_VALUE = 0;

	/**
	 * The '<em><b>ENUM Bestandsrelevanz Bestandsdokumentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BESTANDSRELEVANZ_BESTANDSDOKUMENTATION
	 * @model name="ENUMBestandsrelevanz_Bestandsdokumentation" literal="Bestandsdokumentation"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BESTANDSRELEVANZ_BESTANDSDOKUMENTATION_VALUE = 1;

	/**
	 * The '<em><b>ENUM Bestandsrelevanz dauerhaft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BESTANDSRELEVANZ_DAUERHAFT
	 * @model name="ENUMBestandsrelevanz_dauerhaft" literal="dauerhaft"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BESTANDSRELEVANZ_DAUERHAFT_VALUE = 2;

	/**
	 * The '<em><b>ENUM Bestandsrelevanz nein</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BESTANDSRELEVANZ_NEIN
	 * @model name="ENUMBestandsrelevanz_nein" literal="nein"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BESTANDSRELEVANZ_NEIN_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Bestandsrelevanz</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMBestandsrelevanz[] VALUES_ARRAY =
		new ENUMBestandsrelevanz[] {
			ENUM_BESTANDSRELEVANZ_BESTANDSDATEN,
			ENUM_BESTANDSRELEVANZ_BESTANDSDOKUMENTATION,
			ENUM_BESTANDSRELEVANZ_DAUERHAFT,
			ENUM_BESTANDSRELEVANZ_NEIN,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Bestandsrelevanz</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMBestandsrelevanz> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Bestandsrelevanz</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBestandsrelevanz get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBestandsrelevanz result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Bestandsrelevanz</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBestandsrelevanz getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBestandsrelevanz result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Bestandsrelevanz</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBestandsrelevanz get(int value) {
		switch (value) {
			case ENUM_BESTANDSRELEVANZ_BESTANDSDATEN_VALUE: return ENUM_BESTANDSRELEVANZ_BESTANDSDATEN;
			case ENUM_BESTANDSRELEVANZ_BESTANDSDOKUMENTATION_VALUE: return ENUM_BESTANDSRELEVANZ_BESTANDSDOKUMENTATION;
			case ENUM_BESTANDSRELEVANZ_DAUERHAFT_VALUE: return ENUM_BESTANDSRELEVANZ_DAUERHAFT;
			case ENUM_BESTANDSRELEVANZ_NEIN_VALUE: return ENUM_BESTANDSRELEVANZ_NEIN;
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
	private ENUMBestandsrelevanz(int value, String name, String literal) {
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
	
} //ENUMBestandsrelevanz
