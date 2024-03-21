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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binaerdaten</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Binärdatenstrom oder Binärdatei mit zugehörigen betriebssystemnahen Metadaten (z. B. Dateiname, Dateityp).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Binaerdaten#getBinaerdatenDatei <em>Binaerdaten Datei</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Binaerdaten#getDaten <em>Daten</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBinaerdaten()
 * @model extendedMetaData="name='CBinaerdaten' kind='elementOnly'"
 * @generated
 */
public interface Binaerdaten extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Binaerdaten Datei</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binaerdaten Datei</em>' containment reference.
	 * @see #setBinaerdatenDatei(Binaerdaten_Datei_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBinaerdaten_BinaerdatenDatei()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Binaerdaten_Datei'"
	 * @generated
	 */
	Binaerdaten_Datei_AttributeGroup getBinaerdatenDatei();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Binaerdaten#getBinaerdatenDatei <em>Binaerdaten Datei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binaerdaten Datei</em>' containment reference.
	 * @see #getBinaerdatenDatei()
	 * @generated
	 */
	void setBinaerdatenDatei(Binaerdaten_Datei_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Daten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Im base64-Format codierter Inhalt der Binaerdaten bzw. -datei.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Daten</em>' containment reference.
	 * @see #setDaten(Daten_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBinaerdaten_Daten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Daten'"
	 * @generated
	 */
	Daten_TypeClass getDaten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Binaerdaten#getDaten <em>Daten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daten</em>' containment reference.
	 * @see #getDaten()
	 * @generated
	 */
	void setDaten(Daten_TypeClass value);

} // Binaerdaten
