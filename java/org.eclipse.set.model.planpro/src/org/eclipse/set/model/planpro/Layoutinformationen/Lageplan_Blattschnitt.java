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

import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lageplan Blattschnitt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Teil des Lageplans, der auf einem Blatt dargestellt wird.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt#getPolygonzugAusrichtung <em>Polygonzug Ausrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt#getPolygonzugBlattschnitt <em>Polygonzug Blattschnitt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getLageplan_Blattschnitt()
 * @model extendedMetaData="name='CLageplan_Blattschnitt' kind='elementOnly'"
 * @generated
 */
public interface Lageplan_Blattschnitt extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Lageplan_Blattschnitt_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getLageplan_Blattschnitt_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Lageplan_Blattschnitt_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Lageplan_Blattschnitt_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Polygonzug Ausrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Polygonzug zur Ausrichtung des Blattschnitts unter Nutzung des GML-Standards. Es sind nur zwei Stützpunkte anzugeben. Die damit beschriebene Linie dient der Ausrichtung des Blattschnitts an der waagerechten Blattkante. Die Reihenfolge der Stützpunkte bestimmt die Richtung der Darstellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polygonzug Ausrichtung</em>' containment reference.
	 * @see #setPolygonzugAusrichtung(Polygonzug_Ausrichtung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getLageplan_Blattschnitt_PolygonzugAusrichtung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Polygonzug_Ausrichtung'"
	 * @generated
	 */
	Polygonzug_Ausrichtung_TypeClass getPolygonzugAusrichtung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt#getPolygonzugAusrichtung <em>Polygonzug Ausrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygonzug Ausrichtung</em>' containment reference.
	 * @see #getPolygonzugAusrichtung()
	 * @generated
	 */
	void setPolygonzugAusrichtung(Polygonzug_Ausrichtung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Polygonzug Blattschnitt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Polygonzug zur Beschreibung des Blattschnitts unter Nutzung des GML-Standards.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polygonzug Blattschnitt</em>' containment reference.
	 * @see #setPolygonzugBlattschnitt(Polygonzug_Blattschnitt_TypeClass)
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getLageplan_Blattschnitt_PolygonzugBlattschnitt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Polygonzug_Blattschnitt'"
	 * @generated
	 */
	Polygonzug_Blattschnitt_TypeClass getPolygonzugBlattschnitt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt#getPolygonzugBlattschnitt <em>Polygonzug Blattschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygonzug Blattschnitt</em>' containment reference.
	 * @see #getPolygonzugBlattschnitt()
	 * @generated
	 */
	void setPolygonzugBlattschnitt(Polygonzug_Blattschnitt_TypeClass value);

} // Lageplan_Blattschnitt
