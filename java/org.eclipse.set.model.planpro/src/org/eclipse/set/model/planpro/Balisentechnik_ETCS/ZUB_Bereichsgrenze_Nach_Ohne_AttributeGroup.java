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
 * A representation of the model object '<em><b>ZUB Bereichsgrenze Nach Ohne Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup#getBgrenzeNachOhneBedEinstieg <em>Bgrenze Nach Ohne Bed Einstieg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup()
 * @model extendedMetaData="name='CZUB_Bereichsgrenze_Nach_Ohne' kind='elementOnly'"
 * @generated
 */
public interface ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bgrenze Nach Ohne Bed Einstieg</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bgrenze Nach Ohne Bed Einstieg</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup_BgrenzeNachOhneBedEinstieg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bgrenze_Nach_Ohne_Bed_Einstieg'"
	 * @generated
	 */
	EList<Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup> getBgrenzeNachOhneBedEinstieg();

} // ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup
