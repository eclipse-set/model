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

import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hoehenpunkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Örtliche Höhe des Bezugspunkts in Metern gemäß Höhensystem. Liegt der Höhenpunkt innerhalb des zugehörigen Gleises, entfällt die Angabe eines seitlichen Abstands bzw. einer seitlichen Lage. Wird ein seitlicher Abstand ungleich 0.000 angegeben, so handelt es sich um einen sonstigen Höhenpunkt, der nicht die Höhenlage des Gleises angibt. Ein Höhenpunkt, der unmittelbar auf einem Anfang oder Ende eines Weichenschenkels liegt (TOP_Kante, mit Anschluss_A oder Anschluss_B als Links oder Rechts) ist auf die TOP_Kante der Spitze dieser Weiche zu verorten.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.Hoehenpunkt#getHoehenpunktAllg <em>Hoehenpunkt Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getHoehenpunkt()
 * @model extendedMetaData="name='CHoehenpunkt' kind='elementOnly'"
 * @generated
 */
public interface Hoehenpunkt extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>Hoehenpunkt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hoehenpunkt Allg</em>' containment reference.
	 * @see #setHoehenpunktAllg(Hoehenpunkt_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getHoehenpunkt_HoehenpunktAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Hoehenpunkt_Allg'"
	 * @generated
	 */
	Hoehenpunkt_Allg_AttributeGroup getHoehenpunktAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Geodaten.Hoehenpunkt#getHoehenpunktAllg <em>Hoehenpunkt Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehenpunkt Allg</em>' containment reference.
	 * @see #getHoehenpunktAllg()
	 * @generated
	 */
	void setHoehenpunktAllg(Hoehenpunkt_Allg_AttributeGroup value);

} // Hoehenpunkt
