/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Bedien_Standort_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technik Standort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bei DSTW: Bündelung der technischen Anlagen für ESTW_Zentraleinheit, Telekommunikation, Prozessdaten- und Diagnoseschnittstellen sowie die zugehörige technische Gebäudeausrüstung. Je Netzbezirk ist ein Technikstandort vorgesehen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Technik_Standort#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Technik_Standort#getIDBedienStandort <em>ID Bedien Standort</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Technik_Standort#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Technik_Standort#getTSOIPAdressblock <em>TSOIP Adressblock</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getTechnik_Standort()
 * @model extendedMetaData="name='CTechnik_Standort' kind='elementOnly'"
 * @generated
 */
public interface Technik_Standort extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Technik_Standort_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getTechnik_Standort_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Technik_Standort_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Technik_Standort#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Technik_Standort_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Bedien Standort</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_Bedien_Standort_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Bedien-Standort, von dem aus der Technik-Standort bedient wird. Der Verweis dient der Abbildung der vorgesehenen n zu m-Zuordnung zwischen TSO und BSO. Die Angabe erfolgt im Rahmen der Planung des Untergewerks Bedienung Fdl.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Standort</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getTechnik_Standort_IDBedienStandort()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Standort'"
	 * @generated
	 */
	EList<ID_Bedien_Standort_TypeClass> getIDBedienStandort();

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Unterbringung (Gebäude), in der der Technik-Standort untergebracht ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #setIDUnterbringung(ID_Unterbringung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getTechnik_Standort_IDUnterbringung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	ID_Unterbringung_TypeClass getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Technik_Standort#getIDUnterbringung <em>ID Unterbringung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(ID_Unterbringung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>TSOIP Adressblock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TSOIP Adressblock</em>' containment reference.
	 * @see #setTSOIPAdressblock(TSO_IP_Adressblock_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getTechnik_Standort_TSOIPAdressblock()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TSO_IP_Adressblock'"
	 * @generated
	 */
	TSO_IP_Adressblock_AttributeGroup getTSOIPAdressblock();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Technik_Standort#getTSOIPAdressblock <em>TSOIP Adressblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TSOIP Adressblock</em>' containment reference.
	 * @see #getTSOIPAdressblock()
	 * @generated
	 */
	void setTSOIPAdressblock(TSO_IP_Adressblock_AttributeGroup value);

} // Technik_Standort
