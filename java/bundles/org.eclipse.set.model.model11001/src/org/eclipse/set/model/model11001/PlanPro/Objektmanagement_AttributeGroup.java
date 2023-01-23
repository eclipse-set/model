/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.PlanPro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objektmanagement Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.PlanPro.Objektmanagement_AttributeGroup#getLSTPlanungProjekt <em>LST Planung Projekt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.PlanPro.PlanProPackage#getObjektmanagement_AttributeGroup()
 * @model extendedMetaData="name='CObjektmanagement' kind='elementOnly'"
 * @generated
 */
public interface Objektmanagement_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>LST Planung Projekt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.PlanPro.Planung_Projekt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einbindung der konkreten Objektmanagementdaten der Ebene Planung_Projekt.
	 * DB Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro-Planungsprozess.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LST Planung Projekt</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.PlanPro.PlanProPackage#getObjektmanagement_AttributeGroup_LSTPlanungProjekt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LST_Planung_Projekt'"
	 * @generated
	 */
	EList<Planung_Projekt> getLSTPlanungProjekt();

} // Objektmanagement_AttributeGroup
