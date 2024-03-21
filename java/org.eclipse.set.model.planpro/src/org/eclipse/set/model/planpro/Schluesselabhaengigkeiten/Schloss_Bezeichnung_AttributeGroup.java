/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Schluesselabhaengigkeiten;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schloss Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Bezeichnung_AttributeGroup#getBezeichnungSchloss <em>Bezeichnung Schloss</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CSchloss_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Schloss_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung Schloss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Schlosses, die sich im Regelfall aus dem zu verschließenden Element ergibt, ggf. zuzüglich dessen Lage. Bei einer Schlüsselsperre/Schlosskombination entspricht die Bezeichnung der Bezeichnung der Schlüsselsperre/ Schlosskombination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Schloss</em>' containment reference.
	 * @see #setBezeichnungSchloss(Bezeichnung_Schloss_TypeClass)
	 * @see org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Bezeichnung_AttributeGroup_BezeichnungSchloss()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Schloss'"
	 * @generated
	 */
	Bezeichnung_Schloss_TypeClass getBezeichnungSchloss();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Bezeichnung_AttributeGroup#getBezeichnungSchloss <em>Bezeichnung Schloss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Schloss</em>' containment reference.
	 * @see #getBezeichnungSchloss()
	 * @generated
	 */
	void setBezeichnungSchloss(Bezeichnung_Schloss_TypeClass value);

} // Schloss_Bezeichnung_AttributeGroup
