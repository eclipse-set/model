/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Energie Eingang Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMEnergieEingangArt()
 * @model extendedMetaData="name='ENUMEnergie_Eingang_Art'"
 * @generated
 */
public enum ENUMEnergieEingangArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Energie Eingang Art Brennstoffzelle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ENERGIE_EINGANG_ART_BRENNSTOFFZELLE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ENERGIE_EINGANG_ART_BRENNSTOFFZELLE(0, "ENUMEnergie_Eingang_Art_Brennstoffzelle", "Brennstoffzelle"),

	/**
	 * The '<em><b>ENUM Energie Eingang Art Fahrleitung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ENERGIE_EINGANG_ART_FAHRLEITUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ENERGIE_EINGANG_ART_FAHRLEITUNG(1, "ENUMEnergie_Eingang_Art_Fahrleitung", "Fahrleitung"),

	/**
	 * The '<em><b>ENUM Energie Eingang Art Landesnetz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ENERGIE_EINGANG_ART_LANDESNETZ_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ENERGIE_EINGANG_ART_LANDESNETZ(2, "ENUMEnergie_Eingang_Art_Landesnetz", "Landesnetz"),

	/**
	 * The '<em><b>ENUM Energie Eingang Art Solar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ENERGIE_EINGANG_ART_SOLAR_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ENERGIE_EINGANG_ART_SOLAR(3, "ENUMEnergie_Eingang_Art_Solar", "Solar"),

	/**
	 * The '<em><b>ENUM Energie Eingang Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ENERGIE_EINGANG_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_ENERGIE_EINGANG_ART_SONSTIGE(4, "ENUMEnergie_Eingang_Art_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Energie Eingang Art Brennstoffzelle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ENERGIE_EINGANG_ART_BRENNSTOFFZELLE
	 * @model name="ENUMEnergie_Eingang_Art_Brennstoffzelle" literal="Brennstoffzelle"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ENERGIE_EINGANG_ART_BRENNSTOFFZELLE_VALUE = 0;

	/**
	 * The '<em><b>ENUM Energie Eingang Art Fahrleitung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ENERGIE_EINGANG_ART_FAHRLEITUNG
	 * @model name="ENUMEnergie_Eingang_Art_Fahrleitung" literal="Fahrleitung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ENERGIE_EINGANG_ART_FAHRLEITUNG_VALUE = 1;

	/**
	 * The '<em><b>ENUM Energie Eingang Art Landesnetz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ENERGIE_EINGANG_ART_LANDESNETZ
	 * @model name="ENUMEnergie_Eingang_Art_Landesnetz" literal="Landesnetz"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ENERGIE_EINGANG_ART_LANDESNETZ_VALUE = 2;

	/**
	 * The '<em><b>ENUM Energie Eingang Art Solar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ENERGIE_EINGANG_ART_SOLAR
	 * @model name="ENUMEnergie_Eingang_Art_Solar" literal="Solar"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ENERGIE_EINGANG_ART_SOLAR_VALUE = 3;

	/**
	 * The '<em><b>ENUM Energie Eingang Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_ENERGIE_EINGANG_ART_SONSTIGE
	 * @model name="ENUMEnergie_Eingang_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_ENERGIE_EINGANG_ART_SONSTIGE_VALUE = 4;

	/**
	 * An array of all the '<em><b>ENUM Energie Eingang Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMEnergieEingangArt[] VALUES_ARRAY =
		new ENUMEnergieEingangArt[] {
			ENUM_ENERGIE_EINGANG_ART_BRENNSTOFFZELLE,
			ENUM_ENERGIE_EINGANG_ART_FAHRLEITUNG,
			ENUM_ENERGIE_EINGANG_ART_LANDESNETZ,
			ENUM_ENERGIE_EINGANG_ART_SOLAR,
			ENUM_ENERGIE_EINGANG_ART_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Energie Eingang Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMEnergieEingangArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Energie Eingang Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMEnergieEingangArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMEnergieEingangArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Energie Eingang Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMEnergieEingangArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMEnergieEingangArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Energie Eingang Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMEnergieEingangArt get(int value) {
		switch (value) {
			case ENUM_ENERGIE_EINGANG_ART_BRENNSTOFFZELLE_VALUE: return ENUM_ENERGIE_EINGANG_ART_BRENNSTOFFZELLE;
			case ENUM_ENERGIE_EINGANG_ART_FAHRLEITUNG_VALUE: return ENUM_ENERGIE_EINGANG_ART_FAHRLEITUNG;
			case ENUM_ENERGIE_EINGANG_ART_LANDESNETZ_VALUE: return ENUM_ENERGIE_EINGANG_ART_LANDESNETZ;
			case ENUM_ENERGIE_EINGANG_ART_SOLAR_VALUE: return ENUM_ENERGIE_EINGANG_ART_SOLAR;
			case ENUM_ENERGIE_EINGANG_ART_SONSTIGE_VALUE: return ENUM_ENERGIE_EINGANG_ART_SONSTIGE;
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
	private ENUMEnergieEingangArt(int value, String name, String literal) {
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
	
} //ENUMEnergieEingangArt
