/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Flankenschutz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Massnahme</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Flankenschutz.FlankenschutzPackage#getENUMMassnahme()
 * @model extendedMetaData="name='ENUMMassnahme'"
 * @generated
 */
public enum ENUMMassnahme implements Enumerator {
	/**
	 * The '<em><b>ENUM Massnahme Fernschutz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MASSNAHME_FERNSCHUTZ_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MASSNAHME_FERNSCHUTZ(0, "ENUMMassnahme_Fernschutz", "Fernschutz"),

	/**
	 * The '<em><b>ENUM Massnahme Verschluss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MASSNAHME_VERSCHLUSS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MASSNAHME_VERSCHLUSS(1, "ENUMMassnahme_Verschluss", "Verschluss"),

	/**
	 * The '<em><b>ENUM Massnahme Verschluss Fernschutz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MASSNAHME_VERSCHLUSS_FERNSCHUTZ_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MASSNAHME_VERSCHLUSS_FERNSCHUTZ(2, "ENUMMassnahme_Verschluss_Fernschutz", "Verschluss_Fernschutz"),

	/**
	 * The '<em><b>ENUM Massnahme Verzicht</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MASSNAHME_VERZICHT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MASSNAHME_VERZICHT(3, "ENUMMassnahme_Verzicht", "Verzicht");

	/**
	 * The '<em><b>ENUM Massnahme Fernschutz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MASSNAHME_FERNSCHUTZ
	 * @model name="ENUMMassnahme_Fernschutz" literal="Fernschutz"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MASSNAHME_FERNSCHUTZ_VALUE = 0;

	/**
	 * The '<em><b>ENUM Massnahme Verschluss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MASSNAHME_VERSCHLUSS
	 * @model name="ENUMMassnahme_Verschluss" literal="Verschluss"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MASSNAHME_VERSCHLUSS_VALUE = 1;

	/**
	 * The '<em><b>ENUM Massnahme Verschluss Fernschutz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MASSNAHME_VERSCHLUSS_FERNSCHUTZ
	 * @model name="ENUMMassnahme_Verschluss_Fernschutz" literal="Verschluss_Fernschutz"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MASSNAHME_VERSCHLUSS_FERNSCHUTZ_VALUE = 2;

	/**
	 * The '<em><b>ENUM Massnahme Verzicht</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MASSNAHME_VERZICHT
	 * @model name="ENUMMassnahme_Verzicht" literal="Verzicht"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MASSNAHME_VERZICHT_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUM Massnahme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMMassnahme[] VALUES_ARRAY =
		new ENUMMassnahme[] {
			ENUM_MASSNAHME_FERNSCHUTZ,
			ENUM_MASSNAHME_VERSCHLUSS,
			ENUM_MASSNAHME_VERSCHLUSS_FERNSCHUTZ,
			ENUM_MASSNAHME_VERZICHT,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Massnahme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMMassnahme> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Massnahme</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMMassnahme get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMMassnahme result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Massnahme</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMMassnahme getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMMassnahme result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Massnahme</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMMassnahme get(int value) {
		switch (value) {
			case ENUM_MASSNAHME_FERNSCHUTZ_VALUE: return ENUM_MASSNAHME_FERNSCHUTZ;
			case ENUM_MASSNAHME_VERSCHLUSS_VALUE: return ENUM_MASSNAHME_VERSCHLUSS;
			case ENUM_MASSNAHME_VERSCHLUSS_FERNSCHUTZ_VALUE: return ENUM_MASSNAHME_VERSCHLUSS_FERNSCHUTZ;
			case ENUM_MASSNAHME_VERZICHT_VALUE: return ENUM_MASSNAHME_VERZICHT;
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
	private ENUMMassnahme(int value, String name, String literal) {
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
	
} //ENUMMassnahme
