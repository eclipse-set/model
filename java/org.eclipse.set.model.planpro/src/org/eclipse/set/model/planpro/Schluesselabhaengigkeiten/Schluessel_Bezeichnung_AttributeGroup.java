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
 * A representation of the model object '<em><b>Schluessel Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Bezeichnung_AttributeGroup#getBezeichnungSchluessel <em>Bezeichnung Schluessel</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchluessel_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CSchluessel_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Schluessel_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung Schluessel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auf dem Schluessel angebrachte Bezeichnung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Schluessel</em>' containment reference.
	 * @see #setBezeichnungSchluessel(Bezeichnung_Schluessel_TypeClass)
	 * @see org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchluessel_Bezeichnung_AttributeGroup_BezeichnungSchluessel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Schluessel'"
	 * @generated
	 */
	Bezeichnung_Schluessel_TypeClass getBezeichnungSchluessel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Bezeichnung_AttributeGroup#getBezeichnungSchluessel <em>Bezeichnung Schluessel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Schluessel</em>' containment reference.
	 * @see #getBezeichnungSchluessel()
	 * @generated
	 */
	void setBezeichnungSchluessel(Bezeichnung_Schluessel_TypeClass value);

} // Schluessel_Bezeichnung_AttributeGroup
