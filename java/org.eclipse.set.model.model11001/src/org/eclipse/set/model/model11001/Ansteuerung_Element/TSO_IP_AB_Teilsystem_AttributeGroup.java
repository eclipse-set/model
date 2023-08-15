/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ansteuerung_Element;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSO IP AB Teilsystem Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.TSO_IP_AB_Teilsystem_AttributeGroup#getIPAdressblockBlau <em>IP Adressblock Blau</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.TSO_IP_AB_Teilsystem_AttributeGroup#getIPAdressblockGrau <em>IP Adressblock Grau</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.TSO_IP_AB_Teilsystem_AttributeGroup#getTSOTeilsystemArt <em>TSO Teilsystem Art</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getTSO_IP_AB_Teilsystem_AttributeGroup()
 * @model extendedMetaData="name='CTSO_IP_AB_Teilsystem' kind='elementOnly'"
 * @generated
 */
public interface TSO_IP_AB_Teilsystem_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>IP Adressblock Blau</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für das Teilsystem reservierter Adressblock im blauen Weg des bbIP-Netzes. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IP Adressblock Blau</em>' containment reference.
	 * @see #setIPAdressblockBlau(IP_Adressblock_Blau_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getTSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockBlau()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='IP_Adressblock_Blau'"
	 * @generated
	 */
	IP_Adressblock_Blau_TypeClass getIPAdressblockBlau();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.TSO_IP_AB_Teilsystem_AttributeGroup#getIPAdressblockBlau <em>IP Adressblock Blau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Adressblock Blau</em>' containment reference.
	 * @see #getIPAdressblockBlau()
	 * @generated
	 */
	void setIPAdressblockBlau(IP_Adressblock_Blau_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IP Adressblock Grau</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für das Teilsystem reservierter Adressblock im grauen Weg des bbIP-Netzes. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IP Adressblock Grau</em>' containment reference.
	 * @see #setIPAdressblockGrau(IP_Adressblock_Grau_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getTSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockGrau()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='IP_Adressblock_Grau'"
	 * @generated
	 */
	IP_Adressblock_Grau_TypeClass getIPAdressblockGrau();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.TSO_IP_AB_Teilsystem_AttributeGroup#getIPAdressblockGrau <em>IP Adressblock Grau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Adressblock Grau</em>' containment reference.
	 * @see #getIPAdressblockGrau()
	 * @generated
	 */
	void setIPAdressblockGrau(IP_Adressblock_Grau_TypeClass value);

	/**
	 * Returns the value of the '<em><b>TSO Teilsystem Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des TSO-Teilsystems, z. B. ZE (ESTW-Zentraleinheit), MDM (Maintenance Data Management), Doku ZMA ZL (Doku Zugnummernmeldeanlage Zuglenkung), Transfernetz mit SI LST (SI = Service-Interface).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TSO Teilsystem Art</em>' containment reference.
	 * @see #setTSOTeilsystemArt(TSO_Teilsystem_Art_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getTSO_IP_AB_Teilsystem_AttributeGroup_TSOTeilsystemArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TSO_Teilsystem_Art'"
	 * @generated
	 */
	TSO_Teilsystem_Art_TypeClass getTSOTeilsystemArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.TSO_IP_AB_Teilsystem_AttributeGroup#getTSOTeilsystemArt <em>TSO Teilsystem Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TSO Teilsystem Art</em>' containment reference.
	 * @see #getTSOTeilsystemArt()
	 * @generated
	 */
	void setTSOTeilsystemArt(TSO_Teilsystem_Art_TypeClass value);

} // TSO_IP_AB_Teilsystem_AttributeGroup
