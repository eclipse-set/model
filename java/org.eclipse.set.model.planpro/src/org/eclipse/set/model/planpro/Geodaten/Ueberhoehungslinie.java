/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Ueberhoehung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ueberhoehungslinie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Überhöhungsverlauf zwischen zwei Überhöhungspunkten.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Ueberhoehungslinie#getIDUeberhoehungA <em>ID Ueberhoehung A</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Ueberhoehungslinie#getIDUeberhoehungB <em>ID Ueberhoehung B</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Ueberhoehungslinie#getUeberhoehungslinieAllg <em>Ueberhoehungslinie Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getUeberhoehungslinie()
 * @model extendedMetaData="name='CUeberhoehungslinie' kind='elementOnly'"
 * @generated
 */
public interface Ueberhoehungslinie extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Ueberhoehung A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Ueberhoehung am Anfang der Ueberhoehungslinie. Durch die Angabe des Anfangs- sowie des Endpunkts wird die Richtung der Ueberhoehungslinie definiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Ueberhoehung A</em>' containment reference.
	 * @see #setIDUeberhoehungA(ID_Ueberhoehung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getUeberhoehungslinie_IDUeberhoehungA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Ueberhoehung_A'"
	 * @generated
	 */
	ID_Ueberhoehung_TypeClass getIDUeberhoehungA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Ueberhoehungslinie#getIDUeberhoehungA <em>ID Ueberhoehung A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Ueberhoehung A</em>' containment reference.
	 * @see #getIDUeberhoehungA()
	 * @generated
	 */
	void setIDUeberhoehungA(ID_Ueberhoehung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Ueberhoehung B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Ueberhoehung am Ende der Ueberhoehungslinie. Durch die Angabe des Anfangs- sowie des Endpunkts wird die Richtung der Ueberhoehungslinie definiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Ueberhoehung B</em>' containment reference.
	 * @see #setIDUeberhoehungB(ID_Ueberhoehung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getUeberhoehungslinie_IDUeberhoehungB()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Ueberhoehung_B'"
	 * @generated
	 */
	ID_Ueberhoehung_TypeClass getIDUeberhoehungB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Ueberhoehungslinie#getIDUeberhoehungB <em>ID Ueberhoehung B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Ueberhoehung B</em>' containment reference.
	 * @see #getIDUeberhoehungB()
	 * @generated
	 */
	void setIDUeberhoehungB(ID_Ueberhoehung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ueberhoehungslinie Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ueberhoehungslinie Allg</em>' containment reference.
	 * @see #setUeberhoehungslinieAllg(Ueberhoehungslinie_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getUeberhoehungslinie_UeberhoehungslinieAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ueberhoehungslinie_Allg'"
	 * @generated
	 */
	Ueberhoehungslinie_Allg_AttributeGroup getUeberhoehungslinieAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Ueberhoehungslinie#getUeberhoehungslinieAllg <em>Ueberhoehungslinie Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ueberhoehungslinie Allg</em>' containment reference.
	 * @see #getUeberhoehungslinieAllg()
	 * @generated
	 */
	void setUeberhoehungslinieAllg(Ueberhoehungslinie_Allg_AttributeGroup value);

} // Ueberhoehungslinie
