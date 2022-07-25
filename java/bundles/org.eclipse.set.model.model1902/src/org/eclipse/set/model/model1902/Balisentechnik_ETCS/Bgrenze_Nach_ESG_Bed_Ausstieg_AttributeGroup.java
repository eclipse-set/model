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

import org.eclipse.set.model.model1902.Verweise.ID_W_Kr_Gsp_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bgrenze Nach ESG Bed Ausstieg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup#getIDWElement <em>IDW Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup#getWLage <em>WLage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup()
 * @model extendedMetaData="name='CBgrenze_Nach_ESG_Bed_Ausstieg' kind='elementOnly'"
 * @generated
 */
public interface Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>IDW Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Weichen-Element der Entscheidungsweiche.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDW Element</em>' containment reference.
	 * @see #setIDWElement(ID_W_Kr_Gsp_Element_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup_IDWElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_W_Element'"
	 * @generated
	 */
	ID_W_Kr_Gsp_Element_TypeClass getIDWElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup#getIDWElement <em>IDW Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDW Element</em>' containment reference.
	 * @see #getIDWElement()
	 * @generated
	 */
	void setIDWElement(ID_W_Kr_Gsp_Element_TypeClass value);

	/**
	 * Returns the value of the '<em><b>WLage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lage des Weichen-Elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WLage</em>' containment reference.
	 * @see #setWLage(W_Lage_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup_WLage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='W_Lage'"
	 * @generated
	 */
	W_Lage_TypeClass getWLage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup#getWLage <em>WLage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WLage</em>' containment reference.
	 * @see #getWLage()
	 * @generated
	 */
	void setWLage(W_Lage_TypeClass value);

} // Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup
