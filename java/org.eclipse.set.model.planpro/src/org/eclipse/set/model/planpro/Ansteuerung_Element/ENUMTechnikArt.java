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
 * A representation of the literals of the enumeration '<em><b>ENUM Technik Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getENUMTechnikArt()
 * @model extendedMetaData="name='ENUMTechnik_Art'"
 * @generated
 */
public enum ENUMTechnikArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Technik Art analog FSK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TECHNIK_ART_ANALOG_FSK_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_TECHNIK_ART_ANALOG_FSK(0, "ENUMTechnik_Art_analog_FSK", "analog_FSK"),

	/**
	 * The '<em><b>ENUM Technik Art Ethernet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TECHNIK_ART_ETHERNET_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_TECHNIK_ART_ETHERNET(1, "ENUMTechnik_Art_Ethernet", "Ethernet"),

	/**
	 * The '<em><b>ENUM Technik Art G703</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TECHNIK_ART_G703_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_TECHNIK_ART_G703(2, "ENUMTechnik_Art_G_703", "G_703"),

	/**
	 * The '<em><b>ENUM Technik Art SBI intern Kupferkabel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TECHNIK_ART_SBI_INTERN_KUPFERKABEL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_TECHNIK_ART_SBI_INTERN_KUPFERKABEL(3, "ENUMTechnik_Art_SBI_intern_Kupferkabel", "SBI_intern_Kupferkabel"),

	/**
	 * The '<em><b>ENUM Technik Art SBI intern LWL Faser</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TECHNIK_ART_SBI_INTERN_LWL_FASER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_TECHNIK_ART_SBI_INTERN_LWL_FASER(4, "ENUMTechnik_Art_SBI_intern_LWL_Faser", "SBI_intern_LWL_Faser"),

	/**
	 * The '<em><b>ENUM Technik Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TECHNIK_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_TECHNIK_ART_SONSTIGE(5, "ENUMTechnik_Art_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Technik Art analog FSK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TECHNIK_ART_ANALOG_FSK
	 * @model name="ENUMTechnik_Art_analog_FSK" literal="analog_FSK"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_TECHNIK_ART_ANALOG_FSK_VALUE = 0;

	/**
	 * The '<em><b>ENUM Technik Art Ethernet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TECHNIK_ART_ETHERNET
	 * @model name="ENUMTechnik_Art_Ethernet" literal="Ethernet"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_TECHNIK_ART_ETHERNET_VALUE = 1;

	/**
	 * The '<em><b>ENUM Technik Art G703</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TECHNIK_ART_G703
	 * @model name="ENUMTechnik_Art_G_703" literal="G_703"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_TECHNIK_ART_G703_VALUE = 2;

	/**
	 * The '<em><b>ENUM Technik Art SBI intern Kupferkabel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TECHNIK_ART_SBI_INTERN_KUPFERKABEL
	 * @model name="ENUMTechnik_Art_SBI_intern_Kupferkabel" literal="SBI_intern_Kupferkabel"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_TECHNIK_ART_SBI_INTERN_KUPFERKABEL_VALUE = 3;

	/**
	 * The '<em><b>ENUM Technik Art SBI intern LWL Faser</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TECHNIK_ART_SBI_INTERN_LWL_FASER
	 * @model name="ENUMTechnik_Art_SBI_intern_LWL_Faser" literal="SBI_intern_LWL_Faser"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_TECHNIK_ART_SBI_INTERN_LWL_FASER_VALUE = 4;

	/**
	 * The '<em><b>ENUM Technik Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TECHNIK_ART_SONSTIGE
	 * @model name="ENUMTechnik_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_TECHNIK_ART_SONSTIGE_VALUE = 5;

	/**
	 * An array of all the '<em><b>ENUM Technik Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMTechnikArt[] VALUES_ARRAY =
		new ENUMTechnikArt[] {
			ENUM_TECHNIK_ART_ANALOG_FSK,
			ENUM_TECHNIK_ART_ETHERNET,
			ENUM_TECHNIK_ART_G703,
			ENUM_TECHNIK_ART_SBI_INTERN_KUPFERKABEL,
			ENUM_TECHNIK_ART_SBI_INTERN_LWL_FASER,
			ENUM_TECHNIK_ART_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Technik Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMTechnikArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Technik Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTechnikArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMTechnikArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Technik Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTechnikArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMTechnikArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Technik Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTechnikArt get(int value) {
		switch (value) {
			case ENUM_TECHNIK_ART_ANALOG_FSK_VALUE: return ENUM_TECHNIK_ART_ANALOG_FSK;
			case ENUM_TECHNIK_ART_ETHERNET_VALUE: return ENUM_TECHNIK_ART_ETHERNET;
			case ENUM_TECHNIK_ART_G703_VALUE: return ENUM_TECHNIK_ART_G703;
			case ENUM_TECHNIK_ART_SBI_INTERN_KUPFERKABEL_VALUE: return ENUM_TECHNIK_ART_SBI_INTERN_KUPFERKABEL;
			case ENUM_TECHNIK_ART_SBI_INTERN_LWL_FASER_VALUE: return ENUM_TECHNIK_ART_SBI_INTERN_LWL_FASER;
			case ENUM_TECHNIK_ART_SONSTIGE_VALUE: return ENUM_TECHNIK_ART_SONSTIGE;
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
	private ENUMTechnikArt(int value, String name, String literal) {
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
	
} //ENUMTechnikArt
