/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Medien_und_Trassen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Trasse_Kante_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kabel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Medium zur Übermittlung von Energie und/oder Information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel#getIDTrasseKante <em>ID Trasse Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel#getKabelAllg <em>Kabel Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel#getKabelElement <em>Kabel Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel()
 * @model extendedMetaData="name='CKabel' kind='elementOnly'"
 * @generated
 */
public interface Kabel extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Kabel_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Kabel_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Kabel_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Trasse Kante</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Verweise.ID_Trasse_Kante_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Trassen-Kante des Kabel-Gefäßsystems, in dem das Kabel verlegt werden soll bzw. ist. Kurze Verbindungen sind auch ohne Kabelgefäßsystem möglich, z. B. zwischen zwei benachbarten Schaltkästen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Trasse Kante</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_IDTrasseKante()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Trasse_Kante'"
	 * @generated
	 */
	EList<ID_Trasse_Kante_TypeClass> getIDTrasseKante();

	/**
	 * Returns the value of the '<em><b>Kabel Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kabel Allg</em>' containment reference.
	 * @see #setKabelAllg(Kabel_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_KabelAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Kabel_Allg'"
	 * @generated
	 */
	Kabel_Allg_AttributeGroup getKabelAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel#getKabelAllg <em>Kabel Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kabel Allg</em>' containment reference.
	 * @see #getKabelAllg()
	 * @generated
	 */
	void setKabelAllg(Kabel_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Kabel Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Element_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Angabe der Kabeleigenschaften je Verseilart. Bei kombinierten Signalkabeln wird die Attributgruppe zweimal instanziiert, sonst einmal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kabel Element</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_KabelElement()
	 * @model containment="true" required="true" upper="2"
	 *        extendedMetaData="kind='element' name='Kabel_Element'"
	 * @generated
	 */
	EList<Kabel_Element_AttributeGroup> getKabelElement();

} // Kabel
