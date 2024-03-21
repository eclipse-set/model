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
 * A representation of the literals of the enumeration '<em><b>ENUMTB Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getENUMTBArt()
 * @model extendedMetaData="name='ENUMTB_Art'"
 * @generated
 */
public enum ENUMTBArt implements Enumerator {
	/**
	 * The '<em><b>ENUMTB Art Bahnsteig ungenutzt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_BAHNSTEIG_UNGENUTZT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_BAHNSTEIG_UNGENUTZT(0, "ENUMTB_Art_Bahnsteig_ungenutzt", "Bahnsteig_ungenutzt"),

	/**
	 * The '<em><b>ENUMTB Art Personenunterfuehrung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_PERSONENUNTERFUEHRUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_PERSONENUNTERFUEHRUNG(1, "ENUMTB_Art_Personenunterfuehrung", "Personenunterfuehrung"),

	/**
	 * The '<em><b>ENUMTB Art Bahnsteigabsenkung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_BAHNSTEIGABSENKUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_BAHNSTEIGABSENKUNG(2, "ENUMTB_Art_Bahnsteigabsenkung", "Bahnsteigabsenkung"),

	/**
	 * The '<em><b>ENUMTB Art Durchlass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_DURCHLASS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_DURCHLASS(3, "ENUMTB_Art_Durchlass", "Durchlass"),

	/**
	 * The '<em><b>ENUMTB Art Eisenbahnkreuzungsbauwerk oben</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_EISENBAHNKREUZUNGSBAUWERK_OBEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_EISENBAHNKREUZUNGSBAUWERK_OBEN(4, "ENUMTB_Art_Eisenbahnkreuzungsbauwerk_oben", "Eisenbahnkreuzungsbauwerk_oben"),

	/**
	 * The '<em><b>ENUMTB Art Eisenbahnkreuzungsbauwerk unten</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_EISENBAHNKREUZUNGSBAUWERK_UNTEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_EISENBAHNKREUZUNGSBAUWERK_UNTEN(5, "ENUMTB_Art_Eisenbahnkreuzungsbauwerk_unten", "Eisenbahnkreuzungsbauwerk_unten"),

	/**
	 * The '<em><b>ENUMTB Art Eisenbahnueberfuehrung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_EISENBAHNUEBERFUEHRUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_EISENBAHNUEBERFUEHRUNG(6, "ENUMTB_Art_Eisenbahnueberfuehrung", "Eisenbahnueberfuehrung"),

	/**
	 * The '<em><b>ENUMTB Art Schutzwand links</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_SCHUTZWAND_LINKS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_SCHUTZWAND_LINKS(7, "ENUMTB_Art_Schutzwand_links", "Schutzwand_links"),

	/**
	 * The '<em><b>ENUMTB Art Schutzwand rechts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_SCHUTZWAND_RECHTS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_SCHUTZWAND_RECHTS(8, "ENUMTB_Art_Schutzwand_rechts", "Schutzwand_rechts"),

	/**
	 * The '<em><b>ENUMTB Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_SONSTIGE(9, "ENUMTB_Art_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUMTB Art Tunnel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_TUNNEL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_TUNNEL(10, "ENUMTB_Art_Tunnel", "Tunnel"),

	/**
	 * The '<em><b>ENUMTB Art Ueberfuehrung ueber Eisenbahn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_UEBERFUEHRUNG_UEBER_EISENBAHN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMTB_ART_UEBERFUEHRUNG_UEBER_EISENBAHN(11, "ENUMTB_Art_Ueberfuehrung_ueber_Eisenbahn", "Ueberfuehrung_ueber_Eisenbahn");

	/**
	 * The '<em><b>ENUMTB Art Bahnsteig ungenutzt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_BAHNSTEIG_UNGENUTZT
	 * @model name="ENUMTB_Art_Bahnsteig_ungenutzt" literal="Bahnsteig_ungenutzt"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_BAHNSTEIG_UNGENUTZT_VALUE = 0;

	/**
	 * The '<em><b>ENUMTB Art Personenunterfuehrung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_PERSONENUNTERFUEHRUNG
	 * @model name="ENUMTB_Art_Personenunterfuehrung" literal="Personenunterfuehrung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_PERSONENUNTERFUEHRUNG_VALUE = 1;

	/**
	 * The '<em><b>ENUMTB Art Bahnsteigabsenkung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_BAHNSTEIGABSENKUNG
	 * @model name="ENUMTB_Art_Bahnsteigabsenkung" literal="Bahnsteigabsenkung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_BAHNSTEIGABSENKUNG_VALUE = 2;

	/**
	 * The '<em><b>ENUMTB Art Durchlass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_DURCHLASS
	 * @model name="ENUMTB_Art_Durchlass" literal="Durchlass"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_DURCHLASS_VALUE = 3;

	/**
	 * The '<em><b>ENUMTB Art Eisenbahnkreuzungsbauwerk oben</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_EISENBAHNKREUZUNGSBAUWERK_OBEN
	 * @model name="ENUMTB_Art_Eisenbahnkreuzungsbauwerk_oben" literal="Eisenbahnkreuzungsbauwerk_oben"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_EISENBAHNKREUZUNGSBAUWERK_OBEN_VALUE = 4;

	/**
	 * The '<em><b>ENUMTB Art Eisenbahnkreuzungsbauwerk unten</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_EISENBAHNKREUZUNGSBAUWERK_UNTEN
	 * @model name="ENUMTB_Art_Eisenbahnkreuzungsbauwerk_unten" literal="Eisenbahnkreuzungsbauwerk_unten"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_EISENBAHNKREUZUNGSBAUWERK_UNTEN_VALUE = 5;

	/**
	 * The '<em><b>ENUMTB Art Eisenbahnueberfuehrung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_EISENBAHNUEBERFUEHRUNG
	 * @model name="ENUMTB_Art_Eisenbahnueberfuehrung" literal="Eisenbahnueberfuehrung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_EISENBAHNUEBERFUEHRUNG_VALUE = 6;

	/**
	 * The '<em><b>ENUMTB Art Schutzwand links</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_SCHUTZWAND_LINKS
	 * @model name="ENUMTB_Art_Schutzwand_links" literal="Schutzwand_links"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_SCHUTZWAND_LINKS_VALUE = 7;

	/**
	 * The '<em><b>ENUMTB Art Schutzwand rechts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_SCHUTZWAND_RECHTS
	 * @model name="ENUMTB_Art_Schutzwand_rechts" literal="Schutzwand_rechts"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_SCHUTZWAND_RECHTS_VALUE = 8;

	/**
	 * The '<em><b>ENUMTB Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_SONSTIGE
	 * @model name="ENUMTB_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_SONSTIGE_VALUE = 9;

	/**
	 * The '<em><b>ENUMTB Art Tunnel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_TUNNEL
	 * @model name="ENUMTB_Art_Tunnel" literal="Tunnel"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_TUNNEL_VALUE = 10;

	/**
	 * The '<em><b>ENUMTB Art Ueberfuehrung ueber Eisenbahn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMTB_ART_UEBERFUEHRUNG_UEBER_EISENBAHN
	 * @model name="ENUMTB_Art_Ueberfuehrung_ueber_Eisenbahn" literal="Ueberfuehrung_ueber_Eisenbahn"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMTB_ART_UEBERFUEHRUNG_UEBER_EISENBAHN_VALUE = 11;

	/**
	 * An array of all the '<em><b>ENUMTB Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMTBArt[] VALUES_ARRAY =
		new ENUMTBArt[] {
			ENUMTB_ART_BAHNSTEIG_UNGENUTZT,
			ENUMTB_ART_PERSONENUNTERFUEHRUNG,
			ENUMTB_ART_BAHNSTEIGABSENKUNG,
			ENUMTB_ART_DURCHLASS,
			ENUMTB_ART_EISENBAHNKREUZUNGSBAUWERK_OBEN,
			ENUMTB_ART_EISENBAHNKREUZUNGSBAUWERK_UNTEN,
			ENUMTB_ART_EISENBAHNUEBERFUEHRUNG,
			ENUMTB_ART_SCHUTZWAND_LINKS,
			ENUMTB_ART_SCHUTZWAND_RECHTS,
			ENUMTB_ART_SONSTIGE,
			ENUMTB_ART_TUNNEL,
			ENUMTB_ART_UEBERFUEHRUNG_UEBER_EISENBAHN,
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
			case ENUMTB_ART_BAHNSTEIG_UNGENUTZT_VALUE: return ENUMTB_ART_BAHNSTEIG_UNGENUTZT;
			case ENUMTB_ART_PERSONENUNTERFUEHRUNG_VALUE: return ENUMTB_ART_PERSONENUNTERFUEHRUNG;
			case ENUMTB_ART_BAHNSTEIGABSENKUNG_VALUE: return ENUMTB_ART_BAHNSTEIGABSENKUNG;
			case ENUMTB_ART_DURCHLASS_VALUE: return ENUMTB_ART_DURCHLASS;
			case ENUMTB_ART_EISENBAHNKREUZUNGSBAUWERK_OBEN_VALUE: return ENUMTB_ART_EISENBAHNKREUZUNGSBAUWERK_OBEN;
			case ENUMTB_ART_EISENBAHNKREUZUNGSBAUWERK_UNTEN_VALUE: return ENUMTB_ART_EISENBAHNKREUZUNGSBAUWERK_UNTEN;
			case ENUMTB_ART_EISENBAHNUEBERFUEHRUNG_VALUE: return ENUMTB_ART_EISENBAHNUEBERFUEHRUNG;
			case ENUMTB_ART_SCHUTZWAND_LINKS_VALUE: return ENUMTB_ART_SCHUTZWAND_LINKS;
			case ENUMTB_ART_SCHUTZWAND_RECHTS_VALUE: return ENUMTB_ART_SCHUTZWAND_RECHTS;
			case ENUMTB_ART_SONSTIGE_VALUE: return ENUMTB_ART_SONSTIGE;
			case ENUMTB_ART_TUNNEL_VALUE: return ENUMTB_ART_TUNNEL;
			case ENUMTB_ART_UEBERFUEHRUNG_UEBER_EISENBAHN_VALUE: return ENUMTB_ART_UEBERFUEHRUNG_UEBER_EISENBAHN;
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
