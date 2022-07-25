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
 * A representation of the model object '<em><b>ETCS Adresse Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Adresse_AttributeGroup#getETCSKennung <em>ETCS Kennung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Adresse_AttributeGroup#getNIDC <em>NIDC</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Adresse_AttributeGroup#getNIDRBC <em>NIDRBC</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Adresse_AttributeGroup()
 * @model extendedMetaData="name='CETCS_Adresse' kind='elementOnly'"
 * @generated
 */
public interface ETCS_Adresse_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ETCS Kennung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Teilnehmers. Bestandteil der ETCS-Adressierung gemäß FFFIS EuroRadio (Verwendung zusammen mit ETCS ID).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ETCS Kennung</em>' containment reference.
	 * @see #setETCSKennung(ETCS_Kennung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Adresse_AttributeGroup_ETCSKennung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ETCS_Kennung'"
	 * @generated
	 */
	ETCS_Kennung_TypeClass getETCSKennung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Adresse_AttributeGroup#getETCSKennung <em>ETCS Kennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Kennung</em>' containment reference.
	 * @see #getETCSKennung()
	 * @generated
	 */
	void setETCSKennung(ETCS_Kennung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>NIDC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kennung zur Unterscheidung verschiedener Regionen. Bestandteil der ETCS-ID gemäß Subset 26, Kapitel 7 und 8.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NIDC</em>' containment reference.
	 * @see #setNIDC(NID_C_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Adresse_AttributeGroup_NIDC()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NID_C'"
	 * @generated
	 */
	NID_C_TypeClass getNIDC();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Adresse_AttributeGroup#getNIDC <em>NIDC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NIDC</em>' containment reference.
	 * @see #getNIDC()
	 * @generated
	 */
	void setNIDC(NID_C_TypeClass value);

	/**
	 * Returns the value of the '<em><b>NIDRBC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kennung des RBC innerhalb einer Region. Bestandteil der ETCS-ID gemäß Subset 26, Kapitel 7 und 8.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NIDRBC</em>' containment reference.
	 * @see #setNIDRBC(NID_RBC_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Adresse_AttributeGroup_NIDRBC()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NID_RBC'"
	 * @generated
	 */
	NID_RBC_TypeClass getNIDRBC();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Adresse_AttributeGroup#getNIDRBC <em>NIDRBC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NIDRBC</em>' containment reference.
	 * @see #getNIDRBC()
	 * @generated
	 */
	void setNIDRBC(NID_RBC_TypeClass value);

} // ETCS_Adresse_AttributeGroup
