/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Nahbedienung;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMNB Grenze Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getENUMNBGrenzeArt()
 * @model extendedMetaData="name='ENUMNB_Grenze_Art'"
 * @generated
 */
public enum ENUMNBGrenzeArt implements Enumerator {
	/**
	 * The '<em><b>ENUMNB Grenze Art ESTW Bereich</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMNB_GRENZE_ART_ESTW_BEREICH_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMNB_GRENZE_ART_ESTW_BEREICH(0, "ENUMNB_Grenze_Art_ESTW_Bereich", "ESTW_Bereich"),

	/**
	 * The '<em><b>ENUMNB Grenze Art NB Zone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMNB_GRENZE_ART_NB_ZONE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMNB_GRENZE_ART_NB_ZONE(1, "ENUMNB_Grenze_Art_NB_Zone", "NB_Zone"),

	/**
	 * The '<em><b>ENUMNB Grenze Art Ortsstellbereich</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMNB_GRENZE_ART_ORTSSTELLBEREICH_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMNB_GRENZE_ART_ORTSSTELLBEREICH(2, "ENUMNB_Grenze_Art_Ortsstellbereich", "Ortsstellbereich");

	/**
	 * The '<em><b>ENUMNB Grenze Art ESTW Bereich</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMNB_GRENZE_ART_ESTW_BEREICH
	 * @model name="ENUMNB_Grenze_Art_ESTW_Bereich" literal="ESTW_Bereich"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMNB_GRENZE_ART_ESTW_BEREICH_VALUE = 0;

	/**
	 * The '<em><b>ENUMNB Grenze Art NB Zone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMNB_GRENZE_ART_NB_ZONE
	 * @model name="ENUMNB_Grenze_Art_NB_Zone" literal="NB_Zone"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMNB_GRENZE_ART_NB_ZONE_VALUE = 1;

	/**
	 * The '<em><b>ENUMNB Grenze Art Ortsstellbereich</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMNB_GRENZE_ART_ORTSSTELLBEREICH
	 * @model name="ENUMNB_Grenze_Art_Ortsstellbereich" literal="Ortsstellbereich"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMNB_GRENZE_ART_ORTSSTELLBEREICH_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUMNB Grenze Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMNBGrenzeArt[] VALUES_ARRAY =
		new ENUMNBGrenzeArt[] {
			ENUMNB_GRENZE_ART_ESTW_BEREICH,
			ENUMNB_GRENZE_ART_NB_ZONE,
			ENUMNB_GRENZE_ART_ORTSSTELLBEREICH,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMNB Grenze Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMNBGrenzeArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMNB Grenze Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMNBGrenzeArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMNBGrenzeArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMNB Grenze Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMNBGrenzeArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMNBGrenzeArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMNB Grenze Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMNBGrenzeArt get(int value) {
		switch (value) {
			case ENUMNB_GRENZE_ART_ESTW_BEREICH_VALUE: return ENUMNB_GRENZE_ART_ESTW_BEREICH;
			case ENUMNB_GRENZE_ART_NB_ZONE_VALUE: return ENUMNB_GRENZE_ART_NB_ZONE;
			case ENUMNB_GRENZE_ART_ORTSSTELLBEREICH_VALUE: return ENUMNB_GRENZE_ART_ORTSSTELLBEREICH;
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
	private ENUMNBGrenzeArt(int value, String name, String literal) {
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
	
} //ENUMNBGrenzeArt
