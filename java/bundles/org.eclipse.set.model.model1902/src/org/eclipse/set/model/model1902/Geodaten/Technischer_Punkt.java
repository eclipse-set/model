/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten;

import org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technischer Punkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Beschreibung sonstiger punktförmiger Objekte im Datenmodell. Diese werde durch Fremdsysteme bereitgestellt oder während einer Planung manuell ergänzt. Sie dienen nur zur Information für planerische Entscheidungen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.Technischer_Punkt#getTPArt <em>TP Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.Technischer_Punkt#getTPBeschreibung <em>TP Beschreibung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getTechnischer_Punkt()
 * @model extendedMetaData="name='CTechnischer_Punkt' kind='elementOnly'"
 * @generated
 */
public interface Technischer_Punkt extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>TP Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des technischen Punktes. Anhand der in der Planung entstehenden Erfahrungen wird die ENUM-Liste erweitert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TP Art</em>' containment reference.
	 * @see #setTPArt(TP_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getTechnischer_Punkt_TPArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TP_Art'"
	 * @generated
	 */
	TP_Art_TypeClass getTPArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.Technischer_Punkt#getTPArt <em>TP Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TP Art</em>' containment reference.
	 * @see #getTPArt()
	 * @generated
	 */
	void setTPArt(TP_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>TP Beschreibung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verbale Beschreibung oder Bezeichnung des technischen Punktes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TP Beschreibung</em>' containment reference.
	 * @see #setTPBeschreibung(TP_Beschreibung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getTechnischer_Punkt_TPBeschreibung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TP_Beschreibung'"
	 * @generated
	 */
	TP_Beschreibung_TypeClass getTPBeschreibung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.Technischer_Punkt#getTPBeschreibung <em>TP Beschreibung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TP Beschreibung</em>' containment reference.
	 * @see #getTPBeschreibung()
	 * @generated
	 */
	void setTPBeschreibung(TP_Beschreibung_TypeClass value);

} // Technischer_Punkt
