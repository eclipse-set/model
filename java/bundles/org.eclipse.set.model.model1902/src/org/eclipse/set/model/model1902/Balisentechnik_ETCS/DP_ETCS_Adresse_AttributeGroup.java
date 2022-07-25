/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

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
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_ETCS_Adresse_AttributeGroup#getETCSAdresseKennung <em>ETCS Adresse Kennung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_ETCS_Adresse_AttributeGroup#getETCSAdresseNIDBG <em>ETCS Adresse NIDBG</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_ETCS_Adresse_AttributeGroup#getETCSAdresseNIDC <em>ETCS Adresse NIDC</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_ETCS_Adresse_AttributeGroup()
 * @model extendedMetaData="name='CDP_ETCS_Adresse' kind='elementOnly'"
 * @generated
 */
public interface DP_ETCS_Adresse_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ETCS Adresse Kennung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestandteil der ETCS-Adressierung gemäß FFFIS EuroRadio (Verwendung zusammen mit ETCS ID).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ETCS Adresse Kennung</em>' containment reference.
	 * @see #setETCSAdresseKennung(ETCS_Adresse_Kennung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_ETCS_Adresse_AttributeGroup_ETCSAdresseKennung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ETCS_Adresse_Kennung'"
	 * @generated
	 */
	ETCS_Adresse_Kennung_TypeClass getETCSAdresseKennung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_ETCS_Adresse_AttributeGroup#getETCSAdresseKennung <em>ETCS Adresse Kennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Adresse Kennung</em>' containment reference.
	 * @see #getETCSAdresseKennung()
	 * @generated
	 */
	void setETCSAdresseKennung(ETCS_Adresse_Kennung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ETCS Adresse NIDBG</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestandteil der ETCS-ID gemäß Subset 26, Kapitel 7 und 8.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ETCS Adresse NIDBG</em>' containment reference.
	 * @see #setETCSAdresseNIDBG(ETCS_Adresse_NID_BG_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_ETCS_Adresse_AttributeGroup_ETCSAdresseNIDBG()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ETCS_Adresse_NID_BG'"
	 * @generated
	 */
	ETCS_Adresse_NID_BG_TypeClass getETCSAdresseNIDBG();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_ETCS_Adresse_AttributeGroup#getETCSAdresseNIDBG <em>ETCS Adresse NIDBG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Adresse NIDBG</em>' containment reference.
	 * @see #getETCSAdresseNIDBG()
	 * @generated
	 */
	void setETCSAdresseNIDBG(ETCS_Adresse_NID_BG_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ETCS Adresse NIDC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestandteil der ETCS-ID gemäß Subset 26, Kapitel 7 und 8.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ETCS Adresse NIDC</em>' containment reference.
	 * @see #setETCSAdresseNIDC(ETCS_Adresse_NID_C_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_ETCS_Adresse_AttributeGroup_ETCSAdresseNIDC()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ETCS_Adresse_NID_C'"
	 * @generated
	 */
	ETCS_Adresse_NID_C_TypeClass getETCSAdresseNIDC();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_ETCS_Adresse_AttributeGroup#getETCSAdresseNIDC <em>ETCS Adresse NIDC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Adresse NIDC</em>' containment reference.
	 * @see #getETCSAdresseNIDC()
	 * @generated
	 */
	void setETCSAdresseNIDC(ETCS_Adresse_NID_C_TypeClass value);

} // DP_ETCS_Adresse_AttributeGroup
