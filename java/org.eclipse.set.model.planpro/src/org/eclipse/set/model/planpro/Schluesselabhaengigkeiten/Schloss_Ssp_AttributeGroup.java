/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Schluesselabhaengigkeiten;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_Schluesselsperre_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schloss Ssp Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup#getIDSchluesselsperre <em>ID Schluesselsperre</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Ssp_AttributeGroup()
 * @model extendedMetaData="name='CSchloss_Ssp' kind='elementOnly'"
 * @generated
 */
public interface Schloss_Ssp_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Schluesselsperre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Schlüsselsperre, in der sich das Schloss befindet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Schluesselsperre</em>' containment reference.
	 * @see #setIDSchluesselsperre(ID_Schluesselsperre_TypeClass)
	 * @see org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Ssp_AttributeGroup_IDSchluesselsperre()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Schluesselsperre'"
	 * @generated
	 */
	ID_Schluesselsperre_TypeClass getIDSchluesselsperre();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup#getIDSchluesselsperre <em>ID Schluesselsperre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Schluesselsperre</em>' containment reference.
	 * @see #getIDSchluesselsperre()
	 * @generated
	 */
	void setIDSchluesselsperre(ID_Schluesselsperre_TypeClass value);

} // Schloss_Ssp_AttributeGroup
