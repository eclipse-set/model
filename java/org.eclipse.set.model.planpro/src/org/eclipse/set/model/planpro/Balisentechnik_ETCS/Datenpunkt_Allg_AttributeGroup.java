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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datenpunkt Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup#getAnwendungssystem <em>Anwendungssystem</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup#getAusrichtung <em>Ausrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup#getDatenpunktBeschreibung <em>Datenpunkt Beschreibung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup#getDatenpunktLaenge <em>Datenpunkt Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup#getSonstigeStandortangabe <em>Sonstige Standortangabe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup#getStandortangabeBalisenschild <em>Standortangabe Balisenschild</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Allg_AttributeGroup()
 * @model extendedMetaData="name='CDatenpunkt_Allg' kind='elementOnly'"
 * @generated
 */
public interface Datenpunkt_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Anwendungssystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auf dem Balisenschild angegebenes Hauptanwendungssystem des Datenpunkts (z. B. GNT, ETCS). Die Kennzeichnung von Datenpunkten im ETCS-Übersichtsplan wird nicht aus diesem Attribut abgeleitet, sondern aus den vorhandenen Attributgruppen DP_Typ_Gxxxx.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anwendungssystem</em>' containment reference.
	 * @see #setAnwendungssystem(Anwendungssystem_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Allg_AttributeGroup_Anwendungssystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Anwendungssystem'"
	 * @generated
	 */
	Anwendungssystem_TypeClass getAnwendungssystem();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup#getAnwendungssystem <em>Anwendungssystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anwendungssystem</em>' containment reference.
	 * @see #getAnwendungssystem()
	 * @generated
	 */
	void setAnwendungssystem(Anwendungssystem_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ausrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (Physikalische) Ausrichtung der Balisengruppe in Bezug auf die Topologierichtung. Bei der Angabe \"keine\" handelt es sich um eine Einzelbalise. In diesem Fall kann dem Fahrzeuggerät die Ausrichtung über die Linking-Information von einem zurückliegenden Datenpunkt übermittelt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ausrichtung</em>' containment reference.
	 * @see #setAusrichtung(Ausrichtung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Allg_AttributeGroup_Ausrichtung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ausrichtung'"
	 * @generated
	 */
	Ausrichtung_TypeClass getAusrichtung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup#getAusrichtung <em>Ausrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ausrichtung</em>' containment reference.
	 * @see #getAusrichtung()
	 * @generated
	 */
	void setAusrichtung(Ausrichtung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Datenpunkt Beschreibung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ergänzende Beschreibung des Datenpunkts (z. B. Abweichungen bei Einmesspunkten).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datenpunkt Beschreibung</em>' containment reference.
	 * @see #setDatenpunktBeschreibung(Datenpunkt_Beschreibung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Allg_AttributeGroup_DatenpunktBeschreibung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Datenpunkt_Beschreibung'"
	 * @generated
	 */
	Datenpunkt_Beschreibung_TypeClass getDatenpunktBeschreibung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup#getDatenpunktBeschreibung <em>Datenpunkt Beschreibung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenpunkt Beschreibung</em>' containment reference.
	 * @see #getDatenpunktBeschreibung()
	 * @generated
	 */
	void setDatenpunktBeschreibung(Datenpunkt_Beschreibung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Datenpunkt Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand zwischen erster und letzter Balise des Datenpunkts. Die genaue Verteilung der Balisen innerhalb dieser Länge wird nicht abgebildet. Die Angabe entfällt, sofern es sich um eine Einzel-Balise handelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datenpunkt Laenge</em>' containment reference.
	 * @see #setDatenpunktLaenge(Datenpunkt_Laenge_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Allg_AttributeGroup_DatenpunktLaenge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Datenpunkt_Laenge'"
	 * @generated
	 */
	Datenpunkt_Laenge_TypeClass getDatenpunktLaenge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup#getDatenpunktLaenge <em>Datenpunkt Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenpunkt Laenge</em>' containment reference.
	 * @see #getDatenpunktLaenge()
	 * @generated
	 */
	void setDatenpunktLaenge(Datenpunkt_Laenge_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Sonstige Standortangabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sonstige Angabe des Balisenstandortes, sofern unter Standortangabe_Balisenschild die Option \"Strecke sonstiger Standort\" gewählt wurde. Beispiele: \"60W32L\", \"BGRU 023\" (= Berlin-Grunewald Nr. 23).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sonstige Standortangabe</em>' containment reference.
	 * @see #setSonstigeStandortangabe(Sonstige_Standortangabe_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Allg_AttributeGroup_SonstigeStandortangabe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Sonstige_Standortangabe'"
	 * @generated
	 */
	Sonstige_Standortangabe_TypeClass getSonstigeStandortangabe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup#getSonstigeStandortangabe <em>Sonstige Standortangabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sonstige Standortangabe</em>' containment reference.
	 * @see #getSonstigeStandortangabe()
	 * @generated
	 */
	void setSonstigeStandortangabe(Sonstige_Standortangabe_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Standortangabe Balisenschild</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auswahl der Bezeichnungskomponenten für die Angabe des Balisenstandortes auf dem Balisenschild. Die aufzubringende Bezeichnung ergibt sich aus weiteren im Datenmodell vorhandenen Angaben und wird regelbasiert durch den Hersteller festgelegt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standortangabe Balisenschild</em>' containment reference.
	 * @see #setStandortangabeBalisenschild(Standortangabe_Balisenschild_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Allg_AttributeGroup_StandortangabeBalisenschild()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Standortangabe_Balisenschild'"
	 * @generated
	 */
	Standortangabe_Balisenschild_TypeClass getStandortangabeBalisenschild();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup#getStandortangabeBalisenschild <em>Standortangabe Balisenschild</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standortangabe Balisenschild</em>' containment reference.
	 * @see #getStandortangabeBalisenschild()
	 * @generated
	 */
	void setStandortangabeBalisenschild(Standortangabe_Balisenschild_TypeClass value);

} // Datenpunkt_Allg_AttributeGroup
