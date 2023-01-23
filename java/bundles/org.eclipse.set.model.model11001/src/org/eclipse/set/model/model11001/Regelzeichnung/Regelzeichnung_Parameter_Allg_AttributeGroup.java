/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Regelzeichnung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regelzeichnung Parameter Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Regelzeichnung.Regelzeichnung_Parameter_Allg_AttributeGroup#getRZParameterName <em>RZ Parameter Name</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Regelzeichnung.Regelzeichnung_Parameter_Allg_AttributeGroup#getRZParameterWert <em>RZ Parameter Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Regelzeichnung.RegelzeichnungPackage#getRegelzeichnung_Parameter_Allg_AttributeGroup()
 * @model extendedMetaData="name='CRegelzeichnung_Parameter_Allg' kind='elementOnly'"
 * @generated
 */
public interface Regelzeichnung_Parameter_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>RZ Parameter Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name eines Parameters, der in einer Regelzeichnung hinterlegt ist und die konkrete Anwendung der Regelzeichnung präzisiert. Dem benannten Parameter wird ein Wert zugewiesen. Die zulässigen Namen sind für die Regelzeichnungen unterschiedlich. Es muss deshalb eine Datenbank entstehen, in der die für eine Regelzeichnung gültigen Parameter abgelegt sind, da ansonsten eine rechnergestützte Auswertung nicht möglich ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RZ Parameter Name</em>' containment reference.
	 * @see #setRZParameterName(RZ_Parameter_Name_TypeClass)
	 * @see org.eclipse.set.model.model11001.Regelzeichnung.RegelzeichnungPackage#getRegelzeichnung_Parameter_Allg_AttributeGroup_RZParameterName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RZ_Parameter_Name'"
	 * @generated
	 */
	RZ_Parameter_Name_TypeClass getRZParameterName();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Regelzeichnung.Regelzeichnung_Parameter_Allg_AttributeGroup#getRZParameterName <em>RZ Parameter Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RZ Parameter Name</em>' containment reference.
	 * @see #getRZParameterName()
	 * @generated
	 */
	void setRZParameterName(RZ_Parameter_Name_TypeClass value);

	/**
	 * Returns the value of the '<em><b>RZ Parameter Wert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wert, der einen Parameter in einer Regelzeichnung spezifiziert. Der Wert kann dabei ein fester Wert sein oder aus einer in der Regelzeichnung vorhandenen Tabelle entnommen werden. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RZ Parameter Wert</em>' containment reference.
	 * @see #setRZParameterWert(RZ_Parameter_Wert_TypeClass)
	 * @see org.eclipse.set.model.model11001.Regelzeichnung.RegelzeichnungPackage#getRegelzeichnung_Parameter_Allg_AttributeGroup_RZParameterWert()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RZ_Parameter_Wert'"
	 * @generated
	 */
	RZ_Parameter_Wert_TypeClass getRZParameterWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Regelzeichnung.Regelzeichnung_Parameter_Allg_AttributeGroup#getRZParameterWert <em>RZ Parameter Wert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RZ Parameter Wert</em>' containment reference.
	 * @see #getRZParameterWert()
	 * @generated
	 */
	void setRZParameterWert(RZ_Parameter_Wert_TypeClass value);

} // Regelzeichnung_Parameter_Allg_AttributeGroup
