/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_FT_Anschaltbedingung_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Fachtelegramm_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DP Telegramm ESG Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup#getETCSSystemVersion <em>ETCS System Version</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup#getIDFachtelegramm <em>ID Fachtelegramm</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup#getIDFTAnschaltbedingungGeplant <em>IDFT Anschaltbedingung Geplant</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup#getIDFTAnschaltbedingungRealisiert <em>IDFT Anschaltbedingung Realisiert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup#getSRSVersion <em>SRS Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_ESG_AttributeGroup()
 * @model extendedMetaData="name='CDP_Telegramm_ESG' kind='elementOnly'"
 * @generated
 */
public interface DP_Telegramm_ESG_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ETCS System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erste Stelle der Systemversion gemäß System Requirement Specification (Subset 26, Kapitel 7). Die Angabe kann nicht eindeutig aus der ersten Stelle der SRS-Version abgeleitet werden. Auf Basis der SRS 3.3.0 kann beispielsweise die Systemversion 1 oder 2 implementiert werden. In einem Datenpunkt können zu einem Zeitpunkt nur Telegramme der gleichen SRS-Version gesendet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ETCS System Version</em>' containment reference.
	 * @see #setETCSSystemVersion(ETCS_System_Version_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_ESG_AttributeGroup_ETCSSystemVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ETCS_System_Version'"
	 * @generated
	 */
	ETCS_System_Version_TypeClass getETCSSystemVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup#getETCSSystemVersion <em>ETCS System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS System Version</em>' containment reference.
	 * @see #getETCSSystemVersion()
	 * @generated
	 */
	void setETCSSystemVersion(ETCS_System_Version_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fachtelegramm</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_Fachtelegramm_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fachtelegramme, die bei Erfüllung der angegebenen Anschaltbedingungen gültig sind. Es können gleichzeitig mehrere Fachtelegramme des selben und/oder unterschiedlicher Anwendungssysteme angegeben werden. Zusätzlich zu Fachtelegrammen des (führenden) Anwendungssystems ESG können hier auch Fachtelegramme weiterer Anwendungssysteme angegeben werden. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fachtelegramm</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_ESG_AttributeGroup_IDFachtelegramm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fachtelegramm'"
	 * @generated
	 */
	EList<ID_Fachtelegramm_TypeClass> getIDFachtelegramm();

	/**
	 * Returns the value of the '<em><b>IDFT Anschaltbedingung Geplant</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_FT_Anschaltbedingung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geplante Anschaltbedingung(en), die für die angegebenen Fachtelegramme erfüllt sein müssen. Die Angabe ist bei ESG nur dann erforderlich, wenn im Fachtelegramm individuelle oder spezifische Merkmale definiert wurden und sich die Anschaltbedingungen neben dem Bezugspunkt auf weitere Elemente beziehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDFT Anschaltbedingung Geplant</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_ESG_AttributeGroup_IDFTAnschaltbedingungGeplant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_FT_Anschaltbedingung_Geplant'"
	 * @generated
	 */
	EList<ID_FT_Anschaltbedingung_TypeClass> getIDFTAnschaltbedingungGeplant();

	/**
	 * Returns the value of the '<em><b>IDFT Anschaltbedingung Realisiert</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_FT_Anschaltbedingung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Realisierte Anschaltbedingung(en), mit denen die geplante(n) Anschaltbedingung(en) für die angegebenen Fachtelegramme umgesetzt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDFT Anschaltbedingung Realisiert</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_ESG_AttributeGroup_IDFTAnschaltbedingungRealisiert()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_FT_Anschaltbedingung_Realisiert'"
	 * @generated
	 */
	EList<ID_FT_Anschaltbedingung_TypeClass> getIDFTAnschaltbedingungRealisiert();

	/**
	 * Returns the value of the '<em><b>SRS Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version der System Requirement Specification (Subset 26, Kapitel 7). Beispiel: 3.3.0. In einem Datenpunkt können zu einem Zeitpunkt nur Telegramme der gleichen SRS-Version gesendet werden.
	 * Hinweis für die Projektierung: Die System-Unterversion gem. Subset 26 hängt von der SRS-Version und der System-Version ab.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SRS Version</em>' containment reference.
	 * @see #setSRSVersion(SRS_Version_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_ESG_AttributeGroup_SRSVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SRS_Version'"
	 * @generated
	 */
	SRS_Version_TypeClass getSRSVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup#getSRSVersion <em>SRS Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SRS Version</em>' containment reference.
	 * @see #getSRSVersion()
	 * @generated
	 */
	void setSRSVersion(SRS_Version_TypeClass value);

} // DP_Telegramm_ESG_AttributeGroup
