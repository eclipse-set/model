/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element;

import org.eclipse.set.model.model1902.Basisobjekte.Bereich_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Aussenelementansteuerung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stell Bereich</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bereich_Objekt, mit dem ein Stellbereich beschrieben wird. Ein Stellbereich wird immer von einer AEA (Top) gesteuert. Grenzen des Stellbereichs sind Haupt-, Sperr- oder virtuelle Signale oder Gleisabschlüsse. Jedes Hauptgleis muss einem Stellbereich zugeordnet sein.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Stell_Bereich#getIDAussenelementansteuerung <em>ID Aussenelementansteuerung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getStell_Bereich()
 * @model extendedMetaData="name='CStell_Bereich' kind='elementOnly'"
 * @generated
 */
public interface Stell_Bereich extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Aussenelementansteuerung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Top-Außenelementansteuerung (Außenelementansteuerung, die mit einer ESTW Zentraleinheit verbunden ist).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Aussenelementansteuerung</em>' containment reference.
	 * @see #setIDAussenelementansteuerung(ID_Aussenelementansteuerung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getStell_Bereich_IDAussenelementansteuerung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Aussenelementansteuerung'"
	 * @generated
	 */
	ID_Aussenelementansteuerung_TypeClass getIDAussenelementansteuerung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Stell_Bereich#getIDAussenelementansteuerung <em>ID Aussenelementansteuerung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Aussenelementansteuerung</em>' containment reference.
	 * @see #getIDAussenelementansteuerung()
	 * @generated
	 */
	void setIDAussenelementansteuerung(ID_Aussenelementansteuerung_TypeClass value);

} // Stell_Bereich
