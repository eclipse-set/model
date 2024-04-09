/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.ATO;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATO Segment Profile Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile_Bezeichnung_AttributeGroup#getNIDSP <em>NIDSP</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.ATO.ATOPackage#getATO_Segment_Profile_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CATO_Segment_Profile_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface ATO_Segment_Profile_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>NIDSP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Segment Profiles, die sich in der Regel aus der Bezeichnung der referenzierten ETCS-Gleiskante ergibt. Zur Herstellung der Eineindeutigkeit können weitere Bezeichnungsbestandteile ergänzt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NIDSP</em>' containment reference.
	 * @see #setNIDSP(NID_SP_TypeClass)
	 * @see org.eclipse.set.model.planpro.ATO.ATOPackage#getATO_Segment_Profile_Bezeichnung_AttributeGroup_NIDSP()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NID_SP'"
	 * @generated
	 */
	NID_SP_TypeClass getNIDSP();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile_Bezeichnung_AttributeGroup#getNIDSP <em>NIDSP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NIDSP</em>' containment reference.
	 * @see #getNIDSP()
	 * @generated
	 */
	void setNIDSP(NID_SP_TypeClass value);

} // ATO_Segment_Profile_Bezeichnung_AttributeGroup
