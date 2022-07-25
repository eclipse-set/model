/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PZB;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Wirksamkeit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getENUMWirksamkeit()
 * @model extendedMetaData="name='ENUMWirksamkeit'"
 * @generated
 */
public enum ENUMWirksamkeit implements Enumerator {
	/**
	 * The '<em><b>ENUM Wirksamkeit schaltbar von Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKSAMKEIT_SCHALTBAR_VON_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WIRKSAMKEIT_SCHALTBAR_VON_SIGNAL(0, "ENUMWirksamkeit_schaltbar_von_Signal", "schaltbar_von_Signal"),

	/**
	 * The '<em><b>ENUM Wirksamkeit staendig wirksam wenn Fahrstrasse eingestellt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKSAMKEIT_STAENDIG_WIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WIRKSAMKEIT_STAENDIG_WIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT(1, "ENUMWirksamkeit_staendig_wirksam_wenn_Fahrstrasse_eingestellt", "staendig_wirksam_wenn_Fahrstrasse_eingestellt"),

	/**
	 * The '<em><b>ENUM Wirksamkeit unwirksam wenn Fahrstrasse eingestellt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKSAMKEIT_UNWIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WIRKSAMKEIT_UNWIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT(2, "ENUMWirksamkeit_unwirksam_wenn_Fahrstrasse_eingestellt", "unwirksam_wenn_Fahrstrasse_eingestellt"),

	/**
	 * The '<em><b>ENUM Wirksamkeit staendig wirksam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKSAMKEIT_STAENDIG_WIRKSAM_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WIRKSAMKEIT_STAENDIG_WIRKSAM(3, "ENUMWirksamkeit_staendig_wirksam", "staendig_wirksam"),

	/**
	 * The '<em><b>ENUM Wirksamkeit sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKSAMKEIT_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WIRKSAMKEIT_SONSTIGE(4, "ENUMWirksamkeit_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Wirksamkeit schaltbar von Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKSAMKEIT_SCHALTBAR_VON_SIGNAL
	 * @model name="ENUMWirksamkeit_schaltbar_von_Signal" literal="schaltbar_von_Signal"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WIRKSAMKEIT_SCHALTBAR_VON_SIGNAL_VALUE = 0;

	/**
	 * The '<em><b>ENUM Wirksamkeit staendig wirksam wenn Fahrstrasse eingestellt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKSAMKEIT_STAENDIG_WIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT
	 * @model name="ENUMWirksamkeit_staendig_wirksam_wenn_Fahrstrasse_eingestellt" literal="staendig_wirksam_wenn_Fahrstrasse_eingestellt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WIRKSAMKEIT_STAENDIG_WIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT_VALUE = 1;

	/**
	 * The '<em><b>ENUM Wirksamkeit unwirksam wenn Fahrstrasse eingestellt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKSAMKEIT_UNWIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT
	 * @model name="ENUMWirksamkeit_unwirksam_wenn_Fahrstrasse_eingestellt" literal="unwirksam_wenn_Fahrstrasse_eingestellt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WIRKSAMKEIT_UNWIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT_VALUE = 2;

	/**
	 * The '<em><b>ENUM Wirksamkeit staendig wirksam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKSAMKEIT_STAENDIG_WIRKSAM
	 * @model name="ENUMWirksamkeit_staendig_wirksam" literal="staendig_wirksam"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WIRKSAMKEIT_STAENDIG_WIRKSAM_VALUE = 3;

	/**
	 * The '<em><b>ENUM Wirksamkeit sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WIRKSAMKEIT_SONSTIGE
	 * @model name="ENUMWirksamkeit_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WIRKSAMKEIT_SONSTIGE_VALUE = 4;

	/**
	 * An array of all the '<em><b>ENUM Wirksamkeit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMWirksamkeit[] VALUES_ARRAY =
		new ENUMWirksamkeit[] {
			ENUM_WIRKSAMKEIT_SCHALTBAR_VON_SIGNAL,
			ENUM_WIRKSAMKEIT_STAENDIG_WIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT,
			ENUM_WIRKSAMKEIT_UNWIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT,
			ENUM_WIRKSAMKEIT_STAENDIG_WIRKSAM,
			ENUM_WIRKSAMKEIT_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Wirksamkeit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMWirksamkeit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Wirksamkeit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWirksamkeit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMWirksamkeit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Wirksamkeit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWirksamkeit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMWirksamkeit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Wirksamkeit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWirksamkeit get(int value) {
		switch (value) {
			case ENUM_WIRKSAMKEIT_SCHALTBAR_VON_SIGNAL_VALUE: return ENUM_WIRKSAMKEIT_SCHALTBAR_VON_SIGNAL;
			case ENUM_WIRKSAMKEIT_STAENDIG_WIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT_VALUE: return ENUM_WIRKSAMKEIT_STAENDIG_WIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT;
			case ENUM_WIRKSAMKEIT_UNWIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT_VALUE: return ENUM_WIRKSAMKEIT_UNWIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT;
			case ENUM_WIRKSAMKEIT_STAENDIG_WIRKSAM_VALUE: return ENUM_WIRKSAMKEIT_STAENDIG_WIRKSAM;
			case ENUM_WIRKSAMKEIT_SONSTIGE_VALUE: return ENUM_WIRKSAMKEIT_SONSTIGE;
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
	private ENUMWirksamkeit(int value, String name, String literal) {
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
	
} //ENUMWirksamkeit
