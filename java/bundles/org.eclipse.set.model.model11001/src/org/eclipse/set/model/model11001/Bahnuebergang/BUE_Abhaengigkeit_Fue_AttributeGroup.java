/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Abhaengigkeit Fue Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getAutoHet <em>Auto Het</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getFueSchaltfall <em>Fue Schaltfall</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getStoerhaltHaltfall <em>Stoerhalt Haltfall</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getStoerhaltMerkhinweis <em>Stoerhalt Merkhinweis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getZeitueberschreitungsmeldung <em>Zeitueberschreitungsmeldung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Abhaengigkeit_Fue_AttributeGroup()
 * @model extendedMetaData="name='CBUE_Abhaengigkeit_Fue' kind='elementOnly'"
 * @generated
 */
public interface BUE_Abhaengigkeit_Fue_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Auto Het</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für fernüberwachte Bahnübergänge (FÜ-BÜ) ist die Auto-Het-Funktion (automatische Einschaltung mit Befahren der Ausschaltkontakte) zu realisieren. Ausschlüsse gemäß Ril 819.1204 (4) sind zu beachten. DB-Regelwerk Ril 819.1204 (4) TM 2012-001 I.NVT 3 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Het</em>' containment reference.
	 * @see #setAutoHet(Auto_Het_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Abhaengigkeit_Fue_AttributeGroup_AutoHet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Auto_Het'"
	 * @generated
	 */
	Auto_Het_TypeClass getAutoHet();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getAutoHet <em>Auto Het</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Het</em>' containment reference.
	 * @see #getAutoHet()
	 * @generated
	 */
	void setAutoHet(Auto_Het_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fue Schaltfall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Im Stellwerk zu realisierende Schaltung bei Fü-Anlagen:
	 * 2: Wirksamschaltung der Einschaltpunkte;
	 * 12: Art der BÜ-Einschaltung in Abhängigkeit eines Signals in der Einschaltstrecke.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fue Schaltfall</em>' containment reference.
	 * @see #setFueSchaltfall(Fue_Schaltfall_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Abhaengigkeit_Fue_AttributeGroup_FueSchaltfall()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fue_Schaltfall'"
	 * @generated
	 */
	Fue_Schaltfall_TypeClass getFueSchaltfall();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getFueSchaltfall <em>Fue Schaltfall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fue Schaltfall</em>' containment reference.
	 * @see #getFueSchaltfall()
	 * @generated
	 */
	void setFueSchaltfall(Fue_Schaltfall_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Stoerhalt Haltfall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Haltfall des vor einem FÜ-BÜ liegenden Signals, wenn dieser gestört ist. Ist ein Abschnitt der freien Strecke in die Zuglenkung einbezogen und befinden sich in diesem Streckenabschnitt BÜ mit der Funktionsüberwachung FÜ, dann ist bei Bedienung des ESTW aus der Betriebszentrale die Störhaltabhängigkeit zu planen. Damit wird verhindert, dass die Zuglenkung auch bei gestörtem BÜ Fahrstraßen in Richtung Strecke mit gestörtem BÜ einstellt. DB-Regelwerk TM 2010 - 120 I.NVT3 (Fa. Siemens) Datenblatt für die Abhängigkeiten BÜ - Stw Weiterhin existiert ein Lastenheft für die technisch-funktionale Störhaltfunktionalität, das dem LST-Fachplaner nicht zur Verfügung steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stoerhalt Haltfall</em>' containment reference.
	 * @see #setStoerhaltHaltfall(Stoerhalt_Haltfall_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Abhaengigkeit_Fue_AttributeGroup_StoerhaltHaltfall()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Stoerhalt_Haltfall'"
	 * @generated
	 */
	Stoerhalt_Haltfall_TypeClass getStoerhaltHaltfall();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getStoerhaltHaltfall <em>Stoerhalt Haltfall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stoerhalt Haltfall</em>' containment reference.
	 * @see #getStoerhaltHaltfall()
	 * @generated
	 */
	void setStoerhaltHaltfall(Stoerhalt_Haltfall_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Stoerhalt Merkhinweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Merkhinweis ist zu setzen. Der Merkhinweis wird gesetzt, wenn die Verbindung zwischen Betriebszentrale (BZ) und derjenigen ESTW-Unterzentrale (UZ) getrennt ist, in der der entsprechende Bahnübergang fernüberwacht wird. DB-Regelwerk TM 2010 - 120 I.NVT3 (Fa. Siemens) Datenblatt für die Abhängigkeiten BÜ - Stw Weiterhin existiert ein Lastenheft für die technisch-funktionale Störhaltfunktionalität, das dem LST-Fachplaner nicht zur Verfügung steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stoerhalt Merkhinweis</em>' containment reference.
	 * @see #setStoerhaltMerkhinweis(Stoerhalt_Merkhinweis_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Abhaengigkeit_Fue_AttributeGroup_StoerhaltMerkhinweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Stoerhalt_Merkhinweis'"
	 * @generated
	 */
	Stoerhalt_Merkhinweis_TypeClass getStoerhaltMerkhinweis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getStoerhaltMerkhinweis <em>Stoerhalt Merkhinweis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stoerhalt Merkhinweis</em>' containment reference.
	 * @see #getStoerhaltMerkhinweis()
	 * @generated
	 */
	void setStoerhaltMerkhinweis(Stoerhalt_Merkhinweis_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Zeitueberschreitungsmeldung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der gewählten Zeit für die Zeitüberschreitungsmeldung aus der Einschaltstreckenberechnung. DB-Regelwerk Einschaltstreckenberechnung 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitueberschreitungsmeldung</em>' containment reference.
	 * @see #setZeitueberschreitungsmeldung(Zeitueberschreitungsmeldung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Abhaengigkeit_Fue_AttributeGroup_Zeitueberschreitungsmeldung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Zeitueberschreitungsmeldung'"
	 * @generated
	 */
	Zeitueberschreitungsmeldung_TypeClass getZeitueberschreitungsmeldung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup#getZeitueberschreitungsmeldung <em>Zeitueberschreitungsmeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitueberschreitungsmeldung</em>' containment reference.
	 * @see #getZeitueberschreitungsmeldung()
	 * @generated
	 */
	void setZeitueberschreitungsmeldung(Zeitueberschreitungsmeldung_TypeClass value);

} // BUE_Abhaengigkeit_Fue_AttributeGroup
