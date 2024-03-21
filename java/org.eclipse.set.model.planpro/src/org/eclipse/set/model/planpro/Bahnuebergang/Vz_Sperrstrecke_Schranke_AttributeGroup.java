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
 * A representation of the model object '<em><b>Vz Sperrstrecke Schranke Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_Schranke_AttributeGroup#getRaeumstrecke <em>Raeumstrecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_Schranke_AttributeGroup#getTeilsperrstrecke <em>Teilsperrstrecke</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVz_Sperrstrecke_Schranke_AttributeGroup()
 * @model extendedMetaData="name='CVz_Sperrstrecke_Schranke' kind='elementOnly'"
 * @generated
 */
public interface Vz_Sperrstrecke_Schranke_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Raeumstrecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Räumstrecke als Abstand Schranke - gegenüberliegende Gefahrraumgrenze (d2). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raeumstrecke</em>' containment reference.
	 * @see #setRaeumstrecke(Raeumstrecke_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVz_Sperrstrecke_Schranke_AttributeGroup_Raeumstrecke()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Raeumstrecke'"
	 * @generated
	 */
	Raeumstrecke_TypeClass getRaeumstrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_Schranke_AttributeGroup#getRaeumstrecke <em>Raeumstrecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raeumstrecke</em>' containment reference.
	 * @see #getRaeumstrecke()
	 * @generated
	 */
	void setRaeumstrecke(Raeumstrecke_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Teilsperrstrecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Teilsperrstrecke als Abstand Lz - Schranke (d1). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Teilsperrstrecke</em>' containment reference.
	 * @see #setTeilsperrstrecke(Teilsperrstrecke_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVz_Sperrstrecke_Schranke_AttributeGroup_Teilsperrstrecke()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Teilsperrstrecke'"
	 * @generated
	 */
	Teilsperrstrecke_TypeClass getTeilsperrstrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_Schranke_AttributeGroup#getTeilsperrstrecke <em>Teilsperrstrecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teilsperrstrecke</em>' containment reference.
	 * @see #getTeilsperrstrecke()
	 * @generated
	 */
	void setTeilsperrstrecke(Teilsperrstrecke_TypeClass value);

} // Vz_Sperrstrecke_Schranke_AttributeGroup
