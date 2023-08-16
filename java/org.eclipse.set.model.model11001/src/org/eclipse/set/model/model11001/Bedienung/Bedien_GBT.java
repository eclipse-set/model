/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Bedien_Bezirk_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien GBT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Planung aller Parameter, die für die Darstellung der Gleisbenutzungstabelle (GBT) auf dem Bedienplatz für den Nutzer erforderlich sind.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_GBT#getBedienGBTAllg <em>Bedien GBT Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_GBT#getIDAnhangVorgabeGBT <em>ID Anhang Vorgabe GBT</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_GBT#getIDBedienBezirk <em>ID Bedien Bezirk</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_GBT()
 * @model extendedMetaData="name='CBedien_GBT' kind='elementOnly'"
 * @generated
 */
public interface Bedien_GBT extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bedien GBT Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedien GBT Allg</em>' containment reference.
	 * @see #setBedienGBTAllg(Bedien_GBT_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_GBT_BedienGBTAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedien_GBT_Allg'"
	 * @generated
	 */
	Bedien_GBT_Allg_AttributeGroup getBedienGBTAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_GBT#getBedienGBTAllg <em>Bedien GBT Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedien GBT Allg</em>' containment reference.
	 * @see #getBedienGBTAllg()
	 * @generated
	 */
	void setBedienGBTAllg(Bedien_GBT_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Anhang Vorgabe GBT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anhang mit Parametern für die Anzahl und Anordnung der Zuglenkbetriebsstellen in der Gleisbenutzungstabelle (GBT). Die konkreten Inhalte werden derzeit abgestimmt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Vorgabe GBT</em>' containment reference.
	 * @see #setIDAnhangVorgabeGBT(ID_Anhang_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_GBT_IDAnhangVorgabeGBT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Vorgabe_GBT'"
	 * @generated
	 */
	ID_Anhang_TypeClass getIDAnhangVorgabeGBT();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_GBT#getIDAnhangVorgabeGBT <em>ID Anhang Vorgabe GBT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Vorgabe GBT</em>' containment reference.
	 * @see #getIDAnhangVorgabeGBT()
	 * @generated
	 */
	void setIDAnhangVorgabeGBT(ID_Anhang_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Bedien Bezirk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Eigenschaften der Gleisbelegungstabelle als Element der Bedienoberfläche werden derzeit noch modelliert. Deshalb erfolgt eine Beschreibung aller damit zusammenhängender Eigenschaften und Verweise erst nach Abschluss dieser Konsolidierungsphase. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Bezirk</em>' containment reference.
	 * @see #setIDBedienBezirk(ID_Bedien_Bezirk_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_GBT_IDBedienBezirk()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Bezirk'"
	 * @generated
	 */
	ID_Bedien_Bezirk_TypeClass getIDBedienBezirk();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_GBT#getIDBedienBezirk <em>ID Bedien Bezirk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bedien Bezirk</em>' containment reference.
	 * @see #getIDBedienBezirk()
	 * @generated
	 */
	void setIDBedienBezirk(ID_Bedien_Bezirk_TypeClass value);

} // Bedien_GBT
