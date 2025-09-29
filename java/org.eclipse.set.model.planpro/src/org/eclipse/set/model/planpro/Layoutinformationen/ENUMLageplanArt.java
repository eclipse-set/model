/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Layoutinformationen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Lageplan Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getENUMLageplanArt()
 * @model extendedMetaData="name='ENUMLageplan_Art'"
 * @generated
 */
public enum ENUMLageplanArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Lageplan Art BU Kreuzungsplan LST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_BU_KREUZUNGSPLAN_LST_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LAGEPLAN_ART_BU_KREUZUNGSPLAN_LST(0, "ENUMLageplan_Art_BU_Kreuzungsplan_LST", "B\u00dc Kreuzungsplan LST"),

	/**
	 * The '<em><b>ENUM Lageplan Art BU Sicherungstechn Lage und Kabelübersichtsplan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_BU_SICHERUNGSTECHN_LAGE_UND_KABELÜBERSICHTSPLAN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LAGEPLAN_ART_BU_SICHERUNGSTECHN_LAGE_UND_KABELÜBERSICHTSPLAN(1, "ENUMLageplan_Art_BU_Sicherungstechn__Lage__und_Kabelübersichtsplan", "B\u00dc Sicherungstechn. Lage- und Kabel\u00fcbersichtsplan"),

	/**
	 * The '<em><b>ENUM Lageplan Art Gleisfreimeldeplan für Gleisstromkreise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_GLEISFREIMELDEPLAN_FÜR_GLEISSTROMKREISE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LAGEPLAN_ART_GLEISFREIMELDEPLAN_FÜR_GLEISSTROMKREISE(2, "ENUMLageplan_Art_Gleisfreimeldeplan_für_Gleisstromkreise", "Gleisfreimeldeplan f\u00fcr Gleisstromkreise"),

	/**
	 * The '<em><b>ENUM Lageplan Art Kabellageplan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_KABELLAGEPLAN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LAGEPLAN_ART_KABELLAGEPLAN(3, "ENUMLageplan_Art_Kabellageplan", "Kabellageplan"),

	/**
	 * The '<em><b>ENUM Lageplan Art Kabelübersichtsplan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_KABELÜBERSICHTSPLAN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LAGEPLAN_ART_KABELÜBERSICHTSPLAN(4, "ENUMLageplan_Art_Kabelübersichtsplan", "Kabel\u00fcbersichtsplan"),

	/**
	 * The '<em><b>ENUM Lageplan Art Sicherungstechnischer Lageplan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_SICHERUNGSTECHNISCHER_LAGEPLAN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LAGEPLAN_ART_SICHERUNGSTECHNISCHER_LAGEPLAN(5, "ENUMLageplan_Art_Sicherungstechnischer_Lageplan", "Sicherungstechnischer Lageplan"),

	/**
	 * The '<em><b>ENUM Lageplan Art Sicherungstechnischer Ubersichtsplan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_SICHERUNGSTECHNISCHER_UBERSICHTSPLAN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LAGEPLAN_ART_SICHERUNGSTECHNISCHER_UBERSICHTSPLAN(6, "ENUMLageplan_Art_Sicherungstechnischer_Ubersichtsplan", "Sicherungstechnischer \u00dcbersichtsplan"),

	/**
	 * The '<em><b>ENUM Lageplan Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LAGEPLAN_ART_SONSTIGE(7, "ENUMLageplan_Art_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Lageplan Art Stammkabelübersichtsplan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_STAMMKABELÜBERSICHTSPLAN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LAGEPLAN_ART_STAMMKABELÜBERSICHTSPLAN(8, "ENUMLageplan_Art_Stammkabelübersichtsplan", "Stammkabel\u00fcbersichtsplan"),

	/**
	 * The '<em><b>ENUM Lageplan Art ZLV Bus Ubersichtsplan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_ZLV_BUS_UBERSICHTSPLAN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LAGEPLAN_ART_ZLV_BUS_UBERSICHTSPLAN(9, "ENUMLageplan_Art_ZLV_Bus_Ubersichtsplan", "ZLV-Bus-\u00dcbersichtsplan"),

	/**
	 * The '<em><b>ENUM Lageplan Art ZN Ubersichtsplan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_ZN_UBERSICHTSPLAN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LAGEPLAN_ART_ZN_UBERSICHTSPLAN(10, "ENUMLageplan_Art_ZN_Ubersichtsplan", "ZN-\u00dcbersichtsplan");

	/**
	 * The '<em><b>ENUM Lageplan Art BU Kreuzungsplan LST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_BU_KREUZUNGSPLAN_LST
	 * @model name="ENUMLageplan_Art_BU_Kreuzungsplan_LST" literal="B\334 Kreuzungsplan LST"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LAGEPLAN_ART_BU_KREUZUNGSPLAN_LST_VALUE = 0;

	/**
	 * The '<em><b>ENUM Lageplan Art BU Sicherungstechn Lage und Kabelübersichtsplan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_BU_SICHERUNGSTECHN_LAGE_UND_KABELÜBERSICHTSPLAN
	 * @model name="ENUMLageplan_Art_BU_Sicherungstechn__Lage__und_Kabelübersichtsplan" literal="B\334 Sicherungstechn. Lage- und Kabel\374bersichtsplan"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LAGEPLAN_ART_BU_SICHERUNGSTECHN_LAGE_UND_KABELÜBERSICHTSPLAN_VALUE = 1;

	/**
	 * The '<em><b>ENUM Lageplan Art Gleisfreimeldeplan für Gleisstromkreise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_GLEISFREIMELDEPLAN_FÜR_GLEISSTROMKREISE
	 * @model name="ENUMLageplan_Art_Gleisfreimeldeplan_für_Gleisstromkreise" literal="Gleisfreimeldeplan f\374r Gleisstromkreise"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LAGEPLAN_ART_GLEISFREIMELDEPLAN_FÜR_GLEISSTROMKREISE_VALUE = 2;

	/**
	 * The '<em><b>ENUM Lageplan Art Kabellageplan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_KABELLAGEPLAN
	 * @model name="ENUMLageplan_Art_Kabellageplan" literal="Kabellageplan"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LAGEPLAN_ART_KABELLAGEPLAN_VALUE = 3;

	/**
	 * The '<em><b>ENUM Lageplan Art Kabelübersichtsplan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_KABELÜBERSICHTSPLAN
	 * @model name="ENUMLageplan_Art_Kabelübersichtsplan" literal="Kabel\374bersichtsplan"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LAGEPLAN_ART_KABELÜBERSICHTSPLAN_VALUE = 4;

	/**
	 * The '<em><b>ENUM Lageplan Art Sicherungstechnischer Lageplan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_SICHERUNGSTECHNISCHER_LAGEPLAN
	 * @model name="ENUMLageplan_Art_Sicherungstechnischer_Lageplan" literal="Sicherungstechnischer Lageplan"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LAGEPLAN_ART_SICHERUNGSTECHNISCHER_LAGEPLAN_VALUE = 5;

	/**
	 * The '<em><b>ENUM Lageplan Art Sicherungstechnischer Ubersichtsplan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_SICHERUNGSTECHNISCHER_UBERSICHTSPLAN
	 * @model name="ENUMLageplan_Art_Sicherungstechnischer_Ubersichtsplan" literal="Sicherungstechnischer \334bersichtsplan"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LAGEPLAN_ART_SICHERUNGSTECHNISCHER_UBERSICHTSPLAN_VALUE = 6;

	/**
	 * The '<em><b>ENUM Lageplan Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_SONSTIGE
	 * @model name="ENUMLageplan_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LAGEPLAN_ART_SONSTIGE_VALUE = 7;

	/**
	 * The '<em><b>ENUM Lageplan Art Stammkabelübersichtsplan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_STAMMKABELÜBERSICHTSPLAN
	 * @model name="ENUMLageplan_Art_Stammkabelübersichtsplan" literal="Stammkabel\374bersichtsplan"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LAGEPLAN_ART_STAMMKABELÜBERSICHTSPLAN_VALUE = 8;

	/**
	 * The '<em><b>ENUM Lageplan Art ZLV Bus Ubersichtsplan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_ZLV_BUS_UBERSICHTSPLAN
	 * @model name="ENUMLageplan_Art_ZLV_Bus_Ubersichtsplan" literal="ZLV-Bus-\334bersichtsplan"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LAGEPLAN_ART_ZLV_BUS_UBERSICHTSPLAN_VALUE = 9;

	/**
	 * The '<em><b>ENUM Lageplan Art ZN Ubersichtsplan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_LAGEPLAN_ART_ZN_UBERSICHTSPLAN
	 * @model name="ENUMLageplan_Art_ZN_Ubersichtsplan" literal="ZN-\334bersichtsplan"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LAGEPLAN_ART_ZN_UBERSICHTSPLAN_VALUE = 10;

	/**
	 * An array of all the '<em><b>ENUM Lageplan Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMLageplanArt[] VALUES_ARRAY =
		new ENUMLageplanArt[] {
			ENUM_LAGEPLAN_ART_BU_KREUZUNGSPLAN_LST,
			ENUM_LAGEPLAN_ART_BU_SICHERUNGSTECHN_LAGE_UND_KABELÜBERSICHTSPLAN,
			ENUM_LAGEPLAN_ART_GLEISFREIMELDEPLAN_FÜR_GLEISSTROMKREISE,
			ENUM_LAGEPLAN_ART_KABELLAGEPLAN,
			ENUM_LAGEPLAN_ART_KABELÜBERSICHTSPLAN,
			ENUM_LAGEPLAN_ART_SICHERUNGSTECHNISCHER_LAGEPLAN,
			ENUM_LAGEPLAN_ART_SICHERUNGSTECHNISCHER_UBERSICHTSPLAN,
			ENUM_LAGEPLAN_ART_SONSTIGE,
			ENUM_LAGEPLAN_ART_STAMMKABELÜBERSICHTSPLAN,
			ENUM_LAGEPLAN_ART_ZLV_BUS_UBERSICHTSPLAN,
			ENUM_LAGEPLAN_ART_ZN_UBERSICHTSPLAN,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Lageplan Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMLageplanArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Lageplan Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLageplanArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMLageplanArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Lageplan Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLageplanArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMLageplanArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Lageplan Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMLageplanArt get(int value) {
		switch (value) {
			case ENUM_LAGEPLAN_ART_BU_KREUZUNGSPLAN_LST_VALUE: return ENUM_LAGEPLAN_ART_BU_KREUZUNGSPLAN_LST;
			case ENUM_LAGEPLAN_ART_BU_SICHERUNGSTECHN_LAGE_UND_KABELÜBERSICHTSPLAN_VALUE: return ENUM_LAGEPLAN_ART_BU_SICHERUNGSTECHN_LAGE_UND_KABELÜBERSICHTSPLAN;
			case ENUM_LAGEPLAN_ART_GLEISFREIMELDEPLAN_FÜR_GLEISSTROMKREISE_VALUE: return ENUM_LAGEPLAN_ART_GLEISFREIMELDEPLAN_FÜR_GLEISSTROMKREISE;
			case ENUM_LAGEPLAN_ART_KABELLAGEPLAN_VALUE: return ENUM_LAGEPLAN_ART_KABELLAGEPLAN;
			case ENUM_LAGEPLAN_ART_KABELÜBERSICHTSPLAN_VALUE: return ENUM_LAGEPLAN_ART_KABELÜBERSICHTSPLAN;
			case ENUM_LAGEPLAN_ART_SICHERUNGSTECHNISCHER_LAGEPLAN_VALUE: return ENUM_LAGEPLAN_ART_SICHERUNGSTECHNISCHER_LAGEPLAN;
			case ENUM_LAGEPLAN_ART_SICHERUNGSTECHNISCHER_UBERSICHTSPLAN_VALUE: return ENUM_LAGEPLAN_ART_SICHERUNGSTECHNISCHER_UBERSICHTSPLAN;
			case ENUM_LAGEPLAN_ART_SONSTIGE_VALUE: return ENUM_LAGEPLAN_ART_SONSTIGE;
			case ENUM_LAGEPLAN_ART_STAMMKABELÜBERSICHTSPLAN_VALUE: return ENUM_LAGEPLAN_ART_STAMMKABELÜBERSICHTSPLAN;
			case ENUM_LAGEPLAN_ART_ZLV_BUS_UBERSICHTSPLAN_VALUE: return ENUM_LAGEPLAN_ART_ZLV_BUS_UBERSICHTSPLAN;
			case ENUM_LAGEPLAN_ART_ZN_UBERSICHTSPLAN_VALUE: return ENUM_LAGEPLAN_ART_ZN_UBERSICHTSPLAN;
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
	private ENUMLageplanArt(int value, String name, String literal) {
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
	
} //ENUMLageplanArt
