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

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Anlage Strasse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Straßenbezogene Angaben zur BUE_Anlage, die im Wesentlichen im Rahmen der bautechnischen Planung benötigt werden. Die Themen Längsneigung und Ausrundungshalbmesser werden aufgrund der Vielzahl notwendiger Angaben nicht im Modell abgebildet (separate Betrachtung erforderlich).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Anlage_Strasse#getBUEAnlageFussRad <em>BUE Anlage Fuss Rad</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Anlage_Strasse#getBUEAnlageStrasseAllg <em>BUE Anlage Strasse Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Anlage_Strasse#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Strasse()
 * @model extendedMetaData="name='CBUE_Anlage_Strasse' kind='elementOnly'"
 * @generated
 */
public interface BUE_Anlage_Strasse extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>BUE Anlage Fuss Rad</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Anlage_Fuss_Rad_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BUE Anlage Fuss Rad</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Strasse_BUEAnlageFussRad()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Anlage_Fuss_Rad'"
	 * @generated
	 */
	EList<BUE_Anlage_Fuss_Rad_AttributeGroup> getBUEAnlageFussRad();

	/**
	 * Returns the value of the '<em><b>BUE Anlage Strasse Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BUE Anlage Strasse Allg</em>' containment reference.
	 * @see #setBUEAnlageStrasseAllg(BUE_Anlage_Strasse_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Strasse_BUEAnlageStrasseAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BUE_Anlage_Strasse_Allg'"
	 * @generated
	 */
	BUE_Anlage_Strasse_Allg_AttributeGroup getBUEAnlageStrasseAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Anlage_Strasse#getBUEAnlageStrasseAllg <em>BUE Anlage Strasse Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Anlage Strasse Allg</em>' containment reference.
	 * @see #getBUEAnlageStrasseAllg()
	 * @generated
	 */
	void setBUEAnlageStrasseAllg(BUE_Anlage_Strasse_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige BÜ-Anlage
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Anlage</em>' containment reference.
	 * @see #setIDBUEAnlage(ID_BUE_Anlage_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Strasse_IDBUEAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Anlage'"
	 * @generated
	 */
	ID_BUE_Anlage_ohne_Proxy_TypeClass getIDBUEAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Anlage_Strasse#getIDBUEAnlage <em>IDBUE Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Anlage</em>' containment reference.
	 * @see #getIDBUEAnlage()
	 * @generated
	 */
	void setIDBUEAnlage(ID_BUE_Anlage_ohne_Proxy_TypeClass value);

} // BUE_Anlage_Strasse
