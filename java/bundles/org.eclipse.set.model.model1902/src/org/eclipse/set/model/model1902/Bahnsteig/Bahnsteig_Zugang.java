/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnsteig;

import org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Bahnsteig_Anlage_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bahnsteig Zugang</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zugangspunkt der Reisenden zum Bahnsteig. Es wird jeweils die Mitte der Linie angegeben, auf der der Zugangsweg auf den Bahnsteig stößt. Für die Verwendung im Sicherungstechnischen Lageplan während der Bearbeitung wurde ein neues Symbol erschaffen. Dieses soll im endgültigen Lageplan nicht erscheinen. Der Zugang ist in der LST-Planung für die INA-Berechnung relevant. Hierbei wird der Punkt auf der Bahnsteigkante benötigt, an der der Zustrom der Reisenden erfolgt. Dieser Punkt wird im Datenmodell nicht abgespeichert, er kann aus Bahnsteig_Zugang hergeleitet werden. DB-Regelwerk Nennung des Zugangs im INA-Erhebungsbogen, Verortung erfolgt bisher nicht
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang#getBahnsteigZugangAllg <em>Bahnsteig Zugang Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang#getIDBahnsteigAnlage <em>ID Bahnsteig Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnsteig.BahnsteigPackage#getBahnsteig_Zugang()
 * @model extendedMetaData="name='CBahnsteig_Zugang' kind='elementOnly'"
 * @generated
 */
public interface Bahnsteig_Zugang extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>Bahnsteig Zugang Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bahnsteig Zugang Allg</em>' containment reference.
	 * @see #setBahnsteigZugangAllg(Bahnsteig_Zugang_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Bahnsteig.BahnsteigPackage#getBahnsteig_Zugang_BahnsteigZugangAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bahnsteig_Zugang_Allg'"
	 * @generated
	 */
	Bahnsteig_Zugang_Allg_AttributeGroup getBahnsteigZugangAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang#getBahnsteigZugangAllg <em>Bahnsteig Zugang Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bahnsteig Zugang Allg</em>' containment reference.
	 * @see #getBahnsteigZugangAllg()
	 * @generated
	 */
	void setBahnsteigZugangAllg(Bahnsteig_Zugang_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Bahnsteig Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung einer Bahnsteigkante oder eines Bahnsteigzugangs zu einer Bahnsteiganlage. DB-Regelwerk Zusammenhang wird aus der Darstellung im sicherungstechnischen Lageplan ersichtlich
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bahnsteig Anlage</em>' containment reference.
	 * @see #setIDBahnsteigAnlage(ID_Bahnsteig_Anlage_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnsteig.BahnsteigPackage#getBahnsteig_Zugang_IDBahnsteigAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bahnsteig_Anlage'"
	 * @generated
	 */
	ID_Bahnsteig_Anlage_TypeClass getIDBahnsteigAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang#getIDBahnsteigAnlage <em>ID Bahnsteig Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bahnsteig Anlage</em>' containment reference.
	 * @see #getIDBahnsteigAnlage()
	 * @generated
	 */
	void setIDBahnsteigAnlage(ID_Bahnsteig_Anlage_TypeClass value);

} // Bahnsteig_Zugang
