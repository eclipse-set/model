/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Layoutinformationen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Zustand_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Stil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Objekt zur Angabe von Darstellungsvorgaben (z. B. Linienart) für ein LST-Objekt bezogen auf einen Lageplan.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil#getElementStilAllg <em>Element Stil Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil#getIDLageplanZustand <em>ID Lageplan Zustand</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil#getReferenzObjektDarstellung <em>Referenz Objekt Darstellung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getElement_Stil()
 * @model extendedMetaData="name='CElement_Stil' kind='elementOnly'"
 * @generated
 */
public interface Element_Stil extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Element Stil Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Stil Allg</em>' containment reference.
	 * @see #setElementStilAllg(Element_Stil_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getElement_Stil_ElementStilAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Element_Stil_Allg'"
	 * @generated
	 */
	Element_Stil_Allg_AttributeGroup getElementStilAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil#getElementStilAllg <em>Element Stil Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Stil Allg</em>' containment reference.
	 * @see #getElementStilAllg()
	 * @generated
	 */
	void setElementStilAllg(Element_Stil_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Lageplan Zustand</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Zustand_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Lageplan-Zustand, für den die Layoutinformation definiert wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Lageplan Zustand</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getElement_Stil_IDLageplanZustand()
	 * @model containment="true" required="true" upper="2"
	 *        extendedMetaData="kind='element' name='ID_Lageplan_Zustand'"
	 * @generated
	 */
	EList<ID_Lageplan_Zustand_TypeClass> getIDLageplanZustand();

	/**
	 * Returns the value of the '<em><b>Referenz Objekt Darstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GUID des Fachobjekts, für dessen Darstellung die Layoutinformationen gegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenz Objekt Darstellung</em>' containment reference.
	 * @see #setReferenzObjektDarstellung(Referenz_Objekt_Darstellung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getElement_Stil_ReferenzObjektDarstellung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Referenz_Objekt_Darstellung'"
	 * @generated
	 */
	Referenz_Objekt_Darstellung_TypeClass getReferenzObjektDarstellung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil#getReferenzObjektDarstellung <em>Referenz Objekt Darstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenz Objekt Darstellung</em>' containment reference.
	 * @see #getReferenzObjektDarstellung()
	 * @generated
	 */
	void setReferenzObjektDarstellung(Referenz_Objekt_Darstellung_TypeClass value);

} // Element_Stil
