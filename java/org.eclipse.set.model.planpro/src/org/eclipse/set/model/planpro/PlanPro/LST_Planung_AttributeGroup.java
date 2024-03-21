/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LST Planung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.LST_Planung_AttributeGroup#getFachdaten <em>Fachdaten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.LST_Planung_AttributeGroup#getObjektmanagement <em>Objektmanagement</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getLST_Planung_AttributeGroup()
 * @model extendedMetaData="name='CLST_Planung' kind='elementOnly'"
 * @generated
 */
public interface LST_Planung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Fachdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einbindung der LST-Fachdaten.
	 * DB Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro-Planungsprozess.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fachdaten</em>' containment reference.
	 * @see #setFachdaten(Fachdaten_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getLST_Planung_AttributeGroup_Fachdaten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fachdaten'"
	 * @generated
	 */
	Fachdaten_AttributeGroup getFachdaten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.LST_Planung_AttributeGroup#getFachdaten <em>Fachdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fachdaten</em>' containment reference.
	 * @see #getFachdaten()
	 * @generated
	 */
	void setFachdaten(Fachdaten_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Objektmanagement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einbindung der Objektmanagementdaten.
	 * DB Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro-Planungsprozess.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objektmanagement</em>' containment reference.
	 * @see #setObjektmanagement(Objektmanagement_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getLST_Planung_AttributeGroup_Objektmanagement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Objektmanagement'"
	 * @generated
	 */
	Objektmanagement_AttributeGroup getObjektmanagement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.LST_Planung_AttributeGroup#getObjektmanagement <em>Objektmanagement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objektmanagement</em>' containment reference.
	 * @see #getObjektmanagement()
	 * @generated
	 */
	void setObjektmanagement(Objektmanagement_AttributeGroup value);

} // LST_Planung_AttributeGroup
