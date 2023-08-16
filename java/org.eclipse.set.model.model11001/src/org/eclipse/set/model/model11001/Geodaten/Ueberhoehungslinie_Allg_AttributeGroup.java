/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Geodaten;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ueberhoehungslinie Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup#getUeberhoehungslinieForm <em>Ueberhoehungslinie Form</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup#getUeberhoehungslinieLaenge <em>Ueberhoehungslinie Laenge</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getUeberhoehungslinie_Allg_AttributeGroup()
 * @model extendedMetaData="name='CUeberhoehungslinie_Allg' kind='elementOnly'"
 * @generated
 */
public interface Ueberhoehungslinie_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Plan Quelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quelle der Geo-Kante, des Geo-Knotens, des Höhenpunkts, der Höhenlinie, der Überhöhung bzw. der Überhöhungslinie. Bei Auswahl von „sonstige“ ist zwingend ein Bearbeitungsvermerk anzugeben. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan Quelle</em>' containment reference.
	 * @see #setPlanQuelle(Plan_Quelle_TypeClass)
	 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getUeberhoehungslinie_Allg_AttributeGroup_PlanQuelle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Plan_Quelle'"
	 * @generated
	 */
	Plan_Quelle_TypeClass getPlanQuelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Quelle</em>' containment reference.
	 * @see #getPlanQuelle()
	 * @generated
	 */
	void setPlanQuelle(Plan_Quelle_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ueberhoehungslinie Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Form der Ueberhoehungslinie, z. B. gleichbleibend oder gerade Rampe. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ueberhoehungslinie Form</em>' containment reference.
	 * @see #setUeberhoehungslinieForm(Ueberhoehungslinie_Form_TypeClass)
	 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getUeberhoehungslinie_Allg_AttributeGroup_UeberhoehungslinieForm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ueberhoehungslinie_Form'"
	 * @generated
	 */
	Ueberhoehungslinie_Form_TypeClass getUeberhoehungslinieForm();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup#getUeberhoehungslinieForm <em>Ueberhoehungslinie Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ueberhoehungslinie Form</em>' containment reference.
	 * @see #getUeberhoehungslinieForm()
	 * @generated
	 */
	void setUeberhoehungslinieForm(Ueberhoehungslinie_Form_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ueberhoehungslinie Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge der Ueberhoehungslinie. Genauigkeit: Tausendstel m = 1 mm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ueberhoehungslinie Laenge</em>' containment reference.
	 * @see #setUeberhoehungslinieLaenge(Ueberhoehungslinie_Laenge_TypeClass)
	 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getUeberhoehungslinie_Allg_AttributeGroup_UeberhoehungslinieLaenge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ueberhoehungslinie_Laenge'"
	 * @generated
	 */
	Ueberhoehungslinie_Laenge_TypeClass getUeberhoehungslinieLaenge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup#getUeberhoehungslinieLaenge <em>Ueberhoehungslinie Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ueberhoehungslinie Laenge</em>' containment reference.
	 * @see #getUeberhoehungslinieLaenge()
	 * @generated
	 */
	void setUeberhoehungslinieLaenge(Ueberhoehungslinie_Laenge_TypeClass value);

} // Ueberhoehungslinie_Allg_AttributeGroup
