/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.PlanPro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

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
 *   <li>{@link org.eclipse.set.model.model11001.PlanPro.Planung_Projekt#getLSTPlanungGruppe <em>LST Planung Gruppe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PlanPro.Planung_Projekt#getPlanungPAllg <em>Planung PAllg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.PlanPro.PlanProPackage#getPlanung_Projekt()
 * @model extendedMetaData="name='CPlanung_Projekt' kind='elementOnly'"
 * @generated
 */
public interface Planung_Projekt extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>LST Planung Gruppe</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.PlanPro.Planung_Gruppe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einbindung des Objekts Planung_Gruppe in das Objekt Planung_Projekt.
	 * DB Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LST Planung Gruppe</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.PlanPro.PlanProPackage#getPlanung_Projekt_LSTPlanungGruppe()
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
	 * @see org.eclipse.set.model.model11001.PlanPro.PlanProPackage#getPlanung_Projekt_PlanungPAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Planung_P_Allg'"
	 * @generated
	 */
	Planung_P_Allg_AttributeGroup getPlanungPAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.PlanPro.Planung_Projekt#getPlanungPAllg <em>Planung PAllg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planung PAllg</em>' containment reference.
	 * @see #getPlanungPAllg()
	 * @generated
	 */
	void setPlanungPAllg(Planung_P_Allg_AttributeGroup value);

} // Planung_Projekt
