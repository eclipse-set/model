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
 * A representation of the model object '<em><b>FMA Anlage Kaskade Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Kaskade_AttributeGroup#getFMAKaskadeBezeichnung <em>FMA Kaskade Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Kaskade_AttributeGroup#getFMAKaskadeEinzelauswertung <em>FMA Kaskade Einzelauswertung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Anlage_Kaskade_AttributeGroup()
 * @model extendedMetaData="name='CFMA_Anlage_Kaskade' kind='elementOnly'"
 * @generated
 */
public interface FMA_Anlage_Kaskade_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>FMA Kaskade Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ergänzt bei technisch notwendiger Unterteilung eines Gleisabschnitts in mehr als einen Freimeldeabschnitt die Bezeichnung. Die Ergänzung (i. d. R. .1, .2, .3, …; aber auch a, b, c, … oder I, II, III, … ist möglich) wird der Bezeichnung des zugeordneten Objekts Gleis Abschnitt nachgestellt. DB-Regelwerk Planungsdaten: Sicherungstechnischer Lageplan, Gleisfreimeldeplan, Freimeldetabelle, Spalte 1. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Kaskade Bezeichnung</em>' containment reference.
	 * @see #setFMAKaskadeBezeichnung(FMA_Kaskade_Bezeichnung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Anlage_Kaskade_AttributeGroup_FMAKaskadeBezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FMA_Kaskade_Bezeichnung'"
	 * @generated
	 */
	FMA_Kaskade_Bezeichnung_TypeClass getFMAKaskadeBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Kaskade_AttributeGroup#getFMAKaskadeBezeichnung <em>FMA Kaskade Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Kaskade Bezeichnung</em>' containment reference.
	 * @see #getFMAKaskadeBezeichnung()
	 * @generated
	 */
	void setFMAKaskadeBezeichnung(FMA_Kaskade_Bezeichnung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FMA Kaskade Einzelauswertung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Legt fest, ob bei Kaskadierung mehrerer Freimeldeabschnitte zu einem Gleisabschnitt zusätzlich zur Gesamtauswertung des Gleisabschnitts eine Einzelauswertung der einzelnen Freimeldeabschnitte vorgesehen ist. Dies ist u.A. sinnvoll, wenn ein Gleisabschnitt bei unterschiedlichen Fahrtrichtungen zwar in unterschiedlicher Länge benötigt wird, jedoch in beiden Richtungen eine gemeinsame Grenze möglich ist. Wertzuordnung: true - Einzelauswertung vorgesehen, false - Einzelauswertung nicht vorgesehen. DB-Regelwerk Attribut ist im bisherigen PT1 ohne eindeutige Darstellung. Die Angabe kann mittelbar den Einträgen in der Freimeldetabelle entnommen werden (eine zusätzliche Zeile für den gesamten Gleisabschnitt zusätzlich zu den Zeilen für jeden Teil-Freimeldeabschnitt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Kaskade Einzelauswertung</em>' containment reference.
	 * @see #setFMAKaskadeEinzelauswertung(FMA_Kaskade_Einzelauswertung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Anlage_Kaskade_AttributeGroup_FMAKaskadeEinzelauswertung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FMA_Kaskade_Einzelauswertung'"
	 * @generated
	 */
	FMA_Kaskade_Einzelauswertung_TypeClass getFMAKaskadeEinzelauswertung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Kaskade_AttributeGroup#getFMAKaskadeEinzelauswertung <em>FMA Kaskade Einzelauswertung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Kaskade Einzelauswertung</em>' containment reference.
	 * @see #getFMAKaskadeEinzelauswertung()
	 * @generated
	 */
	void setFMAKaskadeEinzelauswertung(FMA_Kaskade_Einzelauswertung_TypeClass value);

} // FMA_Anlage_Kaskade_AttributeGroup
