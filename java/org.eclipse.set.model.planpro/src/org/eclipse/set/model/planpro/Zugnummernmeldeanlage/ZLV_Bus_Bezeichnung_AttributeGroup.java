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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZLV Bus Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Bezeichnung_AttributeGroup#getZLVBusNr <em>ZLV Bus Nr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CZLV_Bus_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface ZLV_Bus_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ZLV Bus Nr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nummer des ZLV-Busses. Jeder ZLV-Bus hat eine ihn identifizierende Nummer, die zentral festgelegt wird. Zukünftig wird die Nummer vierstellig angegeben; die ersten beiden Ziffern geben die Region an. Damit ist jeder ZLV-Bus bereits anhand seiner Nummer eindeutig in der Region identifizierbar. Bei BZ-übergreifenden ZLV-Bussen wird der BZ-Code nach Ril 100.0001A01 der ZLV-Bus-Nummer vorangestellt, getrennt durch einen Schrägstrich. Der BZ-Code wird aus dem Verweis auf die Bedien Zentrale generiert. DB-Regelwerk 100.0001A01 819.0731 5 (14) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZLV Bus Nr</em>' containment reference.
	 * @see #setZLVBusNr(ZLV_Bus_Nr_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Bezeichnung_AttributeGroup_ZLVBusNr()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZLV_Bus_Nr'"
	 * @generated
	 */
	ZLV_Bus_Nr_TypeClass getZLVBusNr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Bezeichnung_AttributeGroup#getZLVBusNr <em>ZLV Bus Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZLV Bus Nr</em>' containment reference.
	 * @see #getZLVBusNr()
	 * @generated
	 */
	void setZLVBusNr(ZLV_Bus_Nr_TypeClass value);

} // ZLV_Bus_Bezeichnung_AttributeGroup
