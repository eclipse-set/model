/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Gleis;

import org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gleis Fahrbahn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bereich, in dem eine besondere Fahrbahnkonstruktion vorhanden ist, die für die Leit- und Sicherungstechnik relevant ist (z. B. Feste Fahrbahn). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Gleis.Gleis_Fahrbahn#getKonstruktion <em>Konstruktion</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Gleis.GleisPackage#getGleis_Fahrbahn()
 * @model extendedMetaData="name='CGleis_Fahrbahn' kind='elementOnly'"
 * @generated
 */
public interface Gleis_Fahrbahn extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>Konstruktion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LST-relevante Fahrbahneigenschaft (z. B. Feste Fahrbahn).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Konstruktion</em>' containment reference.
	 * @see #setKonstruktion(Konstruktion_TypeClass)
	 * @see org.eclipse.set.model.planpro.Gleis.GleisPackage#getGleis_Fahrbahn_Konstruktion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Konstruktion'"
	 * @generated
	 */
	Konstruktion_TypeClass getKonstruktion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Fahrbahn#getKonstruktion <em>Konstruktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Konstruktion</em>' containment reference.
	 * @see #getKonstruktion()
	 * @generated
	 */
	void setKonstruktion(Konstruktion_TypeClass value);

} // Gleis_Fahrbahn
