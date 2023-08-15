/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Layoutinformationen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lageplan Blattschnitt Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Blattschnitt_Bezeichnung_AttributeGroup#getBezLageplanBlattschnitt <em>Bez Lageplan Blattschnitt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage#getLageplan_Blattschnitt_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CLageplan_Blattschnitt_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Lageplan_Blattschnitt_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bez Lageplan Blattschnitt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numerierung des Blattschnitts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bez Lageplan Blattschnitt</em>' containment reference.
	 * @see #setBezLageplanBlattschnitt(Bez_Lageplan_Blattschnitt_TypeClass)
	 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage#getLageplan_Blattschnitt_Bezeichnung_AttributeGroup_BezLageplanBlattschnitt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bez_Lageplan_Blattschnitt'"
	 * @generated
	 */
	Bez_Lageplan_Blattschnitt_TypeClass getBezLageplanBlattschnitt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Blattschnitt_Bezeichnung_AttributeGroup#getBezLageplanBlattschnitt <em>Bez Lageplan Blattschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bez Lageplan Blattschnitt</em>' containment reference.
	 * @see #getBezLageplanBlattschnitt()
	 * @generated
	 */
	void setBezLageplanBlattschnitt(Bez_Lageplan_Blattschnitt_TypeClass value);

} // Lageplan_Blattschnitt_Bezeichnung_AttributeGroup
