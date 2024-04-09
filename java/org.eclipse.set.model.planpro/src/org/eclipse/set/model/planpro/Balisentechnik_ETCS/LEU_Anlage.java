/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_LEU_Bezug_Funktional_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEU Anlage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Elektronische Einheit zur Ansteuerung der Eurobalisen mit Balisentelegrammen in Abhängigkeit von Eingangsinformationen (Signalbegriffe, Weichenlagen etc.). Die LEU-Anlage besteht ggf. aus mehreren Schaltkästen, die mehrere LEU-Module enthalten können.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage#getIDLEUBezugspunkt <em>IDLEU Bezugspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage#getLEUAnlageAllg <em>LEU Anlage Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage()
 * @model extendedMetaData="name='CLEU_Anlage' kind='elementOnly'"
 * @generated
 */
public interface LEU_Anlage extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(LEU_Anlage_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	LEU_Anlage_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(LEU_Anlage_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDLEU Bezugspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Bezugselement der LEU-Anlage, aus dem in der Regel auch die Bezeichnung generiert wird. Über diesen Verweis erfolgt auch die Ermittlung des Bezugselements für von dieser LEU-Anlage gesteuerte Datenpunkte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDLEU Bezugspunkt</em>' containment reference.
	 * @see #setIDLEUBezugspunkt(ID_LEU_Bezug_Funktional_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_IDLEUBezugspunkt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_LEU_Bezugspunkt'"
	 * @generated
	 */
	ID_LEU_Bezug_Funktional_TypeClass getIDLEUBezugspunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage#getIDLEUBezugspunkt <em>IDLEU Bezugspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDLEU Bezugspunkt</em>' containment reference.
	 * @see #getIDLEUBezugspunkt()
	 * @generated
	 */
	void setIDLEUBezugspunkt(ID_LEU_Bezug_Funktional_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LEU Anlage Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LEU Anlage Allg</em>' containment reference.
	 * @see #setLEUAnlageAllg(LEU_Anlage_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_LEUAnlageAllg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Anlage_Allg'"
	 * @generated
	 */
	LEU_Anlage_Allg_AttributeGroup getLEUAnlageAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage#getLEUAnlageAllg <em>LEU Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LEU Anlage Allg</em>' containment reference.
	 * @see #getLEUAnlageAllg()
	 * @generated
	 */
	void setLEUAnlageAllg(LEU_Anlage_Allg_AttributeGroup value);

} // LEU_Anlage
