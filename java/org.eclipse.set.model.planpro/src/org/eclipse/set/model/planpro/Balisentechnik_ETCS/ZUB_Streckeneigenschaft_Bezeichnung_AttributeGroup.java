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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZUB Streckeneigenschaft Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup#getBezeichnungZUBSE <em>Bezeichnung ZUBSE</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CZUB_Streckeneigenschaft_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung ZUBSE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des gekennzeichneten Bereichs (z. B. Metallteil, Tunnel mit Anhalteverbot etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung ZUBSE</em>' containment reference.
	 * @see #setBezeichnungZUBSE(Bezeichnung_ZUB_SE_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup_BezeichnungZUBSE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_ZUB_SE'"
	 * @generated
	 */
	Bezeichnung_ZUB_SE_TypeClass getBezeichnungZUBSE();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup#getBezeichnungZUBSE <em>Bezeichnung ZUBSE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung ZUBSE</em>' containment reference.
	 * @see #getBezeichnungZUBSE()
	 * @generated
	 */
	void setBezeichnungZUBSE(Bezeichnung_ZUB_SE_TypeClass value);

} // ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup
