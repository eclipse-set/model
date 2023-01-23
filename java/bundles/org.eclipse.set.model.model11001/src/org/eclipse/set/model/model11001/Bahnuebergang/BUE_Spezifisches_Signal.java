/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bahnuebergang;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_BUE_Anlage_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_BUE_Einschaltung_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Spezifisches Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Objekt zur Zuordnung von Signalen, die ausschließlich im Zusammenhang mit einem Bahnübergang (BÜ) angeordnet werden. Dazu gehören zum Beispiel Pfeiftafeln, Lf-Signale mit und ohne Zusatz \"BÜ\" oder Überwachungssignale für BÜ, Merktafeln oder Merkpfähle u.a. Die Anwendung von Pfeiftafeln und Lf-Signalen erfolgt zumeist bei nichttechnisch gesicherten BÜ; die Anwendung der Überwachungssignale bei Bahnübergängen der Funktionsüberwachung \"ÜS\". Für die vorgenannten Fälle ist der Verweis auf BUE Anlage zu befüllen. Wird zum Beispiel ein Merkpfahl zur Kennzeichnung eines Einschaltpunktes (Anwendung in besonderen Planungsfällen) vorgesehen, ist der Verweis auf BUE Einschaltung zu befüllen. Für die Bezeichnung von BÜ-spezifischen Signalen, insbesondere Überwachungssignale, sind Ausführungen auf der Seite Bezeichnung Signal vorhanden. DB-Regelwerk Formblatt zur Ermittlung der Sichtflächen für nichttechnisch gesicherte BÜ 819.1204 9 für ÜS SPU 24 für Merktafel /-pfahl BÜ-Kabellage- und -übersichtsplan 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Spezifisches_Signal#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Spezifisches_Signal#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Spezifisches_Signal#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Spezifisches_Signal()
 * @model extendedMetaData="name='CBUE_Spezifisches_Signal' kind='elementOnly'"
 * @generated
 */
public interface BUE_Spezifisches_Signal extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Signal, welches im Zusammenhang mit dem BÜ angeordnet wird. Es ist zu unterscheiden, ob das Signal zur BUE Anlage (z. B. ÜS, Pfeiftafel) oder zur BUE Einschaltung (z. B. Merktafel) gehört.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' containment reference.
	 * @see #setIDSignal(ID_Signal_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Spezifisches_Signal_IDSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	ID_Signal_TypeClass getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Spezifisches_Signal#getIDSignal <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal</em>' containment reference.
	 * @see #getIDSignal()
	 * @generated
	 */
	void setIDSignal(ID_Signal_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die BUE Anlage, für die das Signal angeordnet wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Anlage</em>' containment reference.
	 * @see #setIDBUEAnlage(ID_BUE_Anlage_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Spezifisches_Signal_IDBUEAnlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Anlage'"
	 * @generated
	 */
	ID_BUE_Anlage_TypeClass getIDBUEAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Spezifisches_Signal#getIDBUEAnlage <em>IDBUE Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Anlage</em>' containment reference.
	 * @see #getIDBUEAnlage()
	 * @generated
	 */
	void setIDBUEAnlage(ID_BUE_Anlage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDBUE Einschaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die BUE_Einschaltung, an der das Signal angeordnet wird (z.B. Tafel für die Markierung des Einschaltkontaktes). DB-Regelwerk SPU (Sammlung der Planunterlagen) 24 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Einschaltung</em>' containment reference.
	 * @see #setIDBUEEinschaltung(ID_BUE_Einschaltung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Spezifisches_Signal_IDBUEEinschaltung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Einschaltung'"
	 * @generated
	 */
	ID_BUE_Einschaltung_TypeClass getIDBUEEinschaltung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Spezifisches_Signal#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Einschaltung</em>' containment reference.
	 * @see #getIDBUEEinschaltung()
	 * @generated
	 */
	void setIDBUEEinschaltung(ID_BUE_Einschaltung_TypeClass value);

} // BUE_Spezifisches_Signal
