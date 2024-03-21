/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ortung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMA Anlage Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Bezeichnung_AttributeGroup#getBezeichnungKennbuchstabe <em>Bezeichnung Kennbuchstabe</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Anlage_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CFMA_Anlage_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface FMA_Anlage_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung Kennbuchstabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestandteil der vollständigen Bezeichnung einer FMA Anlage. Die Bezeichnung eines Freimeldeabschnittes besteht aus Kennzahl, Kennbuchstaben und Örtlichem Elementbezeichner des Gleisabschnitts. Kennzahl und Bezeichnung des Gleisabschnitts können über ID Gleis Abschnitt ermittelt werden, die Attribute der Gruppe \"Bezeichnung\" werden für FMA_Anlagen nicht befüllt. Die Herleitung des Kennbuchstabens aus Attributen des Gleises und des Gleisabschnitts ist schwierig und in einigen Fällen unsicher, daher erfolgt im Unterschied zu anderen Objekten eine direkte Abspeicherung als Ergänzung innerhalb der Attributgruppe \"Bezeichnung\". Ein Beispiel ist unter Modellierung Gleisfreimeldung zu finden. DB-Regelwerk Planungsdaten: Freimeldetabelle, Spalte 1 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Kennbuchstabe</em>' containment reference.
	 * @see #setBezeichnungKennbuchstabe(Bezeichnung_Kennbuchstabe_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Anlage_Bezeichnung_AttributeGroup_BezeichnungKennbuchstabe()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Kennbuchstabe'"
	 * @generated
	 */
	Bezeichnung_Kennbuchstabe_TypeClass getBezeichnungKennbuchstabe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Bezeichnung_AttributeGroup#getBezeichnungKennbuchstabe <em>Bezeichnung Kennbuchstabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Kennbuchstabe</em>' containment reference.
	 * @see #getBezeichnungKennbuchstabe()
	 * @generated
	 */
	void setBezeichnungKennbuchstabe(Bezeichnung_Kennbuchstabe_TypeClass value);

} // FMA_Anlage_Bezeichnung_AttributeGroup
