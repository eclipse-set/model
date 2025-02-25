/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMGFR Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getENUMGFRArt()
 * @model extendedMetaData="name='ENUMGFR_Art'"
 * @generated
 */
public enum ENUMGFRArt implements Enumerator {
	/**
	 * The '<em><b>ENUMGFR Art automatisch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGFR_ART_AUTOMATISCH_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGFR_ART_AUTOMATISCH(0, "ENUMGFR_Art_automatisch", "automatisch"),

	/**
	 * The '<em><b>ENUMGFR Art mit Bediener</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGFR_ART_MIT_BEDIENER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGFR_ART_MIT_BEDIENER(1, "ENUMGFR_Art_mit_Bediener", "mit_Bediener"),

	/**
	 * The '<em><b>ENUMGFR Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGFR_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMGFR_ART_SONSTIGE(2, "ENUMGFR_Art_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUMGFR Art automatisch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGFR_ART_AUTOMATISCH
	 * @model name="ENUMGFR_Art_automatisch" literal="automatisch"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGFR_ART_AUTOMATISCH_VALUE = 0;

	/**
	 * The '<em><b>ENUMGFR Art mit Bediener</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGFR_ART_MIT_BEDIENER
	 * @model name="ENUMGFR_Art_mit_Bediener" literal="mit_Bediener"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGFR_ART_MIT_BEDIENER_VALUE = 1;

	/**
	 * The '<em><b>ENUMGFR Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMGFR_ART_SONSTIGE
	 * @model name="ENUMGFR_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMGFR_ART_SONSTIGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUMGFR Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMGFRArt[] VALUES_ARRAY =
		new ENUMGFRArt[] {
			ENUMGFR_ART_AUTOMATISCH,
			ENUMGFR_ART_MIT_BEDIENER,
			ENUMGFR_ART_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMGFR Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMGFRArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMGFR Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGFRArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGFRArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMGFR Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGFRArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMGFRArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMGFR Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMGFRArt get(int value) {
		switch (value) {
			case ENUMGFR_ART_AUTOMATISCH_VALUE: return ENUMGFR_ART_AUTOMATISCH;
			case ENUMGFR_ART_MIT_BEDIENER_VALUE: return ENUMGFR_ART_MIT_BEDIENER;
			case ENUMGFR_ART_SONSTIGE_VALUE: return ENUMGFR_ART_SONSTIGE;
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
	private ENUMGFRArt(int value, String name, String literal) {
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
	
} //ENUMGFRArt
