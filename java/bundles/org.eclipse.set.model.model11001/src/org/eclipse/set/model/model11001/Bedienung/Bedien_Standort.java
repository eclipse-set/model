/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_Unterbringung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Standort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bei DSTW: Standort, von dem die Bedienung der DSTW erfolgt. Von einem Bedienstandort können mehrere Technikstandorte bedient werden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Standort#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Standort#getBSOIPAdressblock <em>BSOIP Adressblock</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Standort#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Standort()
 * @model extendedMetaData="name='CBedien_Standort' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Standort extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bedien_Standort_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Standort_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bedien_Standort_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Standort#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bedien_Standort_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>BSOIP Adressblock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BSOIP Adressblock</em>' containment reference.
	 * @see #setBSOIPAdressblock(BSO_IP_Adressblock_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Standort_BSOIPAdressblock()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BSO_IP_Adressblock'"
	 * @generated
	 */
	BSO_IP_Adressblock_AttributeGroup getBSOIPAdressblock();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Standort#getBSOIPAdressblock <em>BSOIP Adressblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BSOIP Adressblock</em>' containment reference.
	 * @see #getBSOIPAdressblock()
	 * @generated
	 */
	void setBSOIPAdressblock(BSO_IP_Adressblock_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Unterbringung (Gebäude), in der der Bedien-Standort untergebracht ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #setIDUnterbringung(ID_Unterbringung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Standort_IDUnterbringung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	ID_Unterbringung_TypeClass getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Standort#getIDUnterbringung <em>ID Unterbringung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(ID_Unterbringung_TypeClass value);

} // Bedien_Standort
