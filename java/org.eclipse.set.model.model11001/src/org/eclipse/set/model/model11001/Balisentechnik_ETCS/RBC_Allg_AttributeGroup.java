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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RBC Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.RBC_Allg_AttributeGroup#getRBCETCSSystemVersion <em>RBCETCS System Version</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.RBC_Allg_AttributeGroup#getRBCSRSVersion <em>RBCSRS Version</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.RBC_Allg_AttributeGroup#getRufnummer <em>Rufnummer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getRBC_Allg_AttributeGroup()
 * @model extendedMetaData="name='CRBC_Allg' kind='elementOnly'"
 * @generated
 */
public interface RBC_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>RBCETCS System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erste Stelle der Systemversion gemäß System Requirement Specification (Subset 26, Kapitel 7). Die Angabe kann nicht eindeutig aus der ersten Stelle der SRS-Version abgeleitet werden. Auf Basis der SRS 3.3.0 kann beispielsweise die Systemversion 1 oder 2 implementiert werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RBCETCS System Version</em>' containment reference.
	 * @see #setRBCETCSSystemVersion(RBC_ETCS_System_Version_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getRBC_Allg_AttributeGroup_RBCETCSSystemVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RBC_ETCS_System_Version'"
	 * @generated
	 */
	RBC_ETCS_System_Version_TypeClass getRBCETCSSystemVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.RBC_Allg_AttributeGroup#getRBCETCSSystemVersion <em>RBCETCS System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RBCETCS System Version</em>' containment reference.
	 * @see #getRBCETCSSystemVersion()
	 * @generated
	 */
	void setRBCETCSSystemVersion(RBC_ETCS_System_Version_TypeClass value);

	/**
	 * Returns the value of the '<em><b>RBCSRS Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version der System Requirement Specification (Subset 26, Kapitel 7). Beispiel: 3.3.0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RBCSRS Version</em>' containment reference.
	 * @see #setRBCSRSVersion(RBC_SRS_Version_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getRBC_Allg_AttributeGroup_RBCSRSVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RBC_SRS_Version'"
	 * @generated
	 */
	RBC_SRS_Version_TypeClass getRBCSRSVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.RBC_Allg_AttributeGroup#getRBCSRSVersion <em>RBCSRS Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RBCSRS Version</em>' containment reference.
	 * @see #getRBCSRSVersion()
	 * @generated
	 */
	void setRBCSRSVersion(RBC_SRS_Version_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Rufnummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rufnummer, unter der das RBC per EuroRadio für das Fahrzeuggerät erreichbar ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rufnummer</em>' containment reference.
	 * @see #setRufnummer(Rufnummer_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getRBC_Allg_AttributeGroup_Rufnummer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Rufnummer'"
	 * @generated
	 */
	Rufnummer_TypeClass getRufnummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.RBC_Allg_AttributeGroup#getRufnummer <em>Rufnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rufnummer</em>' containment reference.
	 * @see #getRufnummer()
	 * @generated
	 */
	void setRufnummer(Rufnummer_TypeClass value);

} // RBC_Allg_AttributeGroup
