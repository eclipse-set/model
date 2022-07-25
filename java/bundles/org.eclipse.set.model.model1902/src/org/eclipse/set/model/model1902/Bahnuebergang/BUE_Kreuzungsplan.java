/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Anhang_ohne_Proxy_TypeClass;

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
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan#getBUEKreuzungsplanKoordinaten <em>BUE Kreuzungsplan Koordinaten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan#getIDAnhangKreuzungsplan <em>ID Anhang Kreuzungsplan</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan()
 * @model extendedMetaData="name='CBUE_Kreuzungsplan' kind='elementOnly'"
 * @generated
 */
public interface BUE_Kreuzungsplan extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>BUE Kreuzungsplan Koordinaten</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BUE Kreuzungsplan Koordinaten</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan_BUEKreuzungsplanKoordinaten()
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
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan_IDAnhangKreuzungsplan()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Kreuzungsplan'"
	 * @generated
	 */
	ID_Anhang_ohne_Proxy_TypeClass getIDAnhangKreuzungsplan();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan#getIDAnhangKreuzungsplan <em>ID Anhang Kreuzungsplan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Kreuzungsplan</em>' containment reference.
	 * @see #getIDAnhangKreuzungsplan()
	 * @generated
	 */
	void setIDAnhangKreuzungsplan(ID_Anhang_ohne_Proxy_TypeClass value);

} // BUE_Kreuzungsplan
