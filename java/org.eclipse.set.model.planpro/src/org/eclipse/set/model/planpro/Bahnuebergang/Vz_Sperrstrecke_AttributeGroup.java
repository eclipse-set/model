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
 * A representation of the model object '<em><b>Vz Sperrstrecke Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup#getVzSperrstreckeVorgeschaltet <em>Vz Sperrstrecke Vorgeschaltet</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup#getSperrstrecke <em>Sperrstrecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup#getSperrstreckeFussgaenger <em>Sperrstrecke Fussgaenger</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup#getVzSperrstreckeSchranke <em>Vz Sperrstrecke Schranke</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVz_Sperrstrecke_AttributeGroup()
 * @model extendedMetaData="name='CVz_Sperrstrecke' kind='elementOnly'"
 * @generated
 */
public interface Vz_Sperrstrecke_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Vz Sperrstrecke Vorgeschaltet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zusätzliche Angaben zu Räumstrecken bei vorgeschalteten Lichtzeichen gemäß Ril 815.0033A01.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vz Sperrstrecke Vorgeschaltet</em>' containment reference.
	 * @see #setVzSperrstreckeVorgeschaltet(Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVz_Sperrstrecke_AttributeGroup_VzSperrstreckeVorgeschaltet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vz_Sperrstrecke_Vorgeschaltet'"
	 * @generated
	 */
	Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup getVzSperrstreckeVorgeschaltet();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup#getVzSperrstreckeVorgeschaltet <em>Vz Sperrstrecke Vorgeschaltet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vz Sperrstrecke Vorgeschaltet</em>' containment reference.
	 * @see #getVzSperrstreckeVorgeschaltet()
	 * @generated
	 */
	void setVzSperrstreckeVorgeschaltet(Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Sperrstrecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sperrstrecke als Abstand Lz/Andreaskreuz - gegenüberliegende Gefahrraumgrenze (d). Die Angabe ist nur bei unbeschrankten Bahnübergängen erforderlich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sperrstrecke</em>' containment reference.
	 * @see #setSperrstrecke(Sperrstrecke_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVz_Sperrstrecke_AttributeGroup_Sperrstrecke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Sperrstrecke'"
	 * @generated
	 */
	Sperrstrecke_TypeClass getSperrstrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup#getSperrstrecke <em>Sperrstrecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sperrstrecke</em>' containment reference.
	 * @see #getSperrstrecke()
	 * @generated
	 */
	void setSperrstrecke(Sperrstrecke_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Sperrstrecke Fussgaenger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sperrstrecke als Abstand Lz/Andreaskreuz - gegenüberliegende Schranke (dF). Die Angabe ist nur bei beschrankten Bahnübergängen erforderlich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sperrstrecke Fussgaenger</em>' containment reference.
	 * @see #setSperrstreckeFussgaenger(Sperrstrecke_Fussgaenger_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVz_Sperrstrecke_AttributeGroup_SperrstreckeFussgaenger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Sperrstrecke_Fussgaenger'"
	 * @generated
	 */
	Sperrstrecke_Fussgaenger_TypeClass getSperrstreckeFussgaenger();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup#getSperrstreckeFussgaenger <em>Sperrstrecke Fussgaenger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sperrstrecke Fussgaenger</em>' containment reference.
	 * @see #getSperrstreckeFussgaenger()
	 * @generated
	 */
	void setSperrstreckeFussgaenger(Sperrstrecke_Fussgaenger_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Vz Sperrstrecke Schranke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Sperrstrecke bei BÜ der Art LzH bzw. LzHH.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vz Sperrstrecke Schranke</em>' containment reference.
	 * @see #setVzSperrstreckeSchranke(Vz_Sperrstrecke_Schranke_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVz_Sperrstrecke_AttributeGroup_VzSperrstreckeSchranke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vz_Sperrstrecke_Schranke'"
	 * @generated
	 */
	Vz_Sperrstrecke_Schranke_AttributeGroup getVzSperrstreckeSchranke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup#getVzSperrstreckeSchranke <em>Vz Sperrstrecke Schranke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vz Sperrstrecke Schranke</em>' containment reference.
	 * @see #getVzSperrstreckeSchranke()
	 * @generated
	 */
	void setVzSperrstreckeSchranke(Vz_Sperrstrecke_Schranke_AttributeGroup value);

} // Vz_Sperrstrecke_AttributeGroup
