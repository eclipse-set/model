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

import org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strecke Bremsweg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bremswegabstand der Strecke als Eingangsgröße für die LST-Planung. Die Vorgabe erfolgt in der BAst.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Strecke_Bremsweg#getBremsweg <em>Bremsweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Strecke_Bremsweg#getStreckeRichtung <em>Strecke Richtung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getStrecke_Bremsweg()
 * @model extendedMetaData="name='CStrecke_Bremsweg' kind='elementOnly'"
 * @generated
 */
public interface Strecke_Bremsweg extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>Bremsweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bremsweg als Grundlage für die Dimesionierung der zugehörigen Strecke. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bremsweg</em>' containment reference.
	 * @see #setBremsweg(Bremsweg_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getStrecke_Bremsweg_Bremsweg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bremsweg'"
	 * @generated
	 */
	Bremsweg_TypeClass getBremsweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Strecke_Bremsweg#getBremsweg <em>Bremsweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bremsweg</em>' containment reference.
	 * @see #getBremsweg()
	 * @generated
	 */
	void setBremsweg(Bremsweg_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Strecke Richtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Richtung der Strecke, für die der Bremsweg vorgegeben ist. Die Richtung wird topologisch über das Attribut Richtungsbezug (Bereich_Objekt) abgetragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strecke Richtung</em>' containment reference.
	 * @see #setStreckeRichtung(Strecke_Richtung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getStrecke_Bremsweg_StreckeRichtung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Strecke_Richtung'"
	 * @generated
	 */
	Strecke_Richtung_TypeClass getStreckeRichtung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Strecke_Bremsweg#getStreckeRichtung <em>Strecke Richtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strecke Richtung</em>' containment reference.
	 * @see #getStreckeRichtung()
	 * @generated
	 */
	void setStreckeRichtung(Strecke_Richtung_TypeClass value);

} // Strecke_Bremsweg
