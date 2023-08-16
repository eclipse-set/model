/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.PZB;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_Markanter_Punkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INA Gefahrstelle Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.INA_Gefahrstelle_AttributeGroup#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.INA_Gefahrstelle_AttributeGroup#getPrioritaetGefahrstelle <em>Prioritaet Gefahrstelle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getINA_Gefahrstelle_AttributeGroup()
 * @model extendedMetaData="name='CINA_Gefahrstelle' kind='elementOnly'"
 * @generated
 */
public interface INA_Gefahrstelle_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Markanter Punkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Markanten Punkt zur Angabe einer Gefahrstelle für die INA-Berechnung. Die Unterscheidung in  maßgebende und schützenswertere Gefahrstelle erfolgt über das Attribut Prioritaet_Gefahrstelle. DB-Regelwerk 819.1311V00
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Markanter Punkt</em>' containment reference.
	 * @see #setIDMarkanterPunkt(ID_Markanter_Punkt_TypeClass)
	 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getINA_Gefahrstelle_AttributeGroup_IDMarkanterPunkt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Markanter_Punkt'"
	 * @generated
	 */
	ID_Markanter_Punkt_TypeClass getIDMarkanterPunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.PZB.INA_Gefahrstelle_AttributeGroup#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Markanter Punkt</em>' containment reference.
	 * @see #getIDMarkanterPunkt()
	 * @generated
	 */
	void setIDMarkanterPunkt(ID_Markanter_Punkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Prioritaet Gefahrstelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Priorität der Gefahrstelle für die INA-Berechnung. Die maßgebende Gefahrstelle wird durch den Wert 1 gekennzeichnet, schützenswertere Gefahrstellen erhalten entsprechend höhere Werte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prioritaet Gefahrstelle</em>' containment reference.
	 * @see #setPrioritaetGefahrstelle(Prioritaet_Gefahrstelle_TypeClass)
	 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getINA_Gefahrstelle_AttributeGroup_PrioritaetGefahrstelle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Prioritaet_Gefahrstelle'"
	 * @generated
	 */
	Prioritaet_Gefahrstelle_TypeClass getPrioritaetGefahrstelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.PZB.INA_Gefahrstelle_AttributeGroup#getPrioritaetGefahrstelle <em>Prioritaet Gefahrstelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prioritaet Gefahrstelle</em>' containment reference.
	 * @see #getPrioritaetGefahrstelle()
	 * @generated
	 */
	void setPrioritaetGefahrstelle(Prioritaet_Gefahrstelle_TypeClass value);

} // INA_Gefahrstelle_AttributeGroup
