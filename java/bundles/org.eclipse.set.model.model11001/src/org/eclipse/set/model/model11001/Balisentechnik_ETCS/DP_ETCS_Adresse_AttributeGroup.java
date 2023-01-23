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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DP ETCS Adresse Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_ETCS_Adresse_AttributeGroup#getNIDBG <em>NIDBG</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_ETCS_Adresse_AttributeGroup#getNIDC <em>NIDC</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_ETCS_Adresse_AttributeGroup()
 * @model extendedMetaData="name='CDP_ETCS_Adresse' kind='elementOnly'"
 * @generated
 */
public interface DP_ETCS_Adresse_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>NIDBG</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestandteil der ETCS-ID gemäß Subset 26, Kapitel 7 und 8.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NIDBG</em>' containment reference.
	 * @see #setNIDBG(NID_BG_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_ETCS_Adresse_AttributeGroup_NIDBG()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NID_BG'"
	 * @generated
	 */
	NID_BG_TypeClass getNIDBG();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_ETCS_Adresse_AttributeGroup#getNIDBG <em>NIDBG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NIDBG</em>' containment reference.
	 * @see #getNIDBG()
	 * @generated
	 */
	void setNIDBG(NID_BG_TypeClass value);

	/**
	 * Returns the value of the '<em><b>NIDC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestandteil der ETCS-ID gemäß Subset 26, Kapitel 7 und 8.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NIDC</em>' containment reference.
	 * @see #setNIDC(NID_C_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_ETCS_Adresse_AttributeGroup_NIDC()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NID_C'"
	 * @generated
	 */
	NID_C_TypeClass getNIDC();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_ETCS_Adresse_AttributeGroup#getNIDC <em>NIDC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NIDC</em>' containment reference.
	 * @see #getNIDC()
	 * @generated
	 */
	void setNIDC(NID_C_TypeClass value);

} // DP_ETCS_Adresse_AttributeGroup
