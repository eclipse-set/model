/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zuglenkung;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Signal_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_ZL_Signalgruppe_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL Signalgruppe Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung von Signalen zur ZL Signalgruppe. DB-Regelwerk 819.0732 A06 Im PT1 erfolgt die Angabe in einer gesonderten Tabelle, für die es im Regelwerk z. Zt. keine Vorgabe gibt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe_Zuordnung#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe_Zuordnung#getIDZLSignalgruppe <em>IDZL Signalgruppe</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage#getZL_Signalgruppe_Zuordnung()
 * @model extendedMetaData="name='CZL_Signalgruppe_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface ZL_Signalgruppe_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Signal, das der ZL_Signalgruppe zugeordnet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' containment reference.
	 * @see #setIDSignal(ID_Signal_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage#getZL_Signalgruppe_Zuordnung_IDSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	ID_Signal_TypeClass getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe_Zuordnung#getIDSignal <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal</em>' containment reference.
	 * @see #getIDSignal()
	 * @generated
	 */
	void setIDSignal(ID_Signal_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDZL Signalgruppe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ZL_Signalgruppe, zu der das zugeordnete Signal gehört.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZL Signalgruppe</em>' containment reference.
	 * @see #setIDZLSignalgruppe(ID_ZL_Signalgruppe_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage#getZL_Signalgruppe_Zuordnung_IDZLSignalgruppe()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZL_Signalgruppe'"
	 * @generated
	 */
	ID_ZL_Signalgruppe_TypeClass getIDZLSignalgruppe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe_Zuordnung#getIDZLSignalgruppe <em>IDZL Signalgruppe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZL Signalgruppe</em>' containment reference.
	 * @see #getIDZLSignalgruppe()
	 * @generated
	 */
	void setIDZLSignalgruppe(ID_ZL_Signalgruppe_TypeClass value);

} // ZL_Signalgruppe_Zuordnung
