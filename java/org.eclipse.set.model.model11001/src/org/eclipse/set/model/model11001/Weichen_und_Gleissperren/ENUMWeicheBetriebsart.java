/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Weichen_und_Gleissperren;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Weiche Betriebsart</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getENUMWeicheBetriebsart()
 * @model extendedMetaData="name='ENUMWeiche_Betriebsart'"
 * @generated
 */
public enum ENUMWeicheBetriebsart implements Enumerator {
	/**
	 * The '<em><b>ENUM Weiche Betriebsart Betrieb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WEICHE_BETRIEBSART_BETRIEB_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WEICHE_BETRIEBSART_BETRIEB(0, "ENUMWeiche_Betriebsart_Betrieb", "Betrieb"),

	/**
	 * The '<em><b>ENUM Weiche Betriebsart links</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WEICHE_BETRIEBSART_LINKS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WEICHE_BETRIEBSART_LINKS(1, "ENUMWeiche_Betriebsart_links", "links"),

	/**
	 * The '<em><b>ENUM Weiche Betriebsart rechts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WEICHE_BETRIEBSART_RECHTS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_WEICHE_BETRIEBSART_RECHTS(2, "ENUMWeiche_Betriebsart_rechts", "rechts");

	/**
	 * The '<em><b>ENUM Weiche Betriebsart Betrieb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WEICHE_BETRIEBSART_BETRIEB
	 * @model name="ENUMWeiche_Betriebsart_Betrieb" literal="Betrieb"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WEICHE_BETRIEBSART_BETRIEB_VALUE = 0;

	/**
	 * The '<em><b>ENUM Weiche Betriebsart links</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WEICHE_BETRIEBSART_LINKS
	 * @model name="ENUMWeiche_Betriebsart_links" literal="links"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WEICHE_BETRIEBSART_LINKS_VALUE = 1;

	/**
	 * The '<em><b>ENUM Weiche Betriebsart rechts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_WEICHE_BETRIEBSART_RECHTS
	 * @model name="ENUMWeiche_Betriebsart_rechts" literal="rechts"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_WEICHE_BETRIEBSART_RECHTS_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Weiche Betriebsart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMWeicheBetriebsart[] VALUES_ARRAY =
		new ENUMWeicheBetriebsart[] {
			ENUM_WEICHE_BETRIEBSART_BETRIEB,
			ENUM_WEICHE_BETRIEBSART_LINKS,
			ENUM_WEICHE_BETRIEBSART_RECHTS,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Weiche Betriebsart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMWeicheBetriebsart> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Weiche Betriebsart</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWeicheBetriebsart get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMWeicheBetriebsart result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Weiche Betriebsart</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWeicheBetriebsart getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMWeicheBetriebsart result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Weiche Betriebsart</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMWeicheBetriebsart get(int value) {
		switch (value) {
			case ENUM_WEICHE_BETRIEBSART_BETRIEB_VALUE: return ENUM_WEICHE_BETRIEBSART_BETRIEB;
			case ENUM_WEICHE_BETRIEBSART_LINKS_VALUE: return ENUM_WEICHE_BETRIEBSART_LINKS;
			case ENUM_WEICHE_BETRIEBSART_RECHTS_VALUE: return ENUM_WEICHE_BETRIEBSART_RECHTS;
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
	private ENUMWeicheBetriebsart(int value, String name, String literal) {
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
	
} //ENUMWeicheBetriebsart
