/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Weichen_und_Gleissperren;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_Signal_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Weichenlaufkette_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weichenlaufkette Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Logisches Objekt für die Zuordnung zwischen Weichenlaufketten und Signalen. Das Objekt ist in der Realität des Stellwerkes nicht vorhanden. Die Weichenlaufkette_Zuordnung hat keine Attributgruppe \"..._Allgemeine_Merkmale\".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung#getIDWeichenlaufkette <em>ID Weichenlaufkette</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getWeichenlaufkette_Zuordnung()
 * @model extendedMetaData="name='CWeichenlaufkette_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface Weichenlaufkette_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Signal, dem die Weichenlaufkette zugeordnet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' containment reference.
	 * @see #setIDSignal(ID_Signal_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getWeichenlaufkette_Zuordnung_IDSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	ID_Signal_TypeClass getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung#getIDSignal <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal</em>' containment reference.
	 * @see #getIDSignal()
	 * @generated
	 */
	void setIDSignal(ID_Signal_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Weichenlaufkette</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Weichenlaufkette, die dem Signal zugeordnet wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Weichenlaufkette</em>' containment reference.
	 * @see #setIDWeichenlaufkette(ID_Weichenlaufkette_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getWeichenlaufkette_Zuordnung_IDWeichenlaufkette()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Weichenlaufkette'"
	 * @generated
	 */
	ID_Weichenlaufkette_TypeClass getIDWeichenlaufkette();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung#getIDWeichenlaufkette <em>ID Weichenlaufkette</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Weichenlaufkette</em>' containment reference.
	 * @see #getIDWeichenlaufkette()
	 * @generated
	 */
	void setIDWeichenlaufkette(ID_Weichenlaufkette_TypeClass value);

} // Weichenlaufkette_Zuordnung
