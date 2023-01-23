/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Signale;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Signal Funktion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Signale.SignalePackage#getENUMSignalFunktion()
 * @model extendedMetaData="name='ENUMSignal_Funktion'"
 * @generated
 */
public enum ENUMSignalFunktion implements Enumerator {
	/**
	 * The '<em><b>ENUM Signal Funktion Alleinstehendes Zusatzsignal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_ALLEINSTEHENDES_ZUSATZSIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_ALLEINSTEHENDES_ZUSATZSIGNAL(0, "ENUMSignal_Funktion_Alleinstehendes_Zusatzsignal", "Alleinstehendes_Zusatzsignal"),

	/**
	 * The '<em><b>ENUM Signal Funktion andere</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_ANDERE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_ANDERE(1, "ENUMSignal_Funktion_andere", "andere"),

	/**
	 * The '<em><b>ENUM Signal Funktion Ausfahr Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_AUSFAHR_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_AUSFAHR_SIGNAL(2, "ENUMSignal_Funktion_Ausfahr_Signal", "Ausfahr_Signal"),

	/**
	 * The '<em><b>ENUM Signal Funktion Ausfahr Zwischen Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_AUSFAHR_ZWISCHEN_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_AUSFAHR_ZWISCHEN_SIGNAL(3, "ENUMSignal_Funktion_Ausfahr_Zwischen_Signal", "Ausfahr_Zwischen_Signal"),

	/**
	 * The '<em><b>ENUM Signal Funktion Block Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_BLOCK_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_BLOCK_SIGNAL(4, "ENUMSignal_Funktion_Block_Signal", "Block_Signal"),

	/**
	 * The '<em><b>ENUM Signal Funktion BUE Ueberwachungssignal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_BUE_UEBERWACHUNGSSIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_BUE_UEBERWACHUNGSSIGNAL(5, "ENUMSignal_Funktion_BUE_Ueberwachungssignal", "BUE_Ueberwachungssignal"),

	/**
	 * The '<em><b>ENUM Signal Funktion Deckungs Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_DECKUNGS_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_DECKUNGS_SIGNAL(6, "ENUMSignal_Funktion_Deckungs_Signal", "Deckungs_Signal"),

	/**
	 * The '<em><b>ENUM Signal Funktion Einfahr Ausfahr Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_EINFAHR_AUSFAHR_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_EINFAHR_AUSFAHR_SIGNAL(7, "ENUMSignal_Funktion_Einfahr_Ausfahr_Signal", "Einfahr_Ausfahr_Signal"),

	/**
	 * The '<em><b>ENUM Signal Funktion Einfahr Block Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_EINFAHR_BLOCK_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_EINFAHR_BLOCK_SIGNAL(8, "ENUMSignal_Funktion_Einfahr_Block_Signal", "Einfahr_Block_Signal"),

	/**
	 * The '<em><b>ENUM Signal Funktion Einfahr Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_EINFAHR_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_EINFAHR_SIGNAL(9, "ENUMSignal_Funktion_Einfahr_Signal", "Einfahr_Signal"),

	/**
	 * The '<em><b>ENUM Signal Funktion Gruppenausfahr Gruppenzwischen Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_GRUPPENAUSFAHR_GRUPPENZWISCHEN_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_GRUPPENAUSFAHR_GRUPPENZWISCHEN_SIGNAL(10, "ENUMSignal_Funktion_Gruppenausfahr_Gruppenzwischen_Signal", "Gruppenausfahr_Gruppenzwischen_Signal"),

	/**
	 * The '<em><b>ENUM Signal Funktion Gruppenausfahr Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_GRUPPENAUSFAHR_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_GRUPPENAUSFAHR_SIGNAL(11, "ENUMSignal_Funktion_Gruppenausfahr_Signal", "Gruppenausfahr_Signal"),

	/**
	 * The '<em><b>ENUM Signal Funktion Gruppenzwischen Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_GRUPPENZWISCHEN_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_GRUPPENZWISCHEN_SIGNAL(12, "ENUMSignal_Funktion_Gruppenzwischen_Signal", "Gruppenzwischen_Signal"),

	/**
	 * The '<em><b>ENUM Signal Funktion Nachrueck Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_NACHRUECK_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_NACHRUECK_SIGNAL(13, "ENUMSignal_Funktion_Nachrueck_Signal", "Nachrueck_Signal"),

	/**
	 * The '<em><b>ENUM Signal Funktion Vorsignal Vorsignalwiederholer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_VORSIGNAL_VORSIGNALWIEDERHOLER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_VORSIGNAL_VORSIGNALWIEDERHOLER(14, "ENUMSignal_Funktion_Vorsignal_Vorsignalwiederholer", "Vorsignal_Vorsignalwiederholer"),

	/**
	 * The '<em><b>ENUM Signal Funktion Zugdeckungs Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_ZUGDECKUNGS_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_ZUGDECKUNGS_SIGNAL(15, "ENUMSignal_Funktion_Zugdeckungs_Signal", "Zugdeckungs_Signal"),

	/**
	 * The '<em><b>ENUM Signal Funktion Zug Ziel Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_ZUG_ZIEL_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_ZUG_ZIEL_SIGNAL(16, "ENUMSignal_Funktion_Zug_Ziel_Signal", "Zug_Ziel_Signal"),

	/**
	 * The '<em><b>ENUM Signal Funktion Zwischen Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_ZWISCHEN_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_SIGNAL_FUNKTION_ZWISCHEN_SIGNAL(17, "ENUMSignal_Funktion_Zwischen_Signal", "Zwischen_Signal");

	/**
	 * The '<em><b>ENUM Signal Funktion Alleinstehendes Zusatzsignal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_ALLEINSTEHENDES_ZUSATZSIGNAL
	 * @model name="ENUMSignal_Funktion_Alleinstehendes_Zusatzsignal" literal="Alleinstehendes_Zusatzsignal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_ALLEINSTEHENDES_ZUSATZSIGNAL_VALUE = 0;

	/**
	 * The '<em><b>ENUM Signal Funktion andere</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_ANDERE
	 * @model name="ENUMSignal_Funktion_andere" literal="andere"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_ANDERE_VALUE = 1;

	/**
	 * The '<em><b>ENUM Signal Funktion Ausfahr Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_AUSFAHR_SIGNAL
	 * @model name="ENUMSignal_Funktion_Ausfahr_Signal" literal="Ausfahr_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_AUSFAHR_SIGNAL_VALUE = 2;

	/**
	 * The '<em><b>ENUM Signal Funktion Ausfahr Zwischen Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_AUSFAHR_ZWISCHEN_SIGNAL
	 * @model name="ENUMSignal_Funktion_Ausfahr_Zwischen_Signal" literal="Ausfahr_Zwischen_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_AUSFAHR_ZWISCHEN_SIGNAL_VALUE = 3;

	/**
	 * The '<em><b>ENUM Signal Funktion Block Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_BLOCK_SIGNAL
	 * @model name="ENUMSignal_Funktion_Block_Signal" literal="Block_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_BLOCK_SIGNAL_VALUE = 4;

	/**
	 * The '<em><b>ENUM Signal Funktion BUE Ueberwachungssignal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_BUE_UEBERWACHUNGSSIGNAL
	 * @model name="ENUMSignal_Funktion_BUE_Ueberwachungssignal" literal="BUE_Ueberwachungssignal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_BUE_UEBERWACHUNGSSIGNAL_VALUE = 5;

	/**
	 * The '<em><b>ENUM Signal Funktion Deckungs Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_DECKUNGS_SIGNAL
	 * @model name="ENUMSignal_Funktion_Deckungs_Signal" literal="Deckungs_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_DECKUNGS_SIGNAL_VALUE = 6;

	/**
	 * The '<em><b>ENUM Signal Funktion Einfahr Ausfahr Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_EINFAHR_AUSFAHR_SIGNAL
	 * @model name="ENUMSignal_Funktion_Einfahr_Ausfahr_Signal" literal="Einfahr_Ausfahr_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_EINFAHR_AUSFAHR_SIGNAL_VALUE = 7;

	/**
	 * The '<em><b>ENUM Signal Funktion Einfahr Block Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_EINFAHR_BLOCK_SIGNAL
	 * @model name="ENUMSignal_Funktion_Einfahr_Block_Signal" literal="Einfahr_Block_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_EINFAHR_BLOCK_SIGNAL_VALUE = 8;

	/**
	 * The '<em><b>ENUM Signal Funktion Einfahr Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_EINFAHR_SIGNAL
	 * @model name="ENUMSignal_Funktion_Einfahr_Signal" literal="Einfahr_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_EINFAHR_SIGNAL_VALUE = 9;

	/**
	 * The '<em><b>ENUM Signal Funktion Gruppenausfahr Gruppenzwischen Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_GRUPPENAUSFAHR_GRUPPENZWISCHEN_SIGNAL
	 * @model name="ENUMSignal_Funktion_Gruppenausfahr_Gruppenzwischen_Signal" literal="Gruppenausfahr_Gruppenzwischen_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_GRUPPENAUSFAHR_GRUPPENZWISCHEN_SIGNAL_VALUE = 10;

	/**
	 * The '<em><b>ENUM Signal Funktion Gruppenausfahr Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_GRUPPENAUSFAHR_SIGNAL
	 * @model name="ENUMSignal_Funktion_Gruppenausfahr_Signal" literal="Gruppenausfahr_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_GRUPPENAUSFAHR_SIGNAL_VALUE = 11;

	/**
	 * The '<em><b>ENUM Signal Funktion Gruppenzwischen Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_GRUPPENZWISCHEN_SIGNAL
	 * @model name="ENUMSignal_Funktion_Gruppenzwischen_Signal" literal="Gruppenzwischen_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_GRUPPENZWISCHEN_SIGNAL_VALUE = 12;

	/**
	 * The '<em><b>ENUM Signal Funktion Nachrueck Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_NACHRUECK_SIGNAL
	 * @model name="ENUMSignal_Funktion_Nachrueck_Signal" literal="Nachrueck_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_NACHRUECK_SIGNAL_VALUE = 13;

	/**
	 * The '<em><b>ENUM Signal Funktion Vorsignal Vorsignalwiederholer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_VORSIGNAL_VORSIGNALWIEDERHOLER
	 * @model name="ENUMSignal_Funktion_Vorsignal_Vorsignalwiederholer" literal="Vorsignal_Vorsignalwiederholer"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_VORSIGNAL_VORSIGNALWIEDERHOLER_VALUE = 14;

	/**
	 * The '<em><b>ENUM Signal Funktion Zugdeckungs Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_ZUGDECKUNGS_SIGNAL
	 * @model name="ENUMSignal_Funktion_Zugdeckungs_Signal" literal="Zugdeckungs_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_ZUGDECKUNGS_SIGNAL_VALUE = 15;

	/**
	 * The '<em><b>ENUM Signal Funktion Zug Ziel Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_ZUG_ZIEL_SIGNAL
	 * @model name="ENUMSignal_Funktion_Zug_Ziel_Signal" literal="Zug_Ziel_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_ZUG_ZIEL_SIGNAL_VALUE = 16;

	/**
	 * The '<em><b>ENUM Signal Funktion Zwischen Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_SIGNAL_FUNKTION_ZWISCHEN_SIGNAL
	 * @model name="ENUMSignal_Funktion_Zwischen_Signal" literal="Zwischen_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_SIGNAL_FUNKTION_ZWISCHEN_SIGNAL_VALUE = 17;

	/**
	 * An array of all the '<em><b>ENUM Signal Funktion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMSignalFunktion[] VALUES_ARRAY =
		new ENUMSignalFunktion[] {
			ENUM_SIGNAL_FUNKTION_ALLEINSTEHENDES_ZUSATZSIGNAL,
			ENUM_SIGNAL_FUNKTION_ANDERE,
			ENUM_SIGNAL_FUNKTION_AUSFAHR_SIGNAL,
			ENUM_SIGNAL_FUNKTION_AUSFAHR_ZWISCHEN_SIGNAL,
			ENUM_SIGNAL_FUNKTION_BLOCK_SIGNAL,
			ENUM_SIGNAL_FUNKTION_BUE_UEBERWACHUNGSSIGNAL,
			ENUM_SIGNAL_FUNKTION_DECKUNGS_SIGNAL,
			ENUM_SIGNAL_FUNKTION_EINFAHR_AUSFAHR_SIGNAL,
			ENUM_SIGNAL_FUNKTION_EINFAHR_BLOCK_SIGNAL,
			ENUM_SIGNAL_FUNKTION_EINFAHR_SIGNAL,
			ENUM_SIGNAL_FUNKTION_GRUPPENAUSFAHR_GRUPPENZWISCHEN_SIGNAL,
			ENUM_SIGNAL_FUNKTION_GRUPPENAUSFAHR_SIGNAL,
			ENUM_SIGNAL_FUNKTION_GRUPPENZWISCHEN_SIGNAL,
			ENUM_SIGNAL_FUNKTION_NACHRUECK_SIGNAL,
			ENUM_SIGNAL_FUNKTION_VORSIGNAL_VORSIGNALWIEDERHOLER,
			ENUM_SIGNAL_FUNKTION_ZUGDECKUNGS_SIGNAL,
			ENUM_SIGNAL_FUNKTION_ZUG_ZIEL_SIGNAL,
			ENUM_SIGNAL_FUNKTION_ZWISCHEN_SIGNAL,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Signal Funktion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMSignalFunktion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Signal Funktion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSignalFunktion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMSignalFunktion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Signal Funktion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSignalFunktion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMSignalFunktion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Signal Funktion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMSignalFunktion get(int value) {
		switch (value) {
			case ENUM_SIGNAL_FUNKTION_ALLEINSTEHENDES_ZUSATZSIGNAL_VALUE: return ENUM_SIGNAL_FUNKTION_ALLEINSTEHENDES_ZUSATZSIGNAL;
			case ENUM_SIGNAL_FUNKTION_ANDERE_VALUE: return ENUM_SIGNAL_FUNKTION_ANDERE;
			case ENUM_SIGNAL_FUNKTION_AUSFAHR_SIGNAL_VALUE: return ENUM_SIGNAL_FUNKTION_AUSFAHR_SIGNAL;
			case ENUM_SIGNAL_FUNKTION_AUSFAHR_ZWISCHEN_SIGNAL_VALUE: return ENUM_SIGNAL_FUNKTION_AUSFAHR_ZWISCHEN_SIGNAL;
			case ENUM_SIGNAL_FUNKTION_BLOCK_SIGNAL_VALUE: return ENUM_SIGNAL_FUNKTION_BLOCK_SIGNAL;
			case ENUM_SIGNAL_FUNKTION_BUE_UEBERWACHUNGSSIGNAL_VALUE: return ENUM_SIGNAL_FUNKTION_BUE_UEBERWACHUNGSSIGNAL;
			case ENUM_SIGNAL_FUNKTION_DECKUNGS_SIGNAL_VALUE: return ENUM_SIGNAL_FUNKTION_DECKUNGS_SIGNAL;
			case ENUM_SIGNAL_FUNKTION_EINFAHR_AUSFAHR_SIGNAL_VALUE: return ENUM_SIGNAL_FUNKTION_EINFAHR_AUSFAHR_SIGNAL;
			case ENUM_SIGNAL_FUNKTION_EINFAHR_BLOCK_SIGNAL_VALUE: return ENUM_SIGNAL_FUNKTION_EINFAHR_BLOCK_SIGNAL;
			case ENUM_SIGNAL_FUNKTION_EINFAHR_SIGNAL_VALUE: return ENUM_SIGNAL_FUNKTION_EINFAHR_SIGNAL;
			case ENUM_SIGNAL_FUNKTION_GRUPPENAUSFAHR_GRUPPENZWISCHEN_SIGNAL_VALUE: return ENUM_SIGNAL_FUNKTION_GRUPPENAUSFAHR_GRUPPENZWISCHEN_SIGNAL;
			case ENUM_SIGNAL_FUNKTION_GRUPPENAUSFAHR_SIGNAL_VALUE: return ENUM_SIGNAL_FUNKTION_GRUPPENAUSFAHR_SIGNAL;
			case ENUM_SIGNAL_FUNKTION_GRUPPENZWISCHEN_SIGNAL_VALUE: return ENUM_SIGNAL_FUNKTION_GRUPPENZWISCHEN_SIGNAL;
			case ENUM_SIGNAL_FUNKTION_NACHRUECK_SIGNAL_VALUE: return ENUM_SIGNAL_FUNKTION_NACHRUECK_SIGNAL;
			case ENUM_SIGNAL_FUNKTION_VORSIGNAL_VORSIGNALWIEDERHOLER_VALUE: return ENUM_SIGNAL_FUNKTION_VORSIGNAL_VORSIGNALWIEDERHOLER;
			case ENUM_SIGNAL_FUNKTION_ZUGDECKUNGS_SIGNAL_VALUE: return ENUM_SIGNAL_FUNKTION_ZUGDECKUNGS_SIGNAL;
			case ENUM_SIGNAL_FUNKTION_ZUG_ZIEL_SIGNAL_VALUE: return ENUM_SIGNAL_FUNKTION_ZUG_ZIEL_SIGNAL;
			case ENUM_SIGNAL_FUNKTION_ZWISCHEN_SIGNAL_VALUE: return ENUM_SIGNAL_FUNKTION_ZWISCHEN_SIGNAL;
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
	private ENUMSignalFunktion(int value, String name, String literal) {
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
	
} //ENUMSignalFunktion
