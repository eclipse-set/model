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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Aneinander</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Aneinandergereihte Zug- oder Rangierstraße. Die Reihenfolge der aneinandergereihten Fahrstraßen wird nicht mit abgespeichert, da diese aus Start und Ziel erkennbar ist. Durch die Auswahl der letzten Fahrstraße (bei Zugstraßen) wird der Durchrutschweg festgelegt. Sollen für die aneinandergereihte Zugstraße mehrere Durchrutschwege möglich sein, so sind entsprechend viele aneinandergereihte Zugstraßen zu planen (Ausnahmefall). Für die erste bis vorletzte Fahrstraße muss jeweils ein Durchrutschweg gewählt werden, dessen Weg Bestandteil der folgenden Fahrstraße ist; sollten hiervon mehrere existieren, wird der mit den geringsten betrieblichen Einschränkungen (i. d. R. der längste) verwendet. DB-Regelwerk Aneinandergereihte Zugstraßentabelle Aneinandergereihte Rangierstraßentabelle 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Aneinander#getFstrAneinanderBedienstring <em>Fstr Aneinander Bedienstring</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Aneinander()
 * @model extendedMetaData="name='CFstr_Aneinander' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Aneinander extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Fstr Aneinander Bedienstring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bedienstring der aneinandergereihten Zug- oder Rangierstraße. Der Bedienstring ergibt sich in der Regel aus dem Start und dem Ziel der aneinandergereihten Fahrstraße, kann aber auch davon abweichen. DB-Regelwerk Aneinandergereihte Zugstraßen-/Rangierstraßentabelle, Spalten 1 und 2
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Aneinander Bedienstring</em>' containment reference.
	 * @see #setFstrAneinanderBedienstring(Fstr_Aneinander_Bedienstring_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Aneinander_FstrAneinanderBedienstring()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Aneinander_Bedienstring'"
	 * @generated
	 */
	Fstr_Aneinander_Bedienstring_TypeClass getFstrAneinanderBedienstring();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Aneinander#getFstrAneinanderBedienstring <em>Fstr Aneinander Bedienstring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Aneinander Bedienstring</em>' containment reference.
	 * @see #getFstrAneinanderBedienstring()
	 * @generated
	 */
	void setFstrAneinanderBedienstring(Fstr_Aneinander_Bedienstring_TypeClass value);

} // Fstr_Aneinander
