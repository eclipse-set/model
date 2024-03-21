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
 * A representation of the model object '<em><b>Oertlichkeit Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit_Allg_AttributeGroup#getOertlichkeitArt <em>Oertlichkeit Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit_Allg_AttributeGroup#getOertlichkeitGueltigAb <em>Oertlichkeit Gueltig Ab</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit_Allg_AttributeGroup#getOertlichkeitGueltigBis <em>Oertlichkeit Gueltig Bis</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getOertlichkeit_Allg_AttributeGroup()
 * @model extendedMetaData="name='COertlichkeit_Allg' kind='elementOnly'"
 * @generated
 */
public interface Oertlichkeit_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Oertlichkeit Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Örtlichkeit. Die Befüllungen sind der ENUM-Liste von Bahnanlagen und Betriebsstellen des Netzes, weiterer Örtlichkeiten mit Fahrplanzeiten sowie sonstiger Punkte zu entnehmen und müssen in der Regel mit der Angabe in der Ril 100 übereinstimmen. Ab der Version 1.8.0 wird die Schreibweise der ENUM-Werte identisch zur Ril 100 übernommen, indem Umlaute und Leezeichen verwendet werden. Die im Glossar mit (E) gekennzeichneten Werte entfallen zukünftig und sollen daher nicht mehr für Neuanwendungen genutzt werden. DB-Regelwerk Die verwendeten Codierungen sind im Anhang 1 Abschnitt 3 der Richtlinie 100.0001 zusammengestellt und in ihrer Bedeutung erklärt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oertlichkeit Art</em>' containment reference.
	 * @see #setOertlichkeitArt(Oertlichkeit_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getOertlichkeit_Allg_AttributeGroup_OertlichkeitArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Oertlichkeit_Art'"
	 * @generated
	 */
	Oertlichkeit_Art_TypeClass getOertlichkeitArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit_Allg_AttributeGroup#getOertlichkeitArt <em>Oertlichkeit Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oertlichkeit Art</em>' containment reference.
	 * @see #getOertlichkeitArt()
	 * @generated
	 */
	void setOertlichkeitArt(Oertlichkeit_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Oertlichkeit Gueltig Ab</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gültig ab ist eine Angabe zum ersten Gültigkeitstag der Abkürzung oder eine andere Angabe gemäß Regelwerk. DB-Regelwerk Die Angaben zur Gültigkeit sind in Richtlinie 100.0001 Abschnitt 4 (2) geregelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oertlichkeit Gueltig Ab</em>' containment reference.
	 * @see #setOertlichkeitGueltigAb(Oertlichkeit_Gueltig_Ab_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getOertlichkeit_Allg_AttributeGroup_OertlichkeitGueltigAb()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Oertlichkeit_Gueltig_Ab'"
	 * @generated
	 */
	Oertlichkeit_Gueltig_Ab_TypeClass getOertlichkeitGueltigAb();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit_Allg_AttributeGroup#getOertlichkeitGueltigAb <em>Oertlichkeit Gueltig Ab</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oertlichkeit Gueltig Ab</em>' containment reference.
	 * @see #getOertlichkeitGueltigAb()
	 * @generated
	 */
	void setOertlichkeitGueltigAb(Oertlichkeit_Gueltig_Ab_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Oertlichkeit Gueltig Bis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gültig bis ist eine Angabe zum letzten Gültigkeitstag der Abkürzung oder eine andere Angabe gemäß Regelwerk. DB-Regelwerk Die Angaben zur Gültigkeit sind in Richtlinie 100.0001 Abschnitt 4 (2) geregelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oertlichkeit Gueltig Bis</em>' containment reference.
	 * @see #setOertlichkeitGueltigBis(Oertlichkeit_Gueltig_Bis_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getOertlichkeit_Allg_AttributeGroup_OertlichkeitGueltigBis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Oertlichkeit_Gueltig_Bis'"
	 * @generated
	 */
	Oertlichkeit_Gueltig_Bis_TypeClass getOertlichkeitGueltigBis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit_Allg_AttributeGroup#getOertlichkeitGueltigBis <em>Oertlichkeit Gueltig Bis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oertlichkeit Gueltig Bis</em>' containment reference.
	 * @see #getOertlichkeitGueltigBis()
	 * @generated
	 */
	void setOertlichkeitGueltigBis(Oertlichkeit_Gueltig_Bis_TypeClass value);

} // Oertlichkeit_Allg_AttributeGroup
