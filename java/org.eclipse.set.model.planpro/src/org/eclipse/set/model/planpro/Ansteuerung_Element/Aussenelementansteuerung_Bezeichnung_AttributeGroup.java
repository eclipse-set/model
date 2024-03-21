/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aussenelementansteuerung Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Aussenelementansteuerung_Bezeichnung_AttributeGroup#getBezeichnungAEA <em>Bezeichnung AEA</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getAussenelementansteuerung_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CAussenelementansteuerung_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Aussenelementansteuerung_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung AEA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der Aussenelementansteuerung. Beispiel: \"ESTW-A Lummerland\". Bei Aussenelementansteuerungen der Art \"FeAk\" ist die Angabe nicht erforderlich, da eine 1:1-Beziehung zur Bezeichnung des Feldelements besteht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung AEA</em>' containment reference.
	 * @see #setBezeichnungAEA(Bezeichnung_AEA_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getAussenelementansteuerung_Bezeichnung_AttributeGroup_BezeichnungAEA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_AEA'"
	 * @generated
	 */
	Bezeichnung_AEA_TypeClass getBezeichnungAEA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Aussenelementansteuerung_Bezeichnung_AttributeGroup#getBezeichnungAEA <em>Bezeichnung AEA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung AEA</em>' containment reference.
	 * @see #getBezeichnungAEA()
	 * @generated
	 */
	void setBezeichnungAEA(Bezeichnung_AEA_TypeClass value);

} // Aussenelementansteuerung_Bezeichnung_AttributeGroup
