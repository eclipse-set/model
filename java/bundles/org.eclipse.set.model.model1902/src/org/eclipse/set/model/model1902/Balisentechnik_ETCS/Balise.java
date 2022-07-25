/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Datenpunkt_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Balise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bauelement zur Übertragung von Telegrammen an ETCS-Fahrzeugeinrichtungen. Gesteuerte Balisen sind anhand des Verweises LEU_Ausgang.ID_Balise auf diese Balise zu erkennen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balise#getBaliseAllg <em>Balise Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balise#getIDDatenpunkt <em>ID Datenpunkt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBalise()
 * @model extendedMetaData="name='CBalise' kind='elementOnly'"
 * @generated
 */
public interface Balise extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Balise Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balise Allg</em>' containment reference.
	 * @see #setBaliseAllg(Balise_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBalise_BaliseAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Balise_Allg'"
	 * @generated
	 */
	Balise_Allg_AttributeGroup getBaliseAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balise#getBaliseAllg <em>Balise Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balise Allg</em>' containment reference.
	 * @see #getBaliseAllg()
	 * @generated
	 */
	void setBaliseAllg(Balise_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Datenpunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Datenpunkt, zu dem die Balise gehört. Die maximale Anzahl von 16 Balisen für einen Datenpunkt ergibt sich aus der Möglichkeit duplizierter Balisen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Datenpunkt</em>' containment reference.
	 * @see #setIDDatenpunkt(ID_Datenpunkt_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBalise_IDDatenpunkt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Datenpunkt'"
	 * @generated
	 */
	ID_Datenpunkt_ohne_Proxy_TypeClass getIDDatenpunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balise#getIDDatenpunkt <em>ID Datenpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Datenpunkt</em>' containment reference.
	 * @see #getIDDatenpunkt()
	 * @generated
	 */
	void setIDDatenpunkt(ID_Datenpunkt_ohne_Proxy_TypeClass value);

} // Balise
