/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zuglenkung;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_ZL_Fstr_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL DLP Fstr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung von ZL-DLP-Abschnitten zur ZL-Fahrstraße. DB-Regelwerk TM 2011-024 I.NVT 3 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_DLP_Fstr#getIDZLFstr <em>IDZL Fstr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_DLP_Fstr()
 * @model extendedMetaData="name='CZL_DLP_Fstr' kind='elementOnly'"
 * @generated
 */
public interface ZL_DLP_Fstr extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDZL Fstr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der ZL_Fstr, für welche die DLP erfolgen soll. Die Angabe, zu welcher Betriebsstelle die ZL_Fstr gehört, ist über die Zuordnung der Fstr_Zug_Rangier zur Örtlichkeit indirekt möglich. Mehrere Instanzen mit der gleichen ZL_Fstr müssen dann für die eigentliche systematische Prüfung in der DLP ODER-verknüpft werden. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZL Fstr</em>' containment reference.
	 * @see #setIDZLFstr(ID_ZL_Fstr_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_DLP_Fstr_IDZLFstr()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZL_Fstr'"
	 * @generated
	 */
	ID_ZL_Fstr_TypeClass getIDZLFstr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_DLP_Fstr#getIDZLFstr <em>IDZL Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZL Fstr</em>' containment reference.
	 * @see #getIDZLFstr()
	 * @generated
	 */
	void setIDZLFstr(ID_ZL_Fstr_TypeClass value);

} // ZL_DLP_Fstr
