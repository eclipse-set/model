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
 * A representation of the literals of the enumeration '<em><b>ENUM Einzeldatei Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMEinzeldateiArt()
 * @model extendedMetaData="name='ENUMEinzeldatei_Art'"
 * @generated
 */
public enum ENUMEinzeldateiArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Einzeldatei Art Hilfsdatei</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_EINZELDATEI_ART_HILFSDATEI_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_EINZELDATEI_ART_HILFSDATEI(0, "ENUMEinzeldatei_Art_Hilfsdatei", "Hilfsdatei"),

	/**
	 * The '<em><b>ENUM Einzeldatei Art Ladedatei</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_EINZELDATEI_ART_LADEDATEI_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_EINZELDATEI_ART_LADEDATEI(1, "ENUMEinzeldatei_Art_Ladedatei", "Ladedatei");

	/**
	 * The '<em><b>ENUM Einzeldatei Art Hilfsdatei</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_EINZELDATEI_ART_HILFSDATEI
	 * @model name="ENUMEinzeldatei_Art_Hilfsdatei" literal="Hilfsdatei"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_EINZELDATEI_ART_HILFSDATEI_VALUE = 0;

	/**
	 * The '<em><b>ENUM Einzeldatei Art Ladedatei</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_EINZELDATEI_ART_LADEDATEI
	 * @model name="ENUMEinzeldatei_Art_Ladedatei" literal="Ladedatei"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_EINZELDATEI_ART_LADEDATEI_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUM Einzeldatei Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMEinzeldateiArt[] VALUES_ARRAY =
		new ENUMEinzeldateiArt[] {
			ENUM_EINZELDATEI_ART_HILFSDATEI,
			ENUM_EINZELDATEI_ART_LADEDATEI,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Einzeldatei Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMEinzeldateiArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Einzeldatei Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMEinzeldateiArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMEinzeldateiArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Einzeldatei Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMEinzeldateiArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMEinzeldateiArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Einzeldatei Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMEinzeldateiArt get(int value) {
		switch (value) {
			case ENUM_EINZELDATEI_ART_HILFSDATEI_VALUE: return ENUM_EINZELDATEI_ART_HILFSDATEI;
			case ENUM_EINZELDATEI_ART_LADEDATEI_VALUE: return ENUM_EINZELDATEI_ART_LADEDATEI;
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
	private ENUMEinzeldateiArt(int value, String name, String literal) {
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
	
} //ENUMEinzeldateiArt
