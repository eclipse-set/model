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

import org.eclipse.set.model.model11001.Verweise.ID_GFR_Anlage_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Unterbringung_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GFR Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Detektor der GFR-Anlage (z. B. Radar). Elemente für eine Kamera-Überwachung sind  Bestandteil TK-Ausrüstung und werden daher nicht abgebildet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.GFR_Element#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.GFR_Element#getIDGFRAnlage <em>IDGFR Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.GFR_Element#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.GFR_Element#getBUENeigung <em>BUE Neigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.GFR_Element#getGFRNeigung <em>GFR Neigung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getGFR_Element()
 * @model extendedMetaData="name='CGFR_Element' kind='elementOnly'"
 * @generated
 */
public interface GFR_Element extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(GFR_Element_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getGFR_Element_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	GFR_Element_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.GFR_Element#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(GFR_Element_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDGFR Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige GFR_Anlage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGFR Anlage</em>' containment reference.
	 * @see #setIDGFRAnlage(ID_GFR_Anlage_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getGFR_Element_IDGFRAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_GFR_Anlage'"
	 * @generated
	 */
	ID_GFR_Anlage_ohne_Proxy_TypeClass getIDGFRAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.GFR_Element#getIDGFRAnlage <em>IDGFR Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGFR Anlage</em>' containment reference.
	 * @see #getIDGFRAnlage()
	 * @generated
	 */
	void setIDGFRAnlage(ID_GFR_Anlage_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf eine Unterbringung zur Angabe von Position und Befestigungsart des Detektors der GFR-Anlage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #setIDUnterbringung(ID_Unterbringung_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getGFR_Element_IDUnterbringung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	ID_Unterbringung_ohne_Proxy_TypeClass getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.GFR_Element#getIDUnterbringung <em>ID Unterbringung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(ID_Unterbringung_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>BUE Neigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Neigung des BÜ in Bezug auf die Waagerechte in der Achse Detektor - gegenüberliegender Eckpunkt des Gefahrraums.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Neigung</em>' containment reference.
	 * @see #setBUENeigung(BUE_Neigung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getGFR_Element_BUENeigung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Neigung'"
	 * @generated
	 */
	BUE_Neigung_TypeClass getBUENeigung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.GFR_Element#getBUENeigung <em>BUE Neigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Neigung</em>' containment reference.
	 * @see #getBUENeigung()
	 * @generated
	 */
	void setBUENeigung(BUE_Neigung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GFR Neigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Neigung des GFR-Elements (Detektors) bezogen auf die Senkrechte in Grad.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GFR Neigung</em>' containment reference.
	 * @see #setGFRNeigung(GFR_Neigung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getGFR_Element_GFRNeigung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GFR_Neigung'"
	 * @generated
	 */
	GFR_Neigung_TypeClass getGFRNeigung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.GFR_Element#getGFRNeigung <em>GFR Neigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GFR Neigung</em>' containment reference.
	 * @see #getGFRNeigung()
	 * @generated
	 */
	void setGFRNeigung(GFR_Neigung_TypeClass value);

} // GFR_Element
