/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Planung Phase</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getENUMPlanungPhase()
 * @model extendedMetaData="name='ENUMPlanung_Phase'"
 * @generated
 */
public enum ENUMPlanungPhase implements Enumerator {
	/**
	 * The '<em><b>ENUM Planung Phase EP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLANUNG_PHASE_EP_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLANUNG_PHASE_EP(0, "ENUMPlanung_Phase_EP", "EP"),

	/**
	 * The '<em><b>ENUM Planung Phase PT 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLANUNG_PHASE_PT_1_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLANUNG_PHASE_PT_1(1, "ENUMPlanung_Phase_PT_1", "PT_1"),

	/**
	 * The '<em><b>ENUM Planung Phase PT 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLANUNG_PHASE_PT_2_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLANUNG_PHASE_PT_2(2, "ENUMPlanung_Phase_PT_2", "PT_2"),

	/**
	 * The '<em><b>ENUM Planung Phase sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLANUNG_PHASE_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLANUNG_PHASE_SONSTIGE(3, "ENUMPlanung_Phase_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Planung Phase VP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLANUNG_PHASE_VP_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_PLANUNG_PHASE_VP(4, "ENUMPlanung_Phase_VP", "VP");

	/**
	 * The '<em><b>ENUM Planung Phase EP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLANUNG_PHASE_EP
	 * @model name="ENUMPlanung_Phase_EP" literal="EP"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLANUNG_PHASE_EP_VALUE = 0;

	/**
	 * The '<em><b>ENUM Planung Phase PT 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLANUNG_PHASE_PT_1
	 * @model name="ENUMPlanung_Phase_PT_1" literal="PT_1"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLANUNG_PHASE_PT_1_VALUE = 1;

	/**
	 * The '<em><b>ENUM Planung Phase PT 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLANUNG_PHASE_PT_2
	 * @model name="ENUMPlanung_Phase_PT_2" literal="PT_2"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLANUNG_PHASE_PT_2_VALUE = 2;

	/**
	 * The '<em><b>ENUM Planung Phase sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLANUNG_PHASE_SONSTIGE
	 * @model name="ENUMPlanung_Phase_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLANUNG_PHASE_SONSTIGE_VALUE = 3;

	/**
	 * The '<em><b>ENUM Planung Phase VP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_PLANUNG_PHASE_VP
	 * @model name="ENUMPlanung_Phase_VP" literal="VP"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_PLANUNG_PHASE_VP_VALUE = 4;

	/**
	 * An array of all the '<em><b>ENUM Planung Phase</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMPlanungPhase[] VALUES_ARRAY =
		new ENUMPlanungPhase[] {
			ENUM_PLANUNG_PHASE_EP,
			ENUM_PLANUNG_PHASE_PT_1,
			ENUM_PLANUNG_PHASE_PT_2,
			ENUM_PLANUNG_PHASE_SONSTIGE,
			ENUM_PLANUNG_PHASE_VP,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Planung Phase</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMPlanungPhase> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Planung Phase</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMPlanungPhase get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMPlanungPhase result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Planung Phase</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMPlanungPhase getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMPlanungPhase result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Planung Phase</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMPlanungPhase get(int value) {
		switch (value) {
			case ENUM_PLANUNG_PHASE_EP_VALUE: return ENUM_PLANUNG_PHASE_EP;
			case ENUM_PLANUNG_PHASE_PT_1_VALUE: return ENUM_PLANUNG_PHASE_PT_1;
			case ENUM_PLANUNG_PHASE_PT_2_VALUE: return ENUM_PLANUNG_PHASE_PT_2;
			case ENUM_PLANUNG_PHASE_SONSTIGE_VALUE: return ENUM_PLANUNG_PHASE_SONSTIGE;
			case ENUM_PLANUNG_PHASE_VP_VALUE: return ENUM_PLANUNG_PHASE_VP;
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
	private ENUMPlanungPhase(int value, String name, String literal) {
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
	
} //ENUMPlanungPhase
