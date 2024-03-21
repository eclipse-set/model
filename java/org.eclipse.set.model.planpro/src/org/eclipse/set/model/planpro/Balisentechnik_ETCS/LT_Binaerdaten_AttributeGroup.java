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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.BasisTypen.Pruefmerkmale_Daten_AttributeGroup;

import org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Binaerdaten_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LT Binaerdaten Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup#getIDAnhangEADoku <em>ID Anhang EA Doku</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup#getIDBinaerdaten <em>ID Binaerdaten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup#getPruefmerkmaleBinaerdaten <em>Pruefmerkmale Binaerdaten</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLT_Binaerdaten_AttributeGroup()
 * @model extendedMetaData="name='CLT_Binaerdaten' kind='elementOnly'"
 * @generated
 */
public interface LT_Binaerdaten_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Anhang EA Doku</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Anhang, der die Zuordnung zwischen Eingangsinformationen (z. B. Signalbegriffe) und zugehörigem Lufttelegramm enthält.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang EA Doku</em>' containment reference.
	 * @see #setIDAnhangEADoku(ID_Anhang_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLT_Binaerdaten_AttributeGroup_IDAnhangEADoku()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_EA_Doku'"
	 * @generated
	 */
	ID_Anhang_TypeClass getIDAnhangEADoku();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup#getIDAnhangEADoku <em>ID Anhang EA Doku</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang EA Doku</em>' containment reference.
	 * @see #getIDAnhangEADoku()
	 * @generated
	 */
	void setIDAnhangEADoku(ID_Anhang_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Binaerdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Binärdaten, die von der Balise gesendet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Binaerdaten</em>' containment reference.
	 * @see #setIDBinaerdaten(ID_Binaerdaten_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLT_Binaerdaten_AttributeGroup_IDBinaerdaten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Binaerdaten'"
	 * @generated
	 */
	ID_Binaerdaten_ohne_Proxy_TypeClass getIDBinaerdaten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup#getIDBinaerdaten <em>ID Binaerdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Binaerdaten</em>' containment reference.
	 * @see #getIDBinaerdaten()
	 * @generated
	 */
	void setIDBinaerdaten(ID_Binaerdaten_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Pruefmerkmale Binaerdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prüfmerkmale der Binärdaten (z. B. Prüfsumme, Version), die von der Balise gesendet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pruefmerkmale Binaerdaten</em>' containment reference.
	 * @see #setPruefmerkmaleBinaerdaten(Pruefmerkmale_Daten_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLT_Binaerdaten_AttributeGroup_PruefmerkmaleBinaerdaten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Pruefmerkmale_Binaerdaten'"
	 * @generated
	 */
	Pruefmerkmale_Daten_AttributeGroup getPruefmerkmaleBinaerdaten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup#getPruefmerkmaleBinaerdaten <em>Pruefmerkmale Binaerdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pruefmerkmale Binaerdaten</em>' containment reference.
	 * @see #getPruefmerkmaleBinaerdaten()
	 * @generated
	 */
	void setPruefmerkmaleBinaerdaten(Pruefmerkmale_Daten_AttributeGroup value);

} // LT_Binaerdaten_AttributeGroup
