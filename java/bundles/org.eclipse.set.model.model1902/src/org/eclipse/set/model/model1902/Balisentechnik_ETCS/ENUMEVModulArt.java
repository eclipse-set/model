/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMEV Modul Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMEVModulArt()
 * @model extendedMetaData="name='ENUMEV_Modul_Art'"
 * @generated
 */
public enum ENUMEVModulArt implements Enumerator {
	/**
	 * The '<em><b>ENUMEV Modul Art autonom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_MODUL_ART_AUTONOM_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_MODUL_ART_AUTONOM(0, "ENUMEV_Modul_Art_autonom", "autonom"),

	/**
	 * The '<em><b>ENUMEV Modul Art autonom klein</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_MODUL_ART_AUTONOM_KLEIN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_MODUL_ART_AUTONOM_KLEIN(1, "ENUMEV_Modul_Art_autonom_klein", "autonom klein"),

	/**
	 * The '<em><b>ENUMEV Modul Art netzgebunden</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_MODUL_ART_NETZGEBUNDEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_MODUL_ART_NETZGEBUNDEN(2, "ENUMEV_Modul_Art_netzgebunden", "netzgebunden"),

	/**
	 * The '<em><b>ENUMEV Modul Art Po PV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_MODUL_ART_PO_PV_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_MODUL_ART_PO_PV(3, "ENUMEV_Modul_Art_PoP_V", "PoP-V"),

	/**
	 * The '<em><b>ENUMEV Modul Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_MODUL_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMEV_MODUL_ART_SONSTIGE(4, "ENUMEV_Modul_Art_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUMEV Modul Art autonom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_MODUL_ART_AUTONOM
	 * @model name="ENUMEV_Modul_Art_autonom" literal="autonom"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_MODUL_ART_AUTONOM_VALUE = 0;

	/**
	 * The '<em><b>ENUMEV Modul Art autonom klein</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_MODUL_ART_AUTONOM_KLEIN
	 * @model name="ENUMEV_Modul_Art_autonom_klein" literal="autonom klein"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_MODUL_ART_AUTONOM_KLEIN_VALUE = 1;

	/**
	 * The '<em><b>ENUMEV Modul Art netzgebunden</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_MODUL_ART_NETZGEBUNDEN
	 * @model name="ENUMEV_Modul_Art_netzgebunden" literal="netzgebunden"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_MODUL_ART_NETZGEBUNDEN_VALUE = 2;

	/**
	 * The '<em><b>ENUMEV Modul Art Po PV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_MODUL_ART_PO_PV
	 * @model name="ENUMEV_Modul_Art_PoP_V" literal="PoP-V"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_MODUL_ART_PO_PV_VALUE = 3;

	/**
	 * The '<em><b>ENUMEV Modul Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMEV_MODUL_ART_SONSTIGE
	 * @model name="ENUMEV_Modul_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMEV_MODUL_ART_SONSTIGE_VALUE = 4;

	/**
	 * An array of all the '<em><b>ENUMEV Modul Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMEVModulArt[] VALUES_ARRAY =
		new ENUMEVModulArt[] {
			ENUMEV_MODUL_ART_AUTONOM,
			ENUMEV_MODUL_ART_AUTONOM_KLEIN,
			ENUMEV_MODUL_ART_NETZGEBUNDEN,
			ENUMEV_MODUL_ART_PO_PV,
			ENUMEV_MODUL_ART_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMEV Modul Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMEVModulArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMEV Modul Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMEVModulArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMEVModulArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMEV Modul Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMEVModulArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMEVModulArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMEV Modul Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMEVModulArt get(int value) {
		switch (value) {
			case ENUMEV_MODUL_ART_AUTONOM_VALUE: return ENUMEV_MODUL_ART_AUTONOM;
			case ENUMEV_MODUL_ART_AUTONOM_KLEIN_VALUE: return ENUMEV_MODUL_ART_AUTONOM_KLEIN;
			case ENUMEV_MODUL_ART_NETZGEBUNDEN_VALUE: return ENUMEV_MODUL_ART_NETZGEBUNDEN;
			case ENUMEV_MODUL_ART_PO_PV_VALUE: return ENUMEV_MODUL_ART_PO_PV;
			case ENUMEV_MODUL_ART_SONSTIGE_VALUE: return ENUMEV_MODUL_ART_SONSTIGE;
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
	private ENUMEVModulArt(int value, String name, String literal) {
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
	
} //ENUMEVModulArt
