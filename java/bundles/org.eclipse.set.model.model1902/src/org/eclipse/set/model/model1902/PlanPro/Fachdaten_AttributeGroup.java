/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fachdaten Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Fachdaten_AttributeGroup#getAusgabeFachdaten <em>Ausgabe Fachdaten</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getFachdaten_AttributeGroup()
 * @model extendedMetaData="name='CFachdaten' kind='elementOnly'"
 * @generated
 */
public interface Fachdaten_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Ausgabe Fachdaten</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.PlanPro.Ausgabe_Fachdaten}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einbindung der konkreten Lieferung von LST-Fachdaten.\n\nDB Regelwerk\nBisher keine Abbildung, da Neuerung mit PlanPro-Planungsprozess.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ausgabe Fachdaten</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getFachdaten_AttributeGroup_AusgabeFachdaten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ausgabe_Fachdaten'"
	 * @generated
	 */
	EList<Ausgabe_Fachdaten> getAusgabeFachdaten();

} // Fachdaten_AttributeGroup
