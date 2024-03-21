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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_Ur_Objekt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LST Objekte Planungsbereich Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.LST_Objekte_Planungsbereich_AttributeGroup#getIDLSTObjektPlanungsbereich <em>IDLST Objekt Planungsbereich</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getLST_Objekte_Planungsbereich_AttributeGroup()
 * @model extendedMetaData="name='CLST_Objekte_Planungsbereich' kind='elementOnly'"
 * @generated
 */
public interface LST_Objekte_Planungsbereich_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>IDLST Objekt Planungsbereich</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Verweise.ID_Ur_Objekt_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID-Verweis auf LST-Objekt im Planungsbereich.
	 * DB-Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro.
	 * Implizite Zuordnung durch Blattzuschnitte der (gesperrten) Bestandspläne zur Erstellung der Planung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDLST Objekt Planungsbereich</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getLST_Objekte_Planungsbereich_AttributeGroup_IDLSTObjektPlanungsbereich()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_LST_Objekt_Planungsbereich'"
	 * @generated
	 */
	EList<ID_Ur_Objekt_TypeClass> getIDLSTObjektPlanungsbereich();

} // LST_Objekte_Planungsbereich_AttributeGroup
