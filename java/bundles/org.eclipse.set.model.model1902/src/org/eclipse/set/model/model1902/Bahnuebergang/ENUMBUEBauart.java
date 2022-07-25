/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMBUE Bauart</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getENUMBUEBauart()
 * @model extendedMetaData="name='ENUMBUE_Bauart'"
 * @generated
 */
public enum ENUMBUEBauart implements Enumerator {
	/**
	 * The '<em><b>ENUMBUE Bauart Bau Bue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMBUE_BAUART_BAU_BUE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMBUE_BAUART_BAU_BUE(0, "ENUMBUE_Bauart_Bau_Bue", "Bau_Bue"),

	/**
	 * The '<em><b>ENUMBUE Bauart Bue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMBUE_BAUART_BUE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMBUE_BAUART_BUE(1, "ENUMBUE_Bauart_Bue", "Bue"),

	/**
	 * The '<em><b>ENUMBUE Bauart ntg Reisendenuebergang</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMBUE_BAUART_NTG_REISENDENUEBERGANG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMBUE_BAUART_NTG_REISENDENUEBERGANG(2, "ENUMBUE_Bauart_ntg_Reisendenuebergang", "ntg_Reisendenuebergang"),

	/**
	 * The '<em><b>ENUMBUE Bauart Resi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMBUE_BAUART_RESI_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMBUE_BAUART_RESI(3, "ENUMBUE_Bauart_Resi", "Resi");

	/**
	 * The '<em><b>ENUMBUE Bauart Bau Bue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMBUE_BAUART_BAU_BUE
	 * @model name="ENUMBUE_Bauart_Bau_Bue" literal="Bau_Bue"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMBUE_BAUART_BAU_BUE_VALUE = 0;

	/**
	 * The '<em><b>ENUMBUE Bauart Bue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMBUE_BAUART_BUE
	 * @model name="ENUMBUE_Bauart_Bue" literal="Bue"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMBUE_BAUART_BUE_VALUE = 1;

	/**
	 * The '<em><b>ENUMBUE Bauart ntg Reisendenuebergang</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMBUE_BAUART_NTG_REISENDENUEBERGANG
	 * @model name="ENUMBUE_Bauart_ntg_Reisendenuebergang" literal="ntg_Reisendenuebergang"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMBUE_BAUART_NTG_REISENDENUEBERGANG_VALUE = 2;

	/**
	 * The '<em><b>ENUMBUE Bauart Resi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMBUE_BAUART_RESI
	 * @model name="ENUMBUE_Bauart_Resi" literal="Resi"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMBUE_BAUART_RESI_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENUMBUE Bauart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMBUEBauart[] VALUES_ARRAY =
		new ENUMBUEBauart[] {
			ENUMBUE_BAUART_BAU_BUE,
			ENUMBUE_BAUART_BUE,
			ENUMBUE_BAUART_NTG_REISENDENUEBERGANG,
			ENUMBUE_BAUART_RESI,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMBUE Bauart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMBUEBauart> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMBUE Bauart</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBUEBauart get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBUEBauart result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMBUE Bauart</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBUEBauart getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBUEBauart result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMBUE Bauart</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBUEBauart get(int value) {
		switch (value) {
			case ENUMBUE_BAUART_BAU_BUE_VALUE: return ENUMBUE_BAUART_BAU_BUE;
			case ENUMBUE_BAUART_BUE_VALUE: return ENUMBUE_BAUART_BUE;
			case ENUMBUE_BAUART_NTG_REISENDENUEBERGANG_VALUE: return ENUMBUE_BAUART_NTG_REISENDENUEBERGANG;
			case ENUMBUE_BAUART_RESI_VALUE: return ENUMBUE_BAUART_RESI;
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
	private ENUMBUEBauart(int value, String name, String literal) {
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
	
} //ENUMBUEBauart
