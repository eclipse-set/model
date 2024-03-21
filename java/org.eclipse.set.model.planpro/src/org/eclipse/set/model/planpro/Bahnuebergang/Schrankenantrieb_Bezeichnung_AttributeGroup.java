/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schrankenantrieb Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Schrankenantrieb_Bezeichnung_AttributeGroup#getBezSchrankenantrieb <em>Bez Schrankenantrieb</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getSchrankenantrieb_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CSchrankenantrieb_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Schrankenantrieb_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bez Schrankenantrieb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Schrankenantriebs, z. B. A1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bez Schrankenantrieb</em>' containment reference.
	 * @see #setBezSchrankenantrieb(Bez_Schrankenantrieb_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getSchrankenantrieb_Bezeichnung_AttributeGroup_BezSchrankenantrieb()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bez_Schrankenantrieb'"
	 * @generated
	 */
	Bez_Schrankenantrieb_TypeClass getBezSchrankenantrieb();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Schrankenantrieb_Bezeichnung_AttributeGroup#getBezSchrankenantrieb <em>Bez Schrankenantrieb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bez Schrankenantrieb</em>' containment reference.
	 * @see #getBezSchrankenantrieb()
	 * @generated
	 */
	void setBezSchrankenantrieb(Bez_Schrankenantrieb_TypeClass value);

} // Schrankenantrieb_Bezeichnung_AttributeGroup
