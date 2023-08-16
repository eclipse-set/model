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
 * A representation of the model object '<em><b>FT ETCS Trans Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ETCS_Trans_Merkmale_AttributeGroup#getFTETCSTransPaket41 <em>FTETCS Trans Paket41</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ETCS_Trans_Merkmale_AttributeGroup#getFTETCSTransPaketN <em>FTETCS Trans Paket N</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ETCS_Trans_Merkmale_AttributeGroup()
 * @model extendedMetaData="name='CFT_ETCS_Trans_Merkmale' kind='elementOnly'"
 * @generated
 */
public interface FT_ETCS_Trans_Merkmale_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>FTETCS Trans Paket41</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_41_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FTETCS Trans Paket41</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ETCS_Trans_Merkmale_AttributeGroup_FTETCSTransPaket41()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FT_ETCS_Trans_Paket_41'"
	 * @generated
	 */
	EList<FT_ETCS_Trans_Paket_41_AttributeGroup> getFTETCSTransPaket41();

	/**
	 * Returns the value of the '<em><b>FTETCS Trans Paket N</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_N_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FTETCS Trans Paket N</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ETCS_Trans_Merkmale_AttributeGroup_FTETCSTransPaketN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FT_ETCS_Trans_Paket_N'"
	 * @generated
	 */
	EList<FT_ETCS_Trans_Paket_N_AttributeGroup> getFTETCSTransPaketN();

} // FT_ETCS_Trans_Merkmale_AttributeGroup
