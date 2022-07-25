/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Schluesselabhaengigkeiten;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.Verweise.ID_W_Kr_Gsp_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schloss Gsp Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup#getGspLage <em>Gsp Lage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup#getIDGspElement <em>ID Gsp Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Gsp_AttributeGroup()
 * @model extendedMetaData="name='CSchloss_Gsp' kind='elementOnly'"
 * @generated
 */
public interface Schloss_Gsp_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Gsp Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lage, in der die Gleissperre verschlossen wird. DB-Regelwerk Die Abhängigkeiten werden heute durch eine Zeichnung im Lageplan nach 819.9002 3 dargestellt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gsp Lage</em>' containment reference.
	 * @see #setGspLage(Gsp_Lage_TypeClass)
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Gsp_AttributeGroup_GspLage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Gsp_Lage'"
	 * @generated
	 */
	Gsp_Lage_TypeClass getGspLage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup#getGspLage <em>Gsp Lage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gsp Lage</em>' containment reference.
	 * @see #getGspLage()
	 * @generated
	 */
	void setGspLage(Gsp_Lage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Gsp Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Gleissperre, die mit dem Schloss verschlossen wird. DB-Regelwerk Lageplan, Logische Darstellung der Schlüsselabhängigkeit 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Gsp Element</em>' containment reference.
	 * @see #setIDGspElement(ID_W_Kr_Gsp_Element_TypeClass)
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Gsp_AttributeGroup_IDGspElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Gsp_Element'"
	 * @generated
	 */
	ID_W_Kr_Gsp_Element_TypeClass getIDGspElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup#getIDGspElement <em>ID Gsp Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Gsp Element</em>' containment reference.
	 * @see #getIDGspElement()
	 * @generated
	 */
	void setIDGspElement(ID_W_Kr_Gsp_Element_TypeClass value);

} // Schloss_Gsp_AttributeGroup
