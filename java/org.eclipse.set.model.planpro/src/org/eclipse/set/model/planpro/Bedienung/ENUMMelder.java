/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Melder</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getENUMMelder()
 * @model extendedMetaData="name='ENUMMelder'"
 * @generated
 */
public enum ENUMMelder implements Enumerator {
	/**
	 * The '<em><b>ENUM Melder Anforderungsempfang</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_ANFORDERUNGSEMPFANG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MELDER_ANFORDERUNGSEMPFANG(0, "ENUMMelder_Anforderungsempfang", "Anforderungsempfang"),

	/**
	 * The '<em><b>ENUM Melder Anzeige Betriebszustand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_ANZEIGE_BETRIEBSZUSTAND_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MELDER_ANZEIGE_BETRIEBSZUSTAND(1, "ENUMMelder_Anzeige_Betriebszustand", "Anzeige_Betriebszustand"),

	/**
	 * The '<em><b>ENUM Melder Leuchtmelder ZP 10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_LEUCHTMELDER_ZP_10_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MELDER_LEUCHTMELDER_ZP_10(2, "ENUMMelder_Leuchtmelder_ZP_10", "Leuchtmelder_ZP_10"),

	/**
	 * The '<em><b>ENUM Melder Leuchtmelder ZP 9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_LEUCHTMELDER_ZP_9_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MELDER_LEUCHTMELDER_ZP_9(3, "ENUMMelder_Leuchtmelder_ZP_9", "Leuchtmelder_ZP_9"),

	/**
	 * The '<em><b>ENUM Melder Signalanforderung empfangen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_SIGNALANFORDERUNG_EMPFANGEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MELDER_SIGNALANFORDERUNG_EMPFANGEN(4, "ENUMMelder_Signalanforderung_empfangen", "Signalanforderung_empfangen"),

	/**
	 * The '<em><b>ENUM Melder Signalfahrtmelder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_SIGNALFAHRTMELDER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MELDER_SIGNALFAHRTMELDER(5, "ENUMMelder_Signalfahrtmelder", "Signalfahrtmelder"),

	/**
	 * The '<em><b>ENUM Melder Signalhaltmelder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_SIGNALHALTMELDER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MELDER_SIGNALHALTMELDER(6, "ENUMMelder_Signalhaltmelder", "Signalhaltmelder"),

	/**
	 * The '<em><b>ENUM Melder sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MELDER_SONSTIGE(7, "ENUMMelder_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Melder Sperrmelder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_SPERRMELDER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MELDER_SPERRMELDER(8, "ENUMMelder_Sperrmelder", "Sperrmelder"),

	/**
	 * The '<em><b>ENUM Melder Vorbereitungsmeldung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_VORBEREITUNGSMELDUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MELDER_VORBEREITUNGSMELDUNG(9, "ENUMMelder_Vorbereitungsmeldung", "Vorbereitungsmeldung"),

	/**
	 * The '<em><b>ENUM Melder Weichenmelder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_WEICHENMELDER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MELDER_WEICHENMELDER(10, "ENUMMelder_Weichenmelder", "Weichenmelder"),

	/**
	 * The '<em><b>ENUM Melder Zielmelder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_ZIELMELDER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_MELDER_ZIELMELDER(11, "ENUMMelder_Zielmelder", "Zielmelder");

	/**
	 * The '<em><b>ENUM Melder Anforderungsempfang</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_ANFORDERUNGSEMPFANG
	 * @model name="ENUMMelder_Anforderungsempfang" literal="Anforderungsempfang"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MELDER_ANFORDERUNGSEMPFANG_VALUE = 0;

	/**
	 * The '<em><b>ENUM Melder Anzeige Betriebszustand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_ANZEIGE_BETRIEBSZUSTAND
	 * @model name="ENUMMelder_Anzeige_Betriebszustand" literal="Anzeige_Betriebszustand"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MELDER_ANZEIGE_BETRIEBSZUSTAND_VALUE = 1;

	/**
	 * The '<em><b>ENUM Melder Leuchtmelder ZP 10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_LEUCHTMELDER_ZP_10
	 * @model name="ENUMMelder_Leuchtmelder_ZP_10" literal="Leuchtmelder_ZP_10"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MELDER_LEUCHTMELDER_ZP_10_VALUE = 2;

	/**
	 * The '<em><b>ENUM Melder Leuchtmelder ZP 9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_LEUCHTMELDER_ZP_9
	 * @model name="ENUMMelder_Leuchtmelder_ZP_9" literal="Leuchtmelder_ZP_9"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MELDER_LEUCHTMELDER_ZP_9_VALUE = 3;

	/**
	 * The '<em><b>ENUM Melder Signalanforderung empfangen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_SIGNALANFORDERUNG_EMPFANGEN
	 * @model name="ENUMMelder_Signalanforderung_empfangen" literal="Signalanforderung_empfangen"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MELDER_SIGNALANFORDERUNG_EMPFANGEN_VALUE = 4;

	/**
	 * The '<em><b>ENUM Melder Signalfahrtmelder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_SIGNALFAHRTMELDER
	 * @model name="ENUMMelder_Signalfahrtmelder" literal="Signalfahrtmelder"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MELDER_SIGNALFAHRTMELDER_VALUE = 5;

	/**
	 * The '<em><b>ENUM Melder Signalhaltmelder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_SIGNALHALTMELDER
	 * @model name="ENUMMelder_Signalhaltmelder" literal="Signalhaltmelder"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MELDER_SIGNALHALTMELDER_VALUE = 6;

	/**
	 * The '<em><b>ENUM Melder sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_SONSTIGE
	 * @model name="ENUMMelder_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MELDER_SONSTIGE_VALUE = 7;

	/**
	 * The '<em><b>ENUM Melder Sperrmelder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_SPERRMELDER
	 * @model name="ENUMMelder_Sperrmelder" literal="Sperrmelder"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MELDER_SPERRMELDER_VALUE = 8;

	/**
	 * The '<em><b>ENUM Melder Vorbereitungsmeldung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_VORBEREITUNGSMELDUNG
	 * @model name="ENUMMelder_Vorbereitungsmeldung" literal="Vorbereitungsmeldung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MELDER_VORBEREITUNGSMELDUNG_VALUE = 9;

	/**
	 * The '<em><b>ENUM Melder Weichenmelder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_WEICHENMELDER
	 * @model name="ENUMMelder_Weichenmelder" literal="Weichenmelder"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MELDER_WEICHENMELDER_VALUE = 10;

	/**
	 * The '<em><b>ENUM Melder Zielmelder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_MELDER_ZIELMELDER
	 * @model name="ENUMMelder_Zielmelder" literal="Zielmelder"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_MELDER_ZIELMELDER_VALUE = 11;

	/**
	 * An array of all the '<em><b>ENUM Melder</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMMelder[] VALUES_ARRAY =
		new ENUMMelder[] {
			ENUM_MELDER_ANFORDERUNGSEMPFANG,
			ENUM_MELDER_ANZEIGE_BETRIEBSZUSTAND,
			ENUM_MELDER_LEUCHTMELDER_ZP_10,
			ENUM_MELDER_LEUCHTMELDER_ZP_9,
			ENUM_MELDER_SIGNALANFORDERUNG_EMPFANGEN,
			ENUM_MELDER_SIGNALFAHRTMELDER,
			ENUM_MELDER_SIGNALHALTMELDER,
			ENUM_MELDER_SONSTIGE,
			ENUM_MELDER_SPERRMELDER,
			ENUM_MELDER_VORBEREITUNGSMELDUNG,
			ENUM_MELDER_WEICHENMELDER,
			ENUM_MELDER_ZIELMELDER,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Melder</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMMelder> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Melder</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMMelder get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMMelder result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Melder</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMMelder getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMMelder result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Melder</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMMelder get(int value) {
		switch (value) {
			case ENUM_MELDER_ANFORDERUNGSEMPFANG_VALUE: return ENUM_MELDER_ANFORDERUNGSEMPFANG;
			case ENUM_MELDER_ANZEIGE_BETRIEBSZUSTAND_VALUE: return ENUM_MELDER_ANZEIGE_BETRIEBSZUSTAND;
			case ENUM_MELDER_LEUCHTMELDER_ZP_10_VALUE: return ENUM_MELDER_LEUCHTMELDER_ZP_10;
			case ENUM_MELDER_LEUCHTMELDER_ZP_9_VALUE: return ENUM_MELDER_LEUCHTMELDER_ZP_9;
			case ENUM_MELDER_SIGNALANFORDERUNG_EMPFANGEN_VALUE: return ENUM_MELDER_SIGNALANFORDERUNG_EMPFANGEN;
			case ENUM_MELDER_SIGNALFAHRTMELDER_VALUE: return ENUM_MELDER_SIGNALFAHRTMELDER;
			case ENUM_MELDER_SIGNALHALTMELDER_VALUE: return ENUM_MELDER_SIGNALHALTMELDER;
			case ENUM_MELDER_SONSTIGE_VALUE: return ENUM_MELDER_SONSTIGE;
			case ENUM_MELDER_SPERRMELDER_VALUE: return ENUM_MELDER_SPERRMELDER;
			case ENUM_MELDER_VORBEREITUNGSMELDUNG_VALUE: return ENUM_MELDER_VORBEREITUNGSMELDUNG;
			case ENUM_MELDER_WEICHENMELDER_VALUE: return ENUM_MELDER_WEICHENMELDER;
			case ENUM_MELDER_ZIELMELDER_VALUE: return ENUM_MELDER_ZIELMELDER;
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
	private ENUMMelder(int value, String name, String literal) {
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
	
} //ENUMMelder
