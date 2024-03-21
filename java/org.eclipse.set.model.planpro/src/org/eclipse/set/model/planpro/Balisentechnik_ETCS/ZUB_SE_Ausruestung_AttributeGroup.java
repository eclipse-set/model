/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZUB SE Ausruestung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_SE_Ausruestung_AttributeGroup#getAnwendungssystem <em>Anwendungssystem</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_SE_Ausruestung_AttributeGroup#getBaselineSystemVersion <em>Baseline System Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_SE_Ausruestung_AttributeGroup()
 * @model extendedMetaData="name='CZUB_SE_Ausruestung' kind='elementOnly'"
 * @generated
 */
public interface ZUB_SE_Ausruestung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Anwendungssystem</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anwendungssystem_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anwendungssystem(e), mit dem/denen der Streckenbereich ausgerüstet ist. Bei L2: Das zugehörige RBC kann über die ETCS-Kanten ermittelt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anwendungssystem</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_SE_Ausruestung_AttributeGroup_Anwendungssystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Anwendungssystem'"
	 * @generated
	 */
	EList<Anwendungssystem_TypeClass> getAnwendungssystem();

	/**
	 * Returns the value of the '<em><b>Baseline System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Baseline der System-Version, z. B. B3R2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Baseline System Version</em>' containment reference.
	 * @see #setBaselineSystemVersion(Baseline_System_Version_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_SE_Ausruestung_AttributeGroup_BaselineSystemVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Baseline_System_Version'"
	 * @generated
	 */
	Baseline_System_Version_TypeClass getBaselineSystemVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_SE_Ausruestung_AttributeGroup#getBaselineSystemVersion <em>Baseline System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baseline System Version</em>' containment reference.
	 * @see #getBaselineSystemVersion()
	 * @generated
	 */
	void setBaselineSystemVersion(Baseline_System_Version_TypeClass value);

} // ZUB_SE_Ausruestung_AttributeGroup
