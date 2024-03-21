/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Zug_Rangier_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telegramm 84 Einzelne Fstr Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_84_Einzelne_Fstr_AttributeGroup#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_84_Einzelne_Fstr_AttributeGroup#getIDZLVBus <em>IDZLV Bus</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getTelegramm_84_Einzelne_Fstr_AttributeGroup()
 * @model extendedMetaData="name='CTelegramm_84_Einzelne_Fstr' kind='elementOnly'"
 * @generated
 */
public interface Telegramm_84_Einzelne_Fstr_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Fstr Zug Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die betreffende Fahrstraße, für die das Telegramm 84 von der ZN gesendet wird. DB-Regelwerk 819.0731 1 sowie detaillierte Abstimmungen mit dem Betreiber 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Zug Rangier</em>' containment reference.
	 * @see #setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getTelegramm_84_Einzelne_Fstr_AttributeGroup_IDFstrZugRangier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Zug_Rangier'"
	 * @generated
	 */
	ID_Fstr_Zug_Rangier_TypeClass getIDFstrZugRangier();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_84_Einzelne_Fstr_AttributeGroup#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Zug Rangier</em>' containment reference.
	 * @see #getIDFstrZugRangier()
	 * @generated
	 */
	void setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDZLV Bus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Verweis wird gefüllt, wenn das Telegramm 84 durchzureichen ist. Verweis auf den ZLV-Bus, auf den das Telegramm durchgereicht wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZLV Bus</em>' containment reference.
	 * @see #setIDZLVBus(ID_ZLV_Bus_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getTelegramm_84_Einzelne_Fstr_AttributeGroup_IDZLVBus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_ZLV_Bus'"
	 * @generated
	 */
	ID_ZLV_Bus_TypeClass getIDZLVBus();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_84_Einzelne_Fstr_AttributeGroup#getIDZLVBus <em>IDZLV Bus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZLV Bus</em>' containment reference.
	 * @see #getIDZLVBus()
	 * @generated
	 */
	void setIDZLVBus(ID_ZLV_Bus_TypeClass value);

} // Telegramm_84_Einzelne_Fstr_AttributeGroup
