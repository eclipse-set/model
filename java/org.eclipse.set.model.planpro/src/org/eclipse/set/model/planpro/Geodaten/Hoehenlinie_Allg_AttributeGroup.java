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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hoehenlinie Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Hoehenlinie_Allg_AttributeGroup#getHoehenlinieForm <em>Hoehenlinie Form</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Hoehenlinie_Allg_AttributeGroup#getHoehenlinieLaenge <em>Hoehenlinie Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Hoehenlinie_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getHoehenlinie_Allg_AttributeGroup()
 * @model extendedMetaData="name='CHoehenlinie_Allg' kind='elementOnly'"
 * @generated
 */
public interface Hoehenlinie_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Hoehenlinie Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Form der Hoehenlinie, z. B. Gerade.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hoehenlinie Form</em>' containment reference.
	 * @see #setHoehenlinieForm(Hoehenlinie_Form_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getHoehenlinie_Allg_AttributeGroup_HoehenlinieForm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Hoehenlinie_Form'"
	 * @generated
	 */
	Hoehenlinie_Form_TypeClass getHoehenlinieForm();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Hoehenlinie_Allg_AttributeGroup#getHoehenlinieForm <em>Hoehenlinie Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehenlinie Form</em>' containment reference.
	 * @see #getHoehenlinieForm()
	 * @generated
	 */
	void setHoehenlinieForm(Hoehenlinie_Form_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Hoehenlinie Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge der Hoehenlinie. Genauigkeit: Tausendstel m = 1 mm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hoehenlinie Laenge</em>' containment reference.
	 * @see #setHoehenlinieLaenge(Hoehenlinie_Laenge_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getHoehenlinie_Allg_AttributeGroup_HoehenlinieLaenge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Hoehenlinie_Laenge'"
	 * @generated
	 */
	Hoehenlinie_Laenge_TypeClass getHoehenlinieLaenge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Hoehenlinie_Allg_AttributeGroup#getHoehenlinieLaenge <em>Hoehenlinie Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehenlinie Laenge</em>' containment reference.
	 * @see #getHoehenlinieLaenge()
	 * @generated
	 */
	void setHoehenlinieLaenge(Hoehenlinie_Laenge_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Plan Quelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quelle der Geo-Kante, des Geo-Knotens, des Höhenpunkts, der Höhenlinie, der Überhöhung bzw. der Überhöhungslinie. Bei Auswahl von „sonstige“ ist zwingend ein Bearbeitungsvermerk anzugeben. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan Quelle</em>' containment reference.
	 * @see #setPlanQuelle(Plan_Quelle_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getHoehenlinie_Allg_AttributeGroup_PlanQuelle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Plan_Quelle'"
	 * @generated
	 */
	Plan_Quelle_TypeClass getPlanQuelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Hoehenlinie_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Quelle</em>' containment reference.
	 * @see #getPlanQuelle()
	 * @generated
	 */
	void setPlanQuelle(Plan_Quelle_TypeClass value);

} // Hoehenlinie_Allg_AttributeGroup
