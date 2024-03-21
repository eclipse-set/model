/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Strecke_Punkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oertlichkeit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bahnanlagen und Betriebsstellen des Netzes. Die Örtlichkeit muss eine gültige Bezeichnung nach Ril 100 beinhalten und kann mittels ID Strecke Punkt mehreren Strecken mit Bezugskilometer zugeordnet sein. DB-Regelwerk Richtlinie 100.0001 Abschnitt 1 (1) 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit#getIDOertlichkeitAwanstBedient <em>ID Oertlichkeit Awanst Bedient</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit#getIDStreckePunkt <em>ID Strecke Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit#getOertlichkeitAllg <em>Oertlichkeit Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getOertlichkeit()
 * @model extendedMetaData="name='COertlichkeit' kind='elementOnly'"
 * @generated
 */
public interface Oertlichkeit extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Oertlichkeit_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getOertlichkeit_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Oertlichkeit_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Oertlichkeit_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis zur (betrieblichen) Zuordnung von Bahnhofsteilen zu Bahnhöfen und von Betriebsstellen untereinander. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit</em>' containment reference.
	 * @see #setIDOertlichkeit(ID_Oertlichkeit_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getOertlichkeit_IDOertlichkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit'"
	 * @generated
	 */
	ID_Oertlichkeit_TypeClass getIDOertlichkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit#getIDOertlichkeit <em>ID Oertlichkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Oertlichkeit</em>' containment reference.
	 * @see #getIDOertlichkeit()
	 * @generated
	 */
	void setIDOertlichkeit(ID_Oertlichkeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit Awanst Bedient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei Awanst: Angabe der Örtlichkeit, von der die Awanst bedient wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit Awanst Bedient</em>' containment reference.
	 * @see #setIDOertlichkeitAwanstBedient(ID_Oertlichkeit_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getOertlichkeit_IDOertlichkeitAwanstBedient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit_Awanst_Bedient'"
	 * @generated
	 */
	ID_Oertlichkeit_TypeClass getIDOertlichkeitAwanstBedient();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit#getIDOertlichkeitAwanstBedient <em>ID Oertlichkeit Awanst Bedient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Oertlichkeit Awanst Bedient</em>' containment reference.
	 * @see #getIDOertlichkeitAwanstBedient()
	 * @generated
	 */
	void setIDOertlichkeitAwanstBedient(ID_Oertlichkeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Strecke Punkt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Verweise.ID_Strecke_Punkt_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen bzw. mehrere Streckenpunkt(e) zur Lokalisierung der Örtlichkeit im Netz. Die Information wird für die Erstellung der Ausgabeformate benötigt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Strecke Punkt</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getOertlichkeit_IDStreckePunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Strecke_Punkt'"
	 * @generated
	 */
	EList<ID_Strecke_Punkt_TypeClass> getIDStreckePunkt();

	/**
	 * Returns the value of the '<em><b>Oertlichkeit Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oertlichkeit Allg</em>' containment reference.
	 * @see #setOertlichkeitAllg(Oertlichkeit_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getOertlichkeit_OertlichkeitAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Oertlichkeit_Allg'"
	 * @generated
	 */
	Oertlichkeit_Allg_AttributeGroup getOertlichkeitAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit#getOertlichkeitAllg <em>Oertlichkeit Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oertlichkeit Allg</em>' containment reference.
	 * @see #getOertlichkeitAllg()
	 * @generated
	 */
	void setOertlichkeitAllg(Oertlichkeit_Allg_AttributeGroup value);

} // Oertlichkeit
