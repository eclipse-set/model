/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Gleis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Gleisart</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Gleis.GleisPackage#getENUMGleisart()
 * @model extendedMetaData="name='ENUMGleisart'"
 * @generated
 */
public enum ENUMGleisart implements Enumerator {
	/**
	 * The '<em><b>ENUM Gleisart Anschlussgleis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISART_ANSCHLUSSGLEIS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GLEISART_ANSCHLUSSGLEIS(0, "ENUMGleisart_Anschlussgleis", "Anschlussgleis"),

	/**
	 * The '<em><b>ENUM Gleisart Durchgehendes Hauptgleis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISART_DURCHGEHENDES_HAUPTGLEIS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GLEISART_DURCHGEHENDES_HAUPTGLEIS(1, "ENUMGleisart_Durchgehendes_Hauptgleis", "Durchgehendes_Hauptgleis"),

	/**
	 * The '<em><b>ENUM Gleisart Hauptgleis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISART_HAUPTGLEIS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GLEISART_HAUPTGLEIS(2, "ENUMGleisart_Hauptgleis", "Hauptgleis"),

	/**
	 * The '<em><b>ENUM Gleisart Nebengleis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISART_NEBENGLEIS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GLEISART_NEBENGLEIS(3, "ENUMGleisart_Nebengleis", "Nebengleis"),

	/**
	 * The '<em><b>ENUM Gleisart sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GLEISART_SONSTIGE(4, "ENUMGleisart_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Gleisart Streckengleis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISART_STRECKENGLEIS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_GLEISART_STRECKENGLEIS(5, "ENUMGleisart_Streckengleis", "Streckengleis");

	/**
	 * The '<em><b>ENUM Gleisart Anschlussgleis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISART_ANSCHLUSSGLEIS
	 * @model name="ENUMGleisart_Anschlussgleis" literal="Anschlussgleis"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GLEISART_ANSCHLUSSGLEIS_VALUE = 0;

	/**
	 * The '<em><b>ENUM Gleisart Durchgehendes Hauptgleis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISART_DURCHGEHENDES_HAUPTGLEIS
	 * @model name="ENUMGleisart_Durchgehendes_Hauptgleis" literal="Durchgehendes_Hauptgleis"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GLEISART_DURCHGEHENDES_HAUPTGLEIS_VALUE = 1;

	/**
	 * The '<em><b>ENUM Gleisart Hauptgleis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISART_HAUPTGLEIS
	 * @model name="ENUMGleisart_Hauptgleis" literal="Hauptgleis"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GLEISART_HAUPTGLEIS_VALUE = 2;

	/**
	 * The '<em><b>ENUM Gleisart Nebengleis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISART_NEBENGLEIS
	 * @model name="ENUMGleisart_Nebengleis" literal="Nebengleis"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GLEISART_NEBENGLEIS_VALUE = 3;

	/**
	 * The '<em><b>ENUM Gleisart sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISART_SONSTIGE
	 * @model name="ENUMGleisart_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GLEISART_SONSTIGE_VALUE = 4;

	/**
	 * The '<em><b>ENUM Gleisart Streckengleis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_GLEISART_STRECKENGLEIS
	 * @model name="ENUMGleisart_Streckengleis" literal="Streckengleis"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_GLEISART_STRECKENGLEIS_VALUE = 5;

	/**
	 * An array of all the '<em><b>ENUM Gleisart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMGleisart[] VALUES_ARRAY =
		new ENUMGleisart[] {
			ENUM_GLEISART_ANSCHLUSSGLEIS,
			ENUM_GLEISART_DURCHGEHENDES_HAUPTGLEIS,
			ENUM_GLEISART_HAUPTGLEIS,
			ENUM_GLEISART_NEBENGLEIS,
			ENUM_GLEISART_SONSTIGE,
			ENUM_GLEISART_STRECKENGLEIS,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Gleisart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMGleisart> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Gleisart</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGleisart get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGleisart result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Gleisart</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGleisart getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGleisart result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Gleisart</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGleisart get(int value) {
		switch (value) {
			case ENUM_GLEISART_ANSCHLUSSGLEIS_VALUE: return ENUM_GLEISART_ANSCHLUSSGLEIS;
			case ENUM_GLEISART_DURCHGEHENDES_HAUPTGLEIS_VALUE: return ENUM_GLEISART_DURCHGEHENDES_HAUPTGLEIS;
			case ENUM_GLEISART_HAUPTGLEIS_VALUE: return ENUM_GLEISART_HAUPTGLEIS;
			case ENUM_GLEISART_NEBENGLEIS_VALUE: return ENUM_GLEISART_NEBENGLEIS;
			case ENUM_GLEISART_SONSTIGE_VALUE: return ENUM_GLEISART_SONSTIGE;
			case ENUM_GLEISART_STRECKENGLEIS_VALUE: return ENUM_GLEISART_STRECKENGLEIS;
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
	private ENUMGleisart(int value, String name, String literal) {
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
	
} //ENUMGleisart
