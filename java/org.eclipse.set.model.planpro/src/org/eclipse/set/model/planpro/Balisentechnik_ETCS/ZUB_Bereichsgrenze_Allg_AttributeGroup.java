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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_Element_Grenze_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_RBC_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZUB Bereichsgrenze Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup#getIDElementGrenze <em>ID Element Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup#getIDRBCVorGrenze <em>IDRBC Vor Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup#getSystemVorGrenze <em>System Vor Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup#getSystemVorGrenzeBesonders <em>System Vor Grenze Besonders</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Allg_AttributeGroup()
 * @model extendedMetaData="name='CZUB_Bereichsgrenze_Allg' kind='elementOnly'"
 * @generated
 */
public interface ZUB_Bereichsgrenze_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Element Grenze</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Verweise.ID_Element_Grenze_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Grenzsignal bzw. den Grenzdatenpunkt. Der Ort der Bereichsgrenze kann sich vom Ort des Grenzelements unterscheiden.
	 * Bereichsgrenze nach L2: Verweis auf das Grenzsignal (Einstiegssignal für L2) bzw. den Grenzdatenpunkt (nur bei Einstieg ohne bekanntes rückwärtiges Signal)
	 * Bereichsgrenze nach ESG: Verweis auf den Transitionsdatenpunkt (Einstieg für ESG)
	 * Bereichsgrenze nach PZB/LZB: Verweis auf einen Transitionsdatenpunkt (ESG) bzw. auf das Ausstiegssignal (L2)
	 * Bereichsgrenze RBC-Wechsel: Verweis auf das Grenzsignal, an dem die Zuständigkeit des RBC wechselt
	 * Bereichsgrenze nach GNT: Verweis auf den ersten GNT-Datenpunkt (B1 oder B3)
	 * Bereichsgrenze nach OHNE: Verweis auf das Grenzsignal (bei Übergang aus PZB) bzw. den Grenzdatenpunkt (bei Übergang aus ESG oder L2)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Element Grenze</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Allg_AttributeGroup_IDElementGrenze()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Element_Grenze'"
	 * @generated
	 */
	EList<ID_Element_Grenze_TypeClass> getIDElementGrenze();

	/**
	 * Returns the value of the '<em><b>IDRBC Vor Grenze</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei L2: Verweis auf das vor der Bereichsgrenze zuständige RBC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDRBC Vor Grenze</em>' containment reference.
	 * @see #setIDRBCVorGrenze(ID_RBC_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Allg_AttributeGroup_IDRBCVorGrenze()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_RBC_Vor_Grenze'"
	 * @generated
	 */
	ID_RBC_TypeClass getIDRBCVorGrenze();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup#getIDRBCVorGrenze <em>IDRBC Vor Grenze</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDRBC Vor Grenze</em>' containment reference.
	 * @see #getIDRBCVorGrenze()
	 * @generated
	 */
	void setIDRBCVorGrenze(ID_RBC_TypeClass value);

	/**
	 * Returns the value of the '<em><b>System Vor Grenze</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.System_Vor_Grenze_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des in Bezug auf die Wirkrichtung vor der Bereichsgrenze vorhandenen Zugbeeinflussungssystems. Es können mehrere Systeme vorhanden sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Vor Grenze</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Allg_AttributeGroup_SystemVorGrenze()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='System_Vor_Grenze'"
	 * @generated
	 */
	EList<System_Vor_Grenze_TypeClass> getSystemVorGrenze();

	/**
	 * Returns the value of the '<em><b>System Vor Grenze Besonders</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.System_Vor_Grenze_Besonders_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des in Bezug auf die Wirkrichtung vor der Bereichsgrenze vorhandenen Class-B-Zugbeeinflussungssystems. Es können mehrere Systeme vorhanden sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Vor Grenze Besonders</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Allg_AttributeGroup_SystemVorGrenzeBesonders()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='System_Vor_Grenze_Besonders'"
	 * @generated
	 */
	EList<System_Vor_Grenze_Besonders_TypeClass> getSystemVorGrenzeBesonders();

} // ZUB_Bereichsgrenze_Allg_AttributeGroup
