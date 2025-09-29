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

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_RBC_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datenpunkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Beeinflussungspunkt bestehend aus einer Einzelbalise oder Balisengruppe und ggf. einer LEU. In europäischen Spezifikationen wird der Begriff \"Balisengruppe\" auch synonym für \"Datenpunkt\" verwendet. Ein ungesteuerter Datenpunkt besteht ausschließlich aus ungesteuerten Balisen (Festdatenbalisen). Die Attributgruppe DP_Typ_GESG darf nur ausgewählt werden, wenn ausschließlich ESG-Telegramme enthalten sind.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt#getDatenpunktAllg <em>Datenpunkt Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt#getDatenpunktEinmesspunkt <em>Datenpunkt Einmesspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt#getDPBezugFunktional <em>DP Bezug Funktional</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt#getDPETCSAdresse <em>DPETCS Adresse</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt#getDPTyp <em>DP Typ</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt#getIDRBC <em>IDRBC</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt#getLEUSteuernde <em>LEU Steuernde</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt#getDPTelegramm <em>DP Telegramm</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt#getDPTelegrammESG <em>DP Telegramm ESG</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt()
 * @model extendedMetaData="name='CDatenpunkt' kind='elementOnly'"
 * @generated
 */
public interface Datenpunkt extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>Datenpunkt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenpunkt Allg</em>' containment reference.
	 * @see #setDatenpunktAllg(Datenpunkt_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_DatenpunktAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Datenpunkt_Allg'"
	 * @generated
	 */
	Datenpunkt_Allg_AttributeGroup getDatenpunktAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt#getDatenpunktAllg <em>Datenpunkt Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenpunkt Allg</em>' containment reference.
	 * @see #getDatenpunktAllg()
	 * @generated
	 */
	void setDatenpunktAllg(Datenpunkt_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Datenpunkt Einmesspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenpunkt Einmesspunkt</em>' containment reference.
	 * @see #setDatenpunktEinmesspunkt(Datenpunkt_Einmesspunkt_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_DatenpunktEinmesspunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Datenpunkt_Einmesspunkt'"
	 * @generated
	 */
	Datenpunkt_Einmesspunkt_AttributeGroup getDatenpunktEinmesspunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt#getDatenpunktEinmesspunkt <em>Datenpunkt Einmesspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenpunkt Einmesspunkt</em>' containment reference.
	 * @see #getDatenpunktEinmesspunkt()
	 * @generated
	 */
	void setDatenpunktEinmesspunkt(Datenpunkt_Einmesspunkt_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>DP Bezug Funktional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DP Bezug Funktional</em>' containment reference.
	 * @see #setDPBezugFunktional(DP_Bezug_Funktional_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_DPBezugFunktional()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Bezug_Funktional'"
	 * @generated
	 */
	DP_Bezug_Funktional_AttributeGroup getDPBezugFunktional();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt#getDPBezugFunktional <em>DP Bezug Funktional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Bezug Funktional</em>' containment reference.
	 * @see #getDPBezugFunktional()
	 * @generated
	 */
	void setDPBezugFunktional(DP_Bezug_Funktional_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>DPETCS Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei ESG optional (nur, wenn DP in mehreren Anwendungssystemen verwendet wird), bei allen anderen Anwendungssystemen Pflicht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DPETCS Adresse</em>' containment reference.
	 * @see #setDPETCSAdresse(DP_ETCS_Adresse_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_DPETCSAdresse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_ETCS_Adresse'"
	 * @generated
	 */
	DP_ETCS_Adresse_AttributeGroup getDPETCSAdresse();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt#getDPETCSAdresse <em>DPETCS Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DPETCS Adresse</em>' containment reference.
	 * @see #getDPETCSAdresse()
	 * @generated
	 */
	void setDPETCSAdresse(DP_ETCS_Adresse_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>DP Typ</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DP Typ</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_DPTyp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DP_Typ'"
	 * @generated
	 */
	EList<DP_Typ_AttributeGroup> getDPTyp();

	/**
	 * Returns the value of the '<em><b>IDRBC</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Verweise.ID_RBC_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die RBC, denen der Datenpunkt bekannt ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDRBC</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_IDRBC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_RBC'"
	 * @generated
	 */
	EList<ID_RBC_TypeClass> getIDRBC();

	/**
	 * Returns the value of the '<em><b>LEU Steuernde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LEU Steuernde</em>' containment reference.
	 * @see #setLEUSteuernde(LEU_Steuernde_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_LEUSteuernde()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Steuernde'"
	 * @generated
	 */
	LEU_Steuernde_AttributeGroup getLEUSteuernde();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt#getLEUSteuernde <em>LEU Steuernde</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LEU Steuernde</em>' containment reference.
	 * @see #getLEUSteuernde()
	 * @generated
	 */
	void setLEUSteuernde(LEU_Steuernde_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>DP Telegramm</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Telegramm_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DP Telegramm</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_DPTelegramm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Telegramm'"
	 * @generated
	 */
	EList<DP_Telegramm_AttributeGroup> getDPTelegramm();

	/**
	 * Returns the value of the '<em><b>DP Telegramm ESG</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Attributgruppe soll nicht mehr verwendet werden. Die Notwendigkeit wird für Version 1.12 nochmalig geprüft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DP Telegramm ESG</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_DPTelegrammESG()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Telegramm_ESG'"
	 * @generated
	 */
	EList<DP_Telegramm_ESG_AttributeGroup> getDPTelegrammESG();

} // Datenpunkt
