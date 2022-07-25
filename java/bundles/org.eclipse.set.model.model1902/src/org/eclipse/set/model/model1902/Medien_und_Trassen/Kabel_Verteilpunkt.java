/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Medien_und_Trassen;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kabel Verteilpunkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Punktförmige Installation zur Aufteilung bzw. Verschaltung von Kabeln (ohne Intelligenz).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Verteilpunkt#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Verteilpunkt#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Verteilpunkt#getKabelVerteilpunktArt <em>Kabel Verteilpunkt Art</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Verteilpunkt()
 * @model extendedMetaData="name='CKabel_Verteilpunkt' kind='elementOnly'"
 * @generated
 */
public interface Kabel_Verteilpunkt extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Kabel_Verteilpunkt_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Verteilpunkt_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Kabel_Verteilpunkt_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Verteilpunkt#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Kabel_Verteilpunkt_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Kabel-Verteilpunkts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #setIDUnterbringung(ID_Unterbringung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Verteilpunkt_IDUnterbringung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	ID_Unterbringung_TypeClass getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Verteilpunkt#getIDUnterbringung <em>ID Unterbringung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(ID_Unterbringung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Kabel Verteilpunkt Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Unterbringung des Kabel-Verteilpunkts. Als Art der Unterbringung ist dabei immer \"keine\" auszuwählen, da der Kabel-Verteilpunkt selbst die physische Unterbringung definiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kabel Verteilpunkt Art</em>' containment reference.
	 * @see #setKabelVerteilpunktArt(Kabel_Verteilpunkt_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Verteilpunkt_KabelVerteilpunktArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Kabel_Verteilpunkt_Art'"
	 * @generated
	 */
	Kabel_Verteilpunkt_Art_TypeClass getKabelVerteilpunktArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Verteilpunkt#getKabelVerteilpunktArt <em>Kabel Verteilpunkt Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kabel Verteilpunkt Art</em>' containment reference.
	 * @see #getKabelVerteilpunktArt()
	 * @generated
	 */
	void setKabelVerteilpunktArt(Kabel_Verteilpunkt_Art_TypeClass value);

} // Kabel_Verteilpunkt
