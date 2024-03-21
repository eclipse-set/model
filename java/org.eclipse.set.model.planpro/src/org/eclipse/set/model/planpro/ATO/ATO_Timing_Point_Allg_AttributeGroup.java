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
 * A representation of the model object '<em><b>ATO Timing Point Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Allg_AttributeGroup#getErreichungstoleranz <em>Erreichungstoleranz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Allg_AttributeGroup#getHaltetoleranz <em>Haltetoleranz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Allg_AttributeGroup#getNIDTP <em>NIDTP</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.ATO.ATOPackage#getATO_Timing_Point_Allg_AttributeGroup()
 * @model extendedMetaData="name='CATO_Timing_Point_Allg' kind='elementOnly'"
 * @generated
 */
public interface ATO_Timing_Point_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Erreichungstoleranz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kodierung des Haltefensters am Haltplatz bei manueller Fahrt. Der Parameter entspricht dem ATO-Parameter \"Q_STP_Reached\" gemäß Subset 126, Version 0.0.17 vom 05.08.2020.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erreichungstoleranz</em>' containment reference.
	 * @see #setErreichungstoleranz(Erreichungstoleranz_TypeClass)
	 * @see org.eclipse.set.model.planpro.ATO.ATOPackage#getATO_Timing_Point_Allg_AttributeGroup_Erreichungstoleranz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Erreichungstoleranz'"
	 * @generated
	 */
	Erreichungstoleranz_TypeClass getErreichungstoleranz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Allg_AttributeGroup#getErreichungstoleranz <em>Erreichungstoleranz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erreichungstoleranz</em>' containment reference.
	 * @see #getErreichungstoleranz()
	 * @generated
	 */
	void setErreichungstoleranz(Erreichungstoleranz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Haltetoleranz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kodierung des Haltefensters am Halteplatz bei automatischer Fahrt (Q_Stop_Location Tolerance).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Haltetoleranz</em>' containment reference.
	 * @see #setHaltetoleranz(Haltetoleranz_TypeClass)
	 * @see org.eclipse.set.model.planpro.ATO.ATOPackage#getATO_Timing_Point_Allg_AttributeGroup_Haltetoleranz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Haltetoleranz'"
	 * @generated
	 */
	Haltetoleranz_TypeClass getHaltetoleranz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Allg_AttributeGroup#getHaltetoleranz <em>Haltetoleranz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Haltetoleranz</em>' containment reference.
	 * @see #getHaltetoleranz()
	 * @generated
	 */
	void setHaltetoleranz(Haltetoleranz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>NIDTP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Innerhalb eines Landes (NID-C-Bereich) einmalige Adresse des Timing Points.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NIDTP</em>' containment reference.
	 * @see #setNIDTP(NID_TP_TypeClass)
	 * @see org.eclipse.set.model.planpro.ATO.ATOPackage#getATO_Timing_Point_Allg_AttributeGroup_NIDTP()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NID_TP'"
	 * @generated
	 */
	NID_TP_TypeClass getNIDTP();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Allg_AttributeGroup#getNIDTP <em>NIDTP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NIDTP</em>' containment reference.
	 * @see #getNIDTP()
	 * @generated
	 */
	void setNIDTP(NID_TP_TypeClass value);

} // ATO_Timing_Point_Allg_AttributeGroup
