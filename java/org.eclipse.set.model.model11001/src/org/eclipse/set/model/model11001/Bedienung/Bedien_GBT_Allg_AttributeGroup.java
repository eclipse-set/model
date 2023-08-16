/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien GBT Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_GBT_Allg_AttributeGroup#getRueckschauzeit <em>Rueckschauzeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_GBT_Allg_AttributeGroup#getVorschauzeit <em>Vorschauzeit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_GBT_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBedien_GBT_Allg' kind='elementOnly'"
 * @generated
 */
public interface Bedien_GBT_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Rueckschauzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Zeit, in der die GBT für Fahrplanzeiten der Vergangenheit gesehen und editiert werden kann.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rueckschauzeit</em>' containment reference.
	 * @see #setRueckschauzeit(Rueckschauzeit_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_GBT_Allg_AttributeGroup_Rueckschauzeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Rueckschauzeit'"
	 * @generated
	 */
	Rueckschauzeit_TypeClass getRueckschauzeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_GBT_Allg_AttributeGroup#getRueckschauzeit <em>Rueckschauzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rueckschauzeit</em>' containment reference.
	 * @see #getRueckschauzeit()
	 * @generated
	 */
	void setRueckschauzeit(Rueckschauzeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Vorschauzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Zeit, in der die GBT für Fahrplanzeiten der Zukunft gesehen und editiert werden kann.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vorschauzeit</em>' containment reference.
	 * @see #setVorschauzeit(Vorschauzeit_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_GBT_Allg_AttributeGroup_Vorschauzeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vorschauzeit'"
	 * @generated
	 */
	Vorschauzeit_TypeClass getVorschauzeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_GBT_Allg_AttributeGroup#getVorschauzeit <em>Vorschauzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vorschauzeit</em>' containment reference.
	 * @see #getVorschauzeit()
	 * @generated
	 */
	void setVorschauzeit(Vorschauzeit_TypeClass value);

} // Bedien_GBT_Allg_AttributeGroup
