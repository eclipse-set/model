/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMGEO Form</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getENUMGEOForm()
 * @model extendedMetaData="name='ENUMGEO_Form'"
 * @generated
 */
public enum ENUMGEOForm implements Enumerator {
	/**
	 * The '<em><b>ENUMGEO Form Bogen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_BOGEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGEO_FORM_BOGEN(0, "ENUMGEO_Form_Bogen", "Bogen"),

	/**
	 * The '<em><b>ENUMGEO Form Blosskurve</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_BLOSSKURVE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGEO_FORM_BLOSSKURVE(1, "ENUMGEO_Form_Blosskurve", "Blosskurve"),

	/**
	 * The '<em><b>ENUMGEO Form Bloss einfach geschwungen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_BLOSS_EINFACH_GESCHWUNGEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGEO_FORM_BLOSS_EINFACH_GESCHWUNGEN(2, "ENUMGEO_Form_Bloss_einfach_geschwungen", "Bloss_einfach_geschwungen"),

	/**
	 * The '<em><b>ENUMGEO Form Gerade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_GERADE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGEO_FORM_GERADE(3, "ENUMGEO_Form_Gerade", "Gerade"),

	/**
	 * The '<em><b>ENUMGEO Form Klothoide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_KLOTHOIDE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGEO_FORM_KLOTHOIDE(4, "ENUMGEO_Form_Klothoide", "Klothoide"),

	/**
	 * The '<em><b>ENUMGEO Form Km Sprung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_KM_SPRUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGEO_FORM_KM_SPRUNG(5, "ENUMGEO_Form_Km_Sprung", "Km_Sprung"),

	/**
	 * The '<em><b>ENUMGEO Form Polylinie</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_POLYLINIE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGEO_FORM_POLYLINIE(6, "ENUMGEO_Form_Polylinie", "Polylinie"),

	/**
	 * The '<em><b>ENUMGEO Form Richtgerade Knick am Ende 200 gon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_RICHTGERADE_KNICK_AM_ENDE_200_GON_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGEO_FORM_RICHTGERADE_KNICK_AM_ENDE_200_GON(7, "ENUMGEO_Form_Richtgerade_Knick_am_Ende_200_gon", "Richtgerade_Knick_am_Ende_200_gon"),

	/**
	 * The '<em><b>ENUMGEO Form sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGEO_FORM_SONSTIGE(8, "ENUMGEO_Form_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUMGEO Form SForm einfach geschwungen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_SFORM_EINFACH_GESCHWUNGEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGEO_FORM_SFORM_EINFACH_GESCHWUNGEN(9, "ENUMGEO_Form_S_Form_einfach_geschwungen", "S_Form_einfach_geschwungen"),

	/**
	 * The '<em><b>ENUMGEO Form Uebergangsbogen SForm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_UEBERGANGSBOGEN_SFORM_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGEO_FORM_UEBERGANGSBOGEN_SFORM(10, "ENUMGEO_Form_Uebergangsbogen_S_Form", "Uebergangsbogen_S_Form");

	/**
	 * The '<em><b>ENUMGEO Form Bogen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_BOGEN
	 * @model name="ENUMGEO_Form_Bogen" literal="Bogen"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGEO_FORM_BOGEN_VALUE = 0;

	/**
	 * The '<em><b>ENUMGEO Form Blosskurve</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_BLOSSKURVE
	 * @model name="ENUMGEO_Form_Blosskurve" literal="Blosskurve"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGEO_FORM_BLOSSKURVE_VALUE = 1;

	/**
	 * The '<em><b>ENUMGEO Form Bloss einfach geschwungen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_BLOSS_EINFACH_GESCHWUNGEN
	 * @model name="ENUMGEO_Form_Bloss_einfach_geschwungen" literal="Bloss_einfach_geschwungen"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGEO_FORM_BLOSS_EINFACH_GESCHWUNGEN_VALUE = 2;

	/**
	 * The '<em><b>ENUMGEO Form Gerade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_GERADE
	 * @model name="ENUMGEO_Form_Gerade" literal="Gerade"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGEO_FORM_GERADE_VALUE = 3;

	/**
	 * The '<em><b>ENUMGEO Form Klothoide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_KLOTHOIDE
	 * @model name="ENUMGEO_Form_Klothoide" literal="Klothoide"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGEO_FORM_KLOTHOIDE_VALUE = 4;

	/**
	 * The '<em><b>ENUMGEO Form Km Sprung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_KM_SPRUNG
	 * @model name="ENUMGEO_Form_Km_Sprung" literal="Km_Sprung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGEO_FORM_KM_SPRUNG_VALUE = 5;

	/**
	 * The '<em><b>ENUMGEO Form Polylinie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_POLYLINIE
	 * @model name="ENUMGEO_Form_Polylinie" literal="Polylinie"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGEO_FORM_POLYLINIE_VALUE = 6;

	/**
	 * The '<em><b>ENUMGEO Form Richtgerade Knick am Ende 200 gon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_RICHTGERADE_KNICK_AM_ENDE_200_GON
	 * @model name="ENUMGEO_Form_Richtgerade_Knick_am_Ende_200_gon" literal="Richtgerade_Knick_am_Ende_200_gon"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGEO_FORM_RICHTGERADE_KNICK_AM_ENDE_200_GON_VALUE = 7;

	/**
	 * The '<em><b>ENUMGEO Form sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_SONSTIGE
	 * @model name="ENUMGEO_Form_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGEO_FORM_SONSTIGE_VALUE = 8;

	/**
	 * The '<em><b>ENUMGEO Form SForm einfach geschwungen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_SFORM_EINFACH_GESCHWUNGEN
	 * @model name="ENUMGEO_Form_S_Form_einfach_geschwungen" literal="S_Form_einfach_geschwungen"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGEO_FORM_SFORM_EINFACH_GESCHWUNGEN_VALUE = 9;

	/**
	 * The '<em><b>ENUMGEO Form Uebergangsbogen SForm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGEO_FORM_UEBERGANGSBOGEN_SFORM
	 * @model name="ENUMGEO_Form_Uebergangsbogen_S_Form" literal="Uebergangsbogen_S_Form"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGEO_FORM_UEBERGANGSBOGEN_SFORM_VALUE = 10;

	/**
	 * An array of all the '<em><b>ENUMGEO Form</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMGEOForm[] VALUES_ARRAY =
		new ENUMGEOForm[] {
			ENUMGEO_FORM_BOGEN,
			ENUMGEO_FORM_BLOSSKURVE,
			ENUMGEO_FORM_BLOSS_EINFACH_GESCHWUNGEN,
			ENUMGEO_FORM_GERADE,
			ENUMGEO_FORM_KLOTHOIDE,
			ENUMGEO_FORM_KM_SPRUNG,
			ENUMGEO_FORM_POLYLINIE,
			ENUMGEO_FORM_RICHTGERADE_KNICK_AM_ENDE_200_GON,
			ENUMGEO_FORM_SONSTIGE,
			ENUMGEO_FORM_SFORM_EINFACH_GESCHWUNGEN,
			ENUMGEO_FORM_UEBERGANGSBOGEN_SFORM,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMGEO Form</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMGEOForm> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMGEO Form</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGEOForm get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGEOForm result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMGEO Form</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGEOForm getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGEOForm result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMGEO Form</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGEOForm get(int value) {
		switch (value) {
			case ENUMGEO_FORM_BOGEN_VALUE: return ENUMGEO_FORM_BOGEN;
			case ENUMGEO_FORM_BLOSSKURVE_VALUE: return ENUMGEO_FORM_BLOSSKURVE;
			case ENUMGEO_FORM_BLOSS_EINFACH_GESCHWUNGEN_VALUE: return ENUMGEO_FORM_BLOSS_EINFACH_GESCHWUNGEN;
			case ENUMGEO_FORM_GERADE_VALUE: return ENUMGEO_FORM_GERADE;
			case ENUMGEO_FORM_KLOTHOIDE_VALUE: return ENUMGEO_FORM_KLOTHOIDE;
			case ENUMGEO_FORM_KM_SPRUNG_VALUE: return ENUMGEO_FORM_KM_SPRUNG;
			case ENUMGEO_FORM_POLYLINIE_VALUE: return ENUMGEO_FORM_POLYLINIE;
			case ENUMGEO_FORM_RICHTGERADE_KNICK_AM_ENDE_200_GON_VALUE: return ENUMGEO_FORM_RICHTGERADE_KNICK_AM_ENDE_200_GON;
			case ENUMGEO_FORM_SONSTIGE_VALUE: return ENUMGEO_FORM_SONSTIGE;
			case ENUMGEO_FORM_SFORM_EINFACH_GESCHWUNGEN_VALUE: return ENUMGEO_FORM_SFORM_EINFACH_GESCHWUNGEN;
			case ENUMGEO_FORM_UEBERGANGSBOGEN_SFORM_VALUE: return ENUMGEO_FORM_UEBERGANGSBOGEN_SFORM;
			default: return null;
		}
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
	private ENUMGEOForm(int value, String name, String literal) {
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
	
} //ENUMGEOForm
