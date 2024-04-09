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

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planung Projekt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ermöglicht die globale Angabe und Zuordnung von organisatorischen und inhaltlichen Daten, die für alle Planungsgruppen eines Planungsprojekts gleichermaßen gelten.
 * Ein ~ enthält mindestens eine Planungsgruppe.
 * DB-Regelwerk
 * Bisher keine eindeutige Abbildung als Schriftfeldeintrag gemäß Ril 886.0102.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Projekt#getLSTPlanungGruppe <em>LST Planung Gruppe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Projekt#getPlanungPAllg <em>Planung PAllg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Projekt()
 * @model extendedMetaData="name='CPlanung_Projekt' kind='elementOnly'"
 * @generated
 */
public interface Planung_Projekt extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>LST Planung Gruppe</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einbindung des Objekts Planung_Gruppe in das Objekt Planung_Projekt.
	 * DB Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LST Planung Gruppe</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Projekt_LSTPlanungGruppe()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LST_Planung_Gruppe'"
	 * @generated
	 */
	EList<Planung_Gruppe> getLSTPlanungGruppe();

	/**
	 * Returns the value of the '<em><b>Planung PAllg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planung PAllg</em>' containment reference.
	 * @see #setPlanungPAllg(Planung_P_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Projekt_PlanungPAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Planung_P_Allg'"
	 * @generated
	 */
	Planung_P_Allg_AttributeGroup getPlanungPAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_Projekt#getPlanungPAllg <em>Planung PAllg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planung PAllg</em>' containment reference.
	 * @see #getPlanungPAllg()
	 * @generated
	 */
	void setPlanungPAllg(Planung_P_Allg_AttributeGroup value);

} // Planung_Projekt
