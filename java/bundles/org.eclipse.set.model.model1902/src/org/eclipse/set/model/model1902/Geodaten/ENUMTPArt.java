/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMTP Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getENUMTPArt()
 * @model extendedMetaData="name='ENUMTP_Art'"
 * @generated
 */
public enum ENUMTPArt implements Enumerator {
	/**
	 * The '<em><b>ENUMTP Art Gebaeude</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTP_ART_GEBAEUDE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTP_ART_GEBAEUDE(0, "ENUMTP_Art_Gebaeude", "Gebaeude"),

	/**
	 * The '<em><b>ENUMTP Art Mast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTP_ART_MAST_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTP_ART_MAST(1, "ENUMTP_Art_Mast", "Mast"),

	/**
	 * The '<em><b>ENUMTP Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTP_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTP_ART_SONSTIGE(2, "ENUMTP_Art_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUMTP Art Gebaeude</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTP_ART_GEBAEUDE
	 * @model name="ENUMTP_Art_Gebaeude" literal="Gebaeude"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTP_ART_GEBAEUDE_VALUE = 0;

	/**
	 * The '<em><b>ENUMTP Art Mast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTP_ART_MAST
	 * @model name="ENUMTP_Art_Mast" literal="Mast"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTP_ART_MAST_VALUE = 1;

	/**
	 * The '<em><b>ENUMTP Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTP_ART_SONSTIGE
	 * @model name="ENUMTP_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTP_ART_SONSTIGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUMTP Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMTPArt[] VALUES_ARRAY =
		new ENUMTPArt[] {
			ENUMTP_ART_GEBAEUDE,
			ENUMTP_ART_MAST,
			ENUMTP_ART_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMTP Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMTPArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMTP Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTPArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMTPArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMTP Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTPArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMTPArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMTP Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTPArt get(int value) {
		switch (value) {
			case ENUMTP_ART_GEBAEUDE_VALUE: return ENUMTP_ART_GEBAEUDE;
			case ENUMTP_ART_MAST_VALUE: return ENUMTP_ART_MAST;
			case ENUMTP_ART_SONSTIGE_VALUE: return ENUMTP_ART_SONSTIGE;
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
	private ENUMTPArt(int value, String name, String literal) {
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
	
} //ENUMTPArt
