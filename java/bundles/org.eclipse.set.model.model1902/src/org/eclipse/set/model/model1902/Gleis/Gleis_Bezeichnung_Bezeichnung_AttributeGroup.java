/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Gleis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gleis Bezeichnung Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Gleis.Gleis_Bezeichnung_Bezeichnung_AttributeGroup#getBezGleisBezeichnung <em>Bez Gleis Bezeichnung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Gleis.GleisPackage#getGleis_Bezeichnung_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CGleis_Bezeichnung_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Gleis_Bezeichnung_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bez Gleis Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Gleises entsprechend der betrieblichen Vorgaben (üblicherweise Ziffern bzw. Zahlen).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bez Gleis Bezeichnung</em>' containment reference.
	 * @see #setBezGleisBezeichnung(Bez_Gleis_Bezeichnung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Gleis.GleisPackage#getGleis_Bezeichnung_Bezeichnung_AttributeGroup_BezGleisBezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bez_Gleis_Bezeichnung'"
	 * @generated
	 */
	Bez_Gleis_Bezeichnung_TypeClass getBezGleisBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Gleis.Gleis_Bezeichnung_Bezeichnung_AttributeGroup#getBezGleisBezeichnung <em>Bez Gleis Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bez Gleis Bezeichnung</em>' containment reference.
	 * @see #getBezGleisBezeichnung()
	 * @generated
	 */
	void setBezGleisBezeichnung(Bez_Gleis_Bezeichnung_TypeClass value);

} // Gleis_Bezeichnung_Bezeichnung_AttributeGroup
