/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Weichen_und_Gleissperren;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gleissperre Element Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleissperre_Element_AttributeGroup#getGleissperreBetriebsart <em>Gleissperre Betriebsart</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleissperre_Element_AttributeGroup#getGleissperreVorzugslage <em>Gleissperre Vorzugslage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getGleissperre_Element_AttributeGroup()
 * @model extendedMetaData="name='CGleissperre_Element' kind='elementOnly'"
 * @generated
 */
public interface Gleissperre_Element_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Gleissperre Betriebsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Neben dem Normalbetrieb (Element ist stellbar) kann das Element durch den Betriebsartenstecker in einer definierten Lage festgelegt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gleissperre Betriebsart</em>' containment reference.
	 * @see #setGleissperreBetriebsart(Gleissperre_Betriebsart_TypeClass)
	 * @see org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getGleissperre_Element_AttributeGroup_GleissperreBetriebsart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gleissperre_Betriebsart'"
	 * @generated
	 */
	Gleissperre_Betriebsart_TypeClass getGleissperreBetriebsart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleissperre_Element_AttributeGroup#getGleissperreBetriebsart <em>Gleissperre Betriebsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gleissperre Betriebsart</em>' containment reference.
	 * @see #getGleissperreBetriebsart()
	 * @generated
	 */
	void setGleissperreBetriebsart(Gleissperre_Betriebsart_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Gleissperre Vorzugslage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorzugslage der Gleissperre (Grundstellung). Dieses Attribut enthält den Eintrag abgelegt oder aufgelegt. Mit dem Attribut Vorzugslage Automatik kann festgelegt werden, dass diese Vorzugslage automatisch hergestellt wird. In großen Rangierbahnhöfen wird u. U. auf die Festlegung einer Vorzugslage verzichtet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gleissperre Vorzugslage</em>' containment reference.
	 * @see #setGleissperreVorzugslage(Gleissperre_Vorzugslage_TypeClass)
	 * @see org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getGleissperre_Element_AttributeGroup_GleissperreVorzugslage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gleissperre_Vorzugslage'"
	 * @generated
	 */
	Gleissperre_Vorzugslage_TypeClass getGleissperreVorzugslage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleissperre_Element_AttributeGroup#getGleissperreVorzugslage <em>Gleissperre Vorzugslage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gleissperre Vorzugslage</em>' containment reference.
	 * @see #getGleissperreVorzugslage()
	 * @generated
	 */
	void setGleissperreVorzugslage(Gleissperre_Vorzugslage_TypeClass value);

} // Gleissperre_Element_AttributeGroup
