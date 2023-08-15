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

import org.eclipse.set.model.model11001.Verweise.ID_FMA_Anlage_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Fstr_Fahrweg_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Nichthaltfall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Nichthaltfallabschnitt (auch: Haltfallverhinderungsabschnitt). Im Gegensatz zur bisherigen Praxis der LST-Planung, den Haltfallabschnitt zu planen, werden im Datenmodell nur die Nichthaltfallabschnitte für jeden Fahrweg geplant. In der Regel ist es einer, selten mehrere. DB-Regelwerk Haltfallabschnitt bisher: Zugstraßentabelle, Spalte 6: Signalhaltfall
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Nichthaltfall#getIDFMAAnlage <em>IDFMA Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Nichthaltfall#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Nichthaltfall()
 * @model extendedMetaData="name='CFstr_Nichthaltfall' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Nichthaltfall extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDFMA Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Freimeldeabschnitt, der als Nichthaltfallabschnitt genutzt wird. DB-Regelwerk Wurde bisher nicht angegeben, stattdessen: Zugstraßentabelle, Spalte 6: Signalhaltfall.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDFMA Anlage</em>' containment reference.
	 * @see #setIDFMAAnlage(ID_FMA_Anlage_TypeClass)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Nichthaltfall_IDFMAAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_FMA_Anlage'"
	 * @generated
	 */
	ID_FMA_Anlage_TypeClass getIDFMAAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Nichthaltfall#getIDFMAAnlage <em>IDFMA Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDFMA Anlage</em>' containment reference.
	 * @see #getIDFMAAnlage()
	 * @generated
	 */
	void setIDFMAAnlage(ID_FMA_Anlage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fstr Fahrweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des Nichthaltfallabschnitts zu Fstr Fahrweg. DB-Regelwerk Wurde bisher nicht angegeben, stattdessen: Zugstraßentabelle, Spalte 6: Signalhaltfall 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Fahrweg</em>' containment reference.
	 * @see #setIDFstrFahrweg(ID_Fstr_Fahrweg_TypeClass)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Nichthaltfall_IDFstrFahrweg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Fahrweg'"
	 * @generated
	 */
	ID_Fstr_Fahrweg_TypeClass getIDFstrFahrweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Nichthaltfall#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Fahrweg</em>' containment reference.
	 * @see #getIDFstrFahrweg()
	 * @generated
	 */
	void setIDFstrFahrweg(ID_Fstr_Fahrweg_TypeClass value);

} // Fstr_Nichthaltfall
