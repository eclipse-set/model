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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.Verweise.ID_FT_Anschaltbedingung_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Fachtelegramm_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DP Telegramm Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Telegramm_AttributeGroup#getIDFachtelegramm <em>ID Fachtelegramm</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Telegramm_AttributeGroup#getIDFTAnschaltbedingung <em>IDFT Anschaltbedingung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Telegramm_AttributeGroup#getSRSUnterversion <em>SRS Unterversion</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Telegramm_AttributeGroup#getSRSVersion <em>SRS Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_AttributeGroup()
 * @model extendedMetaData="name='CDP_Telegramm' kind='elementOnly'"
 * @generated
 */
public interface DP_Telegramm_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Fachtelegramm</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_Fachtelegramm_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fachtelegramme, die bei Erfüllung der angegebenen Anschaltbedingungen gültig sind. Es können gleichzeitig mehrere Fachtelegramme des selben und/oder unterschiedlicher Anwendungssysteme angegeben werden. Fachtelegramme des Anwendungssystems ESG sind über die Attributgruppe DP_Telegramme_ESG anzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fachtelegramm</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_AttributeGroup_IDFachtelegramm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fachtelegramm'"
	 * @generated
	 */
	EList<ID_Fachtelegramm_TypeClass> getIDFachtelegramm();

	/**
	 * Returns the value of the '<em><b>IDFT Anschaltbedingung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_FT_Anschaltbedingung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Menge von Anschaltbedingungen, die alle gleichzeitig für die angegebenen Fachtelegramme erfüllt sein müssen.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDFT Anschaltbedingung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_AttributeGroup_IDFTAnschaltbedingung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_FT_Anschaltbedingung'"
	 * @generated
	 */
	EList<ID_FT_Anschaltbedingung_TypeClass> getIDFTAnschaltbedingung();

	/**
	 * Returns the value of the '<em><b>SRS Unterversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unterversion der System Requirement Specification gemäß Subset 26 Kapitel 7. In einem Datenpunkt können zu einem Zeitpunkt nur Telegramme der gleichen SRS-Unterversion gesendet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SRS Unterversion</em>' containment reference.
	 * @see #setSRSUnterversion(SRS_Unterversion_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_AttributeGroup_SRSUnterversion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SRS_Unterversion'"
	 * @generated
	 */
	SRS_Unterversion_TypeClass getSRSUnterversion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Telegramm_AttributeGroup#getSRSUnterversion <em>SRS Unterversion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SRS Unterversion</em>' containment reference.
	 * @see #getSRSUnterversion()
	 * @generated
	 */
	void setSRSUnterversion(SRS_Unterversion_TypeClass value);

	/**
	 * Returns the value of the '<em><b>SRS Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version der System Requirement Specification gemäß Subset 26 Kapitel 7. In einem Datenpunkt können zu einem Zeitpunkt nur Telegramme der gleichen SRS-Version gesendet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SRS Version</em>' containment reference.
	 * @see #setSRSVersion(SRS_Version_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_AttributeGroup_SRSVersion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SRS_Version'"
	 * @generated
	 */
	SRS_Version_TypeClass getSRSVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Telegramm_AttributeGroup#getSRSVersion <em>SRS Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SRS Version</em>' containment reference.
	 * @see #getSRSVersion()
	 * @generated
	 */
	void setSRSVersion(SRS_Version_TypeClass value);

} // DP_Telegramm_AttributeGroup
