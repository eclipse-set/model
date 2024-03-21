/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Plan Quelle</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getENUMPlanQuelle()
 * @model extendedMetaData="name='ENUMPlan_Quelle'"
 * @generated
 */
public enum ENUMPlanQuelle implements Enumerator {
	/**
	 * The '<em><b>ENUM Plan Quelle Ersatztrassierung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_ERSATZTRASSIERUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLAN_QUELLE_ERSATZTRASSIERUNG(0, "ENUMPlan_Quelle_Ersatztrassierung", "Ersatztrassierung"),

	/**
	 * The '<em><b>ENUM Plan Quelle GIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_GIS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLAN_QUELLE_GIS(1, "ENUMPlan_Quelle_GIS", "GIS"),

	/**
	 * The '<em><b>ENUM Plan Quelle GND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_GND_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLAN_QUELLE_GND(2, "ENUMPlan_Quelle_GND", "GND"),

	/**
	 * The '<em><b>ENUM Plan Quelle GND autokorr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_GND_AUTOKORR_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLAN_QUELLE_GND_AUTOKORR(3, "ENUMPlan_Quelle_GND_autokorr", "GND_autokorr"),

	/**
	 * The '<em><b>ENUM Plan Quelle GND mankorr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_GND_MANKORR_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLAN_QUELLE_GND_MANKORR(4, "ENUMPlan_Quelle_GND_mankorr", "GND_mankorr"),

	/**
	 * The '<em><b>ENUM Plan Quelle Ivl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_IVL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLAN_QUELLE_IVL(5, "ENUMPlan_Quelle_Ivl", "Ivl"),

	/**
	 * The '<em><b>ENUM Plan Quelle Ivmg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_IVMG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLAN_QUELLE_IVMG(6, "ENUMPlan_Quelle_Ivmg", "Ivmg"),

	/**
	 * The '<em><b>ENUM Plan Quelle Kopie</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_KOPIE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLAN_QUELLE_KOPIE(7, "ENUMPlan_Quelle_Kopie", "Kopie"),

	/**
	 * The '<em><b>ENUM Plan Quelle Neutrassierung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_NEUTRASSIERUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLAN_QUELLE_NEUTRASSIERUNG(8, "ENUMPlan_Quelle_Neutrassierung", "Neutrassierung"),

	/**
	 * The '<em><b>ENUM Plan Quelle Planung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_PLANUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLAN_QUELLE_PLANUNG(9, "ENUMPlan_Quelle_Planung", "Planung"),

	/**
	 * The '<em><b>ENUM Plan Quelle PT 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_PT_2_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLAN_QUELLE_PT_2(10, "ENUMPlan_Quelle_PT_2", "PT 2"),

	/**
	 * The '<em><b>ENUM Plan Quelle sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLAN_QUELLE_SONSTIGE(11, "ENUMPlan_Quelle_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Plan Quelle Vermessung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_VERMESSUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLAN_QUELLE_VERMESSUNG(12, "ENUMPlan_Quelle_Vermessung", "Vermessung");

	/**
	 * The '<em><b>ENUM Plan Quelle Ersatztrassierung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_ERSATZTRASSIERUNG
	 * @model name="ENUMPlan_Quelle_Ersatztrassierung" literal="Ersatztrassierung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLAN_QUELLE_ERSATZTRASSIERUNG_VALUE = 0;

	/**
	 * The '<em><b>ENUM Plan Quelle GIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_GIS
	 * @model name="ENUMPlan_Quelle_GIS" literal="GIS"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLAN_QUELLE_GIS_VALUE = 1;

	/**
	 * The '<em><b>ENUM Plan Quelle GND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_GND
	 * @model name="ENUMPlan_Quelle_GND" literal="GND"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLAN_QUELLE_GND_VALUE = 2;

	/**
	 * The '<em><b>ENUM Plan Quelle GND autokorr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_GND_AUTOKORR
	 * @model name="ENUMPlan_Quelle_GND_autokorr" literal="GND_autokorr"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLAN_QUELLE_GND_AUTOKORR_VALUE = 3;

	/**
	 * The '<em><b>ENUM Plan Quelle GND mankorr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_GND_MANKORR
	 * @model name="ENUMPlan_Quelle_GND_mankorr" literal="GND_mankorr"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLAN_QUELLE_GND_MANKORR_VALUE = 4;

	/**
	 * The '<em><b>ENUM Plan Quelle Ivl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_IVL
	 * @model name="ENUMPlan_Quelle_Ivl" literal="Ivl"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLAN_QUELLE_IVL_VALUE = 5;

	/**
	 * The '<em><b>ENUM Plan Quelle Ivmg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_IVMG
	 * @model name="ENUMPlan_Quelle_Ivmg" literal="Ivmg"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLAN_QUELLE_IVMG_VALUE = 6;

	/**
	 * The '<em><b>ENUM Plan Quelle Kopie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_KOPIE
	 * @model name="ENUMPlan_Quelle_Kopie" literal="Kopie"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLAN_QUELLE_KOPIE_VALUE = 7;

	/**
	 * The '<em><b>ENUM Plan Quelle Neutrassierung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_NEUTRASSIERUNG
	 * @model name="ENUMPlan_Quelle_Neutrassierung" literal="Neutrassierung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLAN_QUELLE_NEUTRASSIERUNG_VALUE = 8;

	/**
	 * The '<em><b>ENUM Plan Quelle Planung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_PLANUNG
	 * @model name="ENUMPlan_Quelle_Planung" literal="Planung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLAN_QUELLE_PLANUNG_VALUE = 9;

	/**
	 * The '<em><b>ENUM Plan Quelle PT 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_PT_2
	 * @model name="ENUMPlan_Quelle_PT_2" literal="PT 2"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLAN_QUELLE_PT_2_VALUE = 10;

	/**
	 * The '<em><b>ENUM Plan Quelle sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_SONSTIGE
	 * @model name="ENUMPlan_Quelle_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLAN_QUELLE_SONSTIGE_VALUE = 11;

	/**
	 * The '<em><b>ENUM Plan Quelle Vermessung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLAN_QUELLE_VERMESSUNG
	 * @model name="ENUMPlan_Quelle_Vermessung" literal="Vermessung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLAN_QUELLE_VERMESSUNG_VALUE = 12;

	/**
	 * An array of all the '<em><b>ENUM Plan Quelle</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMPlanQuelle[] VALUES_ARRAY =
		new ENUMPlanQuelle[] {
			ENUM_PLAN_QUELLE_ERSATZTRASSIERUNG,
			ENUM_PLAN_QUELLE_GIS,
			ENUM_PLAN_QUELLE_GND,
			ENUM_PLAN_QUELLE_GND_AUTOKORR,
			ENUM_PLAN_QUELLE_GND_MANKORR,
			ENUM_PLAN_QUELLE_IVL,
			ENUM_PLAN_QUELLE_IVMG,
			ENUM_PLAN_QUELLE_KOPIE,
			ENUM_PLAN_QUELLE_NEUTRASSIERUNG,
			ENUM_PLAN_QUELLE_PLANUNG,
			ENUM_PLAN_QUELLE_PT_2,
			ENUM_PLAN_QUELLE_SONSTIGE,
			ENUM_PLAN_QUELLE_VERMESSUNG,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Plan Quelle</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMPlanQuelle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Plan Quelle</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMPlanQuelle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMPlanQuelle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Plan Quelle</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMPlanQuelle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMPlanQuelle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Plan Quelle</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMPlanQuelle get(int value) {
		switch (value) {
			case ENUM_PLAN_QUELLE_ERSATZTRASSIERUNG_VALUE: return ENUM_PLAN_QUELLE_ERSATZTRASSIERUNG;
			case ENUM_PLAN_QUELLE_GIS_VALUE: return ENUM_PLAN_QUELLE_GIS;
			case ENUM_PLAN_QUELLE_GND_VALUE: return ENUM_PLAN_QUELLE_GND;
			case ENUM_PLAN_QUELLE_GND_AUTOKORR_VALUE: return ENUM_PLAN_QUELLE_GND_AUTOKORR;
			case ENUM_PLAN_QUELLE_GND_MANKORR_VALUE: return ENUM_PLAN_QUELLE_GND_MANKORR;
			case ENUM_PLAN_QUELLE_IVL_VALUE: return ENUM_PLAN_QUELLE_IVL;
			case ENUM_PLAN_QUELLE_IVMG_VALUE: return ENUM_PLAN_QUELLE_IVMG;
			case ENUM_PLAN_QUELLE_KOPIE_VALUE: return ENUM_PLAN_QUELLE_KOPIE;
			case ENUM_PLAN_QUELLE_NEUTRASSIERUNG_VALUE: return ENUM_PLAN_QUELLE_NEUTRASSIERUNG;
			case ENUM_PLAN_QUELLE_PLANUNG_VALUE: return ENUM_PLAN_QUELLE_PLANUNG;
			case ENUM_PLAN_QUELLE_PT_2_VALUE: return ENUM_PLAN_QUELLE_PT_2;
			case ENUM_PLAN_QUELLE_SONSTIGE_VALUE: return ENUM_PLAN_QUELLE_SONSTIGE;
			case ENUM_PLAN_QUELLE_VERMESSUNG_VALUE: return ENUM_PLAN_QUELLE_VERMESSUNG;
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
	private ENUMPlanQuelle(int value, String name, String literal) {
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
	
} //ENUMPlanQuelle
