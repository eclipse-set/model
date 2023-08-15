/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Layoutinformationen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_Lageplan_Zustand_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Objekt zur Angabe von Positionsinformationen für ein LST-Objekt bezogen auf einen Lageplan.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Position#getElementPositionAllg <em>Element Position Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Position#getIDLageplanZustand <em>ID Lageplan Zustand</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Position#getReferenzObjektDarstellung <em>Referenz Objekt Darstellung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage#getElement_Position()
 * @model extendedMetaData="name='CElement_Position' kind='elementOnly'"
 * @generated
 */
public interface Element_Position extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Element Position Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Position Allg</em>' containment reference.
	 * @see #setElementPositionAllg(Element_Position_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage#getElement_Position_ElementPositionAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Element_Position_Allg'"
	 * @generated
	 */
	Element_Position_Allg_AttributeGroup getElementPositionAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Position#getElementPositionAllg <em>Element Position Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Position Allg</em>' containment reference.
	 * @see #getElementPositionAllg()
	 * @generated
	 */
	void setElementPositionAllg(Element_Position_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Lageplan Zustand</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_Lageplan_Zustand_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Lageplan-Zustand, für den die Layoutinformation definiert wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Lageplan Zustand</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage#getElement_Position_IDLageplanZustand()
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
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage#getElement_Position_ReferenzObjektDarstellung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Referenz_Objekt_Darstellung'"
	 * @generated
	 */
	Referenz_Objekt_Darstellung_TypeClass getReferenzObjektDarstellung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Position#getReferenzObjektDarstellung <em>Referenz Objekt Darstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenz Objekt Darstellung</em>' containment reference.
	 * @see #getReferenzObjektDarstellung()
	 * @generated
	 */
	void setReferenzObjektDarstellung(Referenz_Objekt_Darstellung_TypeClass value);

} // Element_Position
