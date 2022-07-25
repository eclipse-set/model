/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Medien_und_Trassen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kabel Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Bezeichnung_AttributeGroup#getBezeichnungKabel <em>Bezeichnung Kabel</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CKabel_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Kabel_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung Kabel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Kabels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Kabel</em>' containment reference.
	 * @see #setBezeichnungKabel(Bezeichnung_Kabel_TypeClass)
	 * @see org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Bezeichnung_AttributeGroup_BezeichnungKabel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Kabel'"
	 * @generated
	 */
	Bezeichnung_Kabel_TypeClass getBezeichnungKabel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Bezeichnung_AttributeGroup#getBezeichnungKabel <em>Bezeichnung Kabel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Kabel</em>' containment reference.
	 * @see #getBezeichnungKabel()
	 * @generated
	 */
	void setBezeichnungKabel(Bezeichnung_Kabel_TypeClass value);

} // Kabel_Bezeichnung_AttributeGroup
