/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Medien_und_Trassen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Kabel Verteilpunkt Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenPackage#getENUMKabelVerteilpunktArt()
 * @model extendedMetaData="name='ENUMKabel_Verteilpunkt_Art'"
 * @generated
 */
public enum ENUMKabelVerteilpunktArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Kabel Verteilpunkt Art Kabelschrank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_VERTEILPUNKT_ART_KABELSCHRANK_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_KABEL_VERTEILPUNKT_ART_KABELSCHRANK(0, "ENUMKabel_Verteilpunkt_Art_Kabelschrank", "Kabelschrank"),

	/**
	 * The '<em><b>ENUM Kabel Verteilpunkt Art Kabelverteiler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_VERTEILPUNKT_ART_KABELVERTEILER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_KABEL_VERTEILPUNKT_ART_KABELVERTEILER(1, "ENUMKabel_Verteilpunkt_Art_Kabelverteiler", "Kabelverteiler"),

	/**
	 * The '<em><b>ENUM Kabel Verteilpunkt Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_VERTEILPUNKT_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_KABEL_VERTEILPUNKT_ART_SONSTIGE(2, "ENUMKabel_Verteilpunkt_Art_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Kabel Verteilpunkt Art Kabelschrank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_VERTEILPUNKT_ART_KABELSCHRANK
	 * @model name="ENUMKabel_Verteilpunkt_Art_Kabelschrank" literal="Kabelschrank"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_KABEL_VERTEILPUNKT_ART_KABELSCHRANK_VALUE = 0;

	/**
	 * The '<em><b>ENUM Kabel Verteilpunkt Art Kabelverteiler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_VERTEILPUNKT_ART_KABELVERTEILER
	 * @model name="ENUMKabel_Verteilpunkt_Art_Kabelverteiler" literal="Kabelverteiler"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_KABEL_VERTEILPUNKT_ART_KABELVERTEILER_VALUE = 1;

	/**
	 * The '<em><b>ENUM Kabel Verteilpunkt Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_VERTEILPUNKT_ART_SONSTIGE
	 * @model name="ENUMKabel_Verteilpunkt_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_KABEL_VERTEILPUNKT_ART_SONSTIGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Kabel Verteilpunkt Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMKabelVerteilpunktArt[] VALUES_ARRAY =
		new ENUMKabelVerteilpunktArt[] {
			ENUM_KABEL_VERTEILPUNKT_ART_KABELSCHRANK,
			ENUM_KABEL_VERTEILPUNKT_ART_KABELVERTEILER,
			ENUM_KABEL_VERTEILPUNKT_ART_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Kabel Verteilpunkt Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMKabelVerteilpunktArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Kabel Verteilpunkt Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMKabelVerteilpunktArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMKabelVerteilpunktArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Kabel Verteilpunkt Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMKabelVerteilpunktArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMKabelVerteilpunktArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Kabel Verteilpunkt Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMKabelVerteilpunktArt get(int value) {
		switch (value) {
			case ENUM_KABEL_VERTEILPUNKT_ART_KABELSCHRANK_VALUE: return ENUM_KABEL_VERTEILPUNKT_ART_KABELSCHRANK;
			case ENUM_KABEL_VERTEILPUNKT_ART_KABELVERTEILER_VALUE: return ENUM_KABEL_VERTEILPUNKT_ART_KABELVERTEILER;
			case ENUM_KABEL_VERTEILPUNKT_ART_SONSTIGE_VALUE: return ENUM_KABEL_VERTEILPUNKT_ART_SONSTIGE;
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
	private ENUMKabelVerteilpunktArt(int value, String name, String literal) {
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
	
} //ENUMKabelVerteilpunktArt
