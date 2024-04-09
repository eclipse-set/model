/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_BUE_WS_Fstr_Zuordnung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Schaltmittel_Zuordnung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schaltmittel Fstr Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Verknüpft bei einem Bahnübergang mit der Funktionsüberwachung Fü die möglichen Fahrstraßen mit den Elementen für die Wirksamschaltung.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Schaltmittel_Fstr_Zuordnung#getIDBUEWSFstrZuordnung <em>IDBUEWS Fstr Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Schaltmittel_Fstr_Zuordnung#getIDSchaltmittelZuordnung <em>ID Schaltmittel Zuordnung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getSchaltmittel_Fstr_Zuordnung()
 * @model extendedMetaData="name='CSchaltmittel_Fstr_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface Schaltmittel_Fstr_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDBUEWS Fstr Zuordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordnet eine zulässige Kombination von Fahrstraße und BÜ-Einschaltung für die Wirksamkeitsschaltung der Einschaltstelle zu. Falls Einschaltstellen von BÜ nur dann wirksam sein sollen, wenn bestimmte Fahrstraßen eingestellt sind, so werden in einem ersten Schritt Zuordnungsobjekte zwischen der Funktion Einschaltung eines BÜ und allen auf diesen BÜ zulaufenden Fahrstraßen gebildet. ID_BUE_WS_Fstr_Zuordnung verweist auf dieses Zuordnungsobjekt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUEWS Fstr Zuordnung</em>' containment reference.
	 * @see #setIDBUEWSFstrZuordnung(ID_BUE_WS_Fstr_Zuordnung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getSchaltmittel_Fstr_Zuordnung_IDBUEWSFstrZuordnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_WS_Fstr_Zuordnung'"
	 * @generated
	 */
	ID_BUE_WS_Fstr_Zuordnung_TypeClass getIDBUEWSFstrZuordnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Schaltmittel_Fstr_Zuordnung#getIDBUEWSFstrZuordnung <em>IDBUEWS Fstr Zuordnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUEWS Fstr Zuordnung</em>' containment reference.
	 * @see #getIDBUEWSFstrZuordnung()
	 * @generated
	 */
	void setIDBUEWSFstrZuordnung(ID_BUE_WS_Fstr_Zuordnung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Schaltmittel Zuordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordnet einer vom Befahren eines bestimmten Punktes abhängigen Funktion ein Schaltmittel zu. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Schaltmittel Zuordnung</em>' containment reference.
	 * @see #setIDSchaltmittelZuordnung(ID_Schaltmittel_Zuordnung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getSchaltmittel_Fstr_Zuordnung_IDSchaltmittelZuordnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Schaltmittel_Zuordnung'"
	 * @generated
	 */
	ID_Schaltmittel_Zuordnung_TypeClass getIDSchaltmittelZuordnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Schaltmittel_Fstr_Zuordnung#getIDSchaltmittelZuordnung <em>ID Schaltmittel Zuordnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Schaltmittel Zuordnung</em>' containment reference.
	 * @see #getIDSchaltmittelZuordnung()
	 * @generated
	 */
	void setIDSchaltmittelZuordnung(ID_Schaltmittel_Zuordnung_TypeClass value);

} // Schaltmittel_Fstr_Zuordnung
