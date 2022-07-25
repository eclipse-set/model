/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Basisobjekte;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objektreferenzen Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.Objektreferenzen_AttributeGroup#getDBGDIReferenz <em>DBGDI Referenz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.Objektreferenzen_AttributeGroup#getTechnischerPlatz <em>Technischer Platz</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage#getObjektreferenzen_AttributeGroup()
 * @model extendedMetaData="name='CObjektreferenzen' kind='elementOnly'"
 * @generated
 */
public interface Objektreferenzen_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>DBGDI Referenz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IPID-Kennung des Objektes im DB-GIS Systems. Das Attribut ist optional. Die Kennung ist eindeutig einem konkreten Objekt im DB-GDI zugeordnet. Das Attribut ist dann zu befüllen, wenn Daten über Objekte aus dem DB-GIS verarbeitet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DBGDI Referenz</em>' containment reference.
	 * @see #setDBGDIReferenz(DB_GDI_Referenz_TypeClass)
	 * @see org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage#getObjektreferenzen_AttributeGroup_DBGDIReferenz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DB_GDI_Referenz'"
	 * @generated
	 */
	DB_GDI_Referenz_TypeClass getDBGDIReferenz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Basisobjekte.Objektreferenzen_AttributeGroup#getDBGDIReferenz <em>DBGDI Referenz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DBGDI Referenz</em>' containment reference.
	 * @see #getDBGDIReferenz()
	 * @generated
	 */
	void setDBGDIReferenz(DB_GDI_Referenz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Technischer Platz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des zugehörigen Technischen Platzes im SAP-System. Das Attribut ist optional und enthält die Bezeichnung des zugehörigen technischen Platzes im SAP-System. Die Kennung ist eindeutig einem konkreten Objekt im SAP zugeordnet. Mehrere PlanPro-Objekte können auf den gleichen technischen Platz verweisen. Das Attribut ist dann zu befüllen, wenn Daten über Objekte aus einem Fremdsystem der DB AG mit Verweis auf einen Technischen Platz verarbeitet werden oder im Rahmen der Bestandserstellung die technischen Plätze zugewiesen werden. Es ist noch gesondert festzulegen, für welche PlanPro-Objekte technische Plätze zugewiesen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technischer Platz</em>' containment reference.
	 * @see #setTechnischerPlatz(Technischer_Platz_TypeClass)
	 * @see org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage#getObjektreferenzen_AttributeGroup_TechnischerPlatz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Technischer_Platz'"
	 * @generated
	 */
	Technischer_Platz_TypeClass getTechnischerPlatz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Basisobjekte.Objektreferenzen_AttributeGroup#getTechnischerPlatz <em>Technischer Platz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technischer Platz</em>' containment reference.
	 * @see #getTechnischerPlatz()
	 * @generated
	 */
	void setTechnischerPlatz(Technischer_Platz_TypeClass value);

} // Objektreferenzen_AttributeGroup
