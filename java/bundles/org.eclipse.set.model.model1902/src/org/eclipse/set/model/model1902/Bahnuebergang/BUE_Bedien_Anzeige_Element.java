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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Bedien Anzeige Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Objekt zur Definition der logischen Bedienfunktionen, die über Taster auf den BÜ einwirken. Es dient der Zuordnung der ausgewählten Bedienfunktionen zum BÜ bzw. zu den Ein-/Ausschaltungen des zugehörigen Gleises. Die Zuordnung zur physischen Unterbringung erfolgt über den Verweis auf Bedien Anzeige Element. DB-Regelwerk 819.1204 8 TM 2012 - 001 I.NVT 3 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anzeige_Element#getBUEBedienAnzElementAllg <em>BUE Bedien Anz Element Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Bedien_Anzeige_Element()
 * @model extendedMetaData="name='CBUE_Bedien_Anzeige_Element' kind='elementOnly'"
 * @generated
 */
public interface BUE_Bedien_Anzeige_Element extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>BUE Bedien Anz Element Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BUE Bedien Anz Element Allg</em>' containment reference.
	 * @see #setBUEBedienAnzElementAllg(BUE_Bedien_Anz_Element_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Bedien_Anzeige_Element_BUEBedienAnzElementAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BUE_Bedien_Anz_Element_Allg'"
	 * @generated
	 */
	BUE_Bedien_Anz_Element_Allg_AttributeGroup getBUEBedienAnzElementAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anzeige_Element#getBUEBedienAnzElementAllg <em>BUE Bedien Anz Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Bedien Anz Element Allg</em>' containment reference.
	 * @see #getBUEBedienAnzElementAllg()
	 * @generated
	 */
	void setBUEBedienAnzElementAllg(BUE_Bedien_Anz_Element_Allg_AttributeGroup value);

} // BUE_Bedien_Anzeige_Element
