/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.set.model.model1902.BasisTypen.Eigenschaften_Datei_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Balise_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Binaerdatei_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Fachtelegramm_TypeClass;

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
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm#getEigenschaftenBinaerdatei <em>Eigenschaften Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm#getEigenschaftenBinaerdateiHilfe <em>Eigenschaften Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm#getIDAnhangEADoku <em>ID Anhang EA Doku</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm#getIDBaliseUebertragung <em>ID Balise Uebertragung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm#getIDBinaerdatei <em>ID Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm#getIDBinaerdateiHilfe <em>ID Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm#getIDFachtelegramm <em>ID Fachtelegramm</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm()
 * @model extendedMetaData="name='CLuft_Telegramm' kind='elementOnly'"
 * @generated
 */
public interface Luft_Telegramm extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Eigenschaften Binaerdatei</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Metadaten der Binärdatei, die von der Balise gesendet wird
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eigenschaften Binaerdatei</em>' containment reference.
	 * @see #setEigenschaftenBinaerdatei(Eigenschaften_Datei_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_EigenschaftenBinaerdatei()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Eigenschaften_Binaerdatei'"
	 * @generated
	 */
	Eigenschaften_Datei_AttributeGroup getEigenschaftenBinaerdatei();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm#getEigenschaftenBinaerdatei <em>Eigenschaften Binaerdatei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eigenschaften Binaerdatei</em>' containment reference.
	 * @see #getEigenschaftenBinaerdatei()
	 * @generated
	 */
	void setEigenschaftenBinaerdatei(Eigenschaften_Datei_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Eigenschaften Binaerdatei Hilfe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Metadaten der Hilfsdatei zur Unterstützung bei der Balisenprüfung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eigenschaften Binaerdatei Hilfe</em>' containment reference.
	 * @see #setEigenschaftenBinaerdateiHilfe(Eigenschaften_Datei_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_EigenschaftenBinaerdateiHilfe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Eigenschaften_Binaerdatei_Hilfe'"
	 * @generated
	 */
	Eigenschaften_Datei_AttributeGroup getEigenschaftenBinaerdateiHilfe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm#getEigenschaftenBinaerdateiHilfe <em>Eigenschaften Binaerdatei Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eigenschaften Binaerdatei Hilfe</em>' containment reference.
	 * @see #getEigenschaftenBinaerdateiHilfe()
	 * @generated
	 */
	void setEigenschaftenBinaerdateiHilfe(Eigenschaften_Datei_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Anhang EA Doku</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Anhang, der die Zuordnung zwischen Eingangsinformationen (z. B. Signalbegriffe) und zugehörigem Lufttelegramm enthält.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang EA Doku</em>' containment reference.
	 * @see #setIDAnhangEADoku(ID_Anhang_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_IDAnhangEADoku()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_EA_Doku'"
	 * @generated
	 */
	ID_Anhang_TypeClass getIDAnhangEADoku();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm#getIDAnhangEADoku <em>ID Anhang EA Doku</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang EA Doku</em>' containment reference.
	 * @see #getIDAnhangEADoku()
	 * @generated
	 */
	void setIDAnhangEADoku(ID_Anhang_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Balise Uebertragung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Balise, von der das Lufttelegramm gesendet wird. Die Unterscheidung der verschiedenen Lufttelegramme an einer Balise erfolgt über ID_Fachtelegramm bzw. dessen Anschaltbedingung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Balise Uebertragung</em>' containment reference.
	 * @see #setIDBaliseUebertragung(ID_Balise_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_IDBaliseUebertragung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Balise_Uebertragung'"
	 * @generated
	 */
	ID_Balise_ohne_Proxy_TypeClass getIDBaliseUebertragung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm#getIDBaliseUebertragung <em>ID Balise Uebertragung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Balise Uebertragung</em>' containment reference.
	 * @see #getIDBaliseUebertragung()
	 * @generated
	 */
	void setIDBaliseUebertragung(ID_Balise_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Binaerdatei</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Binärdatei, die von der Balise gesendet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Binaerdatei</em>' containment reference.
	 * @see #setIDBinaerdatei(ID_Binaerdatei_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_IDBinaerdatei()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Binaerdatei'"
	 * @generated
	 */
	ID_Binaerdatei_ohne_Proxy_TypeClass getIDBinaerdatei();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm#getIDBinaerdatei <em>ID Binaerdatei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Binaerdatei</em>' containment reference.
	 * @see #getIDBinaerdatei()
	 * @generated
	 */
	void setIDBinaerdatei(ID_Binaerdatei_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Binaerdatei Hilfe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf eine Hilfsdatei zur Unterstützung bei der Balisenprüfung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Binaerdatei Hilfe</em>' containment reference.
	 * @see #setIDBinaerdateiHilfe(ID_Binaerdatei_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_IDBinaerdateiHilfe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Binaerdatei_Hilfe'"
	 * @generated
	 */
	ID_Binaerdatei_ohne_Proxy_TypeClass getIDBinaerdateiHilfe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm#getIDBinaerdateiHilfe <em>ID Binaerdatei Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Binaerdatei Hilfe</em>' containment reference.
	 * @see #getIDBinaerdateiHilfe()
	 * @generated
	 */
	void setIDBinaerdateiHilfe(ID_Binaerdatei_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fachtelegramm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Fachtelegramm, das vom Lufttelegramm umgesetzt wird. Ein Fachtelegramm kann dabei durch mehrere Lufttelegramme umgesetzt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fachtelegramm</em>' containment reference.
	 * @see #setIDFachtelegramm(ID_Fachtelegramm_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_IDFachtelegramm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fachtelegramm'"
	 * @generated
	 */
	ID_Fachtelegramm_TypeClass getIDFachtelegramm();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm#getIDFachtelegramm <em>ID Fachtelegramm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fachtelegramm</em>' containment reference.
	 * @see #getIDFachtelegramm()
	 * @generated
	 */
	void setIDFachtelegramm(ID_Fachtelegramm_TypeClass value);

} // Luft_Telegramm
