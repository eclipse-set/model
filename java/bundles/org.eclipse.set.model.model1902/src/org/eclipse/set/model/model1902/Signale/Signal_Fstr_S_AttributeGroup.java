/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Signale;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.Verweise.ID_Schaltmittel_Zuordnung_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Zweites_Haltfallkriterium_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Fstr SAttribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Fstr_S_AttributeGroup#getGegengleis <em>Gegengleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Fstr_S_AttributeGroup#getIDAnrueckverschluss <em>ID Anrueckverschluss</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Fstr_S_AttributeGroup#getIDZweitesHaltfallkriterium <em>ID Zweites Haltfallkriterium</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Fstr_S_AttributeGroup()
 * @model extendedMetaData="name='CSignal_Fstr_S' kind='elementOnly'"
 * @generated
 */
public interface Signal_Fstr_S_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Gegengleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signal steht am Gegengleis. Das Gleis, das auf zweigleisiger, freier Strecke entgegen der gewöhnlichen Fahrtrichtung befahren wird (bei den EdB das linke Gleis), wird als Gegengleis bezeichnet. Das Attribut wird nur für (reale und fiktive) Signale an den Streckengleisen mit der Betriebsform \"zweigleisiger Betrieb\" ausgefüllt. Erfüllt ein Ausfahrziel die Bedingung Gegengleis = true, ist für die Zulassung einer Zugfahrt auf dieses Gleis ein Gegengleisanzeiger erforderlich. Im Beispiel sind die (realen) Signale 13 und AA sowie die fiktiven Signale HIDOG und DOHIG Signale, die am Gegengleis stehen. Media:Signale am Gegengleis.svg Wertzuordnung: true - Signal steht an einem Gegengleis, false - Signal steht nicht an einem Gegengleis. Hinweis: Dieses Attribut darf nicht verwechselt werden mit dem Attribut Wirkrichtung, das sich auf die topologische Richtung des Gleises bezieht. DB-Regelwerk Planungsdaten: Sicherungstechnischer Lageplan / BÜ-Lageplan 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gegengleis</em>' containment reference.
	 * @see #setGegengleis(Gegengleis_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Fstr_S_AttributeGroup_Gegengleis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gegengleis'"
	 * @generated
	 */
	Gegengleis_TypeClass getGegengleis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Fstr_S_AttributeGroup#getGegengleis <em>Gegengleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gegengleis</em>' containment reference.
	 * @see #getGegengleis()
	 * @generated
	 */
	void setGegengleis(Gegengleis_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Anrueckverschluss</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_Schaltmittel_Zuordnung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf alle Gleisschaltmittel, bei dessen Befahrung der Anrückverschluss wirkt. Der Anrückverschluss eines Signals wird benötigt zur Stellbarkeit und Löschung eines Ersatzsignals, zur Verhinderung der Fahrstraßenhilfsauflösung, wenn sich ein Zug diesem Signal nähert. Das Gleisschaltmittel ist in der Regel ein Freimeldeabschnitt. Das Signal ist in der Regel ein Einfahrsignal. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anrueckverschluss</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Fstr_S_AttributeGroup_IDAnrueckverschluss()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Anrueckverschluss'"
	 * @generated
	 */
	EList<ID_Schaltmittel_Zuordnung_TypeClass> getIDAnrueckverschluss();

	/**
	 * Returns the value of the '<em><b>ID Zweites Haltfallkriterium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Gleisschaltmittel, dessen Befahrung als zweites Haltfallkriterium dient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Zweites Haltfallkriterium</em>' containment reference.
	 * @see #setIDZweitesHaltfallkriterium(ID_Zweites_Haltfallkriterium_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Fstr_S_AttributeGroup_IDZweitesHaltfallkriterium()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Zweites_Haltfallkriterium'"
	 * @generated
	 */
	ID_Zweites_Haltfallkriterium_TypeClass getIDZweitesHaltfallkriterium();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Fstr_S_AttributeGroup#getIDZweitesHaltfallkriterium <em>ID Zweites Haltfallkriterium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Zweites Haltfallkriterium</em>' containment reference.
	 * @see #getIDZweitesHaltfallkriterium()
	 * @generated
	 */
	void setIDZweitesHaltfallkriterium(ID_Zweites_Haltfallkriterium_TypeClass value);

} // Signal_Fstr_S_AttributeGroup
