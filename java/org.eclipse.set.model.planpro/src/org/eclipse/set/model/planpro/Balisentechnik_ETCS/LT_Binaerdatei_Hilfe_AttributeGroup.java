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

import org.eclipse.set.model.planpro.Verweise.ID_Binaerdaten_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LT Binaerdatei Hilfe Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdatei_Hilfe_AttributeGroup#getIDBinaerdateiHilfe <em>ID Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdatei_Hilfe_AttributeGroup#getPruefmerkmaleBinaerdateiHilfe <em>Pruefmerkmale Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdatei_Hilfe_AttributeGroup#getVerwendungHilfe <em>Verwendung Hilfe</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLT_Binaerdatei_Hilfe_AttributeGroup()
 * @model extendedMetaData="name='CLT_Binaerdatei_Hilfe' kind='elementOnly'"
 * @generated
 */
public interface LT_Binaerdatei_Hilfe_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Binaerdatei Hilfe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf eine Hilfsdatei zur Unterstützung bei der Balisenprüfung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Binaerdatei Hilfe</em>' containment reference.
	 * @see #setIDBinaerdateiHilfe(ID_Binaerdaten_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLT_Binaerdatei_Hilfe_AttributeGroup_IDBinaerdateiHilfe()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Binaerdatei_Hilfe'"
	 * @generated
	 */
	ID_Binaerdaten_ohne_Proxy_TypeClass getIDBinaerdateiHilfe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdatei_Hilfe_AttributeGroup#getIDBinaerdateiHilfe <em>ID Binaerdatei Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Binaerdatei Hilfe</em>' containment reference.
	 * @see #getIDBinaerdateiHilfe()
	 * @generated
	 */
	void setIDBinaerdateiHilfe(ID_Binaerdaten_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Pruefmerkmale Binaerdatei Hilfe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prüfmerkmale der Hilfsdatei (z. B. Prüfsumme, Version) zur Unterstützung bei der Balisenprüfung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pruefmerkmale Binaerdatei Hilfe</em>' containment reference.
	 * @see #setPruefmerkmaleBinaerdateiHilfe(Pruefmerkmale_Daten_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLT_Binaerdatei_Hilfe_AttributeGroup_PruefmerkmaleBinaerdateiHilfe()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Pruefmerkmale_Binaerdatei_Hilfe'"
	 * @generated
	 */
	Pruefmerkmale_Daten_AttributeGroup getPruefmerkmaleBinaerdateiHilfe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdatei_Hilfe_AttributeGroup#getPruefmerkmaleBinaerdateiHilfe <em>Pruefmerkmale Binaerdatei Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pruefmerkmale Binaerdatei Hilfe</em>' containment reference.
	 * @see #getPruefmerkmaleBinaerdateiHilfe()
	 * @generated
	 */
	void setPruefmerkmaleBinaerdateiHilfe(Pruefmerkmale_Daten_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Verwendung Hilfe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Herstellerübergreifend eindeutige Beschreibung des Verwendungszwecks der  Hilfsdatei (z. B. Kodierungsart, Steuerung des Prüf-Algorithmus).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verwendung Hilfe</em>' containment reference.
	 * @see #setVerwendungHilfe(Verwendung_Hilfe_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLT_Binaerdatei_Hilfe_AttributeGroup_VerwendungHilfe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Verwendung_Hilfe'"
	 * @generated
	 */
	Verwendung_Hilfe_TypeClass getVerwendungHilfe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdatei_Hilfe_AttributeGroup#getVerwendungHilfe <em>Verwendung Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verwendung Hilfe</em>' containment reference.
	 * @see #getVerwendungHilfe()
	 * @generated
	 */
	void setVerwendungHilfe(Verwendung_Hilfe_TypeClass value);

} // LT_Binaerdatei_Hilfe_AttributeGroup
