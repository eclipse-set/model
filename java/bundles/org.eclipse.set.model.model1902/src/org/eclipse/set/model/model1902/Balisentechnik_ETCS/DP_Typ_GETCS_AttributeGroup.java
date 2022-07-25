/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DP Typ GETCS Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GETCS_AttributeGroup#getDPTypETCS <em>DP Typ ETCS</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GETCS_AttributeGroup()
 * @model extendedMetaData="name='CDP_Typ_GETCS' kind='elementOnly'"
 * @generated
 */
public interface DP_Typ_GETCS_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>DP Typ ETCS</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_ETCS_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durch das Anwendungssystem ETCS definierter Datenpunkttyp. Bei zusammengefassten Datenpunkttypen erfolgt eine mehrfache Angabe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DP Typ ETCS</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GETCS_AttributeGroup_DPTypETCS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DP_Typ_ETCS'"
	 * @generated
	 */
	EList<DP_Typ_ETCS_TypeClass> getDPTypETCS();

} // DP_Typ_GETCS_AttributeGroup
