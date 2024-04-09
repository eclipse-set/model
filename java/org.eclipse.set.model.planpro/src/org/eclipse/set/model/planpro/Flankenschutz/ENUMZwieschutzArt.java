/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Flankenschutz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Zwieschutz Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getENUMZwieschutzArt()
 * @model extendedMetaData="name='ENUMZwieschutz_Art'"
 * @generated
 */
public enum ENUMZwieschutzArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Zwieschutz Art echt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ZWIESCHUTZ_ART_ECHT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ZWIESCHUTZ_ART_ECHT(0, "ENUMZwieschutz_Art_echt", "echt"),

	/**
	 * The '<em><b>ENUM Zwieschutz Art echt eigen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ZWIESCHUTZ_ART_ECHT_EIGEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ZWIESCHUTZ_ART_ECHT_EIGEN(1, "ENUMZwieschutz_Art_echt_eigen", "echt_eigen"),

	/**
	 * The '<em><b>ENUM Zwieschutz Art eigen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ZWIESCHUTZ_ART_EIGEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ZWIESCHUTZ_ART_EIGEN(2, "ENUMZwieschutz_Art_eigen", "eigen");

	/**
	 * The '<em><b>ENUM Zwieschutz Art echt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ZWIESCHUTZ_ART_ECHT
	 * @model name="ENUMZwieschutz_Art_echt" literal="echt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ZWIESCHUTZ_ART_ECHT_VALUE = 0;

	/**
	 * The '<em><b>ENUM Zwieschutz Art echt eigen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ZWIESCHUTZ_ART_ECHT_EIGEN
	 * @model name="ENUMZwieschutz_Art_echt_eigen" literal="echt_eigen"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ZWIESCHUTZ_ART_ECHT_EIGEN_VALUE = 1;

	/**
	 * The '<em><b>ENUM Zwieschutz Art eigen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ZWIESCHUTZ_ART_EIGEN
	 * @model name="ENUMZwieschutz_Art_eigen" literal="eigen"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ZWIESCHUTZ_ART_EIGEN_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Zwieschutz Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMZwieschutzArt[] VALUES_ARRAY =
		new ENUMZwieschutzArt[] {
			ENUM_ZWIESCHUTZ_ART_ECHT,
			ENUM_ZWIESCHUTZ_ART_ECHT_EIGEN,
			ENUM_ZWIESCHUTZ_ART_EIGEN,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Zwieschutz Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMZwieschutzArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Zwieschutz Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMZwieschutzArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMZwieschutzArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Zwieschutz Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMZwieschutzArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMZwieschutzArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Zwieschutz Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMZwieschutzArt get(int value) {
		switch (value) {
			case ENUM_ZWIESCHUTZ_ART_ECHT_VALUE: return ENUM_ZWIESCHUTZ_ART_ECHT;
			case ENUM_ZWIESCHUTZ_ART_ECHT_EIGEN_VALUE: return ENUM_ZWIESCHUTZ_ART_ECHT_EIGEN;
			case ENUM_ZWIESCHUTZ_ART_EIGEN_VALUE: return ENUM_ZWIESCHUTZ_ART_EIGEN;
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
	private ENUMZwieschutzArt(int value, String name, String literal) {
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
	
} //ENUMZwieschutzArt
