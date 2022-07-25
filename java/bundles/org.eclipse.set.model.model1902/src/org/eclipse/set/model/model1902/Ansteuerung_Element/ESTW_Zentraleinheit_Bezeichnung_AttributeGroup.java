/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESTW Zentraleinheit Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Bezeichnung_AttributeGroup#getBezeichnungESTWZE <em>Bezeichnung ESTWZE</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CESTW_Zentraleinheit_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface ESTW_Zentraleinheit_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung ESTWZE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der ESTW Zentraleinheit. Beispiel: \"ESTW-UZ Waldhof\", \"ESTW-Z Zellwald\".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung ESTWZE</em>' containment reference.
	 * @see #setBezeichnungESTWZE(Bezeichnung_ESTW_ZE_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_Bezeichnung_AttributeGroup_BezeichnungESTWZE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_ESTW_ZE'"
	 * @generated
	 */
	Bezeichnung_ESTW_ZE_TypeClass getBezeichnungESTWZE();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Bezeichnung_AttributeGroup#getBezeichnungESTWZE <em>Bezeichnung ESTWZE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung ESTWZE</em>' containment reference.
	 * @see #getBezeichnungESTWZE()
	 * @generated
	 */
	void setBezeichnungESTWZE(Bezeichnung_ESTW_ZE_TypeClass value);

} // ESTW_Zentraleinheit_Bezeichnung_AttributeGroup
