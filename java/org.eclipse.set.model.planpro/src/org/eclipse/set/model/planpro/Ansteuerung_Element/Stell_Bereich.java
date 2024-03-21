/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element;

import org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_TypeClass;

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
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Stell_Bereich#getZusatzinformationStellwerk <em>Zusatzinformation Stellwerk</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Stell_Bereich#getBezeichnungStellwerk <em>Bezeichnung Stellwerk</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Stell_Bereich#getIDAussenelementansteuerung <em>ID Aussenelementansteuerung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getStell_Bereich()
 * @model extendedMetaData="name='CStell_Bereich' kind='elementOnly'"
 * @generated
 */
public interface Stell_Bereich extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>Zusatzinformation Stellwerk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ergänzende Information zur Beschreibung des Stellbereichs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusatzinformation Stellwerk</em>' containment reference.
	 * @see #setZusatzinformationStellwerk(Zusatzinformation_Stellwerk_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getStell_Bereich_ZusatzinformationStellwerk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Zusatzinformation_Stellwerk'"
	 * @generated
	 */
	Zusatzinformation_Stellwerk_TypeClass getZusatzinformationStellwerk();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Stell_Bereich#getZusatzinformationStellwerk <em>Zusatzinformation Stellwerk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusatzinformation Stellwerk</em>' containment reference.
	 * @see #getZusatzinformationStellwerk()
	 * @generated
	 */
	void setZusatzinformationStellwerk(Zusatzinformation_Stellwerk_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung Stellwerk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Stellwerks, sofern kein Verweis auf eine Aussenelementansteuerung möglich ist (z. B. \"Relaisstellwerk xyz\").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Stellwerk</em>' containment reference.
	 * @see #setBezeichnungStellwerk(Bezeichnung_Stellwerk_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getStell_Bereich_BezeichnungStellwerk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Stellwerk'"
	 * @generated
	 */
	Bezeichnung_Stellwerk_TypeClass getBezeichnungStellwerk();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Stell_Bereich#getBezeichnungStellwerk <em>Bezeichnung Stellwerk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Stellwerk</em>' containment reference.
	 * @see #getBezeichnungStellwerk()
	 * @generated
	 */
	void setBezeichnungStellwerk(Bezeichnung_Stellwerk_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Aussenelementansteuerung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Top-Außenelementansteuerung (Außenelementansteuerung, die mit einer ESTW Zentraleinheit verbunden ist).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Aussenelementansteuerung</em>' containment reference.
	 * @see #setIDAussenelementansteuerung(ID_Aussenelementansteuerung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getStell_Bereich_IDAussenelementansteuerung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Aussenelementansteuerung'"
	 * @generated
	 */
	ID_Aussenelementansteuerung_TypeClass getIDAussenelementansteuerung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Stell_Bereich#getIDAussenelementansteuerung <em>ID Aussenelementansteuerung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Aussenelementansteuerung</em>' containment reference.
	 * @see #getIDAussenelementansteuerung()
	 * @generated
	 */
	void setIDAussenelementansteuerung(ID_Aussenelementansteuerung_TypeClass value);

} // Stell_Bereich
