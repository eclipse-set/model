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
 * A representation of the model object '<em><b>Kabel Verteilpunkt Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Verteilpunkt_Bezeichnung_AttributeGroup#getBezeichnungKabelVerteilpunkt <em>Bezeichnung Kabel Verteilpunkt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Verteilpunkt_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CKabel_Verteilpunkt_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Kabel_Verteilpunkt_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung Kabel Verteilpunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Kabel-Verteilpunkts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Kabel Verteilpunkt</em>' containment reference.
	 * @see #setBezeichnungKabelVerteilpunkt(Bezeichnung_Kabel_Verteilpunkt_TypeClass)
	 * @see org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Verteilpunkt_Bezeichnung_AttributeGroup_BezeichnungKabelVerteilpunkt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Kabel_Verteilpunkt'"
	 * @generated
	 */
	Bezeichnung_Kabel_Verteilpunkt_TypeClass getBezeichnungKabelVerteilpunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Verteilpunkt_Bezeichnung_AttributeGroup#getBezeichnungKabelVerteilpunkt <em>Bezeichnung Kabel Verteilpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Kabel Verteilpunkt</em>' containment reference.
	 * @see #getBezeichnungKabelVerteilpunkt()
	 * @generated
	 */
	void setBezeichnungKabelVerteilpunkt(Bezeichnung_Kabel_Verteilpunkt_TypeClass value);

} // Kabel_Verteilpunkt_Bezeichnung_AttributeGroup
