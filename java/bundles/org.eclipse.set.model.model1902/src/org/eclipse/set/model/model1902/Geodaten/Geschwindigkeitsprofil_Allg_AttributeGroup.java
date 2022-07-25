/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geschwindigkeitsprofil Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getGeschwindigkeit <em>Geschwindigkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getVProfilArt <em>VProfil Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getWirkrichtung <em>Wirkrichtung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getGeschwindigkeitsprofil_Allg_AttributeGroup()
 * @model extendedMetaData="name='CGeschwindigkeitsprofil_Allg' kind='elementOnly'"
 * @generated
 */
public interface Geschwindigkeitsprofil_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Geschwindigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zulässige Geschwindigkeit nach jeweiligem Geschwindigkeitsprofil. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geschwindigkeit</em>' containment reference.
	 * @see #setGeschwindigkeit(Geschwindigkeit_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getGeschwindigkeitsprofil_Allg_AttributeGroup_Geschwindigkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Geschwindigkeit'"
	 * @generated
	 */
	Geschwindigkeit_TypeClass getGeschwindigkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getGeschwindigkeit <em>Geschwindigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschwindigkeit</em>' containment reference.
	 * @see #getGeschwindigkeit()
	 * @generated
	 */
	void setGeschwindigkeit(Geschwindigkeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VProfil Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Geschwindigkeitsprofils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VProfil Art</em>' containment reference.
	 * @see #setVProfilArt(V_Profil_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getGeschwindigkeitsprofil_Allg_AttributeGroup_VProfilArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='V_Profil_Art'"
	 * @generated
	 */
	V_Profil_Art_TypeClass getVProfilArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getVProfilArt <em>VProfil Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VProfil Art</em>' containment reference.
	 * @see #getVProfilArt()
	 * @generated
	 */
	void setVProfilArt(V_Profil_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Wirkrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (Fahrt-)Richtung, in die ein verortetes Objekt wirkt. Die Angabe \"in\", \"gegen\" bzw. \"beide\" bezieht sich auf die Topologierichtung der TOP Kante. Weitere Erläuterungen zu den verwendeten Richtungsbegriffen siehe Modellierung Richtung. Zur vererbungsspezifischen Befüllung siehe Modellierung Basisobjekte. DB-Regelwerk Darstellung im sicherungstechnischen Lageplan
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wirkrichtung</em>' containment reference.
	 * @see #setWirkrichtung(Wirkrichtung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getGeschwindigkeitsprofil_Allg_AttributeGroup_Wirkrichtung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Wirkrichtung'"
	 * @generated
	 */
	Wirkrichtung_TypeClass getWirkrichtung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup#getWirkrichtung <em>Wirkrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wirkrichtung</em>' containment reference.
	 * @see #getWirkrichtung()
	 * @generated
	 */
	void setWirkrichtung(Wirkrichtung_TypeClass value);

} // Geschwindigkeitsprofil_Allg_AttributeGroup
