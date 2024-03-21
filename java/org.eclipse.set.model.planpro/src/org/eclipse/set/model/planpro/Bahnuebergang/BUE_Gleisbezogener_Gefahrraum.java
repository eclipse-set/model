/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang;

import org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Gleisbezogener Gefahrraum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bereichsobjekt, das den Gefahrraum eines BÜ für ein Gleis abbildet. Die Grenzen des Bereichsobjektes liegen jeweils auf dem Schnittpunkt zwischen Gefahrraumkante und zugehörigem Gleis. Die zugehörigen Ein- und Ausschaltelemente verweisen auf die jeweilige Grenze des Bereichsobjektes. Für jedes Gleis am BÜ ist ein solches Objekt vorzusehen. Somit hat ein BÜ bzw. eine BUE Anlage immer genauso viele Instanzen von BUE_Gleisbezogener_Gefahrraum wie BÜ-Gleise. Zu einem späteren Zeitpunkt werden ggf. weitere, Gefahrraum-spezifische Angaben ergänzt. DB-Regelwerk 819.1210 7 (1)-(3) 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum#getErsatzsteckerGleisbezogen <em>Ersatzstecker Gleisbezogen</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum#getGleisAmBue <em>Gleis Am Bue</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Gleisbezogener_Gefahrraum()
 * @model extendedMetaData="name='CBUE_Gleisbezogener_Gefahrraum' kind='elementOnly'"
 * @generated
 */
public interface BUE_Gleisbezogener_Gefahrraum extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>Ersatzstecker Gleisbezogen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Sensor- bzw. EGL-Ersatzstecker ist vorzusehen, der die Gleisschaltmittel zur Einschaltung des BÜ für dieses BÜ-Gleis außer Betrieb setzt und damit eine Einschaltung des BÜ verhindert (z. B. für Baugleis). Das Attribut kann nur den Wert \"true\" annehmen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ersatzstecker Gleisbezogen</em>' containment reference.
	 * @see #setErsatzsteckerGleisbezogen(Ersatzstecker_Gleisbezogen_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Gleisbezogener_Gefahrraum_ErsatzsteckerGleisbezogen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ersatzstecker_Gleisbezogen'"
	 * @generated
	 */
	Ersatzstecker_Gleisbezogen_TypeClass getErsatzsteckerGleisbezogen();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum#getErsatzsteckerGleisbezogen <em>Ersatzstecker Gleisbezogen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ersatzstecker Gleisbezogen</em>' containment reference.
	 * @see #getErsatzsteckerGleisbezogen()
	 * @generated
	 */
	void setErsatzsteckerGleisbezogen(Ersatzstecker_Gleisbezogen_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Gleis Am Bue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des BÜ-Gleises. Die Bezeichnung wird in alphabetisch aufsteigender Reihenfolge vergeben, beginnend bei \"a\". Bei mehrgleisigen Strecken über einen BÜ wird das in aufsteigender km-Richtung rechts liegende Gleis mit \"a\" bezeichnet; das daneben liegende (Gegen)Gleis mit \"b\" usw. Diese \"Kennung\" ist Bestandteil der Bezeichnung der Anrueckmelder und Einschaltkontakte (sofern vorhanden) sowie der Ausschaltkontakte des BÜ. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht eindeutig beschrieben. Es geht aus dem Eingabeblättern der Einschaltstreckenberechnung hervor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gleis Am Bue</em>' containment reference.
	 * @see #setGleisAmBue(Gleis_Am_Bue_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Gleisbezogener_Gefahrraum_GleisAmBue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Gleis_Am_Bue'"
	 * @generated
	 */
	Gleis_Am_Bue_TypeClass getGleisAmBue();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum#getGleisAmBue <em>Gleis Am Bue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gleis Am Bue</em>' containment reference.
	 * @see #getGleisAmBue()
	 * @generated
	 */
	void setGleisAmBue(Gleis_Am_Bue_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die BUE Anlage, zu der der Gefahrraum zugehörig ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Anlage</em>' containment reference.
	 * @see #setIDBUEAnlage(ID_BUE_Anlage_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Gleisbezogener_Gefahrraum_IDBUEAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Anlage'"
	 * @generated
	 */
	ID_BUE_Anlage_TypeClass getIDBUEAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum#getIDBUEAnlage <em>IDBUE Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Anlage</em>' containment reference.
	 * @see #getIDBUEAnlage()
	 * @generated
	 */
	void setIDBUEAnlage(ID_BUE_Anlage_TypeClass value);

} // BUE_Gleisbezogener_Gefahrraum
