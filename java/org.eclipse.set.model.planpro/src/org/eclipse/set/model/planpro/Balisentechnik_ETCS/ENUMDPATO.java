/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMDPATO</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMDPATO()
 * @model extendedMetaData="name='ENUMDP_ATO'"
 * @generated
 */
public enum ENUMDPATO implements Enumerator {
	/**
	 * The '<em><b>ENUMDP ATO Präzisionshalt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_ATO_PRÄZISIONSHALT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_ATO_PRÄZISIONSHALT(0, "ENUMDP_ATO_Präzisionshalt", "Pr\u00e4zisionshalt"),

	/**
	 * The '<em><b>ENUMDP ATO Präzisionshalt hochpräzise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_ATO_PRÄZISIONSHALT_HOCHPRÄZISE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_ATO_PRÄZISIONSHALT_HOCHPRÄZISE(1, "ENUMDP_ATO_Präzisionshalt_hochpräzise", "Pr\u00e4zisionshalt hochpr\u00e4zise"),

	/**
	 * The '<em><b>ENUMDP ATO sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_ATO_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_ATO_SONSTIGE(2, "ENUMDP_ATO_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUMDP ATO Präzisionshalt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_ATO_PRÄZISIONSHALT
	 * @model name="ENUMDP_ATO_Präzisionshalt" literal="Pr\344zisionshalt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_ATO_PRÄZISIONSHALT_VALUE = 0;

	/**
	 * The '<em><b>ENUMDP ATO Präzisionshalt hochpräzise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_ATO_PRÄZISIONSHALT_HOCHPRÄZISE
	 * @model name="ENUMDP_ATO_Präzisionshalt_hochpräzise" literal="Pr\344zisionshalt hochpr\344zise"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_ATO_PRÄZISIONSHALT_HOCHPRÄZISE_VALUE = 1;

	/**
	 * The '<em><b>ENUMDP ATO sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_ATO_SONSTIGE
	 * @model name="ENUMDP_ATO_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_ATO_SONSTIGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUMDPATO</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMDPATO[] VALUES_ARRAY =
		new ENUMDPATO[] {
			ENUMDP_ATO_PRÄZISIONSHALT,
			ENUMDP_ATO_PRÄZISIONSHALT_HOCHPRÄZISE,
			ENUMDP_ATO_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMDPATO</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMDPATO> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMDPATO</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPATO get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMDPATO result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMDPATO</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPATO getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMDPATO result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMDPATO</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPATO get(int value) {
		switch (value) {
			case ENUMDP_ATO_PRÄZISIONSHALT_VALUE: return ENUMDP_ATO_PRÄZISIONSHALT;
			case ENUMDP_ATO_PRÄZISIONSHALT_HOCHPRÄZISE_VALUE: return ENUMDP_ATO_PRÄZISIONSHALT_HOCHPRÄZISE;
			case ENUMDP_ATO_SONSTIGE_VALUE: return ENUMDP_ATO_SONSTIGE;
			default: return null;
		}
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
	private ENUMDPATO(int value, String name, String literal) {
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
	
} //ENUMDPATO
