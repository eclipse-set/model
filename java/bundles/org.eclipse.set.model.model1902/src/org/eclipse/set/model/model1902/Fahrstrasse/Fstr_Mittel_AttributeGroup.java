/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Fahrstrasse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Mittel Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Mittel_AttributeGroup#getFstrMittelVAufwertung <em>Fstr Mittel VAufwertung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Mittel_AttributeGroup()
 * @model extendedMetaData="name='CFstr_Mittel' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Mittel_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Fstr Mittel VAufwertung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Aufwertung des Signals aus einer Einschränkung aufgrund von Mittelweichen ist möglich. Ist eine Mittelweiche für eine Geschwindigkeitseinschränkung verantwortlich, so fällt nach Freifahren dieser die Restriktion weg und das Signalbild kann aufgewertet werden. DB-Regelwerk Mittelweichenteilfahrstraßentabelle, Spalte 6 \"Geschwindigkeit - Aufwertung\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Mittel VAufwertung</em>' containment reference.
	 * @see #setFstrMittelVAufwertung(Fstr_Mittel_V_Aufwertung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Mittel_AttributeGroup_FstrMittelVAufwertung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fstr_Mittel_V_Aufwertung'"
	 * @generated
	 */
	Fstr_Mittel_V_Aufwertung_TypeClass getFstrMittelVAufwertung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Mittel_AttributeGroup#getFstrMittelVAufwertung <em>Fstr Mittel VAufwertung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Mittel VAufwertung</em>' containment reference.
	 * @see #getFstrMittelVAufwertung()
	 * @generated
	 */
	void setFstrMittelVAufwertung(Fstr_Mittel_V_Aufwertung_TypeClass value);

} // Fstr_Mittel_AttributeGroup
