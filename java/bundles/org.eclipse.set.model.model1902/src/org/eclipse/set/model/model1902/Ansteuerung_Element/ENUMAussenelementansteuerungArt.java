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
 * A representation of the literals of the enumeration '<em><b>ENUM Aussenelementansteuerung Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * GFK=Gleisfeldkonzentrator; FeAk=Feldelement-Anschlusskasten; enthält ebenfalls Objektcontroller; dieser ist mit dem ENUM-Wert 
 * <!-- end-model-doc -->
 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getENUMAussenelementansteuerungArt()
 * @model extendedMetaData="name='ENUMAussenelementansteuerung_Art'"
 * @generated
 */
public enum ENUMAussenelementansteuerungArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Aussenelementansteuerung Art Fe Ak</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSENELEMENTANSTEUERUNG_ART_FE_AK_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUSSENELEMENTANSTEUERUNG_ART_FE_AK(0, "ENUMAussenelementansteuerung_Art_FeAk", "FeAk"),

	/**
	 * The '<em><b>ENUM Aussenelementansteuerung Art GFK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSENELEMENTANSTEUERUNG_ART_GFK_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUSSENELEMENTANSTEUERUNG_ART_GFK(1, "ENUMAussenelementansteuerung_Art_GFK", "GFK"),

	/**
	 * The '<em><b>ENUM Aussenelementansteuerung Art ESTW A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSENELEMENTANSTEUERUNG_ART_ESTW_A_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUSSENELEMENTANSTEUERUNG_ART_ESTW_A(2, "ENUMAussenelementansteuerung_Art_ESTW_A", "ESTW_A"),

	/**
	 * The '<em><b>ENUM Aussenelementansteuerung Art Gleisfreimelde Innenanlage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSENELEMENTANSTEUERUNG_ART_GLEISFREIMELDE_INNENANLAGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUSSENELEMENTANSTEUERUNG_ART_GLEISFREIMELDE_INNENANLAGE(3, "ENUMAussenelementansteuerung_Art_Gleisfreimelde_Innenanlage", "Gleisfreimelde_Innenanlage"),

	/**
	 * The '<em><b>ENUM Aussenelementansteuerung Art Objektcontroller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSENELEMENTANSTEUERUNG_ART_OBJEKTCONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUSSENELEMENTANSTEUERUNG_ART_OBJEKTCONTROLLER(4, "ENUMAussenelementansteuerung_Art_Objektcontroller", "Objektcontroller"),

	/**
	 * The '<em><b>ENUM Aussenelementansteuerung Art Relaisstellwerk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSENELEMENTANSTEUERUNG_ART_RELAISSTELLWERK_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUSSENELEMENTANSTEUERUNG_ART_RELAISSTELLWERK(5, "ENUMAussenelementansteuerung_Art_Relaisstellwerk", "Relaisstellwerk"),

	/**
	 * The '<em><b>ENUM Aussenelementansteuerung Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSENELEMENTANSTEUERUNG_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUSSENELEMENTANSTEUERUNG_ART_SONSTIGE(6, "ENUMAussenelementansteuerung_Art_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Aussenelementansteuerung Art virtuelle Aussenelementansteuerung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSENELEMENTANSTEUERUNG_ART_VIRTUELLE_AUSSENELEMENTANSTEUERUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_AUSSENELEMENTANSTEUERUNG_ART_VIRTUELLE_AUSSENELEMENTANSTEUERUNG(7, "ENUMAussenelementansteuerung_Art_virtuelle_Aussenelementansteuerung", "virtuelle_Aussenelementansteuerung");

	/**
	 * The '<em><b>ENUM Aussenelementansteuerung Art Fe Ak</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSENELEMENTANSTEUERUNG_ART_FE_AK
	 * @model name="ENUMAussenelementansteuerung_Art_FeAk" literal="FeAk"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUSSENELEMENTANSTEUERUNG_ART_FE_AK_VALUE = 0;

	/**
	 * The '<em><b>ENUM Aussenelementansteuerung Art GFK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSENELEMENTANSTEUERUNG_ART_GFK
	 * @model name="ENUMAussenelementansteuerung_Art_GFK" literal="GFK"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUSSENELEMENTANSTEUERUNG_ART_GFK_VALUE = 1;

	/**
	 * The '<em><b>ENUM Aussenelementansteuerung Art ESTW A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSENELEMENTANSTEUERUNG_ART_ESTW_A
	 * @model name="ENUMAussenelementansteuerung_Art_ESTW_A" literal="ESTW_A"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUSSENELEMENTANSTEUERUNG_ART_ESTW_A_VALUE = 2;

	/**
	 * The '<em><b>ENUM Aussenelementansteuerung Art Gleisfreimelde Innenanlage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSENELEMENTANSTEUERUNG_ART_GLEISFREIMELDE_INNENANLAGE
	 * @model name="ENUMAussenelementansteuerung_Art_Gleisfreimelde_Innenanlage" literal="Gleisfreimelde_Innenanlage"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUSSENELEMENTANSTEUERUNG_ART_GLEISFREIMELDE_INNENANLAGE_VALUE = 3;

	/**
	 * The '<em><b>ENUM Aussenelementansteuerung Art Objektcontroller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSENELEMENTANSTEUERUNG_ART_OBJEKTCONTROLLER
	 * @model name="ENUMAussenelementansteuerung_Art_Objektcontroller" literal="Objektcontroller"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUSSENELEMENTANSTEUERUNG_ART_OBJEKTCONTROLLER_VALUE = 4;

	/**
	 * The '<em><b>ENUM Aussenelementansteuerung Art Relaisstellwerk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSENELEMENTANSTEUERUNG_ART_RELAISSTELLWERK
	 * @model name="ENUMAussenelementansteuerung_Art_Relaisstellwerk" literal="Relaisstellwerk"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUSSENELEMENTANSTEUERUNG_ART_RELAISSTELLWERK_VALUE = 5;

	/**
	 * The '<em><b>ENUM Aussenelementansteuerung Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSENELEMENTANSTEUERUNG_ART_SONSTIGE
	 * @model name="ENUMAussenelementansteuerung_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUSSENELEMENTANSTEUERUNG_ART_SONSTIGE_VALUE = 6;

	/**
	 * The '<em><b>ENUM Aussenelementansteuerung Art virtuelle Aussenelementansteuerung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_AUSSENELEMENTANSTEUERUNG_ART_VIRTUELLE_AUSSENELEMENTANSTEUERUNG
	 * @model name="ENUMAussenelementansteuerung_Art_virtuelle_Aussenelementansteuerung" literal="virtuelle_Aussenelementansteuerung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_AUSSENELEMENTANSTEUERUNG_ART_VIRTUELLE_AUSSENELEMENTANSTEUERUNG_VALUE = 7;

	/**
	 * An array of all the '<em><b>ENUM Aussenelementansteuerung Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMAussenelementansteuerungArt[] VALUES_ARRAY =
		new ENUMAussenelementansteuerungArt[] {
			ENUM_AUSSENELEMENTANSTEUERUNG_ART_FE_AK,
			ENUM_AUSSENELEMENTANSTEUERUNG_ART_GFK,
			ENUM_AUSSENELEMENTANSTEUERUNG_ART_ESTW_A,
			ENUM_AUSSENELEMENTANSTEUERUNG_ART_GLEISFREIMELDE_INNENANLAGE,
			ENUM_AUSSENELEMENTANSTEUERUNG_ART_OBJEKTCONTROLLER,
			ENUM_AUSSENELEMENTANSTEUERUNG_ART_RELAISSTELLWERK,
			ENUM_AUSSENELEMENTANSTEUERUNG_ART_SONSTIGE,
			ENUM_AUSSENELEMENTANSTEUERUNG_ART_VIRTUELLE_AUSSENELEMENTANSTEUERUNG,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Aussenelementansteuerung Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMAussenelementansteuerungArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Aussenelementansteuerung Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAussenelementansteuerungArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAussenelementansteuerungArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Aussenelementansteuerung Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAussenelementansteuerungArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMAussenelementansteuerungArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Aussenelementansteuerung Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMAussenelementansteuerungArt get(int value) {
		switch (value) {
			case ENUM_AUSSENELEMENTANSTEUERUNG_ART_FE_AK_VALUE: return ENUM_AUSSENELEMENTANSTEUERUNG_ART_FE_AK;
			case ENUM_AUSSENELEMENTANSTEUERUNG_ART_GFK_VALUE: return ENUM_AUSSENELEMENTANSTEUERUNG_ART_GFK;
			case ENUM_AUSSENELEMENTANSTEUERUNG_ART_ESTW_A_VALUE: return ENUM_AUSSENELEMENTANSTEUERUNG_ART_ESTW_A;
			case ENUM_AUSSENELEMENTANSTEUERUNG_ART_GLEISFREIMELDE_INNENANLAGE_VALUE: return ENUM_AUSSENELEMENTANSTEUERUNG_ART_GLEISFREIMELDE_INNENANLAGE;
			case ENUM_AUSSENELEMENTANSTEUERUNG_ART_OBJEKTCONTROLLER_VALUE: return ENUM_AUSSENELEMENTANSTEUERUNG_ART_OBJEKTCONTROLLER;
			case ENUM_AUSSENELEMENTANSTEUERUNG_ART_RELAISSTELLWERK_VALUE: return ENUM_AUSSENELEMENTANSTEUERUNG_ART_RELAISSTELLWERK;
			case ENUM_AUSSENELEMENTANSTEUERUNG_ART_SONSTIGE_VALUE: return ENUM_AUSSENELEMENTANSTEUERUNG_ART_SONSTIGE;
			case ENUM_AUSSENELEMENTANSTEUERUNG_ART_VIRTUELLE_AUSSENELEMENTANSTEUERUNG_VALUE: return ENUM_AUSSENELEMENTANSTEUERUNG_ART_VIRTUELLE_AUSSENELEMENTANSTEUERUNG;
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
	private ENUMAussenelementansteuerungArt(int value, String name, String literal) {
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
	
} //ENUMAussenelementansteuerungArt
