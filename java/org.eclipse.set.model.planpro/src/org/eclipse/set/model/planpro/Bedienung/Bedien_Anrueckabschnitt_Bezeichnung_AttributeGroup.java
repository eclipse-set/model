/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Anrueckabschnitt Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup#getBezBedAnrueckabschnitt <em>Bez Bed Anrueckabschnitt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CBedien_Anrueckabschnitt_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bez Bed Anrueckabschnitt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Bedien-Anrückabschnitts. Wenn ein Bedien_Anrueckabschnitt nicht verlinkt werden kann (beispielsweise weil er außerhalb des zu bearbeitenden Planungsdatensatzes liegt), wird als Ersatz die Bezeichnung des Gleisabschnitts gefüllt, dessen Belegung als Anrückmeldung in der Bedienoberfläche gespiegelt werden soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bez Bed Anrueckabschnitt</em>' containment reference.
	 * @see #setBezBedAnrueckabschnitt(Bez_Bed_Anrueckabschnitt_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup_BezBedAnrueckabschnitt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bez_Bed_Anrueckabschnitt'"
	 * @generated
	 */
	Bez_Bed_Anrueckabschnitt_TypeClass getBezBedAnrueckabschnitt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup#getBezBedAnrueckabschnitt <em>Bez Bed Anrueckabschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bez Bed Anrueckabschnitt</em>' containment reference.
	 * @see #getBezBedAnrueckabschnitt()
	 * @generated
	 */
	void setBezBedAnrueckabschnitt(Bez_Bed_Anrueckabschnitt_TypeClass value);

} // Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup
