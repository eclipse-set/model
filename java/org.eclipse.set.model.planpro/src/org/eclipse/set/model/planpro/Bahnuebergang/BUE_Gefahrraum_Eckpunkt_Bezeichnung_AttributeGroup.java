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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Gefahrraum Eckpunkt Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup#getBezeichnungBUEGFREckpunkt <em>Bezeichnung BUEGFR Eckpunkt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CBUE_Gefahrraum_Eckpunkt_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung BUEGFR Eckpunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des BÜ-Gefahrraum-Eckpunkts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung BUEGFR Eckpunkt</em>' containment reference.
	 * @see #setBezeichnungBUEGFREckpunkt(Bezeichnung_BUE_GFR_Eckpunkt_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup_BezeichnungBUEGFREckpunkt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_BUE_GFR_Eckpunkt'"
	 * @generated
	 */
	Bezeichnung_BUE_GFR_Eckpunkt_TypeClass getBezeichnungBUEGFREckpunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup#getBezeichnungBUEGFREckpunkt <em>Bezeichnung BUEGFR Eckpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung BUEGFR Eckpunkt</em>' containment reference.
	 * @see #getBezeichnungBUEGFREckpunkt()
	 * @generated
	 */
	void setBezeichnungBUEGFREckpunkt(Bezeichnung_BUE_GFR_Eckpunkt_TypeClass value);

} // BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup
