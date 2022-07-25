/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Gleis;

import org.eclipse.set.model.model1902.Basisobjekte.Bereich_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gleis Art</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Klassifizierung des Gleises aus betrieblicher Sicht. Es erfolgt die Unterscheidung in Haupt- und Nebengleise in einem Bahnhof, sowie die Abgrenzung von Strecken und Anschlussgleisen. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Gleis.Gleis_Art#getGleisart <em>Gleisart</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Gleis.GleisPackage#getGleis_Art()
 * @model extendedMetaData="name='CGleis_Art' kind='elementOnly'"
 * @generated
 */
public interface Gleis_Art extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>Gleisart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Betriebliche Einordnung des Gleises. Aus einer Liste erfolgt die Auswahl der Gleisart. Falls eine abweichende Gleisart vorhanden ist, ist \"sonstige\" auszuwählen und mit einem Bearbeitungsvermerk zu erläutern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gleisart</em>' containment reference.
	 * @see #setGleisart(Gleisart_TypeClass)
	 * @see org.eclipse.set.model.model1902.Gleis.GleisPackage#getGleis_Art_Gleisart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Gleisart'"
	 * @generated
	 */
	Gleisart_TypeClass getGleisart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Gleis.Gleis_Art#getGleisart <em>Gleisart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gleisart</em>' containment reference.
	 * @see #getGleisart()
	 * @generated
	 */
	void setGleisart(Gleisart_TypeClass value);

} // Gleis_Art
