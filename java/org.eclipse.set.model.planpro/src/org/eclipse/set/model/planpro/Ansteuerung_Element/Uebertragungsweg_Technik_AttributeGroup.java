/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uebertragungsweg Technik Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg_Technik_AttributeGroup#getBandbreite <em>Bandbreite</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg_Technik_AttributeGroup#getMediumArt <em>Medium Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg_Technik_AttributeGroup#getNetzArt <em>Netz Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg_Technik_AttributeGroup#getTechnikArt <em>Technik Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg_Technik_AttributeGroup#getTechnikBeschreibung <em>Technik Beschreibung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getUebertragungsweg_Technik_AttributeGroup()
 * @model extendedMetaData="name='CUebertragungsweg_Technik' kind='elementOnly'"
 * @generated
 */
public interface Uebertragungsweg_Technik_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bandbreite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibt die nötige Bandbreite des Übertragungsweges. Beispiel: 2Mbit_s bei UZ-BZ-Verbindung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bandbreite</em>' containment reference.
	 * @see #setBandbreite(Bandbreite_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getUebertragungsweg_Technik_AttributeGroup_Bandbreite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bandbreite'"
	 * @generated
	 */
	Bandbreite_TypeClass getBandbreite();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg_Technik_AttributeGroup#getBandbreite <em>Bandbreite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandbreite</em>' containment reference.
	 * @see #getBandbreite()
	 * @generated
	 */
	void setBandbreite(Bandbreite_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Medium Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibt den Übergabepunkt des Übertragungsweges in dessen physikalischer Ausprägung. Beispiel: ADO8-Dose bei ZBS-Verbindung, RJ45-Port bei UZ-BZ-Verbindung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medium Art</em>' containment reference.
	 * @see #setMediumArt(Medium_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getUebertragungsweg_Technik_AttributeGroup_MediumArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Medium_Art'"
	 * @generated
	 */
	Medium_Art_TypeClass getMediumArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg_Technik_AttributeGroup#getMediumArt <em>Medium Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium Art</em>' containment reference.
	 * @see #getMediumArt()
	 * @generated
	 */
	void setMediumArt(Medium_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Netz Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibt die Art des Übertragungsnetzes, ggf. auch die Anforderungen. Beispiel: geschlossenes Netz oder offenes Netz bei der ZBS-Verbindung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Netz Art</em>' containment reference.
	 * @see #setNetzArt(Netz_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getUebertragungsweg_Technik_AttributeGroup_NetzArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Netz_Art'"
	 * @generated
	 */
	Netz_Art_TypeClass getNetzArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg_Technik_AttributeGroup#getNetzArt <em>Netz Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Netz Art</em>' containment reference.
	 * @see #getNetzArt()
	 * @generated
	 */
	void setNetzArt(Netz_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Technik Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technische Ausprägung der physikalischen Schnittstelle. Beispiel: G.703, Ethernet oder LWL_Faser.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technik Art</em>' containment reference.
	 * @see #setTechnikArt(Technik_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getUebertragungsweg_Technik_AttributeGroup_TechnikArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Technik_Art'"
	 * @generated
	 */
	Technik_Art_TypeClass getTechnikArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg_Technik_AttributeGroup#getTechnikArt <em>Technik Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technik Art</em>' containment reference.
	 * @see #getTechnikArt()
	 * @generated
	 */
	void setTechnikArt(Technik_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Technik Beschreibung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung der technischen Realisierung des Übertragungsweges in Textform.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technik Beschreibung</em>' containment reference.
	 * @see #setTechnikBeschreibung(Technik_Beschreibung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getUebertragungsweg_Technik_AttributeGroup_TechnikBeschreibung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Technik_Beschreibung'"
	 * @generated
	 */
	Technik_Beschreibung_TypeClass getTechnikBeschreibung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg_Technik_AttributeGroup#getTechnikBeschreibung <em>Technik Beschreibung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technik Beschreibung</em>' containment reference.
	 * @see #getTechnikBeschreibung()
	 * @generated
	 */
	void setTechnikBeschreibung(Technik_Beschreibung_TypeClass value);

} // Uebertragungsweg_Technik_AttributeGroup
