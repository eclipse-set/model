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
 * A representation of the model object '<em><b>GFR Element Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.GFR_Element_Bezeichnung_AttributeGroup#getBezeichnungGFRElement <em>Bezeichnung GFR Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getGFR_Element_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CGFR_Element_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface GFR_Element_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung GFR Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des GFR-Elements (Detektors).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung GFR Element</em>' containment reference.
	 * @see #setBezeichnungGFRElement(Bezeichnung_GFR_Element_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getGFR_Element_Bezeichnung_AttributeGroup_BezeichnungGFRElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_GFR_Element'"
	 * @generated
	 */
	Bezeichnung_GFR_Element_TypeClass getBezeichnungGFRElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.GFR_Element_Bezeichnung_AttributeGroup#getBezeichnungGFRElement <em>Bezeichnung GFR Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung GFR Element</em>' containment reference.
	 * @see #getBezeichnungGFRElement()
	 * @generated
	 */
	void setBezeichnungGFRElement(Bezeichnung_GFR_Element_TypeClass value);

} // GFR_Element_Bezeichnung_AttributeGroup
