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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geschwindigkeitsprofil Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getAnzeigegefuehrtESKategorie <em>Anzeigegefuehrt ES Kategorie</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getGeschwindigkeit <em>Geschwindigkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getVProfilArt <em>VProfil Art</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGeschwindigkeitsprofil_Allg_AttributeGroup()
 * @model extendedMetaData="name='CGeschwindigkeitsprofil_Allg' kind='elementOnly'"
 * @generated
 */
public interface Geschwindigkeitsprofil_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Anzeigegefuehrt ES Kategorie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kategorie für Geschwindigkeitsprofile der Art \"anzeigefeführt ES\", z. B. Gültigkeit für Reise- oder Güterzüge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anzeigegefuehrt ES Kategorie</em>' containment reference.
	 * @see #setAnzeigegefuehrtESKategorie(Anzeigegefuehrt_ES_Kategorie_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGeschwindigkeitsprofil_Allg_AttributeGroup_AnzeigegefuehrtESKategorie()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anzeigegefuehrt_ES_Kategorie'"
	 * @generated
	 */
	Anzeigegefuehrt_ES_Kategorie_TypeClass getAnzeigegefuehrtESKategorie();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getAnzeigegefuehrtESKategorie <em>Anzeigegefuehrt ES Kategorie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzeigegefuehrt ES Kategorie</em>' containment reference.
	 * @see #getAnzeigegefuehrtESKategorie()
	 * @generated
	 */
	void setAnzeigegefuehrtESKategorie(Anzeigegefuehrt_ES_Kategorie_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Geschwindigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zulässige Geschwindigkeit nach jeweiligem Geschwindigkeitsprofil. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geschwindigkeit</em>' containment reference.
	 * @see #setGeschwindigkeit(Geschwindigkeit_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGeschwindigkeitsprofil_Allg_AttributeGroup_Geschwindigkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Geschwindigkeit'"
	 * @generated
	 */
	Geschwindigkeit_TypeClass getGeschwindigkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getGeschwindigkeit <em>Geschwindigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschwindigkeit</em>' containment reference.
	 * @see #getGeschwindigkeit()
	 * @generated
	 */
	void setGeschwindigkeit(Geschwindigkeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VProfil Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Geschwindigkeitsprofils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VProfil Art</em>' containment reference.
	 * @see #setVProfilArt(V_Profil_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGeschwindigkeitsprofil_Allg_AttributeGroup_VProfilArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='V_Profil_Art'"
	 * @generated
	 */
	V_Profil_Art_TypeClass getVProfilArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getVProfilArt <em>VProfil Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VProfil Art</em>' containment reference.
	 * @see #getVProfilArt()
	 * @generated
	 */
	void setVProfilArt(V_Profil_Art_TypeClass value);

} // Geschwindigkeitsprofil_Allg_AttributeGroup
