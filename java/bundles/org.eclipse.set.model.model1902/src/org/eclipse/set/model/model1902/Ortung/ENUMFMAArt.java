/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ortung;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMFMA Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Ortung.OrtungPackage#getENUMFMAArt()
 * @model extendedMetaData="name='ENUMFMA_Art'"
 * @generated
 */
public enum ENUMFMAArt implements Enumerator {
	/**
	 * The '<em><b>ENUMFMA Art NF Gleisstromkreis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ART_NF_GLEISSTROMKREIS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFMA_ART_NF_GLEISSTROMKREIS(0, "ENUMFMA_Art_NF_Gleisstromkreis", "NF_Gleisstromkreis"),

	/**
	 * The '<em><b>ENUMFMA Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFMA_ART_SONSTIGE(1, "ENUMFMA_Art_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUMFMA Art TF Gleisstromkreis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ART_TF_GLEISSTROMKREIS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFMA_ART_TF_GLEISSTROMKREIS(2, "ENUMFMA_Art_TF_Gleisstromkreis", "TF_Gleisstromkreis"),

	/**
	 * The '<em><b>ENUMFMA Art FTGS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ART_FTGS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFMA_ART_FTGS(3, "ENUMFMA_Art_FTGS", "FTGS"),

	/**
	 * The '<em><b>ENUMFMA Art Achszaehlanlage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ART_ACHSZAEHLANLAGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMFMA_ART_ACHSZAEHLANLAGE(4, "ENUMFMA_Art_Achszaehlanlage", "Achszaehlanlage");

	/**
	 * The '<em><b>ENUMFMA Art NF Gleisstromkreis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ART_NF_GLEISSTROMKREIS
	 * @model name="ENUMFMA_Art_NF_Gleisstromkreis" literal="NF_Gleisstromkreis"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFMA_ART_NF_GLEISSTROMKREIS_VALUE = 0;

	/**
	 * The '<em><b>ENUMFMA Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ART_SONSTIGE
	 * @model name="ENUMFMA_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFMA_ART_SONSTIGE_VALUE = 1;

	/**
	 * The '<em><b>ENUMFMA Art TF Gleisstromkreis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ART_TF_GLEISSTROMKREIS
	 * @model name="ENUMFMA_Art_TF_Gleisstromkreis" literal="TF_Gleisstromkreis"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFMA_ART_TF_GLEISSTROMKREIS_VALUE = 2;

	/**
	 * The '<em><b>ENUMFMA Art FTGS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ART_FTGS
	 * @model name="ENUMFMA_Art_FTGS" literal="FTGS"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFMA_ART_FTGS_VALUE = 3;

	/**
	 * The '<em><b>ENUMFMA Art Achszaehlanlage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMFMA_ART_ACHSZAEHLANLAGE
	 * @model name="ENUMFMA_Art_Achszaehlanlage" literal="Achszaehlanlage"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMFMA_ART_ACHSZAEHLANLAGE_VALUE = 4;

	/**
	 * An array of all the '<em><b>ENUMFMA Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMFMAArt[] VALUES_ARRAY =
		new ENUMFMAArt[] {
			ENUMFMA_ART_NF_GLEISSTROMKREIS,
			ENUMFMA_ART_SONSTIGE,
			ENUMFMA_ART_TF_GLEISSTROMKREIS,
			ENUMFMA_ART_FTGS,
			ENUMFMA_ART_ACHSZAEHLANLAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMFMA Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMFMAArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMFMA Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFMAArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFMAArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMFMA Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFMAArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMFMAArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMFMA Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMFMAArt get(int value) {
		switch (value) {
			case ENUMFMA_ART_NF_GLEISSTROMKREIS_VALUE: return ENUMFMA_ART_NF_GLEISSTROMKREIS;
			case ENUMFMA_ART_SONSTIGE_VALUE: return ENUMFMA_ART_SONSTIGE;
			case ENUMFMA_ART_TF_GLEISSTROMKREIS_VALUE: return ENUMFMA_ART_TF_GLEISSTROMKREIS;
			case ENUMFMA_ART_FTGS_VALUE: return ENUMFMA_ART_FTGS;
			case ENUMFMA_ART_ACHSZAEHLANLAGE_VALUE: return ENUMFMA_ART_ACHSZAEHLANLAGE;
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
	private ENUMFMAArt(int value, String name, String literal) {
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
	
} //ENUMFMAArt
