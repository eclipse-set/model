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

import org.eclipse.set.model.model11001.Verweise.ID_Lageplan_Blattschnitt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lageplan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Plan, der maßstäblich oder unmaßstäblich die Lage von LST-Objekten zeigt. Beispiel: Sicherungstechnischer Lageplan. Bei Planungen wird für Start- und Zielzustand je eine Instanz von Lageplan erzeugt. Zu einem Lageplan ist mindestens ein Blattschnitt zu definieren.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan#getIDLageplanBlattschnitt <em>ID Lageplan Blattschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan#getLageplanArt <em>Lageplan Art</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage#getLageplan()
 * @model extendedMetaData="name='CLageplan' kind='elementOnly'"
 * @generated
 */
public interface Lageplan extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Lageplan_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage#getLageplan_Bezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Lageplan_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Lageplan_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Lageplan Blattschnitt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_Lageplan_Blattschnitt_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den zum Lageplan gehörenden Blattschnitt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Lageplan Blattschnitt</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage#getLageplan_IDLageplanBlattschnitt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Lageplan_Blattschnitt'"
	 * @generated
	 */
	EList<ID_Lageplan_Blattschnitt_TypeClass> getIDLageplanBlattschnitt();

	/**
	 * Returns the value of the '<em><b>Lageplan Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Ausgabeformats (Plan), dem die Layoutinformationen zugeordnet werden. Beispiel: Sicherungstechnischer Lageplan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lageplan Art</em>' containment reference.
	 * @see #setLageplanArt(Lageplan_Art_TypeClass)
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage#getLageplan_LageplanArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Lageplan_Art'"
	 * @generated
	 */
	Lageplan_Art_TypeClass getLageplanArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan#getLageplanArt <em>Lageplan Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lageplan Art</em>' containment reference.
	 * @see #getLageplanArt()
	 * @generated
	 */
	void setLageplanArt(Lageplan_Art_TypeClass value);

} // Lageplan
