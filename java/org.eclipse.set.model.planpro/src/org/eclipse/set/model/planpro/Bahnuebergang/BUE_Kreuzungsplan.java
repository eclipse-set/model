/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Anhang_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Kreuzungsplan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Verortungspunkte des für die BÜ-Planung verwendeten bautechnischen BÜ-Kreuzungsplans. Sofern der Anhang nicht als GeoTiff vorliegt, sind mindestens 2 Verortungspunkte anzugeben.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan#getBUEKreuzungsplanKoordinaten <em>BUE Kreuzungsplan Koordinaten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan#getIDAnhangKreuzungsplan <em>ID Anhang Kreuzungsplan</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan()
 * @model extendedMetaData="name='CBUE_Kreuzungsplan' kind='elementOnly'"
 * @generated
 */
public interface BUE_Kreuzungsplan extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>BUE Kreuzungsplan Koordinaten</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BUE Kreuzungsplan Koordinaten</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan_BUEKreuzungsplanKoordinaten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Kreuzungsplan_Koordinaten'"
	 * @generated
	 */
	EList<BUE_Kreuzungsplan_Koordinaten_AttributeGroup> getBUEKreuzungsplanKoordinaten();

	/**
	 * Returns the value of the '<em><b>ID Anhang Kreuzungsplan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den einzubindenden bautechnischen BÜ-Kreuzungsplan als Bild.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Kreuzungsplan</em>' containment reference.
	 * @see #setIDAnhangKreuzungsplan(ID_Anhang_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan_IDAnhangKreuzungsplan()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Kreuzungsplan'"
	 * @generated
	 */
	ID_Anhang_ohne_Proxy_TypeClass getIDAnhangKreuzungsplan();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan#getIDAnhangKreuzungsplan <em>ID Anhang Kreuzungsplan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Kreuzungsplan</em>' containment reference.
	 * @see #getIDAnhangKreuzungsplan()
	 * @generated
	 */
	void setIDAnhangKreuzungsplan(ID_Anhang_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die für die Ausgabe des Kreuzungsplans relevante BÜ-Anlage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Anlage</em>' containment reference.
	 * @see #setIDBUEAnlage(ID_BUE_Anlage_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan_IDBUEAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Anlage'"
	 * @generated
	 */
	ID_BUE_Anlage_ohne_Proxy_TypeClass getIDBUEAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan#getIDBUEAnlage <em>IDBUE Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Anlage</em>' containment reference.
	 * @see #getIDBUEAnlage()
	 * @generated
	 */
	void setIDBUEAnlage(ID_BUE_Anlage_ohne_Proxy_TypeClass value);

} // BUE_Kreuzungsplan
