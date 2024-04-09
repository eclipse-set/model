/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Medien_und_Trassen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Trasse Knoten Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * \"Schacht, Trassenabzweig\"==Abzweig beliebig vieler Trassen;
 * \"Trassenauslass\"==Auslass von Kabeln (z. B. zu einem Kabelverteiler), wobei die Verbindung Trasse - Verteiler nicht als eigene Trasse abgebildet wird 
 * <!-- end-model-doc -->
 * @see org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage#getENUMTrasseKnotenArt()
 * @model extendedMetaData="name='ENUMTrasse_Knoten_Art'"
 * @generated
 */
public enum ENUMTrasseKnotenArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Trasse Knoten Art Schacht</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TRASSE_KNOTEN_ART_SCHACHT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_TRASSE_KNOTEN_ART_SCHACHT(0, "ENUMTrasse_Knoten_Art_Schacht", "Schacht"),

	/**
	 * The '<em><b>ENUM Trasse Knoten Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TRASSE_KNOTEN_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_TRASSE_KNOTEN_ART_SONSTIGE(1, "ENUMTrasse_Knoten_Art_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Trasse Knoten Art Trassenabzweig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TRASSE_KNOTEN_ART_TRASSENABZWEIG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_TRASSE_KNOTEN_ART_TRASSENABZWEIG(2, "ENUMTrasse_Knoten_Art_Trassenabzweig", "Trassenabzweig"),

	/**
	 * The '<em><b>ENUM Trasse Knoten Art Trassenaenderung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TRASSE_KNOTEN_ART_TRASSENAENDERUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_TRASSE_KNOTEN_ART_TRASSENAENDERUNG(3, "ENUMTrasse_Knoten_Art_Trassenaenderung", "Trassenaenderung"),

	/**
	 * The '<em><b>ENUM Trasse Knoten Art Trassenauslass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TRASSE_KNOTEN_ART_TRASSENAUSLASS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_TRASSE_KNOTEN_ART_TRASSENAUSLASS(4, "ENUMTrasse_Knoten_Art_Trassenauslass", "Trassenauslass"),

	/**
	 * The '<em><b>ENUM Trasse Knoten Art Trassenende</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TRASSE_KNOTEN_ART_TRASSENENDE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_TRASSE_KNOTEN_ART_TRASSENENDE(5, "ENUMTrasse_Knoten_Art_Trassenende", "Trassenende");

	/**
	 * The '<em><b>ENUM Trasse Knoten Art Schacht</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TRASSE_KNOTEN_ART_SCHACHT
	 * @model name="ENUMTrasse_Knoten_Art_Schacht" literal="Schacht"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_TRASSE_KNOTEN_ART_SCHACHT_VALUE = 0;

	/**
	 * The '<em><b>ENUM Trasse Knoten Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TRASSE_KNOTEN_ART_SONSTIGE
	 * @model name="ENUMTrasse_Knoten_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_TRASSE_KNOTEN_ART_SONSTIGE_VALUE = 1;

	/**
	 * The '<em><b>ENUM Trasse Knoten Art Trassenabzweig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TRASSE_KNOTEN_ART_TRASSENABZWEIG
	 * @model name="ENUMTrasse_Knoten_Art_Trassenabzweig" literal="Trassenabzweig"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_TRASSE_KNOTEN_ART_TRASSENABZWEIG_VALUE = 2;

	/**
	 * The '<em><b>ENUM Trasse Knoten Art Trassenaenderung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TRASSE_KNOTEN_ART_TRASSENAENDERUNG
	 * @model name="ENUMTrasse_Knoten_Art_Trassenaenderung" literal="Trassenaenderung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_TRASSE_KNOTEN_ART_TRASSENAENDERUNG_VALUE = 3;

	/**
	 * The '<em><b>ENUM Trasse Knoten Art Trassenauslass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TRASSE_KNOTEN_ART_TRASSENAUSLASS
	 * @model name="ENUMTrasse_Knoten_Art_Trassenauslass" literal="Trassenauslass"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_TRASSE_KNOTEN_ART_TRASSENAUSLASS_VALUE = 4;

	/**
	 * The '<em><b>ENUM Trasse Knoten Art Trassenende</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TRASSE_KNOTEN_ART_TRASSENENDE
	 * @model name="ENUMTrasse_Knoten_Art_Trassenende" literal="Trassenende"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_TRASSE_KNOTEN_ART_TRASSENENDE_VALUE = 5;

	/**
	 * An array of all the '<em><b>ENUM Trasse Knoten Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMTrasseKnotenArt[] VALUES_ARRAY =
		new ENUMTrasseKnotenArt[] {
			ENUM_TRASSE_KNOTEN_ART_SCHACHT,
			ENUM_TRASSE_KNOTEN_ART_SONSTIGE,
			ENUM_TRASSE_KNOTEN_ART_TRASSENABZWEIG,
			ENUM_TRASSE_KNOTEN_ART_TRASSENAENDERUNG,
			ENUM_TRASSE_KNOTEN_ART_TRASSENAUSLASS,
			ENUM_TRASSE_KNOTEN_ART_TRASSENENDE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Trasse Knoten Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMTrasseKnotenArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Trasse Knoten Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTrasseKnotenArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMTrasseKnotenArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Trasse Knoten Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTrasseKnotenArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMTrasseKnotenArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Trasse Knoten Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTrasseKnotenArt get(int value) {
		switch (value) {
			case ENUM_TRASSE_KNOTEN_ART_SCHACHT_VALUE: return ENUM_TRASSE_KNOTEN_ART_SCHACHT;
			case ENUM_TRASSE_KNOTEN_ART_SONSTIGE_VALUE: return ENUM_TRASSE_KNOTEN_ART_SONSTIGE;
			case ENUM_TRASSE_KNOTEN_ART_TRASSENABZWEIG_VALUE: return ENUM_TRASSE_KNOTEN_ART_TRASSENABZWEIG;
			case ENUM_TRASSE_KNOTEN_ART_TRASSENAENDERUNG_VALUE: return ENUM_TRASSE_KNOTEN_ART_TRASSENAENDERUNG;
			case ENUM_TRASSE_KNOTEN_ART_TRASSENAUSLASS_VALUE: return ENUM_TRASSE_KNOTEN_ART_TRASSENAUSLASS;
			case ENUM_TRASSE_KNOTEN_ART_TRASSENENDE_VALUE: return ENUM_TRASSE_KNOTEN_ART_TRASSENENDE;
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
	private ENUMTrasseKnotenArt(int value, String name, String literal) {
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
	
} //ENUMTrasseKnotenArt
