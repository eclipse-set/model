/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Schluesselabhaengigkeiten;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_Schlosskombination_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schloss Sk Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup#getHauptschloss <em>Hauptschloss</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup#getIDSchlosskombination <em>ID Schlosskombination</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Sk_AttributeGroup()
 * @model extendedMetaData="name='CSchloss_Sk' kind='elementOnly'"
 * @generated
 */
public interface Schloss_Sk_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Hauptschloss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schloss ist das Hauptschloss der Schlosskombination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hauptschloss</em>' containment reference.
	 * @see #setHauptschloss(Hauptschloss_TypeClass)
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Sk_AttributeGroup_Hauptschloss()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Hauptschloss'"
	 * @generated
	 */
	Hauptschloss_TypeClass getHauptschloss();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup#getHauptschloss <em>Hauptschloss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauptschloss</em>' containment reference.
	 * @see #getHauptschloss()
	 * @generated
	 */
	void setHauptschloss(Hauptschloss_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Schlosskombination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Schlosskombination, zu der das Schloss gehört.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Schlosskombination</em>' containment reference.
	 * @see #setIDSchlosskombination(ID_Schlosskombination_TypeClass)
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Sk_AttributeGroup_IDSchlosskombination()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Schlosskombination'"
	 * @generated
	 */
	ID_Schlosskombination_TypeClass getIDSchlosskombination();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup#getIDSchlosskombination <em>ID Schlosskombination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Schlosskombination</em>' containment reference.
	 * @see #getIDSchlosskombination()
	 * @generated
	 */
	void setIDSchlosskombination(ID_Schlosskombination_TypeClass value);

} // Schloss_Sk_AttributeGroup
