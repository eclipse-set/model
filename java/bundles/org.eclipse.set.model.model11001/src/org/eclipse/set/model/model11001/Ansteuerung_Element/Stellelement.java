/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ansteuerung_Element;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_Aussenelementansteuerung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stellelement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zusammenfassung der gemeinsamen Eigenschaften aller elektrisch bedienbaren Elemente der Außenanlage sowie der BÜ-Schnittstelle. Folgende Elemente sind Stellelemente: BUE Schnittstelle, PZB Element, Schluesselsperre, Signal, W Kr Gsp Element. Die Übertragung von Information (Daten) und Energie ist in getrennten Verweisen modelliert. Erfolgt die Übertragung von Information und Energie gemeinsam, so sind beide Verweise mit dem gleichen Verweisziel anzugeben. DB-Regelwerk Die Zusammenfassung der Stellelemente dient der Vereinheitlichung der Modellierung und wird heute nicht explizit geplant.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.Stellelement#getIDEnergie <em>ID Energie</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.Stellelement#getIDInformation <em>ID Information</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getStellelement()
 * @model extendedMetaData="name='CStellelement' kind='elementOnly'"
 * @generated
 */
public interface Stellelement extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Energie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Aussenelementansteuerung, von der die Energieversorgung des Stellelements oder der FMA Komponente erfolgt. Objekte, die Stellelemente\" href=\"//Stellelement\"\u003eStellelemente sind, enthalten keine eigenen Attribute ID_Energie und ID Information, sondern verweisen auf das Objekt Stellelement, das diese Attribute enthält. Nicht-Stellelemente (z. B. der Achszählpunkt als FMA Komponente) hingegen müssen diese Attribute selbst enthalten. DB-Regelwerk bei Achszählpunkten: Achszählpunkttabelle, Spalte 4 (und redundant dazu: Freimeldetabelle, Spalte 4); bei anderen Typen von Freimeldeanlagen: im bisherigen PT1 ohne eindeutige Darstellung, in der Regel mittelbar aus dem Sicherungstechnischen Lageplan/BÜ-Lageplan ermittelbar. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Energie</em>' containment reference.
	 * @see #setIDEnergie(ID_Aussenelementansteuerung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getStellelement_IDEnergie()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Energie'"
	 * @generated
	 */
	ID_Aussenelementansteuerung_TypeClass getIDEnergie();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.Stellelement#getIDEnergie <em>ID Energie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Energie</em>' containment reference.
	 * @see #getIDEnergie()
	 * @generated
	 */
	void setIDEnergie(ID_Aussenelementansteuerung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Aussenelementansteuerung, von der die Informationsversorgung des Stellelements bzw. die Informationsverarbeitung der FMA Komponente erfolgt. Objekte, die Stellelemente\" href=\"//Stellelement\"\u003eStellelemente sind, enthalten keine eigenen Attribute ID Energie und ID_Information, sondern verweisen auf das Objekt Stellelement, das diese Attribute enthält. Nicht-Stellelemente (z.B. der Achszählpunkt als FMA Komponente) hingegen müssen diese Attribute selbst enthalten. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Information</em>' containment reference.
	 * @see #setIDInformation(ID_Aussenelementansteuerung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getStellelement_IDInformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Information'"
	 * @generated
	 */
	ID_Aussenelementansteuerung_TypeClass getIDInformation();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.Stellelement#getIDInformation <em>ID Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Information</em>' containment reference.
	 * @see #getIDInformation()
	 * @generated
	 */
	void setIDInformation(ID_Aussenelementansteuerung_TypeClass value);

} // Stellelement
