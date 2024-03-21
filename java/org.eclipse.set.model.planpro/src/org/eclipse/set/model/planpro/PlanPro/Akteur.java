/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro;

import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Akteur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Am PlanPro-Planungsprozess beteiligter Akteur.
 * In PlanPro werden der Name und Kontaktdaten des Akteurs erfasst. Einschränkungen hinsichtlich der zulässigen Rolle des Akteurs sind durch entsprechende Attributbezeichnungen und -beschreibungen ersichtlich.
 * DB-Regelwerk Schriftfeldeintrag gemäß Ril 886.0102
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Akteur#getAkteurAllg <em>Akteur Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Akteur#getKontaktdaten <em>Kontaktdaten</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getAkteur()
 * @model extendedMetaData="name='CAkteur' kind='elementOnly'"
 * @generated
 */
public interface Akteur extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Akteur Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Akteur Allg</em>' containment reference.
	 * @see #setAkteurAllg(Akteur_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getAkteur_AkteurAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Akteur_Allg'"
	 * @generated
	 */
	Akteur_Allg_AttributeGroup getAkteurAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Akteur#getAkteurAllg <em>Akteur Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Akteur Allg</em>' containment reference.
	 * @see #getAkteurAllg()
	 * @generated
	 */
	void setAkteurAllg(Akteur_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Kontaktdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kontaktdaten des Akteurs zur Unternehmenszuordnung.
	 * DB-Regelwerk
	 * Bisher keine Abbildung als Schriftfeldeintrag gemäß Ril 886.0102.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kontaktdaten</em>' containment reference.
	 * @see #setKontaktdaten(Organisation)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getAkteur_Kontaktdaten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Kontaktdaten'"
	 * @generated
	 */
	Organisation getKontaktdaten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Akteur#getKontaktdaten <em>Kontaktdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kontaktdaten</em>' containment reference.
	 * @see #getKontaktdaten()
	 * @generated
	 */
	void setKontaktdaten(Organisation value);

} // Akteur
