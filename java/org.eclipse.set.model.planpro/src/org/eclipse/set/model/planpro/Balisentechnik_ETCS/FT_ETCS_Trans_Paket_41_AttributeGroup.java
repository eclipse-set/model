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
 * A representation of the model object '<em><b>FT ETCS Trans Paket 41 Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_41_AttributeGroup#getDLEVELTR <em>DLEVELTR</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_41_AttributeGroup#getLACKLEVELTR <em>LACKLEVELTR</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_41_AttributeGroup#getMLEVELTR <em>MLEVELTR</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_41_AttributeGroup#getNIDSTM <em>NIDSTM</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ETCS_Trans_Paket_41_AttributeGroup()
 * @model extendedMetaData="name='CFT_ETCS_Trans_Paket_41' kind='elementOnly'"
 * @generated
 */
public interface FT_ETCS_Trans_Paket_41_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>DLEVELTR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entfernung bis zum Punkt, an dem die Transition stattfindet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DLEVELTR</em>' containment reference.
	 * @see #setDLEVELTR(D_LEVELTR_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ETCS_Trans_Paket_41_AttributeGroup_DLEVELTR()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='D_LEVELTR'"
	 * @generated
	 */
	D_LEVELTR_TypeClass getDLEVELTR();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_41_AttributeGroup#getDLEVELTR <em>DLEVELTR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DLEVELTR</em>' containment reference.
	 * @see #getDLEVELTR()
	 * @generated
	 */
	void setDLEVELTR(D_LEVELTR_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LACKLEVELTR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge des Bereichs vor dem Umschaltpunkt, in dem der Tf die Transition bestätigen muss.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LACKLEVELTR</em>' containment reference.
	 * @see #setLACKLEVELTR(L_ACKLEVELTR_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ETCS_Trans_Paket_41_AttributeGroup_LACKLEVELTR()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='L_ACKLEVELTR'"
	 * @generated
	 */
	L_ACKLEVELTR_TypeClass getLACKLEVELTR();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_41_AttributeGroup#getLACKLEVELTR <em>LACKLEVELTR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LACKLEVELTR</em>' containment reference.
	 * @see #getLACKLEVELTR()
	 * @generated
	 */
	void setLACKLEVELTR(L_ACKLEVELTR_TypeClass value);

	/**
	 * Returns the value of the '<em><b>MLEVELTR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ETCS-Level, auf das umgeschaltet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MLEVELTR</em>' containment reference.
	 * @see #setMLEVELTR(M_LEVELTR_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ETCS_Trans_Paket_41_AttributeGroup_MLEVELTR()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='M_LEVELTR'"
	 * @generated
	 */
	M_LEVELTR_TypeClass getMLEVELTR();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_41_AttributeGroup#getMLEVELTR <em>MLEVELTR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MLEVELTR</em>' containment reference.
	 * @see #getMLEVELTR()
	 * @generated
	 */
	void setMLEVELTR(M_LEVELTR_TypeClass value);

	/**
	 * Returns the value of the '<em><b>NIDSTM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des nationalen Zugsicherungssystems, auf das umgeschaltet wird. Das Attribut ist nur zu füllen, wenn M_LEVELTR == \"STM\" gesetzt ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NIDSTM</em>' containment reference.
	 * @see #setNIDSTM(NID_STM_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ETCS_Trans_Paket_41_AttributeGroup_NIDSTM()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NID_STM'"
	 * @generated
	 */
	NID_STM_TypeClass getNIDSTM();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_41_AttributeGroup#getNIDSTM <em>NIDSTM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NIDSTM</em>' containment reference.
	 * @see #getNIDSTM()
	 * @generated
	 */
	void setNIDSTM(NID_STM_TypeClass value);

} // FT_ETCS_Trans_Paket_41_AttributeGroup
