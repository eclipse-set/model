/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Aneinander_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Zug_Rangier_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Aneinander Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung der aneinandergereihten Zug- oder Rangierstraße zu den Fahrstraßen Fstr Zug Rangier (\"Elementarfahrstraßen\"), aus denen sie besteht. DB-Regelwerk Tabelle der aneinandergereihten Zugstraßen Tabelle der aneinandergereihten Rangierstraßen 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Zuordnung#getIDFstrAneinander <em>ID Fstr Aneinander</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Zuordnung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage#getFstr_Aneinander_Zuordnung()
 * @model extendedMetaData="name='CFstr_Aneinander_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Aneinander_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Fstr Aneinander</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeiger auf Fstr Aneinander des Zuordnungsobjekts Fstr Aneinander Zuordnung. DB-Regelwerk Zusammengesetzte Zugstraßentabelle: Eintragungen einer Zeile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Aneinander</em>' containment reference.
	 * @see #setIDFstrAneinander(ID_Fstr_Aneinander_TypeClass)
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage#getFstr_Aneinander_Zuordnung_IDFstrAneinander()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Aneinander'"
	 * @generated
	 */
	ID_Fstr_Aneinander_TypeClass getIDFstrAneinander();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Zuordnung#getIDFstrAneinander <em>ID Fstr Aneinander</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Aneinander</em>' containment reference.
	 * @see #getIDFstrAneinander()
	 * @generated
	 */
	void setIDFstrAneinander(ID_Fstr_Aneinander_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fstr Zug Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeiger auf die jeweilige Fahrstraße des Zuordnungsobjekts Fstr Aneinander Zuordnung. DB-Regelwerk Zusammengesetzte Zugstraßentabelle: Eintragungen einer Zeile 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Zug Rangier</em>' containment reference.
	 * @see #setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass)
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage#getFstr_Aneinander_Zuordnung_IDFstrZugRangier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Zug_Rangier'"
	 * @generated
	 */
	ID_Fstr_Zug_Rangier_TypeClass getIDFstrZugRangier();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Zuordnung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Zug Rangier</em>' containment reference.
	 * @see #getIDFstrZugRangier()
	 * @generated
	 */
	void setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass value);

} // Fstr_Aneinander_Zuordnung
