/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN Akustik Anzeigefeld Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Akustik_Anzeigefeld_AttributeGroup#getAkustikdauerAnbAnn <em>Akustikdauer Anb Ann</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Akustik_Anzeigefeld_AttributeGroup#getAkustikdauerSonst <em>Akustikdauer Sonst</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Akustik_Anzeigefeld_AttributeGroup#getAkustikdauerVoranz <em>Akustikdauer Voranz</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Akustik_Anzeigefeld_AttributeGroup()
 * @model extendedMetaData="name='CZN_Akustik_Anzeigefeld' kind='elementOnly'"
 * @generated
 */
public interface ZN_Akustik_Anzeigefeld_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Akustikdauer Anb Ann</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dauer der akustischen Meldung im Anbiete-/Annahmefeld Eine akustische Meldung im Anbiete-/Annahmefeld (mit Anzeige der Zugnummer) ist Standard und daher nicht gesondert zu planen. Es kann nur zwischen der Akustikdauer von 5s oder bis zur Annahme des Zuges unterschieden werden. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es ist nur im Lastenheft zu finden, das dem LST-Fachplaner nicht zur Verfügung steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Akustikdauer Anb Ann</em>' containment reference.
	 * @see #setAkustikdauerAnbAnn(Akustikdauer_Anb_Ann_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Akustik_Anzeigefeld_AttributeGroup_AkustikdauerAnbAnn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Akustikdauer_Anb_Ann'"
	 * @generated
	 */
	Akustikdauer_Anb_Ann_TypeClass getAkustikdauerAnbAnn();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Akustik_Anzeigefeld_AttributeGroup#getAkustikdauerAnbAnn <em>Akustikdauer Anb Ann</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Akustikdauer Anb Ann</em>' containment reference.
	 * @see #getAkustikdauerAnbAnn()
	 * @generated
	 */
	void setAkustikdauerAnbAnn(Akustikdauer_Anb_Ann_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Akustikdauer Sonst</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dauer einer akustischen Meldung im ZN Anzeigefeld. Herstellerspezifisch ist es möglich, jedes ZN Anzeigefeld, welches nicht Anbiet-/Annahme- oder Voranzeigefeld ist, mit einer akustischen Meldung bei Befüllung mit einer Zugnummer zu belegen. Dieses Attribut wird nur befüllt, wenn die ZN-Anlage dieses herstellerseitig zulässt. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es bedarf der Abstimmung zwischen LST-Fachplaner und dem Hersteller. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Akustikdauer Sonst</em>' containment reference.
	 * @see #setAkustikdauerSonst(Akustikdauer_Sonst_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Akustik_Anzeigefeld_AttributeGroup_AkustikdauerSonst()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Akustikdauer_Sonst'"
	 * @generated
	 */
	Akustikdauer_Sonst_TypeClass getAkustikdauerSonst();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Akustik_Anzeigefeld_AttributeGroup#getAkustikdauerSonst <em>Akustikdauer Sonst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Akustikdauer Sonst</em>' containment reference.
	 * @see #getAkustikdauerSonst()
	 * @generated
	 */
	void setAkustikdauerSonst(Akustikdauer_Sonst_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Akustikdauer Voranz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dauer einer akustischen Meldung im Voranzeigefeld. Es ist anzugeben, ob bei Befüllen der Voranzeige durch eine Zugnummer eine akustische Meldung erfolgt. Bei den Bauarten der Hersteller Siemens und Thales muss die Angabe für alle Voranzeigefelder einheitlich sein, da eine Unterscheidung je Voranzeigefeld systembedingt z. Zt. nicht realisiert ist. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es bedarf der Abstimmung zwischen LST-Fachplaner und Hersteller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Akustikdauer Voranz</em>' containment reference.
	 * @see #setAkustikdauerVoranz(Akustikdauer_Voranz_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Akustik_Anzeigefeld_AttributeGroup_AkustikdauerVoranz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Akustikdauer_Voranz'"
	 * @generated
	 */
	Akustikdauer_Voranz_TypeClass getAkustikdauerVoranz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Akustik_Anzeigefeld_AttributeGroup#getAkustikdauerVoranz <em>Akustikdauer Voranz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Akustikdauer Voranz</em>' containment reference.
	 * @see #getAkustikdauerVoranz()
	 * @generated
	 */
	void setAkustikdauerVoranz(Akustikdauer_Voranz_TypeClass value);

} // ZN_Akustik_Anzeigefeld_AttributeGroup
