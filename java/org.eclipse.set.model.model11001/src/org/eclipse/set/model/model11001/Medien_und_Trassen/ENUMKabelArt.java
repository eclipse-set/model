/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Medien_und_Trassen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Kabel Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Medien_und_TrassenPackage#getENUMKabelArt()
 * @model extendedMetaData="name='ENUMKabel_Art'"
 * @generated
 */
public enum ENUMKabelArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Kabel Art Balisenkabel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_ART_BALISENKABEL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_KABEL_ART_BALISENKABEL(0, "ENUMKabel_Art_Balisenkabel", "Balisenkabel"),

	/**
	 * The '<em><b>ENUM Kabel Art Energie 400V AC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_ART_ENERGIE_400V_AC_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_KABEL_ART_ENERGIE_400V_AC(1, "ENUMKabel_Art_Energie_400V_AC", "Energie 400V AC"),

	/**
	 * The '<em><b>ENUM Kabel Art Energie 750V DC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_ART_ENERGIE_750V_DC_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_KABEL_ART_ENERGIE_750V_DC(2, "ENUMKabel_Art_Energie_750V_DC", "Energie 750V DC"),

	/**
	 * The '<em><b>ENUM Kabel Art LWL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_ART_LWL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_KABEL_ART_LWL(3, "ENUMKabel_Art_LWL", "LWL"),

	/**
	 * The '<em><b>ENUM Kabel Art Signalkabel adrig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_ART_SIGNALKABEL_ADRIG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_KABEL_ART_SIGNALKABEL_ADRIG(4, "ENUMKabel_Art_Signalkabel_adrig", "Signalkabel adrig"),

	/**
	 * The '<em><b>ENUM Kabel Art Signalkabel kombiniert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_ART_SIGNALKABEL_KOMBINIERT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_KABEL_ART_SIGNALKABEL_KOMBINIERT(5, "ENUMKabel_Art_Signalkabel_kombiniert", "Signalkabel kombiniert"),

	/**
	 * The '<em><b>ENUM Kabel Art Signalkabel Sternvierer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_ART_SIGNALKABEL_STERNVIERER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_KABEL_ART_SIGNALKABEL_STERNVIERER(6, "ENUMKabel_Art_Signalkabel_Sternvierer", "Signalkabel Sternvierer"),

	/**
	 * The '<em><b>ENUM Kabel Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_KABEL_ART_SONSTIGE(7, "ENUMKabel_Art_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Kabel Art Balisenkabel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_ART_BALISENKABEL
	 * @model name="ENUMKabel_Art_Balisenkabel" literal="Balisenkabel"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_KABEL_ART_BALISENKABEL_VALUE = 0;

	/**
	 * The '<em><b>ENUM Kabel Art Energie 400V AC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_ART_ENERGIE_400V_AC
	 * @model name="ENUMKabel_Art_Energie_400V_AC" literal="Energie 400V AC"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_KABEL_ART_ENERGIE_400V_AC_VALUE = 1;

	/**
	 * The '<em><b>ENUM Kabel Art Energie 750V DC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_ART_ENERGIE_750V_DC
	 * @model name="ENUMKabel_Art_Energie_750V_DC" literal="Energie 750V DC"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_KABEL_ART_ENERGIE_750V_DC_VALUE = 2;

	/**
	 * The '<em><b>ENUM Kabel Art LWL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_ART_LWL
	 * @model name="ENUMKabel_Art_LWL" literal="LWL"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_KABEL_ART_LWL_VALUE = 3;

	/**
	 * The '<em><b>ENUM Kabel Art Signalkabel adrig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_ART_SIGNALKABEL_ADRIG
	 * @model name="ENUMKabel_Art_Signalkabel_adrig" literal="Signalkabel adrig"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_KABEL_ART_SIGNALKABEL_ADRIG_VALUE = 4;

	/**
	 * The '<em><b>ENUM Kabel Art Signalkabel kombiniert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_ART_SIGNALKABEL_KOMBINIERT
	 * @model name="ENUMKabel_Art_Signalkabel_kombiniert" literal="Signalkabel kombiniert"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_KABEL_ART_SIGNALKABEL_KOMBINIERT_VALUE = 5;

	/**
	 * The '<em><b>ENUM Kabel Art Signalkabel Sternvierer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_ART_SIGNALKABEL_STERNVIERER
	 * @model name="ENUMKabel_Art_Signalkabel_Sternvierer" literal="Signalkabel Sternvierer"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_KABEL_ART_SIGNALKABEL_STERNVIERER_VALUE = 6;

	/**
	 * The '<em><b>ENUM Kabel Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KABEL_ART_SONSTIGE
	 * @model name="ENUMKabel_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_KABEL_ART_SONSTIGE_VALUE = 7;

	/**
	 * An array of all the '<em><b>ENUM Kabel Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMKabelArt[] VALUES_ARRAY =
		new ENUMKabelArt[] {
			ENUM_KABEL_ART_BALISENKABEL,
			ENUM_KABEL_ART_ENERGIE_400V_AC,
			ENUM_KABEL_ART_ENERGIE_750V_DC,
			ENUM_KABEL_ART_LWL,
			ENUM_KABEL_ART_SIGNALKABEL_ADRIG,
			ENUM_KABEL_ART_SIGNALKABEL_KOMBINIERT,
			ENUM_KABEL_ART_SIGNALKABEL_STERNVIERER,
			ENUM_KABEL_ART_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Kabel Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMKabelArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Kabel Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMKabelArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMKabelArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Kabel Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMKabelArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMKabelArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Kabel Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMKabelArt get(int value) {
		switch (value) {
			case ENUM_KABEL_ART_BALISENKABEL_VALUE: return ENUM_KABEL_ART_BALISENKABEL;
			case ENUM_KABEL_ART_ENERGIE_400V_AC_VALUE: return ENUM_KABEL_ART_ENERGIE_400V_AC;
			case ENUM_KABEL_ART_ENERGIE_750V_DC_VALUE: return ENUM_KABEL_ART_ENERGIE_750V_DC;
			case ENUM_KABEL_ART_LWL_VALUE: return ENUM_KABEL_ART_LWL;
			case ENUM_KABEL_ART_SIGNALKABEL_ADRIG_VALUE: return ENUM_KABEL_ART_SIGNALKABEL_ADRIG;
			case ENUM_KABEL_ART_SIGNALKABEL_KOMBINIERT_VALUE: return ENUM_KABEL_ART_SIGNALKABEL_KOMBINIERT;
			case ENUM_KABEL_ART_SIGNALKABEL_STERNVIERER_VALUE: return ENUM_KABEL_ART_SIGNALKABEL_STERNVIERER;
			case ENUM_KABEL_ART_SONSTIGE_VALUE: return ENUM_KABEL_ART_SONSTIGE;
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
	private ENUMKabelArt(int value, String name, String literal) {
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
	
} //ENUMKabelArt
