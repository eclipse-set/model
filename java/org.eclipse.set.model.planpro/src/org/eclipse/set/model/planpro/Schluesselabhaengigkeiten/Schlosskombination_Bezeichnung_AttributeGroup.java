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
 * A representation of the model object '<em><b>Schlosskombination Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schlosskombination_Bezeichnung_AttributeGroup#getBezeichnungSk <em>Bezeichnung Sk</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchlosskombination_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CSchlosskombination_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Schlosskombination_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung Sk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der Schlosskombination. Zukünftige Regel zur Bezeichnung einer Schlosskombination: \"Sk\" + Kurz- oder Langbezeichnung des zum Hauptschlüssel gehörenden, korrespondierenden Schlosses. Bei mehreren Hauptschlüsseln ist das Schloss mit der niedrigeren Bezeichnung maßgebend.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Sk</em>' containment reference.
	 * @see #setBezeichnungSk(Bezeichnung_Sk_TypeClass)
	 * @see org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchlosskombination_Bezeichnung_AttributeGroup_BezeichnungSk()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Sk'"
	 * @generated
	 */
	Bezeichnung_Sk_TypeClass getBezeichnungSk();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schlosskombination_Bezeichnung_AttributeGroup#getBezeichnungSk <em>Bezeichnung Sk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Sk</em>' containment reference.
	 * @see #getBezeichnungSk()
	 * @generated
	 */
	void setBezeichnungSk(Bezeichnung_Sk_TypeClass value);

} // Schlosskombination_Bezeichnung_AttributeGroup
