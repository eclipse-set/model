/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zuglenkung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL ZN Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_ZN_AttributeGroup#getLenkziffernstellen <em>Lenkziffernstellen</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_ZN_AttributeGroup#getZNStellen <em>ZN Stellen</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_ZN_AttributeGroup()
 * @model extendedMetaData="name='CZL_ZN' kind='elementOnly'"
 * @generated
 */
public interface ZL_ZN_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Lenkziffernstellen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stellen der Lenkziffern. Die Angabe ist notwendig, wenn die ZN bereits vorhanden ist und nicht neu geplant wird. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lenkziffernstellen</em>' containment reference.
	 * @see #setLenkziffernstellen(Lenkziffernstellen_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_ZN_AttributeGroup_Lenkziffernstellen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Lenkziffernstellen'"
	 * @generated
	 */
	Lenkziffernstellen_TypeClass getLenkziffernstellen();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_ZN_AttributeGroup#getLenkziffernstellen <em>Lenkziffernstellen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lenkziffernstellen</em>' containment reference.
	 * @see #getLenkziffernstellen()
	 * @generated
	 */
	void setLenkziffernstellen(Lenkziffernstellen_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZN Stellen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stellen der ZN. Die Angabe ist notwendig, wenn die ZN bereits vorhanden ist und nicht neu geplant wird. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht zu finden. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZN Stellen</em>' containment reference.
	 * @see #setZNStellen(ZN_Stellen_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_ZN_AttributeGroup_ZNStellen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_Stellen'"
	 * @generated
	 */
	ZN_Stellen_TypeClass getZNStellen();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_ZN_AttributeGroup#getZNStellen <em>ZN Stellen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Stellen</em>' containment reference.
	 * @see #getZNStellen()
	 * @generated
	 */
	void setZNStellen(ZN_Stellen_TypeClass value);

} // ZL_ZN_AttributeGroup
