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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GFR Tripelspiegel Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.GFR_Tripelspiegel_Bezeichnung_AttributeGroup#getBezeichnungGFRTripelspiegel <em>Bezeichnung GFR Tripelspiegel</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getGFR_Tripelspiegel_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CGFR_Tripelspiegel_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface GFR_Tripelspiegel_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung GFR Tripelspiegel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Tripelspiegels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung GFR Tripelspiegel</em>' containment reference.
	 * @see #setBezeichnungGFRTripelspiegel(Bezeichnung_GFR_Tripelspiegel_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getGFR_Tripelspiegel_Bezeichnung_AttributeGroup_BezeichnungGFRTripelspiegel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_GFR_Tripelspiegel'"
	 * @generated
	 */
	Bezeichnung_GFR_Tripelspiegel_TypeClass getBezeichnungGFRTripelspiegel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.GFR_Tripelspiegel_Bezeichnung_AttributeGroup#getBezeichnungGFRTripelspiegel <em>Bezeichnung GFR Tripelspiegel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung GFR Tripelspiegel</em>' containment reference.
	 * @see #getBezeichnungGFRTripelspiegel()
	 * @generated
	 */
	void setBezeichnungGFRTripelspiegel(Bezeichnung_GFR_Tripelspiegel_TypeClass value);

} // GFR_Tripelspiegel_Bezeichnung_AttributeGroup
