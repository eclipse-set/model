/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.ATO;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATO TS Instanz Adresse Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.ATO.ATO_TS_Instanz_Adresse_AttributeGroup#getNIDATOTS <em>NIDATOTS</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.ATO.ATO_TS_Instanz_Adresse_AttributeGroup#getNIDCATOTS <em>NIDCATOTS</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.ATO.ATOPackage#getATO_TS_Instanz_Adresse_AttributeGroup()
 * @model extendedMetaData="name='CATO_TS_Instanz_Adresse' kind='elementOnly'"
 * @generated
 */
public interface ATO_TS_Instanz_Adresse_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>NIDATOTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kennung der ATO-TS-Instanz als Bestandteil der ATO-Kennung (ATO-ID) gemäß Subset 126, Version 0.0.17 vom 05.08.2020.
	 * Die Kennung wird zentral zugeteilt und verwaltet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NIDATOTS</em>' containment reference.
	 * @see #setNIDATOTS(NID_ATOTS_TypeClass)
	 * @see org.eclipse.set.model.model11001.ATO.ATOPackage#getATO_TS_Instanz_Adresse_AttributeGroup_NIDATOTS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NID_ATOTS'"
	 * @generated
	 */
	NID_ATOTS_TypeClass getNIDATOTS();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.ATO.ATO_TS_Instanz_Adresse_AttributeGroup#getNIDATOTS <em>NIDATOTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NIDATOTS</em>' containment reference.
	 * @see #getNIDATOTS()
	 * @generated
	 */
	void setNIDATOTS(NID_ATOTS_TypeClass value);

	/**
	 * Returns the value of the '<em><b>NIDCATOTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gebietskennung als Bestandteil der ATO-Kennung (ATO-ID) gemäß Subset 126, Version 0.0.17 vom 05.08.2020.
	 * Die Gebietskennung NID_C_ATOTS für ATO-TS- Instanzen wird aus der ETCS-Gebietskennung (NID_C) des entsprechenden Bereichs übernommen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NIDCATOTS</em>' containment reference.
	 * @see #setNIDCATOTS(NID_C_ATOTS_TypeClass)
	 * @see org.eclipse.set.model.model11001.ATO.ATOPackage#getATO_TS_Instanz_Adresse_AttributeGroup_NIDCATOTS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NID_C_ATOTS'"
	 * @generated
	 */
	NID_C_ATOTS_TypeClass getNIDCATOTS();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.ATO.ATO_TS_Instanz_Adresse_AttributeGroup#getNIDCATOTS <em>NIDCATOTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NIDCATOTS</em>' containment reference.
	 * @see #getNIDCATOTS()
	 * @generated
	 */
	void setNIDCATOTS(NID_C_ATOTS_TypeClass value);

} // ATO_TS_Instanz_Adresse_AttributeGroup
