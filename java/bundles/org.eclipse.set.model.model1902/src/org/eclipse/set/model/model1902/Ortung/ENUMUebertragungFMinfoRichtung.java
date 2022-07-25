/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ortung;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Uebertragung FMinfo Richtung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Ortung.OrtungPackage#getENUMUebertragungFMinfoRichtung()
 * @model extendedMetaData="name='ENUMUebertragung_FMinfo_Richtung'"
 * @generated
 */
public enum ENUMUebertragungFMinfoRichtung implements Enumerator {
	/**
	 * The '<em><b>ENUM Uebertragung FMinfo Richtung gehend</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_GEHEND_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_GEHEND(0, "ENUMUebertragung_FMinfo_Richtung_gehend", "gehend"),

	/**
	 * The '<em><b>ENUM Uebertragung FMinfo Richtung kommend</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_KOMMEND_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_KOMMEND(1, "ENUMUebertragung_FMinfo_Richtung_kommend", "kommend");

	/**
	 * The '<em><b>ENUM Uebertragung FMinfo Richtung gehend</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_GEHEND
	 * @model name="ENUMUebertragung_FMinfo_Richtung_gehend" literal="gehend"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_GEHEND_VALUE = 0;

	/**
	 * The '<em><b>ENUM Uebertragung FMinfo Richtung kommend</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_KOMMEND
	 * @model name="ENUMUebertragung_FMinfo_Richtung_kommend" literal="kommend"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_KOMMEND_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUM Uebertragung FMinfo Richtung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMUebertragungFMinfoRichtung[] VALUES_ARRAY =
		new ENUMUebertragungFMinfoRichtung[] {
			ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_GEHEND,
			ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_KOMMEND,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Uebertragung FMinfo Richtung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMUebertragungFMinfoRichtung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Uebertragung FMinfo Richtung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMUebertragungFMinfoRichtung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMUebertragungFMinfoRichtung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Uebertragung FMinfo Richtung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMUebertragungFMinfoRichtung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMUebertragungFMinfoRichtung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Uebertragung FMinfo Richtung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMUebertragungFMinfoRichtung get(int value) {
		switch (value) {
			case ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_GEHEND_VALUE: return ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_GEHEND;
			case ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_KOMMEND_VALUE: return ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_KOMMEND;
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
	private ENUMUebertragungFMinfoRichtung(int value, String name, String literal) {
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
	
} //ENUMUebertragungFMinfoRichtung
