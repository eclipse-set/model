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

import org.eclipse.set.model.model1902.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GFR Anlage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Gerfahrraumfreimeldeanlage. Folgende Rahmenbedingungen sind für den Einsatz einer GFR zu beachten: max. Höhe der Bodenwellen des BÜ: 15 cm; max. Neigung des BÜ: 2°.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage#getGFRAnlageAllg <em>GFR Anlage Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getGFR_Anlage()
 * @model extendedMetaData="name='CGFR_Anlage' kind='elementOnly'"
 * @generated
 */
public interface GFR_Anlage extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>GFR Anlage Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GFR Anlage Allg</em>' containment reference.
	 * @see #setGFRAnlageAllg(GFR_Anlage_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getGFR_Anlage_GFRAnlageAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GFR_Anlage_Allg'"
	 * @generated
	 */
	GFR_Anlage_Allg_AttributeGroup getGFRAnlageAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage#getGFRAnlageAllg <em>GFR Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GFR Anlage Allg</em>' containment reference.
	 * @see #getGFRAnlageAllg()
	 * @generated
	 */
	void setGFRAnlageAllg(GFR_Anlage_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige BÜ-Anlage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Anlage</em>' containment reference.
	 * @see #setIDBUEAnlage(ID_BUE_Anlage_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getGFR_Anlage_IDBUEAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Anlage'"
	 * @generated
	 */
	ID_BUE_Anlage_ohne_Proxy_TypeClass getIDBUEAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage#getIDBUEAnlage <em>IDBUE Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Anlage</em>' containment reference.
	 * @see #getIDBUEAnlage()
	 * @generated
	 */
	void setIDBUEAnlage(ID_BUE_Anlage_ohne_Proxy_TypeClass value);

} // GFR_Anlage
