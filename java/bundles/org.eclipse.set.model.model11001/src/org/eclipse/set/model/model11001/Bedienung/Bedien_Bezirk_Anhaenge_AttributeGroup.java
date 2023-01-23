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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_Anhang_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Bezirk Anhaenge Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangAnbindungIB2 <em>ID Anhang Anbindung IB2</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangAnbindungIB3 <em>ID Anhang Anbindung IB3</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangSteuerbezUebersicht <em>ID Anhang Steuerbez Uebersicht</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Bezirk_Anhaenge_AttributeGroup()
 * @model extendedMetaData="name='CBedien_Bezirk_Anhaenge' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Bezirk_Anhaenge_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Anhang Anbindung IB2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plan zur Kabel-/Trassen-/Datenanbindung. Pläne können z. B. zur Darstellung der Kabelverbindungen vom IB 1 zum IB 2 angefügt werden. Die Unterlagen sind in den Standorten unterschiedlich oder gar nicht vorhanden und werden ggf. als Anlage der AP PT 1 beigefügt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Anbindung IB2</em>' containment reference.
	 * @see #setIDAnhangAnbindungIB2(ID_Anhang_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangAnbindungIB2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Anbindung_IB2'"
	 * @generated
	 */
	ID_Anhang_TypeClass getIDAnhangAnbindungIB2();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangAnbindungIB2 <em>ID Anhang Anbindung IB2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Anbindung IB2</em>' containment reference.
	 * @see #getIDAnhangAnbindungIB2()
	 * @generated
	 */
	void setIDAnhangAnbindungIB2(ID_Anhang_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Anhang Anbindung IB3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plan zur Kabel-/Trassen-/Datenanbindung. Pläne können z. B. zur Darstellung der Kabelverbindungen vom IB 1 zum IB 3 angefügt werden. Die Unterlagen sind in den Standorten unterschiedlich oder gar nicht vorhanden und werden ggf. als Anlage der AP PT 1 beigefügt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Anbindung IB3</em>' containment reference.
	 * @see #setIDAnhangAnbindungIB3(ID_Anhang_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangAnbindungIB3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Anbindung_IB3'"
	 * @generated
	 */
	ID_Anhang_TypeClass getIDAnhangAnbindungIB3();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangAnbindungIB3 <em>ID Anhang Anbindung IB3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Anbindung IB3</em>' containment reference.
	 * @see #getIDAnhangAnbindungIB3()
	 * @generated
	 */
	void setIDAnhangAnbindungIB3(ID_Anhang_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Anhang Steuerbez Uebersicht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesen Anhang wird die Steuerbezirksübersicht gemäß 819.0603 als PDF eingebettet. Beispiel: Media:Steuerbezirksuebersicht.pdf DB-Regelwerk 819.0603 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Steuerbez Uebersicht</em>' containment reference.
	 * @see #setIDAnhangSteuerbezUebersicht(ID_Anhang_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangSteuerbezUebersicht()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Steuerbez_Uebersicht'"
	 * @generated
	 */
	ID_Anhang_TypeClass getIDAnhangSteuerbezUebersicht();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangSteuerbezUebersicht <em>ID Anhang Steuerbez Uebersicht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Steuerbez Uebersicht</em>' containment reference.
	 * @see #getIDAnhangSteuerbezUebersicht()
	 * @generated
	 */
	void setIDAnhangSteuerbezUebersicht(ID_Anhang_TypeClass value);

} // Bedien_Bezirk_Anhaenge_AttributeGroup
