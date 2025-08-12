/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Bedien Platz Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getENUMBedienPlatzArt()
 * @model extendedMetaData="name='ENUMBedien_Platz_Art'"
 * @generated
 */
public enum ENUMBedienPlatzArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Bedien Platz Art Not BPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEDIEN_PLATZ_ART_NOT_BPS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEDIEN_PLATZ_ART_NOT_BPS(0, "ENUMBedien_Platz_Art_Not_BPS", "Not_BPS"),

	/**
	 * The '<em><b>ENUM Bedien Platz Art Not BPS abgesetzt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEDIEN_PLATZ_ART_NOT_BPS_ABGESETZT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEDIEN_PLATZ_ART_NOT_BPS_ABGESETZT(1, "ENUMBedien_Platz_Art_Not_BPS_abgesetzt", "Not_BPS_abgesetzt"),

	/**
	 * The '<em><b>ENUM Bedien Platz Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEDIEN_PLATZ_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEDIEN_PLATZ_ART_SONSTIGE(2, "ENUMBedien_Platz_Art_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Bedien Platz Art Standard BPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEDIEN_PLATZ_ART_STANDARD_BPS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEDIEN_PLATZ_ART_STANDARD_BPS(3, "ENUMBedien_Platz_Art_Standard_BPS", "Standard_BPS"),

	/**
	 * The '<em><b>ENUM Bedien Platz Art Standard BPS abgesetzt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEDIEN_PLATZ_ART_STANDARD_BPS_ABGESETZT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEDIEN_PLATZ_ART_STANDARD_BPS_ABGESETZT(4, "ENUMBedien_Platz_Art_Standard_BPS_abgesetzt", "Standard_BPS_abgesetzt");

	/**
	 * The '<em><b>ENUM Bedien Platz Art Not BPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEDIEN_PLATZ_ART_NOT_BPS
	 * @model name="ENUMBedien_Platz_Art_Not_BPS" literal="Not_BPS"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEDIEN_PLATZ_ART_NOT_BPS_VALUE = 0;

	/**
	 * The '<em><b>ENUM Bedien Platz Art Not BPS abgesetzt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEDIEN_PLATZ_ART_NOT_BPS_ABGESETZT
	 * @model name="ENUMBedien_Platz_Art_Not_BPS_abgesetzt" literal="Not_BPS_abgesetzt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEDIEN_PLATZ_ART_NOT_BPS_ABGESETZT_VALUE = 1;

	/**
	 * The '<em><b>ENUM Bedien Platz Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEDIEN_PLATZ_ART_SONSTIGE
	 * @model name="ENUMBedien_Platz_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEDIEN_PLATZ_ART_SONSTIGE_VALUE = 2;

	/**
	 * The '<em><b>ENUM Bedien Platz Art Standard BPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEDIEN_PLATZ_ART_STANDARD_BPS
	 * @model name="ENUMBedien_Platz_Art_Standard_BPS" literal="Standard_BPS"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEDIEN_PLATZ_ART_STANDARD_BPS_VALUE = 3;

	/**
	 * The '<em><b>ENUM Bedien Platz Art Standard BPS abgesetzt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEDIEN_PLATZ_ART_STANDARD_BPS_ABGESETZT
	 * @model name="ENUMBedien_Platz_Art_Standard_BPS_abgesetzt" literal="Standard_BPS_abgesetzt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEDIEN_PLATZ_ART_STANDARD_BPS_ABGESETZT_VALUE = 4;

	/**
	 * An array of all the '<em><b>ENUM Bedien Platz Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMBedienPlatzArt[] VALUES_ARRAY =
		new ENUMBedienPlatzArt[] {
			ENUM_BEDIEN_PLATZ_ART_NOT_BPS,
			ENUM_BEDIEN_PLATZ_ART_NOT_BPS_ABGESETZT,
			ENUM_BEDIEN_PLATZ_ART_SONSTIGE,
			ENUM_BEDIEN_PLATZ_ART_STANDARD_BPS,
			ENUM_BEDIEN_PLATZ_ART_STANDARD_BPS_ABGESETZT,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Bedien Platz Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMBedienPlatzArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Bedien Platz Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBedienPlatzArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBedienPlatzArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Bedien Platz Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBedienPlatzArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBedienPlatzArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Bedien Platz Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBedienPlatzArt get(int value) {
		switch (value) {
			case ENUM_BEDIEN_PLATZ_ART_NOT_BPS_VALUE: return ENUM_BEDIEN_PLATZ_ART_NOT_BPS;
			case ENUM_BEDIEN_PLATZ_ART_NOT_BPS_ABGESETZT_VALUE: return ENUM_BEDIEN_PLATZ_ART_NOT_BPS_ABGESETZT;
			case ENUM_BEDIEN_PLATZ_ART_SONSTIGE_VALUE: return ENUM_BEDIEN_PLATZ_ART_SONSTIGE;
			case ENUM_BEDIEN_PLATZ_ART_STANDARD_BPS_VALUE: return ENUM_BEDIEN_PLATZ_ART_STANDARD_BPS;
			case ENUM_BEDIEN_PLATZ_ART_STANDARD_BPS_ABGESETZT_VALUE: return ENUM_BEDIEN_PLATZ_ART_STANDARD_BPS_ABGESETZT;
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
	private ENUMBedienPlatzArt(int value, String name, String literal) {
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
	
} //ENUMBedienPlatzArt
