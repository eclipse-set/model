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
 * A representation of the model object '<em><b>Oertlichkeit Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup#getOertlichkeitAbkuerzung <em>Oertlichkeit Abkuerzung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup#getOertlichkeitKurzname <em>Oertlichkeit Kurzname</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup#getOertlichkeitLangname <em>Oertlichkeit Langname</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getOertlichkeit_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='COertlichkeit_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Oertlichkeit_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Oertlichkeit Abkuerzung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 2- bis 5-stellige Abkürzung der Örtlichkeit gemäß Ril 100.0001. Beispiel P-Hausen: PPHN.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oertlichkeit Abkuerzung</em>' containment reference.
	 * @see #setOertlichkeitAbkuerzung(Oertlichkeit_Abkuerzung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitAbkuerzung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Oertlichkeit_Abkuerzung'"
	 * @generated
	 */
	Oertlichkeit_Abkuerzung_TypeClass getOertlichkeitAbkuerzung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup#getOertlichkeitAbkuerzung <em>Oertlichkeit Abkuerzung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oertlichkeit Abkuerzung</em>' containment reference.
	 * @see #getOertlichkeitAbkuerzung()
	 * @generated
	 */
	void setOertlichkeitAbkuerzung(Oertlichkeit_Abkuerzung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Oertlichkeit Kurzname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 16-stelliger Name der Örtlichkeit. Der Kurzname wird der Ril 100 entnommen und muss in der Schreibweise mit dieser übereinstimmen. DB-Regelwerk Die Bildung des Kurznamens ist in Richtlinie 100.0001 Abschnitt 3 (6) beschrieben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oertlichkeit Kurzname</em>' containment reference.
	 * @see #setOertlichkeitKurzname(Oertlichkeit_Kurzname_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitKurzname()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Oertlichkeit_Kurzname'"
	 * @generated
	 */
	Oertlichkeit_Kurzname_TypeClass getOertlichkeitKurzname();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup#getOertlichkeitKurzname <em>Oertlichkeit Kurzname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oertlichkeit Kurzname</em>' containment reference.
	 * @see #getOertlichkeitKurzname()
	 * @generated
	 */
	void setOertlichkeitKurzname(Oertlichkeit_Kurzname_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Oertlichkeit Langname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 40-stelliger Name der Örtlichkeit Der Langname einer Örtlichkeit wird i. d. R nur dann abweichend zum Kurznamen gebildet, wenn die 16 Zeichen des Kurznamens nicht ausreichend sind. Anderenfalls sind Kurzname und Langname identisch. DB-Regelwerk Die Bildung des Langnamens ist in Richtlinie 100.0001 Abschnitt 3 (6) beschrieben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oertlichkeit Langname</em>' containment reference.
	 * @see #setOertlichkeitLangname(Oertlichkeit_Langname_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitLangname()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Oertlichkeit_Langname'"
	 * @generated
	 */
	Oertlichkeit_Langname_TypeClass getOertlichkeitLangname();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup#getOertlichkeitLangname <em>Oertlichkeit Langname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oertlichkeit Langname</em>' containment reference.
	 * @see #getOertlichkeitLangname()
	 * @generated
	 */
	void setOertlichkeitLangname(Oertlichkeit_Langname_TypeClass value);

} // Oertlichkeit_Bezeichnung_AttributeGroup
