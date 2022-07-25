/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

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
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.RBC_Allg_AttributeGroup#getRBCSRSUnterversion <em>RBCSRS Unterversion</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.RBC_Allg_AttributeGroup#getRBCSRSVersion <em>RBCSRS Version</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.RBC_Allg_AttributeGroup#getRufnummer <em>Rufnummer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getRBC_Allg_AttributeGroup()
 * @model extendedMetaData="name='CRBC_Allg' kind='elementOnly'"
 * @generated
 */
public interface RBC_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>RBCSRS Unterversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unterversion der System Requirement Specification gemäß Subset 26 Kapitel 7. Im Planungswerkzeug soll der Wert aus einer Liste der veröffentlichten Unterversionen für die angegebene SRS-Version auswählbar sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RBCSRS Unterversion</em>' containment reference.
	 * @see #setRBCSRSUnterversion(RBC_SRS_Unterversion_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getRBC_Allg_AttributeGroup_RBCSRSUnterversion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RBC_SRS_Unterversion'"
	 * @generated
	 */
	RBC_SRS_Unterversion_TypeClass getRBCSRSUnterversion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.RBC_Allg_AttributeGroup#getRBCSRSUnterversion <em>RBCSRS Unterversion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RBCSRS Unterversion</em>' containment reference.
	 * @see #getRBCSRSUnterversion()
	 * @generated
	 */
	void setRBCSRSUnterversion(RBC_SRS_Unterversion_TypeClass value);

	/**
	 * Returns the value of the '<em><b>RBCSRS Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version (Baseline) der System Requirement Specification gemäß Subset 26 Kapitel 7.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RBCSRS Version</em>' containment reference.
	 * @see #setRBCSRSVersion(RBC_SRS_Version_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getRBC_Allg_AttributeGroup_RBCSRSVersion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RBC_SRS_Version'"
	 * @generated
	 */
	RBC_SRS_Version_TypeClass getRBCSRSVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.RBC_Allg_AttributeGroup#getRBCSRSVersion <em>RBCSRS Version</em>}' containment reference.
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
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getRBC_Allg_AttributeGroup_Rufnummer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Rufnummer'"
	 * @generated
	 */
	Rufnummer_TypeClass getRufnummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.RBC_Allg_AttributeGroup#getRufnummer <em>Rufnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rufnummer</em>' containment reference.
	 * @see #getRufnummer()
	 * @generated
	 */
	void setRufnummer(Rufnummer_TypeClass value);

} // RBC_Allg_AttributeGroup
