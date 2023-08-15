/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZUB Bereichsgrenze Nach ZBS Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup#getBgrenzeNachZBSBedEinstieg <em>Bgrenze Nach ZBS Bed Einstieg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup()
 * @model extendedMetaData="name='CZUB_Bereichsgrenze_Nach_ZBS' kind='elementOnly'"
 * @generated
 */
public interface ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bgrenze Nach ZBS Bed Einstieg</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.Bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bgrenze Nach ZBS Bed Einstieg</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup_BgrenzeNachZBSBedEinstieg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bgrenze_Nach_ZBS_Bed_Einstieg'"
	 * @generated
	 */
	EList<Bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup> getBgrenzeNachZBSBedEinstieg();

} // ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup
