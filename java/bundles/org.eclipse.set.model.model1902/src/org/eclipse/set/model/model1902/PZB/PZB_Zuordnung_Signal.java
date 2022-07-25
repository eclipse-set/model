/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PZB;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_PZB_Element_Zuordnung_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PZB Zuordnung Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Das Objekt dient der Zuordnung der Signale (Vorsignal, Vorsignalwiederholer, H-Tafel) zum maßgebenden Gleismagneten (GM) 2000 Hz des Hauptsignals. Die Unterscheidung zwischen den verschiedenen Signalen wird über die GUID des Signals hergestellt. Der angegebene Abstand bezieht sich beim Vorsignal auf den Abstand des GM 1000 Hz, bei Vorsignalwiederholer und H-Tafel auf den Abstand des Signals zum maßgebenden GM 2000 Hz des Hauptsignals. Es werden in der Regel bis zu vier H-Tafeln pro Hauptsignal geplant. DB-Regelwerk Gleismagnettabelle, Zeilen 19 sowie 21 bis 25 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.PZB_Zuordnung_Signal#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.PZB_Zuordnung_Signal#getIDSignal <em>ID Signal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Zuordnung_Signal()
 * @model extendedMetaData="name='CPZB_Zuordnung_Signal' kind='elementOnly'"
 * @generated
 */
public interface PZB_Zuordnung_Signal extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDPZB Element Zuordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Objekt PZB_Element_Zuordnung, zur Angabe des zugehörigen Signals. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDPZB Element Zuordnung</em>' containment reference.
	 * @see #setIDPZBElementZuordnung(ID_PZB_Element_Zuordnung_TypeClass)
	 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Zuordnung_Signal_IDPZBElementZuordnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_PZB_Element_Zuordnung'"
	 * @generated
	 */
	ID_PZB_Element_Zuordnung_TypeClass getIDPZBElementZuordnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PZB.PZB_Zuordnung_Signal#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDPZB Element Zuordnung</em>' containment reference.
	 * @see #getIDPZBElementZuordnung()
	 * @generated
	 */
	void setIDPZBElementZuordnung(ID_PZB_Element_Zuordnung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID des zugeordneten Signals (Vorsignal, Vorsignalwiederholer, H-Tafel), welches im Rahmen der INA-Berechnung dem Hauptsignal zugeordet wird und damit mit diesem im festen Zusammenhang steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' containment reference.
	 * @see #setIDSignal(ID_Signal_TypeClass)
	 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Zuordnung_Signal_IDSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	ID_Signal_TypeClass getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PZB.PZB_Zuordnung_Signal#getIDSignal <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal</em>' containment reference.
	 * @see #getIDSignal()
	 * @generated
	 */
	void setIDSignal(ID_Signal_TypeClass value);

} // PZB_Zuordnung_Signal
