/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_LEU_Bezugspunkt_TypeClass;

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
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Anlage#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Anlage#getIDLEUBezugspunkt <em>IDLEU Bezugspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Anlage#getLEUAnlageModuleigenschaften <em>LEU Anlage Moduleigenschaften</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage()
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
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	LEU_Anlage_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Anlage#getBezeichnung <em>Bezeichnung</em>}' containment reference.
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
	 * Verweis auf den Bezugspunkt der LEU-Anlage, aus dem in der Regel auch die Bezeichnung generiert wird. Über diesen Verweis erfolgt auch die Ermittlung des Bezugspunkts für von dieser LEU-Anlage gesteuerte Datenpunkte.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDLEU Bezugspunkt</em>' containment reference.
	 * @see #setIDLEUBezugspunkt(ID_LEU_Bezugspunkt_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_IDLEUBezugspunkt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_LEU_Bezugspunkt'"
	 * @generated
	 */
	ID_LEU_Bezugspunkt_TypeClass getIDLEUBezugspunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Anlage#getIDLEUBezugspunkt <em>IDLEU Bezugspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDLEU Bezugspunkt</em>' containment reference.
	 * @see #getIDLEUBezugspunkt()
	 * @generated
	 */
	void setIDLEUBezugspunkt(ID_LEU_Bezugspunkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LEU Anlage Moduleigenschaften</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Anlage_Moduleigenschaften_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Angabe von Eigenschaften der LEU-Module im Rahmen der PT 1-Planung. Der detaillierte Aufbau der LEU (Module) kann nur herstellerabhängig festgelegt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Anlage Moduleigenschaften</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_LEUAnlageModuleigenschaften()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Anlage_Moduleigenschaften'"
	 * @generated
	 */
	EList<LEU_Anlage_Moduleigenschaften_AttributeGroup> getLEUAnlageModuleigenschaften();

} // LEU_Anlage
