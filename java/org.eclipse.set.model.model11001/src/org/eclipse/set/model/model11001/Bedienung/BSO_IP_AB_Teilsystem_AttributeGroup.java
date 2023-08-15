/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BSO IP AB Teilsystem Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup#getBSOTeilsystemArt <em>BSO Teilsystem Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup#getIPAdressblockBlau <em>IP Adressblock Blau</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup#getIPAdressblockGrau <em>IP Adressblock Grau</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBSO_IP_AB_Teilsystem_AttributeGroup()
 * @model extendedMetaData="name='CBSO_IP_AB_Teilsystem' kind='elementOnly'"
 * @generated
 */
public interface BSO_IP_AB_Teilsystem_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>BSO Teilsystem Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des BSO-Teilsystems (integriertes Bediensystem (iBS) oder Transfernetz Bedienung).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BSO Teilsystem Art</em>' containment reference.
	 * @see #setBSOTeilsystemArt(BSO_Teilsystem_Art_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBSO_IP_AB_Teilsystem_AttributeGroup_BSOTeilsystemArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BSO_Teilsystem_Art'"
	 * @generated
	 */
	BSO_Teilsystem_Art_TypeClass getBSOTeilsystemArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup#getBSOTeilsystemArt <em>BSO Teilsystem Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BSO Teilsystem Art</em>' containment reference.
	 * @see #getBSOTeilsystemArt()
	 * @generated
	 */
	void setBSOTeilsystemArt(BSO_Teilsystem_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IP Adressblock Blau</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für das Teilsystem reservierter Adressblock im blauen Weg des bbIP-Netzes. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IP Adressblock Blau</em>' containment reference.
	 * @see #setIPAdressblockBlau(IP_Adressblock_Blau_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockBlau()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='IP_Adressblock_Blau'"
	 * @generated
	 */
	IP_Adressblock_Blau_TypeClass getIPAdressblockBlau();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup#getIPAdressblockBlau <em>IP Adressblock Blau</em>}' containment reference.
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
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockGrau()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='IP_Adressblock_Grau'"
	 * @generated
	 */
	IP_Adressblock_Grau_TypeClass getIPAdressblockGrau();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup#getIPAdressblockGrau <em>IP Adressblock Grau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Adressblock Grau</em>' containment reference.
	 * @see #getIPAdressblockGrau()
	 * @generated
	 */
	void setIPAdressblockGrau(IP_Adressblock_Grau_TypeClass value);

} // BSO_IP_AB_Teilsystem_AttributeGroup
