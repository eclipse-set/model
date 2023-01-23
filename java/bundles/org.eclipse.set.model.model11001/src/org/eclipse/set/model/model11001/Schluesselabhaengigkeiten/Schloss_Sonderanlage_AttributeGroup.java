/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Schluesselabhaengigkeiten;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_Sonderanlage_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schloss Sonderanlage Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getSonderanlageLage <em>Sonderanlage Lage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getBeschreibungSonderanlage <em>Beschreibung Sonderanlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getIDSonderanlage <em>ID Sonderanlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Sonderanlage_AttributeGroup()
 * @model extendedMetaData="name='CSchloss_Sonderanlage' kind='elementOnly'"
 * @generated
 */
public interface Schloss_Sonderanlage_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Sonderanlage Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lage, in der die Sonderanlage verschlossen wird. DB-Regelwerk Die Abhängigkeiten werden heute durch eine Zeichnung im Lageplan nach 819.9002 3 dargestellt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sonderanlage Lage</em>' containment reference.
	 * @see #setSonderanlageLage(Sonderanlage_Lage_TypeClass)
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Sonderanlage_AttributeGroup_SonderanlageLage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Sonderanlage_Lage'"
	 * @generated
	 */
	Sonderanlage_Lage_TypeClass getSonderanlageLage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getSonderanlageLage <em>Sonderanlage Lage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sonderanlage Lage</em>' containment reference.
	 * @see #getSonderanlageLage()
	 * @generated
	 */
	void setSonderanlageLage(Sonderanlage_Lage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Beschreibung Sonderanlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung der Sonderanlage, sofern es sich nicht um ein besonderes Fahrwegelement handelt, das über ID_Sonderanlage angegeben werden kann.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beschreibung Sonderanlage</em>' containment reference.
	 * @see #setBeschreibungSonderanlage(Beschreibung_Sonderanlage_TypeClass)
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Sonderanlage_AttributeGroup_BeschreibungSonderanlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Beschreibung_Sonderanlage'"
	 * @generated
	 */
	Beschreibung_Sonderanlage_TypeClass getBeschreibungSonderanlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getBeschreibungSonderanlage <em>Beschreibung Sonderanlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschreibung Sonderanlage</em>' containment reference.
	 * @see #getBeschreibungSonderanlage()
	 * @generated
	 */
	void setBeschreibungSonderanlage(Beschreibung_Sonderanlage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Sonderanlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Sonderanlage im Sinne eines besonderen Fahrwegelements (z. B. bewegliche Brücke).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Sonderanlage</em>' containment reference.
	 * @see #setIDSonderanlage(ID_Sonderanlage_TypeClass)
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Sonderanlage_AttributeGroup_IDSonderanlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Sonderanlage'"
	 * @generated
	 */
	ID_Sonderanlage_TypeClass getIDSonderanlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getIDSonderanlage <em>ID Sonderanlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Sonderanlage</em>' containment reference.
	 * @see #getIDSonderanlage()
	 * @generated
	 */
	void setIDSonderanlage(ID_Sonderanlage_TypeClass value);

} // Schloss_Sonderanlage_AttributeGroup
