/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verkehrszeichen Lz Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getAkustikFussgaenger <em>Akustik Fussgaenger</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getKontrastblende <em>Kontrastblende</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getOptikDurchmesser <em>Optik Durchmesser</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getOptikSymbolmaske <em>Optik Symbolmaske</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getSchaltgruppe <em>Schaltgruppe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getTragkopfVerstellbar <em>Tragkopf Verstellbar</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getVorgeschaltet <em>Vorgeschaltet</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Lz_AttributeGroup()
 * @model extendedMetaData="name='CVerkehrszeichen_Lz' kind='elementOnly'"
 * @generated
 */
public interface Verkehrszeichen_Lz_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Akustik Fussgaenger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Lichtzeichen ist mit einer Fußgänger-Akustik auszurüsten (true). Das Attribut entfällt, sofern keine Akustik benötigt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Akustik Fussgaenger</em>' containment reference.
	 * @see #setAkustikFussgaenger(Akustik_Fussgaenger_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Lz_AttributeGroup_AkustikFussgaenger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Akustik_Fussgaenger'"
	 * @generated
	 */
	Akustik_Fussgaenger_TypeClass getAkustikFussgaenger();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getAkustikFussgaenger <em>Akustik Fussgaenger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Akustik Fussgaenger</em>' containment reference.
	 * @see #getAkustikFussgaenger()
	 * @generated
	 */
	void setAkustikFussgaenger(Akustik_Fussgaenger_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Kontrastblende</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für das Lichtzeichen ist eine Kontrastblende vorzusehen (true). Das Attribut entfällt, wenn keine Kontrastblende benötigt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kontrastblende</em>' containment reference.
	 * @see #setKontrastblende(Kontrastblende_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Lz_AttributeGroup_Kontrastblende()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Kontrastblende'"
	 * @generated
	 */
	Kontrastblende_TypeClass getKontrastblende();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getKontrastblende <em>Kontrastblende</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kontrastblende</em>' containment reference.
	 * @see #getKontrastblende()
	 * @generated
	 */
	void setKontrastblende(Kontrastblende_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Optik Durchmesser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durchmesser der Signalgeberoptik in mm. Der Standardwert sind 200 mm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optik Durchmesser</em>' containment reference.
	 * @see #setOptikDurchmesser(Optik_Durchmesser_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Lz_AttributeGroup_OptikDurchmesser()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Optik_Durchmesser'"
	 * @generated
	 */
	Optik_Durchmesser_TypeClass getOptikDurchmesser();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getOptikDurchmesser <em>Optik Durchmesser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optik Durchmesser</em>' containment reference.
	 * @see #getOptikDurchmesser()
	 * @generated
	 */
	void setOptikDurchmesser(Optik_Durchmesser_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Optik Symbolmaske</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Signalgeberoptiken sind mit einer Symbolmaske auszurüsten (true). Das Attribut entfällt, sofern keine Symbolmaske benötigt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optik Symbolmaske</em>' containment reference.
	 * @see #setOptikSymbolmaske(Optik_Symbolmaske_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Lz_AttributeGroup_OptikSymbolmaske()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Optik_Symbolmaske'"
	 * @generated
	 */
	Optik_Symbolmaske_TypeClass getOptikSymbolmaske();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getOptikSymbolmaske <em>Optik Symbolmaske</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optik Symbolmaske</em>' containment reference.
	 * @see #getOptikSymbolmaske()
	 * @generated
	 */
	void setOptikSymbolmaske(Optik_Symbolmaske_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Schaltgruppe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei BUESTRA und vorgeschalteten Lz: Zuordnung des Lz zu einer Schaltgruppe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schaltgruppe</em>' containment reference.
	 * @see #setSchaltgruppe(Schaltgruppe_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Lz_AttributeGroup_Schaltgruppe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schaltgruppe'"
	 * @generated
	 */
	Schaltgruppe_TypeClass getSchaltgruppe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getSchaltgruppe <em>Schaltgruppe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schaltgruppe</em>' containment reference.
	 * @see #getSchaltgruppe()
	 * @generated
	 */
	void setSchaltgruppe(Schaltgruppe_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Tragkopf Verstellbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Tragkopf des Lichtzeichens ist verstellbar (true). Das Attribut entfällt, wenn der Tragkopf nicht verstellbar ist (Standard).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tragkopf Verstellbar</em>' containment reference.
	 * @see #setTragkopfVerstellbar(Tragkopf_Verstellbar_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Lz_AttributeGroup_TragkopfVerstellbar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Tragkopf_Verstellbar'"
	 * @generated
	 */
	Tragkopf_Verstellbar_TypeClass getTragkopfVerstellbar();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getTragkopfVerstellbar <em>Tragkopf Verstellbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tragkopf Verstellbar</em>' containment reference.
	 * @see #getTragkopfVerstellbar()
	 * @generated
	 */
	void setTragkopfVerstellbar(Tragkopf_Verstellbar_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Vorgeschaltet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei dem Lichtzeichen handelt es sich um ein vorgeschaltetes Lichtzeichen (true). Das Attribut entfällt, sofern das Lichtzeichen nicht vorgeschaltet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vorgeschaltet</em>' containment reference.
	 * @see #setVorgeschaltet(Vorgeschaltet_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Lz_AttributeGroup_Vorgeschaltet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vorgeschaltet'"
	 * @generated
	 */
	Vorgeschaltet_TypeClass getVorgeschaltet();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup#getVorgeschaltet <em>Vorgeschaltet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vorgeschaltet</em>' containment reference.
	 * @see #getVorgeschaltet()
	 * @generated
	 */
	void setVorgeschaltet(Vorgeschaltet_TypeClass value);

} // Verkehrszeichen_Lz_AttributeGroup
