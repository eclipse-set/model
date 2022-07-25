/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Fahrstrasse;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Fstr_Fahrweg_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Umfahrpunkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Umfahrpunkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bezeichner des Umfahrpunkts durch eine Weiche oder einen Gleisabschnitt. Der Bezeichner dient nur dazu, den Umfahrweg zu benennen, nicht dazu, den Fahrweg zu beschreiben; die Beschreibung erfolgt in Fstr Fahrweg (Bereich Objekt). Die Festlegung des Umfahrpunkts gilt je Fahrweg und damit für alle Zug- und Rangierstraßen, die diesen Fahrweg nutzen. Das Objekt ist Bestandteil des Untergewerks \"Bedienung Fdl\". DB-Regelwerk Bestandteil des Bezeichners der Umfahrstraße in der Zug-/Rangierstraßentabelle, Spalte 1 \"Start/Ziel\"
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Umfahrpunkt#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Umfahrpunkt#getIDUmfahrpunkt <em>ID Umfahrpunkt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Umfahrpunkt()
 * @model extendedMetaData="name='CFstr_Umfahrpunkt' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Umfahrpunkt extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Fstr Fahrweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des Fahrwegs zum Umfahrpunkt. DB-Regelwerk Zugstraßentabelle, Bezeichnung der Fstr (inkl. Umfahrpunkt) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Fahrweg</em>' containment reference.
	 * @see #setIDFstrFahrweg(ID_Fstr_Fahrweg_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Umfahrpunkt_IDFstrFahrweg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Fahrweg'"
	 * @generated
	 */
	ID_Fstr_Fahrweg_TypeClass getIDFstrFahrweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Umfahrpunkt#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Fahrweg</em>' containment reference.
	 * @see #getIDFstrFahrweg()
	 * @generated
	 */
	void setIDFstrFahrweg(ID_Fstr_Fahrweg_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Umfahrpunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Element (Gleisabschnitt oder Weiche), das für den Umfahrpunkt namensgebend ist. DB-Regelwerk Zugstraßentabelle, Bezeichnung des Umfahrpunktes in der Fahrstraßenbezeichnung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Umfahrpunkt</em>' containment reference.
	 * @see #setIDUmfahrpunkt(ID_Umfahrpunkt_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Umfahrpunkt_IDUmfahrpunkt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Umfahrpunkt'"
	 * @generated
	 */
	ID_Umfahrpunkt_TypeClass getIDUmfahrpunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Umfahrpunkt#getIDUmfahrpunkt <em>ID Umfahrpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Umfahrpunkt</em>' containment reference.
	 * @see #getIDUmfahrpunkt()
	 * @generated
	 */
	void setIDUmfahrpunkt(ID_Umfahrpunkt_TypeClass value);

} // Fstr_Umfahrpunkt
