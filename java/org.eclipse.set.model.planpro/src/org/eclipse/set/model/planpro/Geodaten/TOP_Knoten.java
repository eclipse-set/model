/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_GEO_Knoten_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOP Knoten</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Knoten des topologischen Knoten-Kanten-Modells. Der TOP_Knoten verweist auf einen GEO_Knoten. Die Anzahl der an den TOP_Knoten anschließenden topologischen Kanten ist je nach Art des TOP_Knoten unterschiedlich und muss mit der Anzahl der an den zugehörigen GEO Knoten anschließenden GEO_Kanten übereinstimmen: eine TOP-Kante: Gleisende, Digitalisierungsende, Betrachtungsende; drei TOP-Kanten: verzweigendes Fahrwegelement (siehe Modellierung Weichen). Weitere Fälle mit 0..2 anschließenden TOP-Kanten treten am Verbindungsknoten auf (siehe entsprechende Beschreibung). Im Fall eines Meridiansprungs werden zwei TOP_Knoten angelegt, die mit einer TOP_Kante der Länge Null verbunden werden. an die beiden TOP_Knoten schließen also genau zwei TOP_Kanten an.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.TOP_Knoten#getIDGEOKnoten <em>IDGEO Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.TOP_Knoten#getKnotenname <em>Knotenname</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getTOP_Knoten()
 * @model extendedMetaData="name='CTOP_Knoten' kind='elementOnly'"
 * @generated
 */
public interface TOP_Knoten extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDGEO Knoten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein TOP_Knoten fällt immer mit einem GEO_Knoten der Gleislinie zusammen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Knoten</em>' containment reference.
	 * @see #setIDGEOKnoten(ID_GEO_Knoten_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getTOP_Knoten_IDGEOKnoten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Knoten'"
	 * @generated
	 */
	ID_GEO_Knoten_TypeClass getIDGEOKnoten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.TOP_Knoten#getIDGEOKnoten <em>IDGEO Knoten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGEO Knoten</em>' containment reference.
	 * @see #getIDGEOKnoten()
	 * @generated
	 */
	void setIDGEOKnoten(ID_GEO_Knoten_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Knotenname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung für den Knoten. Die Bezeichnung wird aus AVANI übernommen um die Referenz sicherzustellen. Führende Leerzeichen sind bei der Datenübernahme zu erhalten. Bei Neutrassierung kann diese Bezeichnung leer bleiben. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Knotenname</em>' containment reference.
	 * @see #setKnotenname(Knotenname_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getTOP_Knoten_Knotenname()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Knotenname'"
	 * @generated
	 */
	Knotenname_TypeClass getKnotenname();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.TOP_Knoten#getKnotenname <em>Knotenname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knotenname</em>' containment reference.
	 * @see #getKnotenname()
	 * @generated
	 */
	void setKnotenname(Knotenname_TypeClass value);

} // TOP_Knoten
