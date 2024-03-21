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

import org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Beginn_Bereich_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sonstiger Punkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Nicht durch ein anderes Punkt Objekt festgelegter Markanter Punkt. Das Objekt Sonstiger_Punkt wird durch den LST-Planer angelegt, wenn kein bereits existierendes Punkt Objekt für die Beschreibung des Markanten Punktes zur Verfügung steht. Insbesondere handelt es sich dabei um: Beginn eines Bahnsteigs, Kante eines Gefahrraums am BÜ, Zugschluss bzw. -spitze, Beginn des zu deckenden Bereichs einer Deckungsstelle (z. B. bewegliche Brücke), sonstige Punkte (z. B. Merkpfahl, Laternenmast). DB-Regelwerk Siehe Markanter Punkt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.Sonstiger_Punkt#getIDBeginnBereich <em>ID Beginn Bereich</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage#getSonstiger_Punkt()
 * @model extendedMetaData="name='CSonstiger_Punkt' kind='elementOnly'"
 * @generated
 */
public interface Sonstiger_Punkt extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Beginn Bereich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeiger auf das Bereich Objekt Bahnsteig Kante, BUE Gleisbezogener Gefahrraum oder ZUB Streckeneigenschaft, dessen Beginn bzw. Ende das Punkt Objekt Sonstiger Punkt abbildet. DB-Regelwerk Durchrutschwegtabelle, Spalte 2: \"Durchrutschweg - bis\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Beginn Bereich</em>' containment reference.
	 * @see #setIDBeginnBereich(ID_Beginn_Bereich_TypeClass)
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage#getSonstiger_Punkt_IDBeginnBereich()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Beginn_Bereich'"
	 * @generated
	 */
	ID_Beginn_Bereich_TypeClass getIDBeginnBereich();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Fahrstrasse.Sonstiger_Punkt#getIDBeginnBereich <em>ID Beginn Bereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Beginn Bereich</em>' containment reference.
	 * @see #getIDBeginnBereich()
	 * @generated
	 */
	void setIDBeginnBereich(ID_Beginn_Bereich_TypeClass value);

} // Sonstiger_Punkt
