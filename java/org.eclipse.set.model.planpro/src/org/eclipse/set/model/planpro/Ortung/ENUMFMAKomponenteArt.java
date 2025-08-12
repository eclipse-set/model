/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ortung;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMFMA Komponente Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getENUMFMAKomponenteArt()
 * @model extendedMetaData="name='ENUMFMA_Komponente_Art'"
 * @generated
 */
public enum ENUMFMAKomponenteArt implements Enumerator {
	/**
	 * The '<em><b>ENUMFMA Komponente Art elektrischer Trennstoss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_KOMPONENTE_ART_ELEKTRISCHER_TRENNSTOSS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFMA_KOMPONENTE_ART_ELEKTRISCHER_TRENNSTOSS(0, "ENUMFMA_Komponente_Art_elektrischer_Trennstoss", "elektrischer_Trennstoss"),

	/**
	 * The '<em><b>ENUMFMA Komponente Art Isolierstoss einschienig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_KOMPONENTE_ART_ISOLIERSTOSS_EINSCHIENIG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFMA_KOMPONENTE_ART_ISOLIERSTOSS_EINSCHIENIG(1, "ENUMFMA_Komponente_Art_Isolierstoss_einschienig", "Isolierstoss_einschienig"),

	/**
	 * The '<em><b>ENUMFMA Komponente Art Isolierstoss zweischienig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_KOMPONENTE_ART_ISOLIERSTOSS_ZWEISCHIENIG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFMA_KOMPONENTE_ART_ISOLIERSTOSS_ZWEISCHIENIG(2, "ENUMFMA_Komponente_Art_Isolierstoss_zweischienig", "Isolierstoss_zweischienig");

	/**
	 * The '<em><b>ENUMFMA Komponente Art elektrischer Trennstoss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_KOMPONENTE_ART_ELEKTRISCHER_TRENNSTOSS
	 * @model name="ENUMFMA_Komponente_Art_elektrischer_Trennstoss" literal="elektrischer_Trennstoss"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFMA_KOMPONENTE_ART_ELEKTRISCHER_TRENNSTOSS_VALUE = 0;

	/**
	 * The '<em><b>ENUMFMA Komponente Art Isolierstoss einschienig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_KOMPONENTE_ART_ISOLIERSTOSS_EINSCHIENIG
	 * @model name="ENUMFMA_Komponente_Art_Isolierstoss_einschienig" literal="Isolierstoss_einschienig"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFMA_KOMPONENTE_ART_ISOLIERSTOSS_EINSCHIENIG_VALUE = 1;

	/**
	 * The '<em><b>ENUMFMA Komponente Art Isolierstoss zweischienig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_KOMPONENTE_ART_ISOLIERSTOSS_ZWEISCHIENIG
	 * @model name="ENUMFMA_Komponente_Art_Isolierstoss_zweischienig" literal="Isolierstoss_zweischienig"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFMA_KOMPONENTE_ART_ISOLIERSTOSS_ZWEISCHIENIG_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUMFMA Komponente Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMFMAKomponenteArt[] VALUES_ARRAY =
		new ENUMFMAKomponenteArt[] {
			ENUMFMA_KOMPONENTE_ART_ELEKTRISCHER_TRENNSTOSS,
			ENUMFMA_KOMPONENTE_ART_ISOLIERSTOSS_EINSCHIENIG,
			ENUMFMA_KOMPONENTE_ART_ISOLIERSTOSS_ZWEISCHIENIG,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMFMA Komponente Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMFMAKomponenteArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMFMA Komponente Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFMAKomponenteArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFMAKomponenteArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMFMA Komponente Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFMAKomponenteArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFMAKomponenteArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMFMA Komponente Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFMAKomponenteArt get(int value) {
		switch (value) {
			case ENUMFMA_KOMPONENTE_ART_ELEKTRISCHER_TRENNSTOSS_VALUE: return ENUMFMA_KOMPONENTE_ART_ELEKTRISCHER_TRENNSTOSS;
			case ENUMFMA_KOMPONENTE_ART_ISOLIERSTOSS_EINSCHIENIG_VALUE: return ENUMFMA_KOMPONENTE_ART_ISOLIERSTOSS_EINSCHIENIG;
			case ENUMFMA_KOMPONENTE_ART_ISOLIERSTOSS_ZWEISCHIENIG_VALUE: return ENUMFMA_KOMPONENTE_ART_ISOLIERSTOSS_ZWEISCHIENIG;
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
	private ENUMFMAKomponenteArt(int value, String name, String literal) {
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
	
} //ENUMFMAKomponenteArt
