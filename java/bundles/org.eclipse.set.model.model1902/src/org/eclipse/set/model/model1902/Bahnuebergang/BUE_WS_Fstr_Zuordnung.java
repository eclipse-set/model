/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_BUE_Einschaltung_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Fstr_Zug_Rangier_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE WS Fstr Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung zwischen BUE-Einschaltung und zugehörigen Fahrstraßen, für die die Wirksamkeitskontakte wirken sollen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_WS_Fstr_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_WS_Fstr_Zuordnung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_WS_Fstr_Zuordnung()
 * @model extendedMetaData="name='CBUE_WS_Fstr_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface BUE_WS_Fstr_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDBUE Einschaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf denjenigen Einschaltpunkt, für den die Wirksamschaltung vorgesehen wird. DB-Regelwerk Einschaltstreckenberechnung 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Einschaltung</em>' containment reference.
	 * @see #setIDBUEEinschaltung(ID_BUE_Einschaltung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_WS_Fstr_Zuordnung_IDBUEEinschaltung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Einschaltung'"
	 * @generated
	 */
	ID_BUE_Einschaltung_TypeClass getIDBUEEinschaltung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_WS_Fstr_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Einschaltung</em>' containment reference.
	 * @see #getIDBUEEinschaltung()
	 * @generated
	 */
	void setIDBUEEinschaltung(ID_BUE_Einschaltung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fstr Zug Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeiger auf die Fahrstraße, für die die Einschaltung des BÜ abhängig geschaltet wird. DB-Regelwerk Datenblatt für die Abhängigkeiten BÜ - Stw 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Zug Rangier</em>' containment reference.
	 * @see #setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_WS_Fstr_Zuordnung_IDFstrZugRangier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Zug_Rangier'"
	 * @generated
	 */
	ID_Fstr_Zug_Rangier_TypeClass getIDFstrZugRangier();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_WS_Fstr_Zuordnung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Zug Rangier</em>' containment reference.
	 * @see #getIDFstrZugRangier()
	 * @generated
	 */
	void setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass value);

} // BUE_WS_Fstr_Zuordnung
