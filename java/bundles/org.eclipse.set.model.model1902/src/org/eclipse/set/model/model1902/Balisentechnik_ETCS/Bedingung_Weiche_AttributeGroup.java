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
 * A representation of the model object '<em><b>Bedingung Weiche Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bedingung_Weiche_AttributeGroup#getBedingungWeichenlage <em>Bedingung Weichenlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bedingung_Weiche_AttributeGroup#getIDWElement <em>IDW Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBedingung_Weiche_AttributeGroup()
 * @model extendedMetaData="name='CBedingung_Weiche' kind='elementOnly'"
 * @generated
 */
public interface Bedingung_Weiche_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bedingung Weichenlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lage der Weiche, die als Bedingung für die Auswahl des Fachtelegramms vorhanden sein muss.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedingung Weichenlage</em>' containment reference.
	 * @see #setBedingungWeichenlage(Bedingung_Weichenlage_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBedingung_Weiche_AttributeGroup_BedingungWeichenlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedingung_Weichenlage'"
	 * @generated
	 */
	Bedingung_Weichenlage_TypeClass getBedingungWeichenlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bedingung_Weiche_AttributeGroup#getBedingungWeichenlage <em>Bedingung Weichenlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedingung Weichenlage</em>' containment reference.
	 * @see #getBedingungWeichenlage()
	 * @generated
	 */
	void setBedingungWeichenlage(Bedingung_Weichenlage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDW Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Weichenelement, dessen Lage als Bedingung für die Auswahl des Fachtelegramms ausgewertet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDW Element</em>' containment reference.
	 * @see #setIDWElement(ID_W_Kr_Gsp_Element_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBedingung_Weiche_AttributeGroup_IDWElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_W_Element'"
	 * @generated
	 */
	ID_W_Kr_Gsp_Element_TypeClass getIDWElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bedingung_Weiche_AttributeGroup#getIDWElement <em>IDW Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDW Element</em>' containment reference.
	 * @see #getIDWElement()
	 * @generated
	 */
	void setIDWElement(ID_W_Kr_Gsp_Element_TypeClass value);

} // Bedingung_Weiche_AttributeGroup
