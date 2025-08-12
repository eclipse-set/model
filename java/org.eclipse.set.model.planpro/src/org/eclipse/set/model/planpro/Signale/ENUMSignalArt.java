/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Signal Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getENUMSignalArt()
 * @model extendedMetaData="name='ENUMSignal_Art'"
 * @generated
 */
public enum ENUMSignalArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Signal Art andere</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_ANDERE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_ART_ANDERE(0, "ENUMSignal_Art_andere", "andere"),

	/**
	 * The '<em><b>ENUM Signal Art Hauptsignal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_HAUPTSIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_ART_HAUPTSIGNAL(1, "ENUMSignal_Art_Hauptsignal", "Hauptsignal"),

	/**
	 * The '<em><b>ENUM Signal Art Hauptsperrsignal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_HAUPTSPERRSIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_ART_HAUPTSPERRSIGNAL(2, "ENUMSignal_Art_Hauptsperrsignal", "Hauptsperrsignal"),

	/**
	 * The '<em><b>ENUM Signal Art Hauptsperrsignal Ne 14 Ls</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_HAUPTSPERRSIGNAL_NE_14_LS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_ART_HAUPTSPERRSIGNAL_NE_14_LS(3, "ENUMSignal_Art_Hauptsperrsignal_Ne_14_Ls", "Hauptsperrsignal Ne 14 Ls"),

	/**
	 * The '<em><b>ENUM Signal Art Mehrabschnittssignal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_MEHRABSCHNITTSSIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_ART_MEHRABSCHNITTSSIGNAL(4, "ENUMSignal_Art_Mehrabschnittssignal", "Mehrabschnittssignal"),

	/**
	 * The '<em><b>ENUM Signal Art Mehrabschnittssperrsignal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_MEHRABSCHNITTSSPERRSIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_ART_MEHRABSCHNITTSSPERRSIGNAL(5, "ENUMSignal_Art_Mehrabschnittssperrsignal", "Mehrabschnittssperrsignal"),

	/**
	 * The '<em><b>ENUM Signal Art Sperrsignal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_SPERRSIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_ART_SPERRSIGNAL(6, "ENUMSignal_Art_Sperrsignal", "Sperrsignal"),

	/**
	 * The '<em><b>ENUM Signal Art Vorsignal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_VORSIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_ART_VORSIGNAL(7, "ENUMSignal_Art_Vorsignal", "Vorsignal"),

	/**
	 * The '<em><b>ENUM Signal Art Vorsignalwiederholer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_VORSIGNALWIEDERHOLER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_ART_VORSIGNALWIEDERHOLER(8, "ENUMSignal_Art_Vorsignalwiederholer", "Vorsignalwiederholer"),

	/**
	 * The '<em><b>ENUM Signal Art Zugdeckungssignal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_ZUGDECKUNGSSIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_ART_ZUGDECKUNGSSIGNAL(9, "ENUMSignal_Art_Zugdeckungssignal", "Zugdeckungssignal");

	/**
	 * The '<em><b>ENUM Signal Art andere</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_ANDERE
	 * @model name="ENUMSignal_Art_andere" literal="andere"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_ART_ANDERE_VALUE = 0;

	/**
	 * The '<em><b>ENUM Signal Art Hauptsignal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_HAUPTSIGNAL
	 * @model name="ENUMSignal_Art_Hauptsignal" literal="Hauptsignal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_ART_HAUPTSIGNAL_VALUE = 1;

	/**
	 * The '<em><b>ENUM Signal Art Hauptsperrsignal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_HAUPTSPERRSIGNAL
	 * @model name="ENUMSignal_Art_Hauptsperrsignal" literal="Hauptsperrsignal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_ART_HAUPTSPERRSIGNAL_VALUE = 2;

	/**
	 * The '<em><b>ENUM Signal Art Hauptsperrsignal Ne 14 Ls</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_HAUPTSPERRSIGNAL_NE_14_LS
	 * @model name="ENUMSignal_Art_Hauptsperrsignal_Ne_14_Ls" literal="Hauptsperrsignal Ne 14 Ls"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_ART_HAUPTSPERRSIGNAL_NE_14_LS_VALUE = 3;

	/**
	 * The '<em><b>ENUM Signal Art Mehrabschnittssignal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_MEHRABSCHNITTSSIGNAL
	 * @model name="ENUMSignal_Art_Mehrabschnittssignal" literal="Mehrabschnittssignal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_ART_MEHRABSCHNITTSSIGNAL_VALUE = 4;

	/**
	 * The '<em><b>ENUM Signal Art Mehrabschnittssperrsignal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_MEHRABSCHNITTSSPERRSIGNAL
	 * @model name="ENUMSignal_Art_Mehrabschnittssperrsignal" literal="Mehrabschnittssperrsignal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_ART_MEHRABSCHNITTSSPERRSIGNAL_VALUE = 5;

	/**
	 * The '<em><b>ENUM Signal Art Sperrsignal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_SPERRSIGNAL
	 * @model name="ENUMSignal_Art_Sperrsignal" literal="Sperrsignal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_ART_SPERRSIGNAL_VALUE = 6;

	/**
	 * The '<em><b>ENUM Signal Art Vorsignal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_VORSIGNAL
	 * @model name="ENUMSignal_Art_Vorsignal" literal="Vorsignal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_ART_VORSIGNAL_VALUE = 7;

	/**
	 * The '<em><b>ENUM Signal Art Vorsignalwiederholer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_VORSIGNALWIEDERHOLER
	 * @model name="ENUMSignal_Art_Vorsignalwiederholer" literal="Vorsignalwiederholer"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_ART_VORSIGNALWIEDERHOLER_VALUE = 8;

	/**
	 * The '<em><b>ENUM Signal Art Zugdeckungssignal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_ART_ZUGDECKUNGSSIGNAL
	 * @model name="ENUMSignal_Art_Zugdeckungssignal" literal="Zugdeckungssignal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_ART_ZUGDECKUNGSSIGNAL_VALUE = 9;

	/**
	 * An array of all the '<em><b>ENUM Signal Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMSignalArt[] VALUES_ARRAY =
		new ENUMSignalArt[] {
			ENUM_SIGNAL_ART_ANDERE,
			ENUM_SIGNAL_ART_HAUPTSIGNAL,
			ENUM_SIGNAL_ART_HAUPTSPERRSIGNAL,
			ENUM_SIGNAL_ART_HAUPTSPERRSIGNAL_NE_14_LS,
			ENUM_SIGNAL_ART_MEHRABSCHNITTSSIGNAL,
			ENUM_SIGNAL_ART_MEHRABSCHNITTSSPERRSIGNAL,
			ENUM_SIGNAL_ART_SPERRSIGNAL,
			ENUM_SIGNAL_ART_VORSIGNAL,
			ENUM_SIGNAL_ART_VORSIGNALWIEDERHOLER,
			ENUM_SIGNAL_ART_ZUGDECKUNGSSIGNAL,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Signal Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMSignalArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Signal Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSignalArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMSignalArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Signal Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSignalArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMSignalArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Signal Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSignalArt get(int value) {
		switch (value) {
			case ENUM_SIGNAL_ART_ANDERE_VALUE: return ENUM_SIGNAL_ART_ANDERE;
			case ENUM_SIGNAL_ART_HAUPTSIGNAL_VALUE: return ENUM_SIGNAL_ART_HAUPTSIGNAL;
			case ENUM_SIGNAL_ART_HAUPTSPERRSIGNAL_VALUE: return ENUM_SIGNAL_ART_HAUPTSPERRSIGNAL;
			case ENUM_SIGNAL_ART_HAUPTSPERRSIGNAL_NE_14_LS_VALUE: return ENUM_SIGNAL_ART_HAUPTSPERRSIGNAL_NE_14_LS;
			case ENUM_SIGNAL_ART_MEHRABSCHNITTSSIGNAL_VALUE: return ENUM_SIGNAL_ART_MEHRABSCHNITTSSIGNAL;
			case ENUM_SIGNAL_ART_MEHRABSCHNITTSSPERRSIGNAL_VALUE: return ENUM_SIGNAL_ART_MEHRABSCHNITTSSPERRSIGNAL;
			case ENUM_SIGNAL_ART_SPERRSIGNAL_VALUE: return ENUM_SIGNAL_ART_SPERRSIGNAL;
			case ENUM_SIGNAL_ART_VORSIGNAL_VALUE: return ENUM_SIGNAL_ART_VORSIGNAL;
			case ENUM_SIGNAL_ART_VORSIGNALWIEDERHOLER_VALUE: return ENUM_SIGNAL_ART_VORSIGNALWIEDERHOLER;
			case ENUM_SIGNAL_ART_ZUGDECKUNGSSIGNAL_VALUE: return ENUM_SIGNAL_ART_ZUGDECKUNGSSIGNAL;
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
	private ENUMSignalArt(int value, String name, String literal) {
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
	
} //ENUMSignalArt
