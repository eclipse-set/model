/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Unterbringung Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getENUMUnterbringungArt()
 * @model extendedMetaData="name='ENUMUnterbringung_Art'"
 * @generated
 */
public enum ENUMUnterbringungArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Unterbringung Art Antrieb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UNTERBRINGUNG_ART_ANTRIEB_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_UNTERBRINGUNG_ART_ANTRIEB(0, "ENUMUnterbringung_Art_Antrieb", "Antrieb"),

	/**
	 * The '<em><b>ENUM Unterbringung Art keine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UNTERBRINGUNG_ART_KEINE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_UNTERBRINGUNG_ART_KEINE(1, "ENUMUnterbringung_Art_keine", "keine"),

	/**
	 * The '<em><b>ENUM Unterbringung Art Schaltschrank Schaltkasten</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UNTERBRINGUNG_ART_SCHALTSCHRANK_SCHALTKASTEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_UNTERBRINGUNG_ART_SCHALTSCHRANK_SCHALTKASTEN(2, "ENUMUnterbringung_Art_Schaltschrank_Schaltkasten", "Schaltschrank_Schaltkasten"),

	/**
	 * The '<em><b>ENUM Unterbringung Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UNTERBRINGUNG_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_UNTERBRINGUNG_ART_SONSTIGE(3, "ENUMUnterbringung_Art_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Unterbringung Art Tafel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UNTERBRINGUNG_ART_TAFEL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_UNTERBRINGUNG_ART_TAFEL(4, "ENUMUnterbringung_Art_Tafel", "Tafel"),

	/**
	 * The '<em><b>ENUM Unterbringung Art Gebaeude</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UNTERBRINGUNG_ART_GEBAEUDE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_UNTERBRINGUNG_ART_GEBAEUDE(5, "ENUMUnterbringung_Art_Gebaeude", "Gebaeude"),

	/**
	 * The '<em><b>ENUM Unterbringung Art Schalthaus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UNTERBRINGUNG_ART_SCHALTHAUS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_UNTERBRINGUNG_ART_SCHALTHAUS(6, "ENUMUnterbringung_Art_Schalthaus", "Schalthaus");

	/**
	 * The '<em><b>ENUM Unterbringung Art Antrieb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UNTERBRINGUNG_ART_ANTRIEB
	 * @model name="ENUMUnterbringung_Art_Antrieb" literal="Antrieb"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_UNTERBRINGUNG_ART_ANTRIEB_VALUE = 0;

	/**
	 * The '<em><b>ENUM Unterbringung Art keine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UNTERBRINGUNG_ART_KEINE
	 * @model name="ENUMUnterbringung_Art_keine" literal="keine"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_UNTERBRINGUNG_ART_KEINE_VALUE = 1;

	/**
	 * The '<em><b>ENUM Unterbringung Art Schaltschrank Schaltkasten</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UNTERBRINGUNG_ART_SCHALTSCHRANK_SCHALTKASTEN
	 * @model name="ENUMUnterbringung_Art_Schaltschrank_Schaltkasten" literal="Schaltschrank_Schaltkasten"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_UNTERBRINGUNG_ART_SCHALTSCHRANK_SCHALTKASTEN_VALUE = 2;

	/**
	 * The '<em><b>ENUM Unterbringung Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UNTERBRINGUNG_ART_SONSTIGE
	 * @model name="ENUMUnterbringung_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_UNTERBRINGUNG_ART_SONSTIGE_VALUE = 3;

	/**
	 * The '<em><b>ENUM Unterbringung Art Tafel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UNTERBRINGUNG_ART_TAFEL
	 * @model name="ENUMUnterbringung_Art_Tafel" literal="Tafel"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_UNTERBRINGUNG_ART_TAFEL_VALUE = 4;

	/**
	 * The '<em><b>ENUM Unterbringung Art Gebaeude</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UNTERBRINGUNG_ART_GEBAEUDE
	 * @model name="ENUMUnterbringung_Art_Gebaeude" literal="Gebaeude"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_UNTERBRINGUNG_ART_GEBAEUDE_VALUE = 5;

	/**
	 * The '<em><b>ENUM Unterbringung Art Schalthaus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_UNTERBRINGUNG_ART_SCHALTHAUS
	 * @model name="ENUMUnterbringung_Art_Schalthaus" literal="Schalthaus"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_UNTERBRINGUNG_ART_SCHALTHAUS_VALUE = 6;

	/**
	 * An array of all the '<em><b>ENUM Unterbringung Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMUnterbringungArt[] VALUES_ARRAY =
		new ENUMUnterbringungArt[] {
			ENUM_UNTERBRINGUNG_ART_ANTRIEB,
			ENUM_UNTERBRINGUNG_ART_KEINE,
			ENUM_UNTERBRINGUNG_ART_SCHALTSCHRANK_SCHALTKASTEN,
			ENUM_UNTERBRINGUNG_ART_SONSTIGE,
			ENUM_UNTERBRINGUNG_ART_TAFEL,
			ENUM_UNTERBRINGUNG_ART_GEBAEUDE,
			ENUM_UNTERBRINGUNG_ART_SCHALTHAUS,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Unterbringung Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMUnterbringungArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Unterbringung Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMUnterbringungArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMUnterbringungArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Unterbringung Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMUnterbringungArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMUnterbringungArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Unterbringung Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMUnterbringungArt get(int value) {
		switch (value) {
			case ENUM_UNTERBRINGUNG_ART_ANTRIEB_VALUE: return ENUM_UNTERBRINGUNG_ART_ANTRIEB;
			case ENUM_UNTERBRINGUNG_ART_KEINE_VALUE: return ENUM_UNTERBRINGUNG_ART_KEINE;
			case ENUM_UNTERBRINGUNG_ART_SCHALTSCHRANK_SCHALTKASTEN_VALUE: return ENUM_UNTERBRINGUNG_ART_SCHALTSCHRANK_SCHALTKASTEN;
			case ENUM_UNTERBRINGUNG_ART_SONSTIGE_VALUE: return ENUM_UNTERBRINGUNG_ART_SONSTIGE;
			case ENUM_UNTERBRINGUNG_ART_TAFEL_VALUE: return ENUM_UNTERBRINGUNG_ART_TAFEL;
			case ENUM_UNTERBRINGUNG_ART_GEBAEUDE_VALUE: return ENUM_UNTERBRINGUNG_ART_GEBAEUDE;
			case ENUM_UNTERBRINGUNG_ART_SCHALTHAUS_VALUE: return ENUM_UNTERBRINGUNG_ART_SCHALTHAUS;
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
	private ENUMUnterbringungArt(int value, String name, String literal) {
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
	
} //ENUMUnterbringungArt
