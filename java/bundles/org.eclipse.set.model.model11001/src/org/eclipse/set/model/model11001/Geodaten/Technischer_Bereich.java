/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Geodaten;

import org.eclipse.set.model.model11001.Basisobjekte.Bereich_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technischer Bereich</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Beschreibung sonstiger bereichsförmiger Objekte im Datenmodell. Diese werde durch Fremdsysteme bereitgestellt oder während einer Planung manuell ergänzt. Sie dienen nur zur Information für planerische Entscheidungen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.Technischer_Bereich#getTBArt <em>TB Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.Technischer_Bereich#getTBBeschreibung <em>TB Beschreibung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getTechnischer_Bereich()
 * @model extendedMetaData="name='CTechnischer_Bereich' kind='elementOnly'"
 * @generated
 */
public interface Technischer_Bereich extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>TB Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des technischen Bereichs. Anhand der in der Planung entstehenden Erfahrungen wird die ENUM-Liste erweitert. 
	 * Schutzwand: bauliches Element in unmittelbarer Nähe des Gleises, das bei der Platzierung von Elementen zu berücksichtigen ist (z. B. Stützmauer, Schallschutzwand).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TB Art</em>' containment reference.
	 * @see #setTBArt(TB_Art_TypeClass)
	 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getTechnischer_Bereich_TBArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TB_Art'"
	 * @generated
	 */
	TB_Art_TypeClass getTBArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Geodaten.Technischer_Bereich#getTBArt <em>TB Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TB Art</em>' containment reference.
	 * @see #getTBArt()
	 * @generated
	 */
	void setTBArt(TB_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>TB Beschreibung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verbale Beschreibung oder Bezeichnung des technischen Bereichs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TB Beschreibung</em>' containment reference.
	 * @see #setTBBeschreibung(TB_Beschreibung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getTechnischer_Bereich_TBBeschreibung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TB_Beschreibung'"
	 * @generated
	 */
	TB_Beschreibung_TypeClass getTBBeschreibung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Geodaten.Technischer_Bereich#getTBBeschreibung <em>TB Beschreibung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TB Beschreibung</em>' containment reference.
	 * @see #getTBBeschreibung()
	 * @generated
	 */
	void setTBBeschreibung(TB_Beschreibung_TypeClass value);

} // Technischer_Bereich
