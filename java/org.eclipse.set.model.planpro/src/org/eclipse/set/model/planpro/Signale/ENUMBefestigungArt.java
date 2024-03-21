/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Befestigung Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getENUMBefestigungArt()
 * @model extendedMetaData="name='ENUMBefestigung_Art'"
 * @generated
 */
public enum ENUMBefestigungArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Befestigung Art andere</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_ANDERE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_ANDERE(0, "ENUMBefestigung_Art_andere", "andere"),

	/**
	 * The '<em><b>ENUM Befestigung Art andere Sonderkonstruktion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_ANDERE_SONDERKONSTRUKTION_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_ANDERE_SONDERKONSTRUKTION(1, "ENUMBefestigung_Art_andere_Sonderkonstruktion", "andere Sonderkonstruktion"),

	/**
	 * The '<em><b>ENUM Befestigung Art Arbeitsbuehne</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_ARBEITSBUEHNE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_ARBEITSBUEHNE(2, "ENUMBefestigung_Art_Arbeitsbuehne", "Arbeitsbuehne"),

	/**
	 * The '<em><b>ENUM Befestigung Art Bahnsteig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_BAHNSTEIG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_BAHNSTEIG(3, "ENUMBefestigung_Art_Bahnsteig", "Bahnsteig"),

	/**
	 * The '<em><b>ENUM Befestigung Art Dach Decke</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_DACH_DECKE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_DACH_DECKE(4, "ENUMBefestigung_Art_Dach_Decke", "Dach_Decke"),

	/**
	 * The '<em><b>ENUM Befestigung Art Fundament</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_FUNDAMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_FUNDAMENT(5, "ENUMBefestigung_Art_Fundament", "Fundament"),

	/**
	 * The '<em><b>ENUM Befestigung Art Konstruktionsteil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_KONSTRUKTIONSTEIL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_KONSTRUKTIONSTEIL(6, "ENUMBefestigung_Art_Konstruktionsteil", "Konstruktionsteil"),

	/**
	 * The '<em><b>ENUM Befestigung Art OL Kettenwerk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_OL_KETTENWERK_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_OL_KETTENWERK(7, "ENUMBefestigung_Art_OL_Kettenwerk", "OL_Kettenwerk"),

	/**
	 * The '<em><b>ENUM Befestigung Art OL Mast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_OL_MAST_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_OL_MAST(8, "ENUMBefestigung_Art_OL_Mast", "OL_Mast"),

	/**
	 * The '<em><b>ENUM Befestigung Art Pfahl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_PFAHL_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_PFAHL(9, "ENUMBefestigung_Art_Pfahl", "Pfahl"),

	/**
	 * The '<em><b>ENUM Befestigung Art Pfosten hoch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_PFOSTEN_HOCH_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_PFOSTEN_HOCH(10, "ENUMBefestigung_Art_Pfosten_hoch", "Pfosten_hoch"),

	/**
	 * The '<em><b>ENUM Befestigung Art Pfosten niedrig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_PFOSTEN_NIEDRIG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_PFOSTEN_NIEDRIG(11, "ENUMBefestigung_Art_Pfosten_niedrig", "Pfosten_niedrig"),

	/**
	 * The '<em><b>ENUM Befestigung Art Prellbock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_PRELLBOCK_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_PRELLBOCK(12, "ENUMBefestigung_Art_Prellbock", "Prellbock"),

	/**
	 * The '<em><b>ENUM Befestigung Art Rahmen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_RAHMEN_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_RAHMEN(13, "ENUMBefestigung_Art_Rahmen", "Rahmen"),

	/**
	 * The '<em><b>ENUM Befestigung Art Regelanordnung Mast hoch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_MAST_HOCH_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_MAST_HOCH(14, "ENUMBefestigung_Art_Regelanordnung_Mast_hoch", "Regelanordnung_Mast_hoch"),

	/**
	 * The '<em><b>ENUM Befestigung Art Regelanordnung Mast niedrig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_MAST_NIEDRIG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_MAST_NIEDRIG(15, "ENUMBefestigung_Art_Regelanordnung_Mast_niedrig", "Regelanordnung_Mast_niedrig"),

	/**
	 * The '<em><b>ENUM Befestigung Art Regelanordnung Sonstige hoch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_SONSTIGE_HOCH_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_SONSTIGE_HOCH(16, "ENUMBefestigung_Art_Regelanordnung_Sonstige_hoch", "Regelanordnung_Sonstige_hoch"),

	/**
	 * The '<em><b>ENUM Befestigung Art Regelanordnung Sonstige niedrig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_SONSTIGE_NIEDRIG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_SONSTIGE_NIEDRIG(17, "ENUMBefestigung_Art_Regelanordnung_Sonstige_niedrig", "Regelanordnung_Sonstige_niedrig"),

	/**
	 * The '<em><b>ENUM Befestigung Art Schienenfuss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_SCHIENENFUSS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_SCHIENENFUSS(18, "ENUMBefestigung_Art_Schienenfuss", "Schienenfuss"),

	/**
	 * The '<em><b>ENUM Befestigung Art Signalausleger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_SIGNALAUSLEGER_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_SIGNALAUSLEGER(19, "ENUMBefestigung_Art_Signalausleger", "Signalausleger"),

	/**
	 * The '<em><b>ENUM Befestigung Art Signalbruecke</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_SIGNALBRUECKE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_SIGNALBRUECKE(20, "ENUMBefestigung_Art_Signalbruecke", "Signalbruecke"),

	/**
	 * The '<em><b>ENUM Befestigung Art Sonderanordnung Mast hoch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_SONDERANORDNUNG_MAST_HOCH_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_SONDERANORDNUNG_MAST_HOCH(21, "ENUMBefestigung_Art_Sonderanordnung_Mast_hoch", "Sonderanordnung_Mast_hoch"),

	/**
	 * The '<em><b>ENUM Befestigung Art Sonderanordnung Mast niedrig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_SONDERANORDNUNG_MAST_NIEDRIG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_SONDERANORDNUNG_MAST_NIEDRIG(22, "ENUMBefestigung_Art_Sonderanordnung_Mast_niedrig", "Sonderanordnung_Mast_niedrig"),

	/**
	 * The '<em><b>ENUM Befestigung Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_SONSTIGE(23, "ENUMBefestigung_Art_sonstige", "sonstige"),

	/**
	 * The '<em><b>ENUM Befestigung Art Wand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_WAND_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_BEFESTIGUNG_ART_WAND(24, "ENUMBefestigung_Art_Wand", "Wand");

	/**
	 * The '<em><b>ENUM Befestigung Art andere</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_ANDERE
	 * @model name="ENUMBefestigung_Art_andere" literal="andere"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_ANDERE_VALUE = 0;

	/**
	 * The '<em><b>ENUM Befestigung Art andere Sonderkonstruktion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_ANDERE_SONDERKONSTRUKTION
	 * @model name="ENUMBefestigung_Art_andere_Sonderkonstruktion" literal="andere Sonderkonstruktion"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_ANDERE_SONDERKONSTRUKTION_VALUE = 1;

	/**
	 * The '<em><b>ENUM Befestigung Art Arbeitsbuehne</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_ARBEITSBUEHNE
	 * @model name="ENUMBefestigung_Art_Arbeitsbuehne" literal="Arbeitsbuehne"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_ARBEITSBUEHNE_VALUE = 2;

	/**
	 * The '<em><b>ENUM Befestigung Art Bahnsteig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_BAHNSTEIG
	 * @model name="ENUMBefestigung_Art_Bahnsteig" literal="Bahnsteig"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_BAHNSTEIG_VALUE = 3;

	/**
	 * The '<em><b>ENUM Befestigung Art Dach Decke</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_DACH_DECKE
	 * @model name="ENUMBefestigung_Art_Dach_Decke" literal="Dach_Decke"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_DACH_DECKE_VALUE = 4;

	/**
	 * The '<em><b>ENUM Befestigung Art Fundament</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_FUNDAMENT
	 * @model name="ENUMBefestigung_Art_Fundament" literal="Fundament"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_FUNDAMENT_VALUE = 5;

	/**
	 * The '<em><b>ENUM Befestigung Art Konstruktionsteil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_KONSTRUKTIONSTEIL
	 * @model name="ENUMBefestigung_Art_Konstruktionsteil" literal="Konstruktionsteil"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_KONSTRUKTIONSTEIL_VALUE = 6;

	/**
	 * The '<em><b>ENUM Befestigung Art OL Kettenwerk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_OL_KETTENWERK
	 * @model name="ENUMBefestigung_Art_OL_Kettenwerk" literal="OL_Kettenwerk"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_OL_KETTENWERK_VALUE = 7;

	/**
	 * The '<em><b>ENUM Befestigung Art OL Mast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_OL_MAST
	 * @model name="ENUMBefestigung_Art_OL_Mast" literal="OL_Mast"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_OL_MAST_VALUE = 8;

	/**
	 * The '<em><b>ENUM Befestigung Art Pfahl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_PFAHL
	 * @model name="ENUMBefestigung_Art_Pfahl" literal="Pfahl"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_PFAHL_VALUE = 9;

	/**
	 * The '<em><b>ENUM Befestigung Art Pfosten hoch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_PFOSTEN_HOCH
	 * @model name="ENUMBefestigung_Art_Pfosten_hoch" literal="Pfosten_hoch"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_PFOSTEN_HOCH_VALUE = 10;

	/**
	 * The '<em><b>ENUM Befestigung Art Pfosten niedrig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_PFOSTEN_NIEDRIG
	 * @model name="ENUMBefestigung_Art_Pfosten_niedrig" literal="Pfosten_niedrig"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_PFOSTEN_NIEDRIG_VALUE = 11;

	/**
	 * The '<em><b>ENUM Befestigung Art Prellbock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_PRELLBOCK
	 * @model name="ENUMBefestigung_Art_Prellbock" literal="Prellbock"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_PRELLBOCK_VALUE = 12;

	/**
	 * The '<em><b>ENUM Befestigung Art Rahmen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_RAHMEN
	 * @model name="ENUMBefestigung_Art_Rahmen" literal="Rahmen"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_RAHMEN_VALUE = 13;

	/**
	 * The '<em><b>ENUM Befestigung Art Regelanordnung Mast hoch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_MAST_HOCH
	 * @model name="ENUMBefestigung_Art_Regelanordnung_Mast_hoch" literal="Regelanordnung_Mast_hoch"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_MAST_HOCH_VALUE = 14;

	/**
	 * The '<em><b>ENUM Befestigung Art Regelanordnung Mast niedrig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_MAST_NIEDRIG
	 * @model name="ENUMBefestigung_Art_Regelanordnung_Mast_niedrig" literal="Regelanordnung_Mast_niedrig"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_MAST_NIEDRIG_VALUE = 15;

	/**
	 * The '<em><b>ENUM Befestigung Art Regelanordnung Sonstige hoch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_SONSTIGE_HOCH
	 * @model name="ENUMBefestigung_Art_Regelanordnung_Sonstige_hoch" literal="Regelanordnung_Sonstige_hoch"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_SONSTIGE_HOCH_VALUE = 16;

	/**
	 * The '<em><b>ENUM Befestigung Art Regelanordnung Sonstige niedrig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_SONSTIGE_NIEDRIG
	 * @model name="ENUMBefestigung_Art_Regelanordnung_Sonstige_niedrig" literal="Regelanordnung_Sonstige_niedrig"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_SONSTIGE_NIEDRIG_VALUE = 17;

	/**
	 * The '<em><b>ENUM Befestigung Art Schienenfuss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_SCHIENENFUSS
	 * @model name="ENUMBefestigung_Art_Schienenfuss" literal="Schienenfuss"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_SCHIENENFUSS_VALUE = 18;

	/**
	 * The '<em><b>ENUM Befestigung Art Signalausleger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_SIGNALAUSLEGER
	 * @model name="ENUMBefestigung_Art_Signalausleger" literal="Signalausleger"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_SIGNALAUSLEGER_VALUE = 19;

	/**
	 * The '<em><b>ENUM Befestigung Art Signalbruecke</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_SIGNALBRUECKE
	 * @model name="ENUMBefestigung_Art_Signalbruecke" literal="Signalbruecke"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_SIGNALBRUECKE_VALUE = 20;

	/**
	 * The '<em><b>ENUM Befestigung Art Sonderanordnung Mast hoch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_SONDERANORDNUNG_MAST_HOCH
	 * @model name="ENUMBefestigung_Art_Sonderanordnung_Mast_hoch" literal="Sonderanordnung_Mast_hoch"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_SONDERANORDNUNG_MAST_HOCH_VALUE = 21;

	/**
	 * The '<em><b>ENUM Befestigung Art Sonderanordnung Mast niedrig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_SONDERANORDNUNG_MAST_NIEDRIG
	 * @model name="ENUMBefestigung_Art_Sonderanordnung_Mast_niedrig" literal="Sonderanordnung_Mast_niedrig"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_SONDERANORDNUNG_MAST_NIEDRIG_VALUE = 22;

	/**
	 * The '<em><b>ENUM Befestigung Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_SONSTIGE
	 * @model name="ENUMBefestigung_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_SONSTIGE_VALUE = 23;

	/**
	 * The '<em><b>ENUM Befestigung Art Wand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_BEFESTIGUNG_ART_WAND
	 * @model name="ENUMBefestigung_Art_Wand" literal="Wand"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_BEFESTIGUNG_ART_WAND_VALUE = 24;

	/**
	 * An array of all the '<em><b>ENUM Befestigung Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMBefestigungArt[] VALUES_ARRAY =
		new ENUMBefestigungArt[] {
			ENUM_BEFESTIGUNG_ART_ANDERE,
			ENUM_BEFESTIGUNG_ART_ANDERE_SONDERKONSTRUKTION,
			ENUM_BEFESTIGUNG_ART_ARBEITSBUEHNE,
			ENUM_BEFESTIGUNG_ART_BAHNSTEIG,
			ENUM_BEFESTIGUNG_ART_DACH_DECKE,
			ENUM_BEFESTIGUNG_ART_FUNDAMENT,
			ENUM_BEFESTIGUNG_ART_KONSTRUKTIONSTEIL,
			ENUM_BEFESTIGUNG_ART_OL_KETTENWERK,
			ENUM_BEFESTIGUNG_ART_OL_MAST,
			ENUM_BEFESTIGUNG_ART_PFAHL,
			ENUM_BEFESTIGUNG_ART_PFOSTEN_HOCH,
			ENUM_BEFESTIGUNG_ART_PFOSTEN_NIEDRIG,
			ENUM_BEFESTIGUNG_ART_PRELLBOCK,
			ENUM_BEFESTIGUNG_ART_RAHMEN,
			ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_MAST_HOCH,
			ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_MAST_NIEDRIG,
			ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_SONSTIGE_HOCH,
			ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_SONSTIGE_NIEDRIG,
			ENUM_BEFESTIGUNG_ART_SCHIENENFUSS,
			ENUM_BEFESTIGUNG_ART_SIGNALAUSLEGER,
			ENUM_BEFESTIGUNG_ART_SIGNALBRUECKE,
			ENUM_BEFESTIGUNG_ART_SONDERANORDNUNG_MAST_HOCH,
			ENUM_BEFESTIGUNG_ART_SONDERANORDNUNG_MAST_NIEDRIG,
			ENUM_BEFESTIGUNG_ART_SONSTIGE,
			ENUM_BEFESTIGUNG_ART_WAND,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Befestigung Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMBefestigungArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Befestigung Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBefestigungArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBefestigungArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Befestigung Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBefestigungArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMBefestigungArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Befestigung Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMBefestigungArt get(int value) {
		switch (value) {
			case ENUM_BEFESTIGUNG_ART_ANDERE_VALUE: return ENUM_BEFESTIGUNG_ART_ANDERE;
			case ENUM_BEFESTIGUNG_ART_ANDERE_SONDERKONSTRUKTION_VALUE: return ENUM_BEFESTIGUNG_ART_ANDERE_SONDERKONSTRUKTION;
			case ENUM_BEFESTIGUNG_ART_ARBEITSBUEHNE_VALUE: return ENUM_BEFESTIGUNG_ART_ARBEITSBUEHNE;
			case ENUM_BEFESTIGUNG_ART_BAHNSTEIG_VALUE: return ENUM_BEFESTIGUNG_ART_BAHNSTEIG;
			case ENUM_BEFESTIGUNG_ART_DACH_DECKE_VALUE: return ENUM_BEFESTIGUNG_ART_DACH_DECKE;
			case ENUM_BEFESTIGUNG_ART_FUNDAMENT_VALUE: return ENUM_BEFESTIGUNG_ART_FUNDAMENT;
			case ENUM_BEFESTIGUNG_ART_KONSTRUKTIONSTEIL_VALUE: return ENUM_BEFESTIGUNG_ART_KONSTRUKTIONSTEIL;
			case ENUM_BEFESTIGUNG_ART_OL_KETTENWERK_VALUE: return ENUM_BEFESTIGUNG_ART_OL_KETTENWERK;
			case ENUM_BEFESTIGUNG_ART_OL_MAST_VALUE: return ENUM_BEFESTIGUNG_ART_OL_MAST;
			case ENUM_BEFESTIGUNG_ART_PFAHL_VALUE: return ENUM_BEFESTIGUNG_ART_PFAHL;
			case ENUM_BEFESTIGUNG_ART_PFOSTEN_HOCH_VALUE: return ENUM_BEFESTIGUNG_ART_PFOSTEN_HOCH;
			case ENUM_BEFESTIGUNG_ART_PFOSTEN_NIEDRIG_VALUE: return ENUM_BEFESTIGUNG_ART_PFOSTEN_NIEDRIG;
			case ENUM_BEFESTIGUNG_ART_PRELLBOCK_VALUE: return ENUM_BEFESTIGUNG_ART_PRELLBOCK;
			case ENUM_BEFESTIGUNG_ART_RAHMEN_VALUE: return ENUM_BEFESTIGUNG_ART_RAHMEN;
			case ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_MAST_HOCH_VALUE: return ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_MAST_HOCH;
			case ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_MAST_NIEDRIG_VALUE: return ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_MAST_NIEDRIG;
			case ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_SONSTIGE_HOCH_VALUE: return ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_SONSTIGE_HOCH;
			case ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_SONSTIGE_NIEDRIG_VALUE: return ENUM_BEFESTIGUNG_ART_REGELANORDNUNG_SONSTIGE_NIEDRIG;
			case ENUM_BEFESTIGUNG_ART_SCHIENENFUSS_VALUE: return ENUM_BEFESTIGUNG_ART_SCHIENENFUSS;
			case ENUM_BEFESTIGUNG_ART_SIGNALAUSLEGER_VALUE: return ENUM_BEFESTIGUNG_ART_SIGNALAUSLEGER;
			case ENUM_BEFESTIGUNG_ART_SIGNALBRUECKE_VALUE: return ENUM_BEFESTIGUNG_ART_SIGNALBRUECKE;
			case ENUM_BEFESTIGUNG_ART_SONDERANORDNUNG_MAST_HOCH_VALUE: return ENUM_BEFESTIGUNG_ART_SONDERANORDNUNG_MAST_HOCH;
			case ENUM_BEFESTIGUNG_ART_SONDERANORDNUNG_MAST_NIEDRIG_VALUE: return ENUM_BEFESTIGUNG_ART_SONDERANORDNUNG_MAST_NIEDRIG;
			case ENUM_BEFESTIGUNG_ART_SONSTIGE_VALUE: return ENUM_BEFESTIGUNG_ART_SONSTIGE;
			case ENUM_BEFESTIGUNG_ART_WAND_VALUE: return ENUM_BEFESTIGUNG_ART_WAND;
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
	private ENUMBefestigungArt(int value, String name, String literal) {
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
	
} //ENUMBefestigungArt
