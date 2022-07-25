/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUMTB Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getENUMTBArt()
 * @model extendedMetaData="name='ENUMTB_Art'"
 * @generated
 */
public enum ENUMTBArt implements Enumerator {
	/**
	 * The '<em><b>ENUMTB Art Bruecke</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_BRUECKE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_BRUECKE(0, "ENUMTB_Art_Bruecke", "Bruecke"),

	/**
	 * The '<em><b>ENUMTB Art Durchlass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_DURCHLASS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_DURCHLASS(1, "ENUMTB_Art_Durchlass", "Durchlass"),

	/**
	 * The '<em><b>ENUMTB Art Schutzwand links</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_SCHUTZWAND_LINKS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_SCHUTZWAND_LINKS(2, "ENUMTB_Art_Schutzwand_links", "Schutzwand_links"),

	/**
	 * The '<em><b>ENUMTB Art Schutzwand rechts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_SCHUTZWAND_RECHTS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_SCHUTZWAND_RECHTS(3, "ENUMTB_Art_Schutzwand_rechts", "Schutzwand_rechts"),

	/**
	 * The '<em><b>ENUMTB Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_SONSTIGE(4, "ENUMTB_Art_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUMTB Art Tunnel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_TUNNEL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_TUNNEL(5, "ENUMTB_Art_Tunnel", "Tunnel");

	/**
	 * The '<em><b>ENUMTB Art Bruecke</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_BRUECKE
	 * @model name="ENUMTB_Art_Bruecke" literal="Bruecke"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_BRUECKE_VALUE = 0;

	/**
	 * The '<em><b>ENUMTB Art Durchlass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_DURCHLASS
	 * @model name="ENUMTB_Art_Durchlass" literal="Durchlass"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_DURCHLASS_VALUE = 1;

	/**
	 * The '<em><b>ENUMTB Art Schutzwand links</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_SCHUTZWAND_LINKS
	 * @model name="ENUMTB_Art_Schutzwand_links" literal="Schutzwand_links"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_SCHUTZWAND_LINKS_VALUE = 2;

	/**
	 * The '<em><b>ENUMTB Art Schutzwand rechts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_SCHUTZWAND_RECHTS
	 * @model name="ENUMTB_Art_Schutzwand_rechts" literal="Schutzwand_rechts"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_SCHUTZWAND_RECHTS_VALUE = 3;

	/**
	 * The '<em><b>ENUMTB Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_SONSTIGE
	 * @model name="ENUMTB_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_SONSTIGE_VALUE = 4;

	/**
	 * The '<em><b>ENUMTB Art Tunnel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_TUNNEL
	 * @model name="ENUMTB_Art_Tunnel" literal="Tunnel"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_TUNNEL_VALUE = 5;

	/**
	 * An array of all the '<em><b>ENUMTB Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMTBArt[] VALUES_ARRAY =
		new ENUMTBArt[] {
			ENUMTB_ART_BRUECKE,
			ENUMTB_ART_DURCHLASS,
			ENUMTB_ART_SCHUTZWAND_LINKS,
			ENUMTB_ART_SCHUTZWAND_RECHTS,
			ENUMTB_ART_SONSTIGE,
			ENUMTB_ART_TUNNEL,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMTB Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMTBArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMTB Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTBArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMTBArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMTB Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTBArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMTBArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMTB Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMTBArt get(int value) {
		switch (value) {
			case ENUMTB_ART_BRUECKE_VALUE: return ENUMTB_ART_BRUECKE;
			case ENUMTB_ART_DURCHLASS_VALUE: return ENUMTB_ART_DURCHLASS;
			case ENUMTB_ART_SCHUTZWAND_LINKS_VALUE: return ENUMTB_ART_SCHUTZWAND_LINKS;
			case ENUMTB_ART_SCHUTZWAND_RECHTS_VALUE: return ENUMTB_ART_SCHUTZWAND_RECHTS;
			case ENUMTB_ART_SONSTIGE_VALUE: return ENUMTB_ART_SONSTIGE;
			case ENUMTB_ART_TUNNEL_VALUE: return ENUMTB_ART_TUNNEL;
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
	private ENUMTBArt(int value, String name, String literal) {
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
	
} //ENUMTBArt
