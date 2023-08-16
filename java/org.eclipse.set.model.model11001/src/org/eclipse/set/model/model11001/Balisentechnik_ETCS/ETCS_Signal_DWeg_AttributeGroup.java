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
 * A representation of the model object '<em><b>ETCS Signal DWeg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_DWeg_AttributeGroup#getDWegIntervall200 <em>DWeg Intervall200</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_DWeg_AttributeGroup#getDWegIntervall50 <em>DWeg Intervall50</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_DWeg_AttributeGroup#getDWegIntervall50200 <em>DWeg Intervall50200</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_DWeg_AttributeGroup()
 * @model extendedMetaData="name='CETCS_Signal_DWeg' kind='elementOnly'"
 * @generated
 */
public interface ETCS_Signal_DWeg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>DWeg Intervall200</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge des kürzesten DWegs im Intervall DWeg \u003e= 200 m. Die Angabe entfällt, wenn die exakten DWeg-Längen vom Stellwerk an das RBC übertragen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DWeg Intervall200</em>' containment reference.
	 * @see #setDWegIntervall200(DWeg_Intervall_200_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_DWeg_AttributeGroup_DWegIntervall200()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DWeg_Intervall_200'"
	 * @generated
	 */
	DWeg_Intervall_200_TypeClass getDWegIntervall200();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_DWeg_AttributeGroup#getDWegIntervall200 <em>DWeg Intervall200</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DWeg Intervall200</em>' containment reference.
	 * @see #getDWegIntervall200()
	 * @generated
	 */
	void setDWegIntervall200(DWeg_Intervall_200_TypeClass value);

	/**
	 * Returns the value of the '<em><b>DWeg Intervall50</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge des kürzesten DWegs im Intervall DWeg \u003c50 m. Die Angabe entfällt, wenn die exakten DWeg-Längen vom Stellwerk an das RBC übertragen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DWeg Intervall50</em>' containment reference.
	 * @see #setDWegIntervall50(DWeg_Intervall_50_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_DWeg_AttributeGroup_DWegIntervall50()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DWeg_Intervall_50'"
	 * @generated
	 */
	DWeg_Intervall_50_TypeClass getDWegIntervall50();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_DWeg_AttributeGroup#getDWegIntervall50 <em>DWeg Intervall50</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DWeg Intervall50</em>' containment reference.
	 * @see #getDWegIntervall50()
	 * @generated
	 */
	void setDWegIntervall50(DWeg_Intervall_50_TypeClass value);

	/**
	 * Returns the value of the '<em><b>DWeg Intervall50200</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge des kürzesten DWegs im Intervall 50 m \u003c= DWeg \u003c 200 m. Die Angabe entfällt, wenn die exakten DWeg-Längen vom Stellwerk an das RBC übertragen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DWeg Intervall50200</em>' containment reference.
	 * @see #setDWegIntervall50200(DWeg_Intervall_50_200_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_DWeg_AttributeGroup_DWegIntervall50200()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DWeg_Intervall_50_200'"
	 * @generated
	 */
	DWeg_Intervall_50_200_TypeClass getDWegIntervall50200();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_DWeg_AttributeGroup#getDWegIntervall50200 <em>DWeg Intervall50200</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DWeg Intervall50200</em>' containment reference.
	 * @see #getDWegIntervall50200()
	 * @generated
	 */
	void setDWegIntervall50200(DWeg_Intervall_50_200_TypeClass value);

} // ETCS_Signal_DWeg_AttributeGroup
