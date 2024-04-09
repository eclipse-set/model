/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PZB;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PZB Element Zuordnung INA Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDAnhangINA <em>ID Anhang INA</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getPZB_Element_Zuordnung_INA_AttributeGroup()
 * @model extendedMetaData="name='CPZB_Element_Zuordnung_INA' kind='elementOnly'"
 * @generated
 */
public interface PZB_Element_Zuordnung_INA_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Anhang INA</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörigen Dokumente zur INA-Berechnung. Dazu gehören Erhebungsbogen, Wirkbereichsbogen und ggf. die Berechnungsblätter selbst. Diese werden für jedes Signal gesondert erstellt. DB-Regelwerk 819.1310A02 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang INA</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getPZB_Element_Zuordnung_INA_AttributeGroup_IDAnhangINA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_INA'"
	 * @generated
	 */
	EList<ID_Anhang_TypeClass> getIDAnhangINA();

	/**
	 * Returns the value of the '<em><b>ID Bahnsteig Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID der zugehörigen Bahnsteigkante bezogen auf ein Signal mit INA-Berechnung. Der Fall, dass zwei separate Bahnsteige zwischen Vor- und Hauptsignal angeordnet sind, wird nicht angenommen. Aus der bisherigen Praxis sind keine solchen Fälle bekannt. DB-Regelwerk 819.1310A02 2 (1) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bahnsteig Kante</em>' containment reference.
	 * @see #setIDBahnsteigKante(ID_Bahnsteig_Kante_TypeClass)
	 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getPZB_Element_Zuordnung_INA_AttributeGroup_IDBahnsteigKante()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bahnsteig_Kante'"
	 * @generated
	 */
	ID_Bahnsteig_Kante_TypeClass getIDBahnsteigKante();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bahnsteig Kante</em>' containment reference.
	 * @see #getIDBahnsteigKante()
	 * @generated
	 */
	void setIDBahnsteigKante(ID_Bahnsteig_Kante_TypeClass value);

} // PZB_Element_Zuordnung_INA_AttributeGroup
