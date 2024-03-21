/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Akteur Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Akteur_Allg_AttributeGroup#getNameAkteur <em>Name Akteur</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Akteur_Allg_AttributeGroup#getNameAkteur10 <em>Name Akteur10</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Akteur_Allg_AttributeGroup#getNameAkteur5 <em>Name Akteur5</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getAkteur_Allg_AttributeGroup()
 * @model extendedMetaData="name='CAkteur_Allg' kind='elementOnly'"
 * @generated
 */
public interface Akteur_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Akteur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachname des Akteurs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Akteur</em>' containment reference.
	 * @see #setNameAkteur(Name_Akteur_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getAkteur_Allg_AttributeGroup_NameAkteur()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Name_Akteur'"
	 * @generated
	 */
	Name_Akteur_TypeClass getNameAkteur();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Akteur_Allg_AttributeGroup#getNameAkteur <em>Name Akteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Akteur</em>' containment reference.
	 * @see #getNameAkteur()
	 * @generated
	 */
	void setNameAkteur(Name_Akteur_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Name Akteur10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachname des Akteurs, beschränkt auf 10 Zeichen. DB-Regelwerk Schriftfeldeinträge gemäß Ril 886.0102, Namen der (maßgeblich) handelnden Person für definierte Rollen des Planungsprozesses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Akteur10</em>' containment reference.
	 * @see #setNameAkteur10(Name_Akteur_10_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getAkteur_Allg_AttributeGroup_NameAkteur10()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Name_Akteur_10'"
	 * @generated
	 */
	Name_Akteur_10_TypeClass getNameAkteur10();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Akteur_Allg_AttributeGroup#getNameAkteur10 <em>Name Akteur10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Akteur10</em>' containment reference.
	 * @see #getNameAkteur10()
	 * @generated
	 */
	void setNameAkteur10(Name_Akteur_10_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Name Akteur5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachname des Akteurs, beschränkt auf 5 Zeichen. DB-Regelwerk Schriftfeldeinträge gemäß Ril 886.0102, Namen der (maßgeblich) handelnden Person für definierte Rollen des Planungsprozesses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Akteur5</em>' containment reference.
	 * @see #setNameAkteur5(Name_Akteur_5_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getAkteur_Allg_AttributeGroup_NameAkteur5()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Name_Akteur_5'"
	 * @generated
	 */
	Name_Akteur_5_TypeClass getNameAkteur5();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Akteur_Allg_AttributeGroup#getNameAkteur5 <em>Name Akteur5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Akteur5</em>' containment reference.
	 * @see #getNameAkteur5()
	 * @generated
	 */
	void setNameAkteur5(Name_Akteur_5_TypeClass value);

} // Akteur_Allg_AttributeGroup
