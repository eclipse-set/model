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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BSO IP Adressblock Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_Adressblock_AttributeGroup#getBSOIPABTeilsystem <em>BSOIPAB Teilsystem</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_Adressblock_AttributeGroup#getIPAdressblockBlauV4 <em>IP Adressblock Blau V4</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_Adressblock_AttributeGroup#getIPAdressblockBlauV6 <em>IP Adressblock Blau V6</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_Adressblock_AttributeGroup#getIPAdressblockGrauV4 <em>IP Adressblock Grau V4</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_Adressblock_AttributeGroup#getIPAdressblockGrauV6 <em>IP Adressblock Grau V6</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_Adressblock_AttributeGroup#getRegionalbereich <em>Regionalbereich</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBSO_IP_Adressblock_AttributeGroup()
 * @model extendedMetaData="name='CBSO_IP_Adressblock' kind='elementOnly'"
 * @generated
 */
public interface BSO_IP_Adressblock_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>BSOIPAB Teilsystem</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_AB_Teilsystem_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BSOIPAB Teilsystem</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBSO_IP_Adressblock_AttributeGroup_BSOIPABTeilsystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BSO_IP_AB_Teilsystem'"
	 * @generated
	 */
	EList<BSO_IP_AB_Teilsystem_AttributeGroup> getBSOIPABTeilsystem();

	/**
	 * Returns the value of the '<em><b>IP Adressblock Blau V4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reservierter IPv4-Adressblock für den blauen Weg des bbIP-Netzes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IP Adressblock Blau V4</em>' containment reference.
	 * @see #setIPAdressblockBlauV4(IP_Adressblock_Blau_V4_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV4()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='IP_Adressblock_Blau_V4'"
	 * @generated
	 */
	IP_Adressblock_Blau_V4_TypeClass getIPAdressblockBlauV4();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_Adressblock_AttributeGroup#getIPAdressblockBlauV4 <em>IP Adressblock Blau V4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Adressblock Blau V4</em>' containment reference.
	 * @see #getIPAdressblockBlauV4()
	 * @generated
	 */
	void setIPAdressblockBlauV4(IP_Adressblock_Blau_V4_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IP Adressblock Blau V6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reservierter IPv6-Adressblock für den blauen Weg des bbIP-Netzes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IP Adressblock Blau V6</em>' containment reference.
	 * @see #setIPAdressblockBlauV6(IP_Adressblock_Blau_V6_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV6()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='IP_Adressblock_Blau_V6'"
	 * @generated
	 */
	IP_Adressblock_Blau_V6_TypeClass getIPAdressblockBlauV6();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_Adressblock_AttributeGroup#getIPAdressblockBlauV6 <em>IP Adressblock Blau V6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Adressblock Blau V6</em>' containment reference.
	 * @see #getIPAdressblockBlauV6()
	 * @generated
	 */
	void setIPAdressblockBlauV6(IP_Adressblock_Blau_V6_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IP Adressblock Grau V4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reservierter IPv4-Adressblock für den grauen Weg des bbIP-Netzes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IP Adressblock Grau V4</em>' containment reference.
	 * @see #setIPAdressblockGrauV4(IP_Adressblock_Grau_V4_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV4()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='IP_Adressblock_Grau_V4'"
	 * @generated
	 */
	IP_Adressblock_Grau_V4_TypeClass getIPAdressblockGrauV4();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_Adressblock_AttributeGroup#getIPAdressblockGrauV4 <em>IP Adressblock Grau V4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Adressblock Grau V4</em>' containment reference.
	 * @see #getIPAdressblockGrauV4()
	 * @generated
	 */
	void setIPAdressblockGrauV4(IP_Adressblock_Grau_V4_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IP Adressblock Grau V6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reservierter IPv6-Adressblock für den grauen Weg des bbIP-Netzes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IP Adressblock Grau V6</em>' containment reference.
	 * @see #setIPAdressblockGrauV6(IP_Adressblock_Grau_V6_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV6()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='IP_Adressblock_Grau_V6'"
	 * @generated
	 */
	IP_Adressblock_Grau_V6_TypeClass getIPAdressblockGrauV6();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_Adressblock_AttributeGroup#getIPAdressblockGrauV6 <em>IP Adressblock Grau V6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Adressblock Grau V6</em>' containment reference.
	 * @see #getIPAdressblockGrauV6()
	 * @generated
	 */
	void setIPAdressblockGrauV6(IP_Adressblock_Grau_V6_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Regionalbereich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regionalbereich, dem der Bedien-Standort zugewiesen ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regionalbereich</em>' containment reference.
	 * @see #setRegionalbereich(Regionalbereich_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBSO_IP_Adressblock_AttributeGroup_Regionalbereich()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Regionalbereich'"
	 * @generated
	 */
	Regionalbereich_TypeClass getRegionalbereich();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.BSO_IP_Adressblock_AttributeGroup#getRegionalbereich <em>Regionalbereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regionalbereich</em>' containment reference.
	 * @see #getRegionalbereich()
	 * @generated
	 */
	void setRegionalbereich(Regionalbereich_TypeClass value);

} // BSO_IP_Adressblock_AttributeGroup
