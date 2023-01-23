/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Fahrstrasse;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_Fla_Schutz_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Fstr_Zug_Rangier_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Rangier Fla Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung von zu gewährleistenden Flankenschutzmaßnahmen zur Rangierstraße. Nur in Ausnahmefällen wird Flankenschutz für Rangierstraßen realisiert. Dann kann für jede Weiche einzeln bestimmt werden, ob sie Flankenschutz bekommt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung#getIDFlaSchutz <em>ID Fla Schutz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung#getIDFstrRangier <em>ID Fstr Rangier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Rangier_Fla_Zuordnung()
 * @model extendedMetaData="name='CFstr_Rangier_Fla_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Rangier_Fla_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Fla Schutz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Fahrwegelement, für das Flankenschutz angefordert werden soll, wenn es durch die angegebene Rangierstraße beansprucht wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fla Schutz</em>' containment reference.
	 * @see #setIDFlaSchutz(ID_Fla_Schutz_TypeClass)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Rangier_Fla_Zuordnung_IDFlaSchutz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fla_Schutz'"
	 * @generated
	 */
	ID_Fla_Schutz_TypeClass getIDFlaSchutz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung#getIDFlaSchutz <em>ID Fla Schutz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fla Schutz</em>' containment reference.
	 * @see #getIDFlaSchutz()
	 * @generated
	 */
	void setIDFlaSchutz(ID_Fla_Schutz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fstr Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Rangierstraße, für die das unter ID Fla Schutz angegebene Fahrwegelement Flankenschutz anfordern soll. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Rangier</em>' containment reference.
	 * @see #setIDFstrRangier(ID_Fstr_Zug_Rangier_TypeClass)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Rangier_Fla_Zuordnung_IDFstrRangier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Rangier'"
	 * @generated
	 */
	ID_Fstr_Zug_Rangier_TypeClass getIDFstrRangier();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung#getIDFstrRangier <em>ID Fstr Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Rangier</em>' containment reference.
	 * @see #getIDFstrRangier()
	 * @generated
	 */
	void setIDFstrRangier(ID_Fstr_Zug_Rangier_TypeClass value);

} // Fstr_Rangier_Fla_Zuordnung
