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

import org.eclipse.set.model.planpro.Verweise.ID_Balise_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Luft Telegramm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung des Telegramms (Binaerdatei) zur Balise, von der das Telegramm an das Fahrzeug übertragen wird. Das Telegramm kann dabei in der Balise gespeichert sein oder von der LEU an die Balise gesendet werden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Luft_Telegramm#getIDBaliseUebertragung <em>ID Balise Uebertragung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Luft_Telegramm#getIDFachtelegramm <em>ID Fachtelegramm</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Luft_Telegramm#getLTBinaerdateiHilfe <em>LT Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Luft_Telegramm#getLTBinaerdaten <em>LT Binaerdaten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Luft_Telegramm#getTelegrammIndex <em>Telegramm Index</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm()
 * @model extendedMetaData="name='CLuft_Telegramm' kind='elementOnly'"
 * @generated
 */
public interface Luft_Telegramm extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Balise Uebertragung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Balise, von der das Lufttelegramm gesendet wird. Die Unterscheidung der verschiedenen Lufttelegramme an einer Balise erfolgt über ID_Fachtelegramm bzw. dessen Anschaltbedingung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Balise Uebertragung</em>' containment reference.
	 * @see #setIDBaliseUebertragung(ID_Balise_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_IDBaliseUebertragung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Balise_Uebertragung'"
	 * @generated
	 */
	ID_Balise_ohne_Proxy_TypeClass getIDBaliseUebertragung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Luft_Telegramm#getIDBaliseUebertragung <em>ID Balise Uebertragung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Balise Uebertragung</em>' containment reference.
	 * @see #getIDBaliseUebertragung()
	 * @generated
	 */
	void setIDBaliseUebertragung(ID_Balise_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fachtelegramm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Fachtelegramm, das vom Lufttelegramm umgesetzt wird. Ein Fachtelegramm kann dabei durch mehrere Lufttelegramme umgesetzt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fachtelegramm</em>' containment reference.
	 * @see #setIDFachtelegramm(ID_Fachtelegramm_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_IDFachtelegramm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fachtelegramm'"
	 * @generated
	 */
	ID_Fachtelegramm_TypeClass getIDFachtelegramm();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Luft_Telegramm#getIDFachtelegramm <em>ID Fachtelegramm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fachtelegramm</em>' containment reference.
	 * @see #getIDFachtelegramm()
	 * @generated
	 */
	void setIDFachtelegramm(ID_Fachtelegramm_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LT Binaerdatei Hilfe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LT Binaerdatei Hilfe</em>' containment reference.
	 * @see #setLTBinaerdateiHilfe(LT_Binaerdatei_Hilfe_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_LTBinaerdateiHilfe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LT_Binaerdatei_Hilfe'"
	 * @generated
	 */
	LT_Binaerdatei_Hilfe_AttributeGroup getLTBinaerdateiHilfe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Luft_Telegramm#getLTBinaerdateiHilfe <em>LT Binaerdatei Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LT Binaerdatei Hilfe</em>' containment reference.
	 * @see #getLTBinaerdateiHilfe()
	 * @generated
	 */
	void setLTBinaerdateiHilfe(LT_Binaerdatei_Hilfe_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>LT Binaerdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LT Binaerdaten</em>' containment reference.
	 * @see #setLTBinaerdaten(LT_Binaerdaten_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_LTBinaerdaten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LT_Binaerdaten'"
	 * @generated
	 */
	LT_Binaerdaten_AttributeGroup getLTBinaerdaten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Luft_Telegramm#getLTBinaerdaten <em>LT Binaerdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LT Binaerdaten</em>' containment reference.
	 * @see #getLTBinaerdaten()
	 * @generated
	 */
	void setLTBinaerdaten(LT_Binaerdaten_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Telegramm Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Index für die Signalbegriffsanschaltung, z. B. bei SIMIS D: ACC-Zeiger (Rücklaufdatum)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telegramm Index</em>' containment reference.
	 * @see #setTelegrammIndex(Telegramm_Index_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_TelegrammIndex()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Telegramm_Index'"
	 * @generated
	 */
	Telegramm_Index_TypeClass getTelegrammIndex();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Luft_Telegramm#getTelegrammIndex <em>Telegramm Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telegramm Index</em>' containment reference.
	 * @see #getTelegrammIndex()
	 * @generated
	 */
	void setTelegrammIndex(Telegramm_Index_TypeClass value);

} // Luft_Telegramm
