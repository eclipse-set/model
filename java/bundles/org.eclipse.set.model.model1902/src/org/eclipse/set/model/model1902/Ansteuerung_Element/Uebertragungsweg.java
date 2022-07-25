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

import org.eclipse.set.model.model1902.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Uebertragungsweg_Nach_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Uebertragungsweg_Von_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uebertragungsweg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Physikalischer/logischer Übertragungsweg zwischen zwei Objekten für eine erforderliche Informationsübertragung. Die Angabe erfolgt, wenn der Übertragungsweg vom Betreiber beigestellt wird oder die Informationsübertragung vom Lieferanten zusätzlich zu schalten ist. Es geht um die Erfassung der physikalischen/logischen Verbindung zweier Objekte, die entweder einer funktionalen Verbindung zwischen den Objekten des Modells selbst dient, z.B. der ESTW-Bus zwischen zwei Aussenelementansteuerungen; einer funktionalen Verbindung eines Objektes des Modells zu einer nicht im Modell befindlichen Komponente dient, z.B. der Anbindung der KUS über die ZN_ZBS an die Leittechnik der BZ; einer funktionalen Verbindung zwischen zwei Komponenten, die nicht im Modell abgebildet sind, aber über diese angebunden werden und darum für die SBI dokumentiert werden müssen, z.B. die Verbindung von der LZB-Zentrale in der ESTW Zentraleinheit zum LZB-Bedienplatz in der Bedien Zentrale. Je nach Art und Anwendungsfall kann ein Objekt nur eine oder auch mehrere Verbindungen zu einem oder mehreren anderen Objekten haben. Der Anschluss von stellwerkstypischen Elementen an das Stellwerk (Kabelanlage) wird nicht mit diesem Objekt abgebildet. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Uebertragungsweg#getIDAnhangUeWegNach <em>ID Anhang Ue Weg Nach</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Uebertragungsweg#getIDAnhangUeWegVon <em>ID Anhang Ue Weg Von</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Uebertragungsweg#getIDUebertragungswegNach <em>ID Uebertragungsweg Nach</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Uebertragungsweg#getIDUebertragungswegVon <em>ID Uebertragungsweg Von</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Uebertragungsweg#getUebertragungswegArt <em>Uebertragungsweg Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Uebertragungsweg#getUebertragungswegTechnik <em>Uebertragungsweg Technik</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getUebertragungsweg()
 * @model extendedMetaData="name='CUebertragungsweg' kind='elementOnly'"
 * @generated
 */
public interface Uebertragungsweg extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Anhang Ue Weg Nach</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_Anhang_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entsprechender (Lage)Plan oder Beschreibung als Anhang.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Ue Weg Nach</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getUebertragungsweg_IDAnhangUeWegNach()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_UeWeg_Nach'"
	 * @generated
	 */
	EList<ID_Anhang_TypeClass> getIDAnhangUeWegNach();

	/**
	 * Returns the value of the '<em><b>ID Anhang Ue Weg Von</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_Anhang_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entsprechender (Lage)Plan oder Beschreibung als Anhang.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Ue Weg Von</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getUebertragungsweg_IDAnhangUeWegVon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_UeWeg_Von'"
	 * @generated
	 */
	EList<ID_Anhang_TypeClass> getIDAnhangUeWegVon();

	/**
	 * Returns the value of the '<em><b>ID Uebertragungsweg Nach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information, nach wo die Verbindung hergestellt werden soll. Beispiel: Bedien_Bezirk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Uebertragungsweg Nach</em>' containment reference.
	 * @see #setIDUebertragungswegNach(ID_Uebertragungsweg_Nach_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getUebertragungsweg_IDUebertragungswegNach()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Uebertragungsweg_Nach'"
	 * @generated
	 */
	ID_Uebertragungsweg_Nach_TypeClass getIDUebertragungswegNach();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Uebertragungsweg#getIDUebertragungswegNach <em>ID Uebertragungsweg Nach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Uebertragungsweg Nach</em>' containment reference.
	 * @see #getIDUebertragungswegNach()
	 * @generated
	 */
	void setIDUebertragungswegNach(ID_Uebertragungsweg_Nach_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Uebertragungsweg Von</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information, von wo die Verbindung hergestellt werden soll. Beispiel: ESTW_Zentraleinheit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Uebertragungsweg Von</em>' containment reference.
	 * @see #setIDUebertragungswegVon(ID_Uebertragungsweg_Von_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getUebertragungsweg_IDUebertragungswegVon()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Uebertragungsweg_Von'"
	 * @generated
	 */
	ID_Uebertragungsweg_Von_TypeClass getIDUebertragungswegVon();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Uebertragungsweg#getIDUebertragungswegVon <em>ID Uebertragungsweg Von</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Uebertragungsweg Von</em>' containment reference.
	 * @see #getIDUebertragungswegVon()
	 * @generated
	 */
	void setIDUebertragungswegVon(ID_Uebertragungsweg_Von_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Uebertragungsweg Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verwendung des Übertragungsweges. Beispiel: UZ-BZ-Verbindung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uebertragungsweg Art</em>' containment reference.
	 * @see #setUebertragungswegArt(Uebertragungsweg_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getUebertragungsweg_UebertragungswegArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Uebertragungsweg_Art'"
	 * @generated
	 */
	Uebertragungsweg_Art_TypeClass getUebertragungswegArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Uebertragungsweg#getUebertragungswegArt <em>Uebertragungsweg Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uebertragungsweg Art</em>' containment reference.
	 * @see #getUebertragungswegArt()
	 * @generated
	 */
	void setUebertragungswegArt(Uebertragungsweg_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Uebertragungsweg Technik</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uebertragungsweg Technik</em>' containment reference.
	 * @see #setUebertragungswegTechnik(Uebertragungsweg_Technik_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getUebertragungsweg_UebertragungswegTechnik()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Uebertragungsweg_Technik'"
	 * @generated
	 */
	Uebertragungsweg_Technik_AttributeGroup getUebertragungswegTechnik();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Uebertragungsweg#getUebertragungswegTechnik <em>Uebertragungsweg Technik</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uebertragungsweg Technik</em>' containment reference.
	 * @see #getUebertragungswegTechnik()
	 * @generated
	 */
	void setUebertragungswegTechnik(Uebertragungsweg_Technik_AttributeGroup value);

} // Uebertragungsweg
